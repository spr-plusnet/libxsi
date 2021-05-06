//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *           Contains the Push to Talk service configuration data.
 *           
 *           Push to Talk allows people to call each other and have 
 *           the call answered automatically. You can control which users
 *           are allowed to call you in this way.
 *         
 * 
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowAutoAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outgoingConnectionSelection" type="{http://schema.broadsoft.com/xsi}PushToTalkOutgoingConnectionSelection" minOccurs="0"/&gt;
 *         &lt;element name="accessListSelection" type="{http://schema.broadsoft.com/xsi}PushToTalkAccessListSelection" minOccurs="0"/&gt;
 *         &lt;element name="allowedUsers" type="{http://schema.broadsoft.com/xsi}UserIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowAutoAnswer",
    "outgoingConnectionSelection",
    "accessListSelection",
    "allowedUsers"
})
@XmlRootElement(name = "PushToTalk")
public class PushToTalk {

    protected Boolean allowAutoAnswer;
    @XmlSchemaType(name = "token")
    protected PushToTalkOutgoingConnectionSelection outgoingConnectionSelection;
    @XmlElementRef(name = "accessListSelection", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<PushToTalkAccessListSelection> accessListSelection;
    @XmlElementRef(name = "allowedUsers", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdList> allowedUsers;

    /**
     * Ruft den Wert der allowAutoAnswer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAutoAnswer() {
        return allowAutoAnswer;
    }

    /**
     * Legt den Wert der allowAutoAnswer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAutoAnswer(Boolean value) {
        this.allowAutoAnswer = value;
    }

    /**
     * Ruft den Wert der outgoingConnectionSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushToTalkOutgoingConnectionSelection }
     *     
     */
    public PushToTalkOutgoingConnectionSelection getOutgoingConnectionSelection() {
        return outgoingConnectionSelection;
    }

    /**
     * Legt den Wert der outgoingConnectionSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushToTalkOutgoingConnectionSelection }
     *     
     */
    public void setOutgoingConnectionSelection(PushToTalkOutgoingConnectionSelection value) {
        this.outgoingConnectionSelection = value;
    }

    /**
     * Ruft den Wert der accessListSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PushToTalkAccessListSelection }{@code >}
     *     
     */
    public JAXBElement<PushToTalkAccessListSelection> getAccessListSelection() {
        return accessListSelection;
    }

    /**
     * Legt den Wert der accessListSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PushToTalkAccessListSelection }{@code >}
     *     
     */
    public void setAccessListSelection(JAXBElement<PushToTalkAccessListSelection> value) {
        this.accessListSelection = value;
    }

    /**
     * Ruft den Wert der allowedUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdList }{@code >}
     *     
     */
    public JAXBElement<UserIdList> getAllowedUsers() {
        return allowedUsers;
    }

    /**
     * Legt den Wert der allowedUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdList }{@code >}
     *     
     */
    public void setAllowedUsers(JAXBElement<UserIdList> value) {
        this.allowedUsers = value;
    }

}
