//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FaxStatusCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="FaxStatusCode"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Preparing to Transmit"/&gt;
 *     &lt;enumeration value="Transmitting"/&gt;
 *     &lt;enumeration value="Successful"/&gt;
 *     &lt;enumeration value="Error - File Not Found"/&gt;
 *     &lt;enumeration value="Error - File Transfer Failed"/&gt;
 *     &lt;enumeration value="Temporarily Unavailable"/&gt;
 *     &lt;enumeration value="User Not Found"/&gt;
 *     &lt;enumeration value="File Conversion In Progress"/&gt;
 *     &lt;enumeration value="File Conversion Failed"/&gt;
 *     &lt;enumeration value="Xtended Conversion Service Not Available"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
