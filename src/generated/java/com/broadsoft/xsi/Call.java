//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the details of a call. Note that the local user is the user that
 *         own the call, the remote party is the party the local user is
 *         connected to, and a redirecting party is a party that has
 *         redirected the call.
 *         
 *         Change History:
 *         17.sp4 - Added recorded element.   
 *         20.0 - Added executiveUserId element  
 *         20.0 - Added allowedRecordingControls and recordingState elements.
 *         20.0 - Added securityClassification element
 *         20.0 - Added clientSessionInfo element
 *       
 * 
 * <p>Java-Klasse für Call complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Call">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/>
 *         &lt;element name="networkCallId" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *         &lt;element name="personality" type="{http://schema.broadsoft.com/xsi}Personality"/>
 *         &lt;element name="state" type="{http://schema.broadsoft.com/xsi}CallState"/>
 *         &lt;element name="releaseCause" type="{http://schema.broadsoft.com/xsi}ReleaseCause" minOccurs="0"/>
 *         &lt;element name="releasingParty" type="{http://schema.broadsoft.com/xsi}ReleasingParty" minOccurs="0"/>
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="redirections" type="{http://schema.broadsoft.com/xsi}RedirectionList" minOccurs="0"/>
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/>
 *         &lt;element name="endpoint" type="{http://schema.broadsoft.com/xsi}Endpoint" minOccurs="0"/>
 *         &lt;element name="appearance" type="{http://schema.broadsoft.com/xsi}Appearance" minOccurs="0"/>
 *         &lt;element name="allowAnswer" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="allowRetrieve" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="alternateAddressType" type="{http://schema.broadsoft.com/xsi}AlternateAddressType" minOccurs="0"/>
 *         &lt;element name="huntGroupUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="distinctiveRing" type="{http://schema.broadsoft.com/xsi}DistinctiveRing" minOccurs="0"/>
 *         &lt;element name="diversionInhibited" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="recallType" type="{http://schema.broadsoft.com/xsi}RecallType" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/>
 *         &lt;element name="answerTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="heldTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="totalHeldTime" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="detachedTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="releaseTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="acdCallInfo" type="{http://schema.broadsoft.com/xsi}ACDCallInfo" minOccurs="0"/>
 *         &lt;element name="agentEscalation" type="{http://schema.broadsoft.com/xsi}AgentEscalation" minOccurs="0"/>
 *         &lt;element name="acdOutgoingCallInfo" type="{http://schema.broadsoft.com/xsi}ACDOutgoingCallInfo" minOccurs="0"/>
 *         &lt;element name="groupCallParkLocationSelected" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="recorded" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="findMeFollowMeUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="allowedRecordingControls" type="{http://schema.broadsoft.com/xsi}RecordingControls" minOccurs="0"/>
 *         &lt;element name="recordingState" type="{http://schema.broadsoft.com/xsi}RecordingState" minOccurs="0"/>
 *         &lt;element name="executiveUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="recallFromParty" type="{http://schema.broadsoft.com/xsi}PartyInformation" minOccurs="0"/>
 *         &lt;element name="securityClassification" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *         &lt;element name="clientSessionInfo" type="{http://schema.broadsoft.com/xsi}ClientSessionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Call", propOrder = {
    "callId",
    "extTrackingId",
    "networkCallId",
    "personality",
    "state",
    "releaseCause",
    "releasingParty",
    "remoteParty",
    "redirections",
    "redirect",
    "endpoint",
    "appearance",
    "allowAnswer",
    "allowRetrieve",
    "alternateAddressType",
    "huntGroupUserId",
    "distinctiveRing",
    "diversionInhibited",
    "recallType",
    "startTime",
    "answerTime",
    "heldTime",
    "totalHeldTime",
    "detachedTime",
    "releaseTime",
    "acdCallInfo",
    "agentEscalation",
    "acdOutgoingCallInfo",
    "groupCallParkLocationSelected",
    "recorded",
    "findMeFollowMeUserId",
    "allowedRecordingControls",
    "recordingState",
    "executiveUserId",
    "recallFromParty",
    "securityClassification",
    "clientSessionInfo"
})
public class Call {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extTrackingId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String networkCallId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected Personality personality;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CallState state;
    protected ReleaseCause releaseCause;
    @XmlSchemaType(name = "token")
    protected ReleasingParty releasingParty;
    @XmlElement(required = true)
    protected PartyInformation remoteParty;
    protected RedirectionList redirections;
    protected Redirect redirect;
    protected Endpoint endpoint;
    protected Integer appearance;
    protected EmptyContent allowAnswer;
    protected EmptyContent allowRetrieve;
    protected String alternateAddressType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String huntGroupUserId;
    @XmlSchemaType(name = "token")
    protected DistinctiveRing distinctiveRing;
    protected EmptyContent diversionInhibited;
    @XmlSchemaType(name = "token")
    protected RecallType recallType;
    protected long startTime;
    protected Long answerTime;
    protected Long heldTime;
    protected Integer totalHeldTime;
    protected Long detachedTime;
    protected Long releaseTime;
    protected ACDCallInfo acdCallInfo;
    @XmlSchemaType(name = "token")
    protected AgentEscalation agentEscalation;
    protected ACDOutgoingCallInfo acdOutgoingCallInfo;
    protected EmptyContent groupCallParkLocationSelected;
    protected EmptyContent recorded;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String findMeFollowMeUserId;
    @XmlSchemaType(name = "token")
    protected RecordingControls allowedRecordingControls;
    @XmlSchemaType(name = "token")
    protected RecordingState recordingState;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String executiveUserId;
    protected PartyInformation recallFromParty;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityClassification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientSessionInfo;

    /**
     * Ruft den Wert der callId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Legt den Wert der callId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Ruft den Wert der extTrackingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTrackingId() {
        return extTrackingId;
    }

    /**
     * Legt den Wert der extTrackingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTrackingId(String value) {
        this.extTrackingId = value;
    }

    /**
     * Ruft den Wert der networkCallId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCallId() {
        return networkCallId;
    }

    /**
     * Legt den Wert der networkCallId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCallId(String value) {
        this.networkCallId = value;
    }

    /**
     * Ruft den Wert der personality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Personality }
     *     
     */
    public Personality getPersonality() {
        return personality;
    }

    /**
     * Legt den Wert der personality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Personality }
     *     
     */
    public void setPersonality(Personality value) {
        this.personality = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallState }
     *     
     */
    public CallState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallState }
     *     
     */
    public void setState(CallState value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der releaseCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseCause }
     *     
     */
    public ReleaseCause getReleaseCause() {
        return releaseCause;
    }

    /**
     * Legt den Wert der releaseCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseCause }
     *     
     */
    public void setReleaseCause(ReleaseCause value) {
        this.releaseCause = value;
    }

    /**
     * Ruft den Wert der releasingParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleasingParty }
     *     
     */
    public ReleasingParty getReleasingParty() {
        return releasingParty;
    }

    /**
     * Legt den Wert der releasingParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleasingParty }
     *     
     */
    public void setReleasingParty(ReleasingParty value) {
        this.releasingParty = value;
    }

    /**
     * Ruft den Wert der remoteParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getRemoteParty() {
        return remoteParty;
    }

    /**
     * Legt den Wert der remoteParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setRemoteParty(PartyInformation value) {
        this.remoteParty = value;
    }

    /**
     * Ruft den Wert der redirections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectionList }
     *     
     */
    public RedirectionList getRedirections() {
        return redirections;
    }

    /**
     * Legt den Wert der redirections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectionList }
     *     
     */
    public void setRedirections(RedirectionList value) {
        this.redirections = value;
    }

    /**
     * Ruft den Wert der redirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Redirect }
     *     
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * Legt den Wert der redirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Redirect }
     *     
     */
    public void setRedirect(Redirect value) {
        this.redirect = value;
    }

    /**
     * Ruft den Wert der endpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Endpoint }
     *     
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Legt den Wert der endpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Endpoint }
     *     
     */
    public void setEndpoint(Endpoint value) {
        this.endpoint = value;
    }

    /**
     * Ruft den Wert der appearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppearance() {
        return appearance;
    }

    /**
     * Legt den Wert der appearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppearance(Integer value) {
        this.appearance = value;
    }

    /**
     * Ruft den Wert der allowAnswer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getAllowAnswer() {
        return allowAnswer;
    }

    /**
     * Legt den Wert der allowAnswer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setAllowAnswer(EmptyContent value) {
        this.allowAnswer = value;
    }

    /**
     * Ruft den Wert der allowRetrieve-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getAllowRetrieve() {
        return allowRetrieve;
    }

    /**
     * Legt den Wert der allowRetrieve-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setAllowRetrieve(EmptyContent value) {
        this.allowRetrieve = value;
    }

    /**
     * Ruft den Wert der alternateAddressType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateAddressType() {
        return alternateAddressType;
    }

    /**
     * Legt den Wert der alternateAddressType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateAddressType(String value) {
        this.alternateAddressType = value;
    }

    /**
     * Ruft den Wert der huntGroupUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntGroupUserId() {
        return huntGroupUserId;
    }

    /**
     * Legt den Wert der huntGroupUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntGroupUserId(String value) {
        this.huntGroupUserId = value;
    }

    /**
     * Ruft den Wert der distinctiveRing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinctiveRing }
     *     
     */
    public DistinctiveRing getDistinctiveRing() {
        return distinctiveRing;
    }

    /**
     * Legt den Wert der distinctiveRing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinctiveRing }
     *     
     */
    public void setDistinctiveRing(DistinctiveRing value) {
        this.distinctiveRing = value;
    }

    /**
     * Ruft den Wert der diversionInhibited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getDiversionInhibited() {
        return diversionInhibited;
    }

    /**
     * Legt den Wert der diversionInhibited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setDiversionInhibited(EmptyContent value) {
        this.diversionInhibited = value;
    }

    /**
     * Ruft den Wert der recallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecallType }
     *     
     */
    public RecallType getRecallType() {
        return recallType;
    }

    /**
     * Legt den Wert der recallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecallType }
     *     
     */
    public void setRecallType(RecallType value) {
        this.recallType = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     */
    public void setStartTime(long value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der answerTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnswerTime() {
        return answerTime;
    }

    /**
     * Legt den Wert der answerTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnswerTime(Long value) {
        this.answerTime = value;
    }

    /**
     * Ruft den Wert der heldTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeldTime() {
        return heldTime;
    }

    /**
     * Legt den Wert der heldTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeldTime(Long value) {
        this.heldTime = value;
    }

    /**
     * Ruft den Wert der totalHeldTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHeldTime() {
        return totalHeldTime;
    }

    /**
     * Legt den Wert der totalHeldTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHeldTime(Integer value) {
        this.totalHeldTime = value;
    }

    /**
     * Ruft den Wert der detachedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetachedTime() {
        return detachedTime;
    }

    /**
     * Legt den Wert der detachedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetachedTime(Long value) {
        this.detachedTime = value;
    }

    /**
     * Ruft den Wert der releaseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaseTime() {
        return releaseTime;
    }

    /**
     * Legt den Wert der releaseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaseTime(Long value) {
        this.releaseTime = value;
    }

    /**
     * Ruft den Wert der acdCallInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDCallInfo }
     *     
     */
    public ACDCallInfo getAcdCallInfo() {
        return acdCallInfo;
    }

    /**
     * Legt den Wert der acdCallInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDCallInfo }
     *     
     */
    public void setAcdCallInfo(ACDCallInfo value) {
        this.acdCallInfo = value;
    }

    /**
     * Ruft den Wert der agentEscalation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentEscalation }
     *     
     */
    public AgentEscalation getAgentEscalation() {
        return agentEscalation;
    }

    /**
     * Legt den Wert der agentEscalation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentEscalation }
     *     
     */
    public void setAgentEscalation(AgentEscalation value) {
        this.agentEscalation = value;
    }

    /**
     * Ruft den Wert der acdOutgoingCallInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDOutgoingCallInfo }
     *     
     */
    public ACDOutgoingCallInfo getAcdOutgoingCallInfo() {
        return acdOutgoingCallInfo;
    }

    /**
     * Legt den Wert der acdOutgoingCallInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDOutgoingCallInfo }
     *     
     */
    public void setAcdOutgoingCallInfo(ACDOutgoingCallInfo value) {
        this.acdOutgoingCallInfo = value;
    }

    /**
     * Ruft den Wert der groupCallParkLocationSelected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getGroupCallParkLocationSelected() {
        return groupCallParkLocationSelected;
    }

    /**
     * Legt den Wert der groupCallParkLocationSelected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setGroupCallParkLocationSelected(EmptyContent value) {
        this.groupCallParkLocationSelected = value;
    }

    /**
     * Ruft den Wert der recorded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getRecorded() {
        return recorded;
    }

    /**
     * Legt den Wert der recorded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setRecorded(EmptyContent value) {
        this.recorded = value;
    }

    /**
     * Ruft den Wert der findMeFollowMeUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFindMeFollowMeUserId() {
        return findMeFollowMeUserId;
    }

    /**
     * Legt den Wert der findMeFollowMeUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFindMeFollowMeUserId(String value) {
        this.findMeFollowMeUserId = value;
    }

    /**
     * Ruft den Wert der allowedRecordingControls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecordingControls }
     *     
     */
    public RecordingControls getAllowedRecordingControls() {
        return allowedRecordingControls;
    }

    /**
     * Legt den Wert der allowedRecordingControls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingControls }
     *     
     */
    public void setAllowedRecordingControls(RecordingControls value) {
        this.allowedRecordingControls = value;
    }

    /**
     * Ruft den Wert der recordingState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecordingState }
     *     
     */
    public RecordingState getRecordingState() {
        return recordingState;
    }

    /**
     * Legt den Wert der recordingState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingState }
     *     
     */
    public void setRecordingState(RecordingState value) {
        this.recordingState = value;
    }

    /**
     * Ruft den Wert der executiveUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveUserId() {
        return executiveUserId;
    }

    /**
     * Legt den Wert der executiveUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveUserId(String value) {
        this.executiveUserId = value;
    }

    /**
     * Ruft den Wert der recallFromParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getRecallFromParty() {
        return recallFromParty;
    }

    /**
     * Legt den Wert der recallFromParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setRecallFromParty(PartyInformation value) {
        this.recallFromParty = value;
    }

    /**
     * Ruft den Wert der securityClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Legt den Wert der securityClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassification(String value) {
        this.securityClassification = value;
    }

    /**
     * Ruft den Wert der clientSessionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionInfo() {
        return clientSessionInfo;
    }

    /**
     * Legt den Wert der clientSessionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionInfo(String value) {
        this.clientSessionInfo = value;
    }

}
