//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *         Address information as either a SIP or tel URI.
 *         A SIP URI starts with
 *         sip:. See RFC 3261 for the
 *         complete SIP URI
 *         specification. Note that the URI may
 *         contain parameters. The
 *         following are a few examples of SIP URIs that are considered
 *         valid for XSI:
 * 
 *         sip:+12403649000@broadsoft.com;user=phone
 *         sip:2403649001@broadsoft.com;user=phone
 *         sip:9002@broadsoft.com;user=phone
 *         sip:2403649003;phone-context=+1@broadsoft.com;user=phone
 *         sip:2403649004;phone-context=as.com@broadsoft.com;user=phone
 *         sip:user@broadsoft.com
 * 
 *         A
 *         tel URI starts with tel:. See RFC 3966
 *         for the complete tel URI
 *         specification. Note
 *         that the
 *         URI may
 *         contain parameters. The following are a few examples of tel
 *         URIs
 *         that are
 *         considered valid for XSI:
 * 
 *         tel:+12403649000 tel:2403649001
 *         tel:9002
 *         tel:2403649003;phone-context=+1
 *         tel:2403649004;phone-context=as.com
 * 
 *         Note that
 *         BroadWorks is not strict with RFC 3966 local numbers and allows them without a
 *         phone-context. Also note that a SIP URI without user=phone present is always treated
 *         as a URI, not a phone number. Also note that BroadWorks requires that a SIP URI have
 *         a user portion when the SIP URI is being used as a dialed address (e.g. address for
 *         a Click-to-Dial or a transfer attempt).
 *       
 * 
 * <p>Java-Klasse für Address complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schema.broadsoft.com/xsi>NonEmptyURI">
 *       &lt;attribute name="countryCode" type="{http://schema.broadsoft.com/xsi}CountryCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "value"
})
public class Address {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "countryCode")
    protected Integer countryCode;

    /**
     * 
     *         URI that cannot be empty.
     *       
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryCode(Integer value) {
        this.countryCode = value;
    }

}
