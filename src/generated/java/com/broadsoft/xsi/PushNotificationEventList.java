//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         A list of Push Notification events.
 *         Change History:
 *         R22.0 - Added
 *         R24.0 - Modified (patched in R21.sp1.551, R22.0.1123, R23.0.1075)
 *                 To maintain backwards compatibility, this type contains a choice:
 *                 - "event" to support the previous schema definition
 *                 - "eventDetail" to support the new schema  
 *       
 * 
 * <p>Java-Klasse für PushNotificationEventList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationEventList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="event" type="{http://schema.broadsoft.com/xsi}PushNotificationEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="eventDetail" type="{http://schema.broadsoft.com/xsi}PushNotificationEventDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationEventList", propOrder = {
    "event",
    "eventDetail"
})
public class PushNotificationEventList {

    protected List<String> event;
    protected List<PushNotificationEventDetail> eventDetail;

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEvent() {
        if (event == null) {
            event = new ArrayList<String>();
        }
        return this.event;
    }

    /**
     * Gets the value of the eventDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PushNotificationEventDetail }
     * 
     * 
     */
    public List<PushNotificationEventDetail> getEventDetail() {
        if (eventDetail == null) {
            eventDetail = new ArrayList<PushNotificationEventDetail>();
        }
        return this.eventDetail;
    }

}
