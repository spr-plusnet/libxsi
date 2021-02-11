/**
 * 
 */
package de.qsc.centraflex.broadsoft;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 * @author spr
 *
 */
public class XMLDocumentTokenizer {
	
	private final static Logger logger = LoggerFactory.getLogger("xml");
	
	enum ParseMode {
		IDLE,
		UNDECIDED,
		IN_ELEMENT,
		WAIT_FOR_BRACKET,
		WAIT_FOR_DOUBLE,
		WAIT_FOR_COMMENT,
	}
	
	enum ElementType {
		PROCESSING_INSTRUCTION,
		CDATA,
		COMMENT,
		START_ELEMENT,
		END_ELEMENT
	}
	
	private InputStream in;

	//-----------------------------------------------------------------
	/**
	 * @param args
	 * @throws IOException 
	 * @throws ParserConfigurationException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws XMLStreamException, IOException {
		File file = new File("teststream.txt");
		XMLDocumentTokenizer flow = new XMLDocumentTokenizer(new FileInputStream(file));
		int count =0;
		while (true) {
			String read = flow.nextDocument();
			if (read==null)
				break;
			System.out.println("Read "+(++count)+" = "+read);
		}
	}

	//-----------------------------------------------------------------
	/**
	 */
	public XMLDocumentTokenizer(InputStream delegate) {
		in = delegate;
	}

	//-----------------------------------------------------------------
	public String nextDocument() throws IOException {
		ParseMode mode = ParseMode.IDLE;
		StringBuffer buf = new StringBuffer();
		StringBuffer tmp = new StringBuffer();
		ElementType current = null;
		int depth = 0;
		
		while (true) {
			int code = in.read();
			if (code==-1) {
				// End of File reached
				if (buf.length()>0)
					return buf.toString();
				return null;
			}
			
			char ch = (char)code;
			switch (mode) {
			case IDLE:
				if (ch=='<') {
					mode = ParseMode.UNDECIDED;
					tmp.append(ch);
				} else {
					buf.append(ch);
				}
				break;
			case UNDECIDED:
				tmp.append(ch);
				if (tmp.toString().equals("<?")) {
					// Start processing instruction
					current = ElementType.PROCESSING_INSTRUCTION;
					mode = ParseMode.IN_ELEMENT;
				} else if (tmp.toString().equals("</")) {
					// End element
					current = ElementType.END_ELEMENT;
					mode = ParseMode.WAIT_FOR_BRACKET;
				} else if (tmp.toString().startsWith("<!")) {
					// End element
					if (tmp.toString().startsWith("<![CDATA[")) {
						current = ElementType.CDATA;
						mode = ParseMode.WAIT_FOR_DOUBLE;
					}
					if (tmp.toString().startsWith("<!--")) {
						current = ElementType.COMMENT;
						mode = ParseMode.WAIT_FOR_COMMENT;
					}
				} else {
					// Start element
					current = ElementType.START_ELEMENT;
					mode = ParseMode.WAIT_FOR_BRACKET;
				}
				break;
			case IN_ELEMENT:
				tmp.append(ch);
				switch (current) {
				case PROCESSING_INSTRUCTION:
					if (ch=='?') {
						// End of processing instruction
						mode = ParseMode.WAIT_FOR_BRACKET;
					}
					break;
				default:
					logger.warn("TODO: "+mode+" reading '"+ch+"' while having "+tmp+"  current="+current);
					System.exit(0);
				}
				break;
			
			case WAIT_FOR_BRACKET:
				tmp.append(ch);
				switch (current) {
				case PROCESSING_INSTRUCTION:
					if (ch=='>') {
						// End of processing instruction
						logger.trace("Found PI "+tmp);
						buf.append(tmp.toString());
						tmp = new StringBuffer();
						mode = ParseMode.IDLE;
						current = null;
					}
					break;
				case START_ELEMENT:
					if (ch=='>') {
						// End of start element
						logger.trace("Found START "+tmp);
						buf.append(tmp.toString());
						tmp = new StringBuffer();
						mode = ParseMode.IDLE;
						current = null;
						depth++;
					}
					break;
				case END_ELEMENT:
					if (ch=='>') {
						// End of end element
						logger.trace("Found END "+tmp);
						buf.append(tmp.toString());
						tmp = new StringBuffer();
						mode = ParseMode.IDLE;
						current = null;
						depth--;
						if (depth==0) {
							return buf.toString();
						}
					}
					break;
				case CDATA:
					if (ch=='>') {
						// End of CDATA
						logger.trace("Found CDATA "+tmp);
						buf.append(tmp.toString());
						tmp = new StringBuffer();
						mode = ParseMode.IDLE;
						current = null;
					}
					break;
				case COMMENT:
					if (ch=='>') {
						// End of CDATA
						logger.trace("Found COMMENT "+tmp);
						buf.append(tmp.toString());
						tmp = new StringBuffer();
						mode = ParseMode.IDLE;
						current = null;
					}
					break;
					
				default:
					logger.warn("TODO: "+mode+" reading '"+ch+"' while having "+tmp+"  current="+current);
					System.exit(0);
				}
				break;
				
			case WAIT_FOR_DOUBLE:
				tmp.append(ch);
				if (tmp.toString().endsWith("]]")) {
					mode = ParseMode.WAIT_FOR_BRACKET;
				}
				break;
				
			case WAIT_FOR_COMMENT:
				tmp.append(ch);
				if (tmp.toString().endsWith("--")) {
					mode = ParseMode.WAIT_FOR_BRACKET;
				}
				break;

			default:
				logger.warn("TODO: "+mode+" reading '"+ch+"' while having "+tmp+"  current="+current);
				System.exit(0);
			}

		} // while
	}

}
