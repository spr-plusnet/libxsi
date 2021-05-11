//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Event is an abstract type from which all other Events are derived.
 *       
 * 
 * <p>Java-Klasse für EventData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EventData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventData")
@XmlSeeAlso({
    ACDCallForwardedEvent.class,
    ACDCallForwardedTreatmentCompletedEvent.class,
    ACDConfigurationSubscriptionEvent.class,
    ACDForcedForwardingEvent.class,
    ACDHolidayPolicyAppliedEvent.class,
    ACDHolidayPolicyTreatmentCompletedEvent.class,
    ACDHolidayServiceEvent.class,
    ACDNightPolicyAppliedEvent.class,
    ACDNightPolicyTreatmentCompletedEvent.class,
    ACDNightServiceEvent.class,
    ACDSubscriptionEvent.class,
    ACDEvent.class,
    CallCenterMonitoringEvent.class,
    ACDAgentJoinUpdateEvent.class,
    AgentSubscriptionEvent.class,
    AgentDispositionCodeAddedEvent.class,
    AgentStateEvent.class,
    CallCenterAgentMonitoringEvent.class,
    CallCenterAgentMonitoringSubscriptionEvent.class,
    CallCenterAgentOnCallAlertEvent.class,
    CallRedirectedEvent.class,
    CallSubscriptionEvent.class,
    ConferenceEvent.class,
    HookStatusEvent.class,
    VoiceMailMessageSummaryEvent.class,
    CallEvent.class,
    CollaborateRoomClientSessionInfoUpdatedEvent.class,
    CollaborateRoomLockedEvent.class,
    CollaborateRoomStartedEvent.class,
    CollaborateRoomStoppedEvent.class,
    CollaborateRoomSubscriptionEvent.class,
    CollaborateRoomUnlockedEvent.class,
    CollaborateRoomParticipantLeftEvent.class,
    CollaborateRoomParticipantJoinedEvent.class,
    CollaborateRoomParticipantMutedEvent.class,
    CollaborateRoomParticipantUnmutedEvent.class,
    CollaborateRoomParticipantUpdatedEvent.class,
    SubscriptionTerminatedEvent.class,
    RoutePointCallForwardedEvent.class,
    RoutePointCallForwardedTreatmentCompletedEvent.class,
    RoutePointCallRejectedEvent.class,
    RoutePointFailedEvent.class,
    RoutePointHolidayPolicyAppliedEvent.class,
    RoutePointHolidayPolicyTreatmentCompletedEvent.class,
    RoutePointNewCallEvent.class,
    RoutePointNightPolicyAppliedEvent.class,
    RoutePointNightPolicyTreatmentCompletedEvent.class,
    RoutePointRecoveredEvent.class,
    RoutePointSubscriptionEvent.class,
    RoutePointEvent.class,
    MeetMeAutoLectureModeStartedEvent.class,
    MeetMeConferenceClientSessionInfoUpdatedEvent.class,
    MeetMeConferenceLockedEvent.class,
    MeetMeConferenceRecordingPausedEvent.class,
    MeetMeConferenceRecordingResumedEvent.class,
    MeetMeConferenceRecordingStartedEvent.class,
    MeetMeConferenceRecordingStoppedEvent.class,
    MeetMeConferenceSecurityClassificationUpdatedEvent.class,
    MeetMeConferenceStartedEvent.class,
    MeetMeConferenceStoppedEvent.class,
    MeetMeConferenceSubscriptionEvent.class,
    MeetMeConferenceUnlockedEvent.class,
    MeetMeLectureModeStartedEvent.class,
    MeetMeLectureModeStoppedEvent.class,
    MeetMeParticipantLeftEvent.class,
    MeetMeParticipantHeldEvent.class,
    MeetMeParticipantJoinedEvent.class,
    MeetMeParticipantMutedEvent.class,
    MeetMeParticipantRetrievedEvent.class,
    MeetMeParticipantUnmutedEvent.class,
    MeetMeParticipantUpdatedEvent.class,
    PushNotificationRegistrationEvent.class,
    CallParkedAgainstEvent.class,
    ServiceEvent.class
})
public abstract class EventData {


}
