//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The ACD Call Promoted event is sent when a call has been promoted to
 *         another priority either manually (e.g. through an ACD Promote
 *         Call) or automatically. The ACDPriority parameter is set to the
 *         new priority. The position parameter is set to the new location
 *         of the call in the queue. 
 *       
 * 
 * <p>Java-Klasse für ACDCallPromotedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallPromotedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ACDEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{http://schema.broadsoft.com/xsi}PositiveInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallPromotedEvent", propOrder = {
    "position"
})
public class ACDCallPromotedEvent
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
