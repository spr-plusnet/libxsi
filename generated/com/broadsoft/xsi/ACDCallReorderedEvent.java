//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The ACD Call Reordered event is sent when a call is reordered (e.g.
 *         through an ACD Call Reorder).
 *       
 * 
 * <p>Java-Klasse für ACDCallReorderedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallReorderedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ACDEvent">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://schema.broadsoft.com/xsi}PositiveInt"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallReorderedEvent", propOrder = {
    "position"
})
public class ACDCallReorderedEvent
    extends ACDEvent
{

    protected int position;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

}
