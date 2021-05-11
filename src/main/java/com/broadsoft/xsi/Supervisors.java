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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callCenters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="callCenter" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="serviceUserID" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *                             &lt;element name="supervisorList" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="routePoint" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="supervisorList" type="{http://schema.broadsoft.com/xsi}UserInfoList" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "callCenters",
    "routePoint"
})
@XmlRootElement(name = "Supervisors")
public class Supervisors {

    protected Supervisors.CallCenters callCenters;
    protected Supervisors.RoutePoint routePoint;

    /**
     * Ruft den Wert der callCenters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Supervisors.CallCenters }
     *     
     */
    public Supervisors.CallCenters getCallCenters() {
        return callCenters;
    }

    /**
     * Legt den Wert der callCenters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Supervisors.CallCenters }
     *     
     */
    public void setCallCenters(Supervisors.CallCenters value) {
        this.callCenters = value;
    }

    /**
     * Ruft den Wert der routePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Supervisors.RoutePoint }
     *     
     */
    public Supervisors.RoutePoint getRoutePoint() {
        return routePoint;
    }

    /**
     * Legt den Wert der routePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Supervisors.RoutePoint }
     *     
     */
    public void setRoutePoint(Supervisors.RoutePoint value) {
        this.routePoint = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="callCenter" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="serviceUserID" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
     *                   &lt;element name="supervisorList" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "callCenter"
    })
    public static class CallCenters {

        @XmlElement(required = true)
        protected List<Supervisors.CallCenters.CallCenter> callCenter;

        /**
         * Gets the value of the callCenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the callCenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCallCenter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Supervisors.CallCenters.CallCenter }
         * 
         * 
         */
        public List<Supervisors.CallCenters.CallCenter> getCallCenter() {
            if (callCenter == null) {
                callCenter = new ArrayList<Supervisors.CallCenters.CallCenter>();
            }
            return this.callCenter;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="serviceUserID" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
         *         &lt;element name="supervisorList" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" maxOccurs="unbounded"/&gt;
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
            "serviceUserID",
            "supervisorList"
        })
        public static class CallCenter {

            @XmlElement(required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String serviceUserID;
            @XmlElement(required = true)
            protected List<UserDetailInfoList> supervisorList;

            /**
             * Ruft den Wert der serviceUserID-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceUserID() {
                return serviceUserID;
            }

            /**
             * Legt den Wert der serviceUserID-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceUserID(String value) {
                this.serviceUserID = value;
            }

            /**
             * Gets the value of the supervisorList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the supervisorList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSupervisorList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserDetailInfoList }
             * 
             * 
             */
            public List<UserDetailInfoList> getSupervisorList() {
                if (supervisorList == null) {
                    supervisorList = new ArrayList<UserDetailInfoList>();
                }
                return this.supervisorList;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="supervisorList" type="{http://schema.broadsoft.com/xsi}UserInfoList" maxOccurs="unbounded"/&gt;
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
        "supervisorList"
    })
    public static class RoutePoint {

        @XmlElement(required = true)
        protected List<UserInfoList> supervisorList;

        /**
         * Gets the value of the supervisorList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the supervisorList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupervisorList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserInfoList }
         * 
         * 
         */
        public List<UserInfoList> getSupervisorList() {
            if (supervisorList == null) {
                supervisorList = new ArrayList<UserInfoList>();
            }
            return this.supervisorList;
        }

    }

}
