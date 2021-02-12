//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FaxStatusCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FaxStatusCode">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Preparing to Transmit"/>
 *     &lt;enumeration value="Transmitting"/>
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="Error - File Not Found"/>
 *     &lt;enumeration value="Error - File Transfer Failed"/>
 *     &lt;enumeration value="Temporarily Unavailable"/>
 *     &lt;enumeration value="User Not Found"/>
 *     &lt;enumeration value="File Conversion In Progress"/>
 *     &lt;enumeration value="File Conversion Failed"/>
 *     &lt;enumeration value="Xtended Conversion Service Not Available"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaxStatusCode")
@XmlEnum
public enum FaxStatusCode {


    /**
     * 
     *             The call is being setup to transmit the fax file.
     *           
     * 
     */
    @XmlEnumValue("Preparing to Transmit")
    PREPARING_TO_TRANSMIT("Preparing to Transmit"),

    /**
     * 
     *             The fax file is being transmitted.
     *           
     * 
     */
    @XmlEnumValue("Transmitting")
    TRANSMITTING("Transmitting"),

    /**
     * 
     *             The fax file was sent successfully.
     *           
     * 
     */
    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),

    /**
     * 
     *             The fax file was not found.
     *           
     * 
     */
    @XmlEnumValue("Error - File Not Found")
    ERROR_FILE_NOT_FOUND("Error - File Not Found"),

    /**
     * 
     *             The fax file transfer failed.
     *           
     * 
     */
    @XmlEnumValue("Error - File Transfer Failed")
    ERROR_FILE_TRANSFER_FAILED("Error - File Transfer Failed"),

    /**
     * 
     *             The fax destination is temporarily unavailable.
     *           
     * 
     */
    @XmlEnumValue("Temporarily Unavailable")
    TEMPORARILY_UNAVAILABLE("Temporarily Unavailable"),

    /**
     * 
     *             The fax recipient could not be found.
     *           
     * 
     */
    @XmlEnumValue("User Not Found")
    USER_NOT_FOUND("User Not Found"),

    /**
     * 
     *            File conversion in progress.
     *          
     * 
     */
    @XmlEnumValue("File Conversion In Progress")
    FILE_CONVERSION_IN_PROGRESS("File Conversion In Progress"),

    /**
     * 
     *             File conversion failed.
     *           
     * 
     */
    @XmlEnumValue("File Conversion Failed")
    FILE_CONVERSION_FAILED("File Conversion Failed"),

    /**
     * 
     *             Xtended file conversion service not available. 
     *           
     * 
     */
    @XmlEnumValue("Xtended Conversion Service Not Available")
    XTENDED_CONVERSION_SERVICE_NOT_AVAILABLE("Xtended Conversion Service Not Available");
    private final String value;

    FaxStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaxStatusCode fromValue(String v) {
        for (FaxStatusCode c: FaxStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
