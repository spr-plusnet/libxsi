//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A RoutePointQueueEntryList contains a list of RoutePointQueueEntry.
 *       
 * 
 * <p>Java-Klasse für RoutePointQueueEntryList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointQueueEntryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}RoutePointQueueEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointQueueEntryList", propOrder = {
    "queueEntry"
})
public class RoutePointQueueEntryList {

    @XmlElement(required = true)
    protected List<RoutePointQueueEntry> queueEntry;

    /**
     * Gets the value of the queueEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queueEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueueEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointQueueEntry }
     * 
     * 
     */
    public List<RoutePointQueueEntry> getQueueEntry() {
        if (queueEntry == null) {
            queueEntry = new ArrayList<RoutePointQueueEntry>();
        }
        return this.queueEntry;
    }

}
