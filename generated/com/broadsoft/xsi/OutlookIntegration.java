//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="contactRetrievalSelection" type="{http://schema.broadsoft.com/xsi}OutlookIntegrationContactRetrieval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactRetrievalSelection"
})
@XmlRootElement(name = "OutlookIntegration")
public class OutlookIntegration
    extends ActivatableServiceInfo
{

    @XmlSchemaType(name = "token")
    protected OutlookIntegrationContactRetrieval contactRetrievalSelection;

    /**
     * Ruft den Wert der contactRetrievalSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutlookIntegrationContactRetrieval }
     *     
     */
    public OutlookIntegrationContactRetrieval getContactRetrievalSelection() {
        return contactRetrievalSelection;
    }

    /**
     * Legt den Wert der contactRetrievalSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutlookIntegrationContactRetrieval }
     *     
     */
    public void setContactRetrievalSelection(OutlookIntegrationContactRetrieval value) {
        this.contactRetrievalSelection = value;
    }

}
