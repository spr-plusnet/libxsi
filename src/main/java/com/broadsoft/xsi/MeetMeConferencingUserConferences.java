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
 *         Contains the List of MeetMe Confrerences.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingUserConferences complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingUserConferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userConference" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingUserConference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingUserConferences", propOrder = {
    "userConference"
})
public class MeetMeConferencingUserConferences {

    protected List<MeetMeConferencingUserConference> userConference;

    /**
     * Gets the value of the userConference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userConference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetMeConferencingUserConference }
     * 
     * 
     */
    public List<MeetMeConferencingUserConference> getUserConference() {
        if (userConference == null) {
            userConference = new ArrayList<MeetMeConferencingUserConference>();
        }
        return this.userConference;
    }

}
