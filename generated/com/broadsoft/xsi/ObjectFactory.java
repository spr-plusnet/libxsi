//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.broadsoft.xsi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallingLineIDBlockingOverride_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallingLineIDBlockingOverride");
    private final static QName _Call_QNAME = new QName("http://schema.broadsoft.com/xsi", "Call");
    private final static QName _CallingLineIDDeliveryBlocking_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallingLineIDDeliveryBlocking");
    private final static QName _MeetMeConferencingUserConferences_QNAME = new QName("http://schema.broadsoft.com/xsi", "MeetMeConferencingUserConferences");
    private final static QName _MWIDeliveryToMobileEndpoint_QNAME = new QName("http://schema.broadsoft.com/xsi", "MWIDeliveryToMobileEndpoint");
    private final static QName _SequentialRing_QNAME = new QName("http://schema.broadsoft.com/xsi", "SequentialRing");
    private final static QName _ExecutiveAssistant_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveAssistant");
    private final static QName _ChannelHeartBeat_QNAME = new QName("http://schema.broadsoft.com/xsi", "ChannelHeartBeat");
    private final static QName _MeetMeConference_QNAME = new QName("http://schema.broadsoft.com/xsi", "MeetMeConference");
    private final static QName _CallForwardingNoAnswer_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallForwardingNoAnswer");
    private final static QName _IMRNInfo_QNAME = new QName("http://schema.broadsoft.com/xsi", "IMRNInfo");
    private final static QName _Event_QNAME = new QName("http://schema.broadsoft.com/xsi", "Event");
    private final static QName _DoNotDisturb_QNAME = new QName("http://schema.broadsoft.com/xsi", "DoNotDisturb");
    private final static QName _CollaborateRoomInfo_QNAME = new QName("http://schema.broadsoft.com/xsi", "CollaborateRoomInfo");
    private final static QName _ExecutiveAlerting_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveAlerting");
    private final static QName _PersonalAssistantAvailableCallToNumbers_QNAME = new QName("http://schema.broadsoft.com/xsi", "PersonalAssistantAvailableCallToNumbers");
    private final static QName _PersonalAssistantExclusionNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "PersonalAssistantExclusionNumber");
    private final static QName _MeetMeConferencingConference_QNAME = new QName("http://schema.broadsoft.com/xsi", "MeetMeConferencingConference");
    private final static QName _CallForwardingNotReachable_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallForwardingNotReachable");
    private final static QName _RemoteOffice_QNAME = new QName("http://schema.broadsoft.com/xsi", "RemoteOffice");
    private final static QName _EventResponse_QNAME = new QName("http://schema.broadsoft.com/xsi", "EventResponse");
    private final static QName _CollaborateRoom_QNAME = new QName("http://schema.broadsoft.com/xsi", "CollaborateRoom");
    private final static QName _ExecutiveCallFiltering_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveCallFiltering");
    private final static QName _ConnectedLineIdentificationPresentation_QNAME = new QName("http://schema.broadsoft.com/xsi", "ConnectedLineIdentificationPresentation");
    private final static QName _CommPilotExpress_QNAME = new QName("http://schema.broadsoft.com/xsi", "CommPilotExpress");
    private final static QName _RoutePointState_QNAME = new QName("http://schema.broadsoft.com/xsi", "RoutePointState");
    private final static QName _ExecutiveFilteringCriteria_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveFilteringCriteria");
    private final static QName _Channel_QNAME = new QName("http://schema.broadsoft.com/xsi", "Channel");
    private final static QName _CallWaiting_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallWaiting");
    private final static QName _SimultaneousRingPersonal_QNAME = new QName("http://schema.broadsoft.com/xsi", "SimultaneousRingPersonal");
    private final static QName _Executive_QNAME = new QName("http://schema.broadsoft.com/xsi", "Executive");
    private final static QName _HotelingGuest_QNAME = new QName("http://schema.broadsoft.com/xsi", "HotelingGuest");
    private final static QName _BroadWorksAnywhere_QNAME = new QName("http://schema.broadsoft.com/xsi", "BroadWorksAnywhere");
    private final static QName _InCallServiceActivation_QNAME = new QName("http://schema.broadsoft.com/xsi", "InCallServiceActivation");
    private final static QName _ExecutiveScreening_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveScreening");
    private final static QName _PersonalAssistant_QNAME = new QName("http://schema.broadsoft.com/xsi", "PersonalAssistant");
    private final static QName _CallTransfer_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallTransfer");
    private final static QName _CallForwardingAlways_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallForwardingAlways");
    private final static QName _CallingNameRetrieval_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallingNameRetrieval");
    private final static QName _CallForwardingBusy_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallForwardingBusy");
    private final static QName _GroupNightForwarding_QNAME = new QName("http://schema.broadsoft.com/xsi", "GroupNightForwarding");
    private final static QName _ConnectedLineIdentificationRestriction_QNAME = new QName("http://schema.broadsoft.com/xsi", "ConnectedLineIdentificationRestriction");
    private final static QName _Conference_QNAME = new QName("http://schema.broadsoft.com/xsi", "Conference");
    private final static QName _MeetMeConferencingConferenceInfo_QNAME = new QName("http://schema.broadsoft.com/xsi", "MeetMeConferencingConferenceInfo");
    private final static QName _CallForwardingAlwaysSecondary_QNAME = new QName("http://schema.broadsoft.com/xsi", "CallForwardingAlwaysSecondary");
    private final static QName _PersonalAssistantAssignedCallToNumbers_QNAME = new QName("http://schema.broadsoft.com/xsi", "PersonalAssistantAssignedCallToNumbers");
    private final static QName _IntegratedIMPService_QNAME = new QName("http://schema.broadsoft.com/xsi", "IntegratedIMPService");
    private final static QName _MeetMeConferencingUserBridges_QNAME = new QName("http://schema.broadsoft.com/xsi", "MeetMeConferencingUserBridges");
    private final static QName _PersonalAssistantExclusionNumberList_QNAME = new QName("http://schema.broadsoft.com/xsi", "PersonalAssistantExclusionNumberList");
    private final static QName _Subscription_QNAME = new QName("http://schema.broadsoft.com/xsi", "Subscription");
    private final static QName _SilentAlerting_QNAME = new QName("http://schema.broadsoft.com/xsi", "SilentAlerting");
    private final static QName _ExecutiveAssistants_QNAME = new QName("http://schema.broadsoft.com/xsi", "ExecutiveAssistants");
    private final static QName _FlexibleSeatingGuest_QNAME = new QName("http://schema.broadsoft.com/xsi", "FlexibleSeatingGuest");
    private final static QName _BroadWorksMobilityMobileIdentityDescription_QNAME = new QName("http://schema.broadsoft.com/xsi", "description");
    private final static QName _SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME = new QName("http://schema.broadsoft.com/xsi", "phoneNumberList");
    private final static QName _BroadWorksMobilityCallAnchoringPolicyTimeSchedule_QNAME = new QName("http://schema.broadsoft.com/xsi", "timeSchedule");
    private final static QName _BroadWorksMobilityCallAnchoringPolicyHolidaySchedule_QNAME = new QName("http://schema.broadsoft.com/xsi", "holidaySchedule");
    private final static QName _CallForwardingForwardToPhoneNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "forwardToPhoneNumber");
    private final static QName _FlexibleSeatingGuestHostUserId_QNAME = new QName("http://schema.broadsoft.com/xsi", "hostUserId");
    private final static QName _FlexibleSeatingGuestUnlockPhonePINCode_QNAME = new QName("http://schema.broadsoft.com/xsi", "unlockPhonePINCode");
    private final static QName _FileDescriptorFileUrl_QNAME = new QName("http://schema.broadsoft.com/xsi", "fileUrl");
    private final static QName _CallCenterAgentUnavailableCode_QNAME = new QName("http://schema.broadsoft.com/xsi", "agentUnavailableCode");
    private final static QName _CallCenterOutgoingCallDNIS_QNAME = new QName("http://schema.broadsoft.com/xsi", "outgoingCallDNIS");
    private final static QName _BroadWorksMobilityAlertingPolicyInfoMobileNumbersAlertList_QNAME = new QName("http://schema.broadsoft.com/xsi", "mobileNumbersAlertList");
    private final static QName _ACDNightServiceTransferPhoneNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "transferPhoneNumber");
    private final static QName _ACDNightServiceBusinessHours_QNAME = new QName("http://schema.broadsoft.com/xsi", "businessHours");
    private final static QName _CommPilotExpressAvailableInOfficeAdditionalPhoneNumberToRing_QNAME = new QName("http://schema.broadsoft.com/xsi", "additionalPhoneNumberToRing");
    private final static QName _CallCenterAnnouncementFileListFile4_QNAME = new QName("http://schema.broadsoft.com/xsi", "file4");
    private final static QName _CallCenterAnnouncementFileListFile2_QNAME = new QName("http://schema.broadsoft.com/xsi", "file2");
    private final static QName _CallCenterAnnouncementFileListFile3_QNAME = new QName("http://schema.broadsoft.com/xsi", "file3");
    private final static QName _CallCenterAnnouncementFileListFile1_QNAME = new QName("http://schema.broadsoft.com/xsi", "file1");
    private final static QName _CriteriaWithFromDnAndCallToNumberCriteriaCallToNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "criteriaCallToNumber");
    private final static QName _AlternateNumbersNumbers_QNAME = new QName("http://schema.broadsoft.com/xsi", "numbers");
    private final static QName _CommPilotExpressRedirectionWithExceptionExcludedAddress1_QNAME = new QName("http://schema.broadsoft.com/xsi", "excludedAddress1");
    private final static QName _CommPilotExpressRedirectionWithExceptionForwardToAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "forwardToAddress");
    private final static QName _CommPilotExpressRedirectionWithExceptionExcludedAddress3_QNAME = new QName("http://schema.broadsoft.com/xsi", "excludedAddress3");
    private final static QName _CommPilotExpressRedirectionWithExceptionExcludedAddress2_QNAME = new QName("http://schema.broadsoft.com/xsi", "excludedAddress2");
    private final static QName _UserInfoHiranganaLastName_QNAME = new QName("http://schema.broadsoft.com/xsi", "hiranganaLastName");
    private final static QName _UserInfoFirstName_QNAME = new QName("http://schema.broadsoft.com/xsi", "firstName");
    private final static QName _UserInfoLastName_QNAME = new QName("http://schema.broadsoft.com/xsi", "lastName");
    private final static QName _UserInfoHiranganaFirstName_QNAME = new QName("http://schema.broadsoft.com/xsi", "hiranganaFirstName");
    private final static QName _PersonalAssistantAssignedCallToNumbersCallToNumberList_QNAME = new QName("http://schema.broadsoft.com/xsi", "callToNumberList");
    private final static QName _CallForwardingSelectiveDefaultForwardToPhoneNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "defaultForwardToPhoneNumber");
    private final static QName _AttendantConsoleMonitoredUsers_QNAME = new QName("http://schema.broadsoft.com/xsi", "monitoredUsers");
    private final static QName _AttendantConsoleDisplayFields_QNAME = new QName("http://schema.broadsoft.com/xsi", "displayFields");
    private final static QName _SpeedDial8EntryPhoneNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "phoneNumber");
    private final static QName _VoiceMessagingGreetingsGreetingOnlyForwardDestination_QNAME = new QName("http://schema.broadsoft.com/xsi", "greetingOnlyForwardDestination");
    private final static QName _CommPilotExpressEmailNotifyEmailAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "emailAddress");
    private final static QName _FeatureAccessCodeEntryAlternateCode_QNAME = new QName("http://schema.broadsoft.com/xsi", "alternateCode");
    private final static QName _AlternateNumberEntryExtension_QNAME = new QName("http://schema.broadsoft.com/xsi", "extension");
    private final static QName _AlternateNumberEntryRingPattern_QNAME = new QName("http://schema.broadsoft.com/xsi", "ringPattern");
    private final static QName _SimultaneousRingPersonalSimRingLocations_QNAME = new QName("http://schema.broadsoft.com/xsi", "simRingLocations");
    private final static QName _VoiceMessagingVoiceMessageDeliveryEmailAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "voiceMessageDeliveryEmailAddress");
    private final static QName _VoiceMessagingVoiceMessageCarbonCopyEmailAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "voiceMessageCarbonCopyEmailAddress");
    private final static QName _VoiceMessagingVoiceMessageNotifyEmailAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "voiceMessageNotifyEmailAddress");
    private final static QName _CommPilotExpressRedirectionForwardingAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "forwardingAddress");
    private final static QName _CallParkUserDetailsList_QNAME = new QName("http://schema.broadsoft.com/xsi", "userDetailsList");
    private final static QName _BroadWorksAnywhereLocationOutboundAlternateNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "outboundAlternateNumber");
    private final static QName _MWIDeliveryToMobileEndpointMobilePhoneNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "mobilePhoneNumber");
    private final static QName _PersonalAssistantExpirationTime_QNAME = new QName("http://schema.broadsoft.com/xsi", "expirationTime");
    private final static QName _PersonalAssistantAttendantNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "attendantNumber");
    private final static QName _RemoteOfficeRemoteOfficeNumber_QNAME = new QName("http://schema.broadsoft.com/xsi", "remoteOfficeNumber");
    private final static QName _CallCenterAnnouncementURLListUrl1_QNAME = new QName("http://schema.broadsoft.com/xsi", "url1");
    private final static QName _CallCenterAnnouncementURLListUrl2_QNAME = new QName("http://schema.broadsoft.com/xsi", "url2");
    private final static QName _CallCenterAnnouncementURLListUrl3_QNAME = new QName("http://schema.broadsoft.com/xsi", "url3");
    private final static QName _CallCenterAnnouncementURLListUrl4_QNAME = new QName("http://schema.broadsoft.com/xsi", "url4");
    private final static QName _PrivacyAllowedUsers_QNAME = new QName("http://schema.broadsoft.com/xsi", "allowedUsers");
    private final static QName _BusyLampFieldListURI_QNAME = new QName("http://schema.broadsoft.com/xsi", "listURI");
    private final static QName _BusyLampFieldMonitoredUserList_QNAME = new QName("http://schema.broadsoft.com/xsi", "monitoredUserList");
    private final static QName _SequentialRingLocationAddress_QNAME = new QName("http://schema.broadsoft.com/xsi", "address");
    private final static QName _MeetMeConferencingConferenceAccountCode_QNAME = new QName("http://schema.broadsoft.com/xsi", "accountCode");
    private final static QName _OutgoingMWIOutgoingSMDIMWIPhoneNumberList_QNAME = new QName("http://schema.broadsoft.com/xsi", "outgoingSMDIMWIPhoneNumberList");
    private final static QName _PushToTalkAccessListSelection_QNAME = new QName("http://schema.broadsoft.com/xsi", "accessListSelection");
    private final static QName _CommPilotExpressProfile_QNAME = new QName("http://schema.broadsoft.com/xsi", "profile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.broadsoft.xsi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.broadsoft.xsi.CallCenters }
     * 
     */
    public com.broadsoft.xsi.CallCenters createCallCenters() {
        return new com.broadsoft.xsi.CallCenters();
    }

    /**
     * Create an instance of {@link Directory }
     * 
     */
    public Directory createDirectory() {
        return new Directory();
    }

    /**
     * Create an instance of {@link BroadWorksAnywherePortal }
     * 
     */
    public BroadWorksAnywherePortal createBroadWorksAnywherePortal() {
        return new BroadWorksAnywherePortal();
    }

    /**
     * Create an instance of {@link AvailableHotelingHosts }
     * 
     */
    public AvailableHotelingHosts createAvailableHotelingHosts() {
        return new AvailableHotelingHosts();
    }

    /**
     * Create an instance of {@link Supervisors }
     * 
     */
    public Supervisors createSupervisors() {
        return new Supervisors();
    }

    /**
     * Create an instance of {@link AvailableFlexibleSeatingHosts }
     * 
     */
    public AvailableFlexibleSeatingHosts createAvailableFlexibleSeatingHosts() {
        return new AvailableFlexibleSeatingHosts();
    }

    /**
     * Create an instance of {@link CallCenterAgents }
     * 
     */
    public CallCenterAgents createCallCenterAgents() {
        return new CallCenterAgents();
    }

    /**
     * Create an instance of {@link Recurrence }
     * 
     */
    public Recurrence createRecurrence() {
        return new Recurrence();
    }

    /**
     * Create an instance of {@link CollaborateRoomSchedule }
     * 
     */
    public CollaborateRoomSchedule createCollaborateRoomSchedule() {
        return new CollaborateRoomSchedule();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceSchedule }
     * 
     */
    public MeetMeConferencingConferenceSchedule createMeetMeConferencingConferenceSchedule() {
        return new MeetMeConferencingConferenceSchedule();
    }

    /**
     * Create an instance of {@link Supervisors.CallCenters }
     * 
     */
    public Supervisors.CallCenters createSupervisorsCallCenters() {
        return new Supervisors.CallCenters();
    }

    /**
     * Create an instance of {@link RoutePointPlaySilence }
     * 
     */
    public RoutePointPlaySilence createRoutePointPlaySilence() {
        return new RoutePointPlaySilence();
    }

    /**
     * Create an instance of {@link CallForwardingBusy }
     * 
     */
    public CallForwardingBusy createCallForwardingBusy() {
        return new CallForwardingBusy();
    }

    /**
     * Create an instance of {@link GroupNightForwarding }
     * 
     */
    public GroupNightForwarding createGroupNightForwarding() {
        return new GroupNightForwarding();
    }

    /**
     * Create an instance of {@link ConnectedLineIdentificationRestriction }
     * 
     */
    public ConnectedLineIdentificationRestriction createConnectedLineIdentificationRestriction() {
        return new ConnectedLineIdentificationRestriction();
    }

    /**
     * Create an instance of {@link CallingNameRetrieval }
     * 
     */
    public CallingNameRetrieval createCallingNameRetrieval() {
        return new CallingNameRetrieval();
    }

    /**
     * Create an instance of {@link CallPark }
     * 
     */
    public CallPark createCallPark() {
        return new CallPark();
    }

    /**
     * Create an instance of {@link UserDetailsList }
     * 
     */
    public UserDetailsList createUserDetailsList() {
        return new UserDetailsList();
    }

    /**
     * Create an instance of {@link RoutePointPlayRingBack }
     * 
     */
    public RoutePointPlayRingBack createRoutePointPlayRingBack() {
        return new RoutePointPlayRingBack();
    }

    /**
     * Create an instance of {@link PersonalAssistantAssignedCallToNumbers }
     * 
     */
    public PersonalAssistantAssignedCallToNumbers createPersonalAssistantAssignedCallToNumbers() {
        return new PersonalAssistantAssignedCallToNumbers();
    }

    /**
     * Create an instance of {@link RoutePointCallStartInfo }
     * 
     */
    public RoutePointCallStartInfo createRoutePointCallStartInfo() {
        return new RoutePointCallStartInfo();
    }

    /**
     * Create an instance of {@link IntegratedIMPService }
     * 
     */
    public IntegratedIMPService createIntegratedIMPService() {
        return new IntegratedIMPService();
    }

    /**
     * Create an instance of {@link MeetMeConferencingUserBridges }
     * 
     */
    public MeetMeConferencingUserBridges createMeetMeConferencingUserBridges() {
        return new MeetMeConferencingUserBridges();
    }

    /**
     * Create an instance of {@link com.broadsoft.xsi.CallCenters.CallCenter }
     * 
     */
    public com.broadsoft.xsi.CallCenters.CallCenter createCallCentersCallCenter() {
        return new com.broadsoft.xsi.CallCenters.CallCenter();
    }

    /**
     * Create an instance of {@link Conference }
     * 
     */
    public Conference createConference() {
        return new Conference();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceInfo }
     * 
     */
    public MeetMeConferencingConferenceInfo createMeetMeConferencingConferenceInfo() {
        return new MeetMeConferencingConferenceInfo();
    }

    /**
     * Create an instance of {@link CallForwardingAlwaysSecondary }
     * 
     */
    public CallForwardingAlwaysSecondary createCallForwardingAlwaysSecondary() {
        return new CallForwardingAlwaysSecondary();
    }

    /**
     * Create an instance of {@link Privacy }
     * 
     */
    public Privacy createPrivacy() {
        return new Privacy();
    }

    /**
     * Create an instance of {@link UserDetailInfoList }
     * 
     */
    public UserDetailInfoList createUserDetailInfoList() {
        return new UserDetailInfoList();
    }

    /**
     * Create an instance of {@link RoutePointOutgoingDial }
     * 
     */
    public RoutePointOutgoingDial createRoutePointOutgoingDial() {
        return new RoutePointOutgoingDial();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link SilentAlerting }
     * 
     */
    public SilentAlerting createSilentAlerting() {
        return new SilentAlerting();
    }

    /**
     * Create an instance of {@link ExecutiveAssistants }
     * 
     */
    public ExecutiveAssistants createExecutiveAssistants() {
        return new ExecutiveAssistants();
    }

    /**
     * Create an instance of {@link ExternalCallingLineIDDelivery }
     * 
     */
    public ExternalCallingLineIDDelivery createExternalCallingLineIDDelivery() {
        return new ExternalCallingLineIDDelivery();
    }

    /**
     * Create an instance of {@link ActivatableServiceInfo }
     * 
     */
    public ActivatableServiceInfo createActivatableServiceInfo() {
        return new ActivatableServiceInfo();
    }

    /**
     * Create an instance of {@link Registrations }
     * 
     */
    public Registrations createRegistrations() {
        return new Registrations();
    }

    /**
     * Create an instance of {@link RegistrationEntry }
     * 
     */
    public RegistrationEntry createRegistrationEntry() {
        return new RegistrationEntry();
    }

    /**
     * Create an instance of {@link ExecutiveFilteringCriteria }
     * 
     */
    public ExecutiveFilteringCriteria createExecutiveFilteringCriteria() {
        return new ExecutiveFilteringCriteria();
    }

    /**
     * Create an instance of {@link VoiceMessaging }
     * 
     */
    public VoiceMessaging createVoiceMessaging() {
        return new VoiceMessaging();
    }

    /**
     * Create an instance of {@link Personal }
     * 
     */
    public Personal createPersonal() {
        return new Personal();
    }

    /**
     * Create an instance of {@link PersonalEntry }
     * 
     */
    public PersonalEntry createPersonalEntry() {
        return new PersonalEntry();
    }

    /**
     * Create an instance of {@link PushToTalk }
     * 
     */
    public PushToTalk createPushToTalk() {
        return new PushToTalk();
    }

    /**
     * Create an instance of {@link UserIdList }
     * 
     */
    public UserIdList createUserIdList() {
        return new UserIdList();
    }

    /**
     * Create an instance of {@link ACDDNISKey }
     * 
     */
    public ACDDNISKey createACDDNISKey() {
        return new ACDDNISKey();
    }

    /**
     * Create an instance of {@link OutlookIntegration }
     * 
     */
    public OutlookIntegration createOutlookIntegration() {
        return new OutlookIntegration();
    }

    /**
     * Create an instance of {@link SelectiveCallAcceptanceCriteria }
     * 
     */
    public SelectiveCallAcceptanceCriteria createSelectiveCallAcceptanceCriteria() {
        return new SelectiveCallAcceptanceCriteria();
    }

    /**
     * Create an instance of {@link CriteriaWithFromDnAndCallToNumber }
     * 
     */
    public CriteriaWithFromDnAndCallToNumber createCriteriaWithFromDnAndCallToNumber() {
        return new CriteriaWithFromDnAndCallToNumber();
    }

    /**
     * Create an instance of {@link SpeedDial100 }
     * 
     */
    public SpeedDial100 createSpeedDial100() {
        return new SpeedDial100();
    }

    /**
     * Create an instance of {@link SpeedDial100Entry }
     * 
     */
    public SpeedDial100Entry createSpeedDial100Entry() {
        return new SpeedDial100Entry();
    }

    /**
     * Create an instance of {@link RoutePointPlayInfo }
     * 
     */
    public RoutePointPlayInfo createRoutePointPlayInfo() {
        return new RoutePointPlayInfo();
    }

    /**
     * Create an instance of {@link CallForwardingSelective }
     * 
     */
    public CallForwardingSelective createCallForwardingSelective() {
        return new CallForwardingSelective();
    }

    /**
     * Create an instance of {@link CriteriaActivationList }
     * 
     */
    public CriteriaActivationList createCriteriaActivationList() {
        return new CriteriaActivationList();
    }

    /**
     * Create an instance of {@link CallMeNowStartInfo }
     * 
     */
    public CallMeNowStartInfo createCallMeNowStartInfo() {
        return new CallMeNowStartInfo();
    }

    /**
     * Create an instance of {@link com.broadsoft.xsi.CallCenter }
     * 
     */
    public com.broadsoft.xsi.CallCenter createCallCenter() {
        return new com.broadsoft.xsi.CallCenter();
    }

    /**
     * Create an instance of {@link DNISKey }
     * 
     */
    public DNISKey createDNISKey() {
        return new DNISKey();
    }

    /**
     * Create an instance of {@link CallCenterList }
     * 
     */
    public CallCenterList createCallCenterList() {
        return new CallCenterList();
    }

    /**
     * Create an instance of {@link AttendantConsole }
     * 
     */
    public AttendantConsole createAttendantConsole() {
        return new AttendantConsole();
    }

    /**
     * Create an instance of {@link AttendantConsoleDisplayFieldList }
     * 
     */
    public AttendantConsoleDisplayFieldList createAttendantConsoleDisplayFieldList() {
        return new AttendantConsoleDisplayFieldList();
    }

    /**
     * Create an instance of {@link OutgoingMWI }
     * 
     */
    public OutgoingMWI createOutgoingMWI() {
        return new OutgoingMWI();
    }

    /**
     * Create an instance of {@link OutgoingDNList }
     * 
     */
    public OutgoingDNList createOutgoingDNList() {
        return new OutgoingDNList();
    }

    /**
     * Create an instance of {@link HotelingGuest }
     * 
     */
    public HotelingGuest createHotelingGuest() {
        return new HotelingGuest();
    }

    /**
     * Create an instance of {@link SelectiveCallAcceptance }
     * 
     */
    public SelectiveCallAcceptance createSelectiveCallAcceptance() {
        return new SelectiveCallAcceptance();
    }

    /**
     * Create an instance of {@link ExecutiveScreening }
     * 
     */
    public ExecutiveScreening createExecutiveScreening() {
        return new ExecutiveScreening();
    }

    /**
     * Create an instance of {@link PersonalAssistant }
     * 
     */
    public PersonalAssistant createPersonalAssistant() {
        return new PersonalAssistant();
    }

    /**
     * Create an instance of {@link Versions }
     * 
     */
    public Versions createVersions() {
        return new Versions();
    }

    /**
     * Create an instance of {@link Commands }
     * 
     */
    public Commands createCommands() {
        return new Commands();
    }

    /**
     * Create an instance of {@link EventPackages }
     * 
     */
    public EventPackages createEventPackages() {
        return new EventPackages();
    }

    /**
     * Create an instance of {@link LoginToken }
     * 
     */
    public LoginToken createLoginToken() {
        return new LoginToken();
    }

    /**
     * Create an instance of {@link AutomaticCallback }
     * 
     */
    public AutomaticCallback createAutomaticCallback() {
        return new AutomaticCallback();
    }

    /**
     * Create an instance of {@link CallForwardingAlways }
     * 
     */
    public CallForwardingAlways createCallForwardingAlways() {
        return new CallForwardingAlways();
    }

    /**
     * Create an instance of {@link InternalCallingLineIDDelivery }
     * 
     */
    public InternalCallingLineIDDelivery createInternalCallingLineIDDelivery() {
        return new InternalCallingLineIDDelivery();
    }

    /**
     * Create an instance of {@link ACDDNIS }
     * 
     */
    public ACDDNIS createACDDNIS() {
        return new ACDDNIS();
    }

    /**
     * Create an instance of {@link ACDDNISDisplaySetting }
     * 
     */
    public ACDDNISDisplaySetting createACDDNISDisplaySetting() {
        return new ACDDNISDisplaySetting();
    }

    /**
     * Create an instance of {@link ACDDNISPrioritySetting }
     * 
     */
    public ACDDNISPrioritySetting createACDDNISPrioritySetting() {
        return new ACDDNISPrioritySetting();
    }

    /**
     * Create an instance of {@link ACDDNISInfoList }
     * 
     */
    public ACDDNISInfoList createACDDNISInfoList() {
        return new ACDDNISInfoList();
    }

    /**
     * Create an instance of {@link GroupCommon }
     * 
     */
    public GroupCommon createGroupCommon() {
        return new GroupCommon();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link UserAdditionalDetailsList }
     * 
     */
    public UserAdditionalDetailsList createUserAdditionalDetailsList() {
        return new UserAdditionalDetailsList();
    }

    /**
     * Create an instance of {@link ACDForcedForwarding }
     * 
     */
    public ACDForcedForwarding createACDForcedForwarding() {
        return new ACDForcedForwarding();
    }

    /**
     * Create an instance of {@link CallCenterAnnouncementURLList }
     * 
     */
    public CallCenterAnnouncementURLList createCallCenterAnnouncementURLList() {
        return new CallCenterAnnouncementURLList();
    }

    /**
     * Create an instance of {@link CallCenterAnnouncementFileList }
     * 
     */
    public CallCenterAnnouncementFileList createCallCenterAnnouncementFileList() {
        return new CallCenterAnnouncementFileList();
    }

    /**
     * Create an instance of {@link AlternateNumbers }
     * 
     */
    public AlternateNumbers createAlternateNumbers() {
        return new AlternateNumbers();
    }

    /**
     * Create an instance of {@link AlternateNumbersList }
     * 
     */
    public AlternateNumbersList createAlternateNumbersList() {
        return new AlternateNumbersList();
    }

    /**
     * Create an instance of {@link ExecutiveAlerting }
     * 
     */
    public ExecutiveAlerting createExecutiveAlerting() {
        return new ExecutiveAlerting();
    }

    /**
     * Create an instance of {@link CallToNumberList }
     * 
     */
    public CallToNumberList createCallToNumberList() {
        return new CallToNumberList();
    }

    /**
     * Create an instance of {@link QueueCallOrder }
     * 
     */
    public QueueCallOrder createQueueCallOrder() {
        return new QueueCallOrder();
    }

    /**
     * Create an instance of {@link VoiceMessagingMessages }
     * 
     */
    public VoiceMessagingMessages createVoiceMessagingMessages() {
        return new VoiceMessagingMessages();
    }

    /**
     * Create an instance of {@link MessageInfoList }
     * 
     */
    public MessageInfoList createMessageInfoList() {
        return new MessageInfoList();
    }

    /**
     * Create an instance of {@link PersonalAssistantExclusionNumberEntry }
     * 
     */
    public PersonalAssistantExclusionNumberEntry createPersonalAssistantExclusionNumberEntry() {
        return new PersonalAssistantExclusionNumberEntry();
    }

    /**
     * Create an instance of {@link RoutePointPlayBusy }
     * 
     */
    public RoutePointPlayBusy createRoutePointPlayBusy() {
        return new RoutePointPlayBusy();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConference }
     * 
     */
    public MeetMeConferencingConference createMeetMeConferencingConference() {
        return new MeetMeConferencingConference();
    }

    /**
     * Create an instance of {@link CommPilotCallManager }
     * 
     */
    public CommPilotCallManager createCommPilotCallManager() {
        return new CommPilotCallManager();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link UserDetails }
     * 
     */
    public UserDetails createUserDetails() {
        return new UserDetails();
    }

    /**
     * Create an instance of {@link UserAdditionalDetails }
     * 
     */
    public UserAdditionalDetails createUserAdditionalDetails() {
        return new UserAdditionalDetails();
    }

    /**
     * Create an instance of {@link CallForwardingNotReachable }
     * 
     */
    public CallForwardingNotReachable createCallForwardingNotReachable() {
        return new CallForwardingNotReachable();
    }

    /**
     * Create an instance of {@link RemoteOffice }
     * 
     */
    public RemoteOffice createRemoteOffice() {
        return new RemoteOffice();
    }

    /**
     * Create an instance of {@link CallingNumberDelivery }
     * 
     */
    public CallingNumberDelivery createCallingNumberDelivery() {
        return new CallingNumberDelivery();
    }

    /**
     * Create an instance of {@link CallMeNow }
     * 
     */
    public CallMeNow createCallMeNow() {
        return new CallMeNow();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link AnonymousCallRejection }
     * 
     */
    public AnonymousCallRejection createAnonymousCallRejection() {
        return new AnonymousCallRejection();
    }

    /**
     * Create an instance of {@link RoutePointPlayMusicOnHold }
     * 
     */
    public RoutePointPlayMusicOnHold createRoutePointPlayMusicOnHold() {
        return new RoutePointPlayMusicOnHold();
    }

    /**
     * Create an instance of {@link AccountCodes }
     * 
     */
    public AccountCodes createAccountCodes() {
        return new AccountCodes();
    }

    /**
     * Create an instance of {@link AccountAuthorizationCodeEntry }
     * 
     */
    public AccountAuthorizationCodeEntry createAccountAuthorizationCodeEntry() {
        return new AccountAuthorizationCodeEntry();
    }

    /**
     * Create an instance of {@link SelectiveCallRejection }
     * 
     */
    public SelectiveCallRejection createSelectiveCallRejection() {
        return new SelectiveCallRejection();
    }

    /**
     * Create an instance of {@link ExecutiveCallFiltering }
     * 
     */
    public ExecutiveCallFiltering createExecutiveCallFiltering() {
        return new ExecutiveCallFiltering();
    }

    /**
     * Create an instance of {@link Portal }
     * 
     */
    public Portal createPortal() {
        return new Portal();
    }

    /**
     * Create an instance of {@link CommPilotExpress }
     * 
     */
    public CommPilotExpress createCommPilotExpress() {
        return new CommPilotExpress();
    }

    /**
     * Create an instance of {@link ACDExternalReporting }
     * 
     */
    public ACDExternalReporting createACDExternalReporting() {
        return new ACDExternalReporting();
    }

    /**
     * Create an instance of {@link CallMeNowCriteria }
     * 
     */
    public CallMeNowCriteria createCallMeNowCriteria() {
        return new CallMeNowCriteria();
    }

    /**
     * Create an instance of {@link CriteriaWithToDn }
     * 
     */
    public CriteriaWithToDn createCriteriaWithToDn() {
        return new CriteriaWithToDn();
    }

    /**
     * Create an instance of {@link CustomRingbackUser }
     * 
     */
    public CustomRingbackUser createCustomRingbackUser() {
        return new CustomRingbackUser();
    }

    /**
     * Create an instance of {@link Directory.Contacts }
     * 
     */
    public Directory.Contacts createDirectoryContacts() {
        return new Directory.Contacts();
    }

    /**
     * Create an instance of {@link PriorityAlertCriteria }
     * 
     */
    public PriorityAlertCriteria createPriorityAlertCriteria() {
        return new PriorityAlertCriteria();
    }

    /**
     * Create an instance of {@link CriteriaWithPriorityAlert }
     * 
     */
    public CriteriaWithPriorityAlert createCriteriaWithPriorityAlert() {
        return new CriteriaWithPriorityAlert();
    }

    /**
     * Create an instance of {@link AgentCallCenterAssignedStatus }
     * 
     */
    public AgentCallCenterAssignedStatus createAgentCallCenterAssignedStatus() {
        return new AgentCallCenterAssignedStatus();
    }

    /**
     * Create an instance of {@link Call }
     * 
     */
    public Call createCall() {
        return new Call();
    }

    /**
     * Create an instance of {@link VoicePortal }
     * 
     */
    public VoicePortal createVoicePortal() {
        return new VoicePortal();
    }

    /**
     * Create an instance of {@link LabeledMediaFileResource }
     * 
     */
    public LabeledMediaFileResource createLabeledMediaFileResource() {
        return new LabeledMediaFileResource();
    }

    /**
     * Create an instance of {@link CustomerOriginatedTrace }
     * 
     */
    public CustomerOriginatedTrace createCustomerOriginatedTrace() {
        return new CustomerOriginatedTrace();
    }

    /**
     * Create an instance of {@link CallingLineIDDeliveryBlocking }
     * 
     */
    public CallingLineIDDeliveryBlocking createCallingLineIDDeliveryBlocking() {
        return new CallingLineIDDeliveryBlocking();
    }

    /**
     * Create an instance of {@link VoiceMessagingDistributionList }
     * 
     */
    public VoiceMessagingDistributionList createVoiceMessagingDistributionList() {
        return new VoiceMessagingDistributionList();
    }

    /**
     * Create an instance of {@link OutgoingDNorSIPURIList }
     * 
     */
    public OutgoingDNorSIPURIList createOutgoingDNorSIPURIList() {
        return new OutgoingDNorSIPURIList();
    }

    /**
     * Create an instance of {@link Calls }
     * 
     */
    public Calls createCalls() {
        return new Calls();
    }

    /**
     * Create an instance of {@link CallInfo }
     * 
     */
    public CallInfo createCallInfo() {
        return new CallInfo();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereLocation }
     * 
     */
    public BroadWorksAnywhereLocation createBroadWorksAnywhereLocation() {
        return new BroadWorksAnywhereLocation();
    }

    /**
     * Create an instance of {@link CriteriaActivation }
     * 
     */
    public CriteriaActivation createCriteriaActivation() {
        return new CriteriaActivation();
    }

    /**
     * Create an instance of {@link VoiceMessagingMailServer }
     * 
     */
    public VoiceMessagingMailServer createVoiceMessagingMailServer() {
        return new VoiceMessagingMailServer();
    }

    /**
     * Create an instance of {@link Services }
     * 
     */
    public Services createServices() {
        return new Services();
    }

    /**
     * Create an instance of {@link ServiceEntry }
     * 
     */
    public ServiceEntry createServiceEntry() {
        return new ServiceEntry();
    }

    /**
     * Create an instance of {@link CallingNameDelivery }
     * 
     */
    public CallingNameDelivery createCallingNameDelivery() {
        return new CallingNameDelivery();
    }

    /**
     * Create an instance of {@link VoiceMessagingAliasList }
     * 
     */
    public VoiceMessagingAliasList createVoiceMessagingAliasList() {
        return new VoiceMessagingAliasList();
    }

    /**
     * Create an instance of {@link Enterprise }
     * 
     */
    public Enterprise createEnterprise() {
        return new Enterprise();
    }

    /**
     * Create an instance of {@link SubscriptionList }
     * 
     */
    public SubscriptionList createSubscriptionList() {
        return new SubscriptionList();
    }

    /**
     * Create an instance of {@link CollaborateRoomInfo }
     * 
     */
    public CollaborateRoomInfo createCollaborateRoomInfo() {
        return new CollaborateRoomInfo();
    }

    /**
     * Create an instance of {@link BroadWorksAnywherePortal.PhoneNumbers }
     * 
     */
    public BroadWorksAnywherePortal.PhoneNumbers createBroadWorksAnywherePortalPhoneNumbers() {
        return new BroadWorksAnywherePortal.PhoneNumbers();
    }

    /**
     * Create an instance of {@link RoutePointBlindTransfer }
     * 
     */
    public RoutePointBlindTransfer createRoutePointBlindTransfer() {
        return new RoutePointBlindTransfer();
    }

    /**
     * Create an instance of {@link AvailableUsers }
     * 
     */
    public AvailableUsers createAvailableUsers() {
        return new AvailableUsers();
    }

    /**
     * Create an instance of {@link UserDetailInfo }
     * 
     */
    public UserDetailInfo createUserDetailInfo() {
        return new UserDetailInfo();
    }

    /**
     * Create an instance of {@link PersonalAssistantExclusionNumberList }
     * 
     */
    public PersonalAssistantExclusionNumberList createPersonalAssistantExclusionNumberList() {
        return new PersonalAssistantExclusionNumberList();
    }

    /**
     * Create an instance of {@link EnterpriseCommon }
     * 
     */
    public EnterpriseCommon createEnterpriseCommon() {
        return new EnterpriseCommon();
    }

    /**
     * Create an instance of {@link SequentialRingCriteria }
     * 
     */
    public SequentialRingCriteria createSequentialRingCriteria() {
        return new SequentialRingCriteria();
    }

    /**
     * Create an instance of {@link CriteriaWithFromDn }
     * 
     */
    public CriteriaWithFromDn createCriteriaWithFromDn() {
        return new CriteriaWithFromDn();
    }

    /**
     * Create an instance of {@link Collaborate }
     * 
     */
    public Collaborate createCollaborate() {
        return new Collaborate();
    }

    /**
     * Create an instance of {@link CollaborateBridgeInfo }
     * 
     */
    public CollaborateBridgeInfo createCollaborateBridgeInfo() {
        return new CollaborateBridgeInfo();
    }

    /**
     * Create an instance of {@link CollaborateRoomList }
     * 
     */
    public CollaborateRoomList createCollaborateRoomList() {
        return new CollaborateRoomList();
    }

    /**
     * Create an instance of {@link CommonInstantRoomSettings }
     * 
     */
    public CommonInstantRoomSettings createCommonInstantRoomSettings() {
        return new CommonInstantRoomSettings();
    }

    /**
     * Create an instance of {@link SimultaneousRingPersonalCriteria }
     * 
     */
    public SimultaneousRingPersonalCriteria createSimultaneousRingPersonalCriteria() {
        return new SimultaneousRingPersonalCriteria();
    }

    /**
     * Create an instance of {@link VoiceMailMessageSummary }
     * 
     */
    public VoiceMailMessageSummary createVoiceMailMessageSummary() {
        return new VoiceMailMessageSummary();
    }

    /**
     * Create an instance of {@link MessageSummary }
     * 
     */
    public MessageSummary createMessageSummary() {
        return new MessageSummary();
    }

    /**
     * Create an instance of {@link FlexibleSeatingGuest }
     * 
     */
    public FlexibleSeatingGuest createFlexibleSeatingGuest() {
        return new FlexibleSeatingGuest();
    }

    /**
     * Create an instance of {@link AvailableHotelingHosts.HostUserIdList }
     * 
     */
    public AvailableHotelingHosts.HostUserIdList createAvailableHotelingHostsHostUserIdList() {
        return new AvailableHotelingHosts.HostUserIdList();
    }

    /**
     * Create an instance of {@link CallWaiting }
     * 
     */
    public CallWaiting createCallWaiting() {
        return new CallWaiting();
    }

    /**
     * Create an instance of {@link SimultaneousRingPersonal }
     * 
     */
    public SimultaneousRingPersonal createSimultaneousRingPersonal() {
        return new SimultaneousRingPersonal();
    }

    /**
     * Create an instance of {@link Executive }
     * 
     */
    public Executive createExecutive() {
        return new Executive();
    }

    /**
     * Create an instance of {@link ACDNightService }
     * 
     */
    public ACDNightService createACDNightService() {
        return new ACDNightService();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link ApplicationController }
     * 
     */
    public ApplicationController createApplicationController() {
        return new ApplicationController();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link CallRecording }
     * 
     */
    public CallRecording createCallRecording() {
        return new CallRecording();
    }

    /**
     * Create an instance of {@link DirectedCallPickupWithBargeIn }
     * 
     */
    public DirectedCallPickupWithBargeIn createDirectedCallPickupWithBargeIn() {
        return new DirectedCallPickupWithBargeIn();
    }

    /**
     * Create an instance of {@link SelectiveCallRejectionCriteria }
     * 
     */
    public SelectiveCallRejectionCriteria createSelectiveCallRejectionCriteria() {
        return new SelectiveCallRejectionCriteria();
    }

    /**
     * Create an instance of {@link CriteriaWithSelectiveCall }
     * 
     */
    public CriteriaWithSelectiveCall createCriteriaWithSelectiveCall() {
        return new CriteriaWithSelectiveCall();
    }

    /**
     * Create an instance of {@link InCallServiceActivation }
     * 
     */
    public InCallServiceActivation createInCallServiceActivation() {
        return new InCallServiceActivation();
    }

    /**
     * Create an instance of {@link BargeInExempt }
     * 
     */
    public BargeInExempt createBargeInExempt() {
        return new BargeInExempt();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereInfo }
     * 
     */
    public BroadWorksAnywhereInfo createBroadWorksAnywhereInfo() {
        return new BroadWorksAnywhereInfo();
    }

    /**
     * Create an instance of {@link CustomContact }
     * 
     */
    public CustomContact createCustomContact() {
        return new CustomContact();
    }

    /**
     * Create an instance of {@link DirectoryDetails }
     * 
     */
    public DirectoryDetails createDirectoryDetails() {
        return new DirectoryDetails();
    }

    /**
     * Create an instance of {@link CallCenterMonitoring }
     * 
     */
    public CallCenterMonitoring createCallCenterMonitoring() {
        return new CallCenterMonitoring();
    }

    /**
     * Create an instance of {@link NumberPortabilityAnnouncement }
     * 
     */
    public NumberPortabilityAnnouncement createNumberPortabilityAnnouncement() {
        return new NumberPortabilityAnnouncement();
    }

    /**
     * Create an instance of {@link Supervisors.RoutePoint }
     * 
     */
    public Supervisors.RoutePoint createSupervisorsRoutePoint() {
        return new Supervisors.RoutePoint();
    }

    /**
     * Create an instance of {@link AvailableFlexibleSeatingHosts.HostUserIdList }
     * 
     */
    public AvailableFlexibleSeatingHosts.HostUserIdList createAvailableFlexibleSeatingHostsHostUserIdList() {
        return new AvailableFlexibleSeatingHosts.HostUserIdList();
    }

    /**
     * Create an instance of {@link CallTransferInfo }
     * 
     */
    public CallTransferInfo createCallTransferInfo() {
        return new CallTransferInfo();
    }

    /**
     * Create an instance of {@link EnhancedCallLogs }
     * 
     */
    public EnhancedCallLogs createEnhancedCallLogs() {
        return new EnhancedCallLogs();
    }

    /**
     * Create an instance of {@link EnhancedCallLogsEntries }
     * 
     */
    public EnhancedCallLogsEntries createEnhancedCallLogsEntries() {
        return new EnhancedCallLogsEntries();
    }

    /**
     * Create an instance of {@link HotelingHost }
     * 
     */
    public HotelingHost createHotelingHost() {
        return new HotelingHost();
    }

    /**
     * Create an instance of {@link CallLogs }
     * 
     */
    public CallLogs createCallLogs() {
        return new CallLogs();
    }

    /**
     * Create an instance of {@link CallLogsEntries }
     * 
     */
    public CallLogsEntries createCallLogsEntries() {
        return new CallLogsEntries();
    }

    /**
     * Create an instance of {@link FaxMessaging }
     * 
     */
    public FaxMessaging createFaxMessaging() {
        return new FaxMessaging();
    }

    /**
     * Create an instance of {@link TransmitDTMF }
     * 
     */
    public TransmitDTMF createTransmitDTMF() {
        return new TransmitDTMF();
    }

    /**
     * Create an instance of {@link ACDProfile }
     * 
     */
    public ACDProfile createACDProfile() {
        return new ACDProfile();
    }

    /**
     * Create an instance of {@link ServiceInstanceReadProfile }
     * 
     */
    public ServiceInstanceReadProfile createServiceInstanceReadProfile() {
        return new ServiceInstanceReadProfile();
    }

    /**
     * Create an instance of {@link ChannelSet }
     * 
     */
    public ChannelSet createChannelSet() {
        return new ChannelSet();
    }

    /**
     * Create an instance of {@link CallCenterReportingServer }
     * 
     */
    public CallCenterReportingServer createCallCenterReportingServer() {
        return new CallCenterReportingServer();
    }

    /**
     * Create an instance of {@link CallStartInfo }
     * 
     */
    public CallStartInfo createCallStartInfo() {
        return new CallStartInfo();
    }

    /**
     * Create an instance of {@link VoiceMessagingGreetings }
     * 
     */
    public VoiceMessagingGreetings createVoiceMessagingGreetings() {
        return new VoiceMessagingGreetings();
    }

    /**
     * Create an instance of {@link VoiceMessagingAlternateNoAnswerGreeting }
     * 
     */
    public VoiceMessagingAlternateNoAnswerGreeting createVoiceMessagingAlternateNoAnswerGreeting() {
        return new VoiceMessagingAlternateNoAnswerGreeting();
    }

    /**
     * Create an instance of {@link RoutePointDistribute }
     * 
     */
    public RoutePointDistribute createRoutePointDistribute() {
        return new RoutePointDistribute();
    }

    /**
     * Create an instance of {@link SecurityClassification }
     * 
     */
    public SecurityClassification createSecurityClassification() {
        return new SecurityClassification();
    }

    /**
     * Create an instance of {@link SecurityClassificationLevels }
     * 
     */
    public SecurityClassificationLevels createSecurityClassificationLevels() {
        return new SecurityClassificationLevels();
    }

    /**
     * Create an instance of {@link CallingPartyCategory }
     * 
     */
    public CallingPartyCategory createCallingPartyCategory() {
        return new CallingPartyCategory();
    }

    /**
     * Create an instance of {@link ScheduleUri }
     * 
     */
    public ScheduleUri createScheduleUri() {
        return new ScheduleUri();
    }

    /**
     * Create an instance of {@link ScheduleList }
     * 
     */
    public ScheduleList createScheduleList() {
        return new ScheduleList();
    }

    /**
     * Create an instance of {@link BroadWorksReceptionist }
     * 
     */
    public BroadWorksReceptionist createBroadWorksReceptionist() {
        return new BroadWorksReceptionist();
    }

    /**
     * Create an instance of {@link ConnectedLineIdentificationPresentation }
     * 
     */
    public ConnectedLineIdentificationPresentation createConnectedLineIdentificationPresentation() {
        return new ConnectedLineIdentificationPresentation();
    }

    /**
     * Create an instance of {@link InterceptUser }
     * 
     */
    public InterceptUser createInterceptUser() {
        return new InterceptUser();
    }

    /**
     * Create an instance of {@link BroadWorksMobility }
     * 
     */
    public BroadWorksMobility createBroadWorksMobility() {
        return new BroadWorksMobility();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityProfileIdentityEntry }
     * 
     */
    public BroadWorksMobilityProfileIdentityEntry createBroadWorksMobilityProfileIdentityEntry() {
        return new BroadWorksMobilityProfileIdentityEntry();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityMobileIdentityEntry }
     * 
     */
    public BroadWorksMobilityMobileIdentityEntry createBroadWorksMobilityMobileIdentityEntry() {
        return new BroadWorksMobilityMobileIdentityEntry();
    }

    /**
     * Create an instance of {@link CallNotify }
     * 
     */
    public CallNotify createCallNotify() {
        return new CallNotify();
    }

    /**
     * Create an instance of {@link BusyLampField }
     * 
     */
    public BusyLampField createBusyLampField() {
        return new BusyLampField();
    }

    /**
     * Create an instance of {@link CollaborateRoom }
     * 
     */
    public CollaborateRoom createCollaborateRoom() {
        return new CollaborateRoom();
    }

    /**
     * Create an instance of {@link ACDPromote }
     * 
     */
    public ACDPromote createACDPromote() {
        return new ACDPromote();
    }

    /**
     * Create an instance of {@link ChargeNumber }
     * 
     */
    public ChargeNumber createChargeNumber() {
        return new ChargeNumber();
    }

    /**
     * Create an instance of {@link LegacyAutomaticCallback }
     * 
     */
    public LegacyAutomaticCallback createLegacyAutomaticCallback() {
        return new LegacyAutomaticCallback();
    }

    /**
     * Create an instance of {@link MusicOnHold }
     * 
     */
    public MusicOnHold createMusicOnHold() {
        return new MusicOnHold();
    }

    /**
     * Create an instance of {@link SpeedDial8 }
     * 
     */
    public SpeedDial8 createSpeedDial8() {
        return new SpeedDial8();
    }

    /**
     * Create an instance of {@link SpeedDial8Entry }
     * 
     */
    public SpeedDial8Entry createSpeedDial8Entry() {
        return new SpeedDial8Entry();
    }

    /**
     * Create an instance of {@link PriorityAlert }
     * 
     */
    public PriorityAlert createPriorityAlert() {
        return new PriorityAlert();
    }

    /**
     * Create an instance of {@link CallingLineIDBlockingOverride }
     * 
     */
    public CallingLineIDBlockingOverride createCallingLineIDBlockingOverride() {
        return new CallingLineIDBlockingOverride();
    }

    /**
     * Create an instance of {@link RoutePointPlayTreatment }
     * 
     */
    public RoutePointPlayTreatment createRoutePointPlayTreatment() {
        return new RoutePointPlayTreatment();
    }

    /**
     * Create an instance of {@link RoutePointPlayTreatmentURIList }
     * 
     */
    public RoutePointPlayTreatmentURIList createRoutePointPlayTreatmentURIList() {
        return new RoutePointPlayTreatmentURIList();
    }

    /**
     * Create an instance of {@link AutomaticHoldRetrieve }
     * 
     */
    public AutomaticHoldRetrieve createAutomaticHoldRetrieve() {
        return new AutomaticHoldRetrieve();
    }

    /**
     * Create an instance of {@link FAC }
     * 
     */
    public FAC createFAC() {
        return new FAC();
    }

    /**
     * Create an instance of {@link FeatureAccessCodeEntry }
     * 
     */
    public FeatureAccessCodeEntry createFeatureAccessCodeEntry() {
        return new FeatureAccessCodeEntry();
    }

    /**
     * Create an instance of {@link MeetMeConferencingUserConferences }
     * 
     */
    public MeetMeConferencingUserConferences createMeetMeConferencingUserConferences() {
        return new MeetMeConferencingUserConferences();
    }

    /**
     * Create an instance of {@link MWIDeliveryToMobileEndpoint }
     * 
     */
    public MWIDeliveryToMobileEndpoint createMWIDeliveryToMobileEndpoint() {
        return new MWIDeliveryToMobileEndpoint();
    }

    /**
     * Create an instance of {@link ACDQueue }
     * 
     */
    public ACDQueue createACDQueue() {
        return new ACDQueue();
    }

    /**
     * Create an instance of {@link ACDQueueEntryList }
     * 
     */
    public ACDQueueEntryList createACDQueueEntryList() {
        return new ACDQueueEntryList();
    }

    /**
     * Create an instance of {@link CustomRingbackUserCriteria }
     * 
     */
    public CustomRingbackUserCriteria createCustomRingbackUserCriteria() {
        return new CustomRingbackUserCriteria();
    }

    /**
     * Create an instance of {@link AudioFileDetails }
     * 
     */
    public AudioFileDetails createAudioFileDetails() {
        return new AudioFileDetails();
    }

    /**
     * Create an instance of {@link VideoFileDetails }
     * 
     */
    public VideoFileDetails createVideoFileDetails() {
        return new VideoFileDetails();
    }

    /**
     * Create an instance of {@link ACDAgentUnavailableCodes }
     * 
     */
    public ACDAgentUnavailableCodes createACDAgentUnavailableCodes() {
        return new ACDAgentUnavailableCodes();
    }

    /**
     * Create an instance of {@link ACDAgentUnavailableCodeList }
     * 
     */
    public ACDAgentUnavailableCodeList createACDAgentUnavailableCodeList() {
        return new ACDAgentUnavailableCodeList();
    }

    /**
     * Create an instance of {@link SequentialRing }
     * 
     */
    public SequentialRing createSequentialRing() {
        return new SequentialRing();
    }

    /**
     * Create an instance of {@link MeetMeConference }
     * 
     */
    public MeetMeConference createMeetMeConference() {
        return new MeetMeConference();
    }

    /**
     * Create an instance of {@link VoiceMessage }
     * 
     */
    public VoiceMessage createVoiceMessage() {
        return new VoiceMessage();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link MessageMediaContent }
     * 
     */
    public MessageMediaContent createMessageMediaContent() {
        return new MessageMediaContent();
    }

    /**
     * Create an instance of {@link CallCenterAgents.CallCenter }
     * 
     */
    public CallCenterAgents.CallCenter createCallCenterAgentsCallCenter() {
        return new CallCenterAgents.CallCenter();
    }

    /**
     * Create an instance of {@link IMPProfile }
     * 
     */
    public IMPProfile createIMPProfile() {
        return new IMPProfile();
    }

    /**
     * Create an instance of {@link DeviceToken }
     * 
     */
    public DeviceToken createDeviceToken() {
        return new DeviceToken();
    }

    /**
     * Create an instance of {@link CallForwardingSelectiveCriteria }
     * 
     */
    public CallForwardingSelectiveCriteria createCallForwardingSelectiveCriteria() {
        return new CallForwardingSelectiveCriteria();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ScheduleDetail }
     * 
     */
    public ScheduleDetail createScheduleDetail() {
        return new ScheduleDetail();
    }

    /**
     * Create an instance of {@link ExecutiveAssistant }
     * 
     */
    public ExecutiveAssistant createExecutiveAssistant() {
        return new ExecutiveAssistant();
    }

    /**
     * Create an instance of {@link DoNotDisturb }
     * 
     */
    public DoNotDisturb createDoNotDisturb() {
        return new DoNotDisturb();
    }

    /**
     * Create an instance of {@link ThirdPartyVoiceMailSupport }
     * 
     */
    public ThirdPartyVoiceMailSupport createThirdPartyVoiceMailSupport() {
        return new ThirdPartyVoiceMailSupport();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityMobileIdentity }
     * 
     */
    public BroadWorksMobilityMobileIdentity createBroadWorksMobilityMobileIdentity() {
        return new BroadWorksMobilityMobileIdentity();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityAlertingPolicyInfo }
     * 
     */
    public BroadWorksMobilityAlertingPolicyInfo createBroadWorksMobilityAlertingPolicyInfo() {
        return new BroadWorksMobilityAlertingPolicyInfo();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityCallAnchoringPolicy }
     * 
     */
    public BroadWorksMobilityCallAnchoringPolicy createBroadWorksMobilityCallAnchoringPolicy() {
        return new BroadWorksMobilityCallAnchoringPolicy();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereLocationCriteria }
     * 
     */
    public BroadWorksAnywhereLocationCriteria createBroadWorksAnywhereLocationCriteria() {
        return new BroadWorksAnywhereLocationCriteria();
    }

    /**
     * Create an instance of {@link ACDCallDispostionCodes }
     * 
     */
    public ACDCallDispostionCodes createACDCallDispostionCodes() {
        return new ACDCallDispostionCodes();
    }

    /**
     * Create an instance of {@link ACDCallDispositionCodeList }
     * 
     */
    public ACDCallDispositionCodeList createACDCallDispositionCodeList() {
        return new ACDCallDispositionCodeList();
    }

    /**
     * Create an instance of {@link CallForwardingNoAnswer }
     * 
     */
    public CallForwardingNoAnswer createCallForwardingNoAnswer() {
        return new CallForwardingNoAnswer();
    }

    /**
     * Create an instance of {@link RoutePointQueue }
     * 
     */
    public RoutePointQueue createRoutePointQueue() {
        return new RoutePointQueue();
    }

    /**
     * Create an instance of {@link RoutePointQueueEntryList }
     * 
     */
    public RoutePointQueueEntryList createRoutePointQueueEntryList() {
        return new RoutePointQueueEntryList();
    }

    /**
     * Create an instance of {@link IMRNInfo }
     * 
     */
    public IMRNInfo createIMRNInfo() {
        return new IMRNInfo();
    }

    /**
     * Create an instance of {@link RoutePointSubscriptionEvent }
     * 
     */
    public RoutePointSubscriptionEvent createRoutePointSubscriptionEvent() {
        return new RoutePointSubscriptionEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantMutedEvent }
     * 
     */
    public CollaborateRoomParticipantMutedEvent createCollaborateRoomParticipantMutedEvent() {
        return new CollaborateRoomParticipantMutedEvent();
    }

    /**
     * Create an instance of {@link ACDHolidayPolicyTreatmentCompletedEvent }
     * 
     */
    public ACDHolidayPolicyTreatmentCompletedEvent createACDHolidayPolicyTreatmentCompletedEvent() {
        return new ACDHolidayPolicyTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallBouncedEvent }
     * 
     */
    public RoutePointCallBouncedEvent createRoutePointCallBouncedEvent() {
        return new RoutePointCallBouncedEvent();
    }

    /**
     * Create an instance of {@link EventDetail }
     * 
     */
    public EventDetail createEventDetail() {
        return new EventDetail();
    }

    /**
     * Create an instance of {@link PatchedCommand }
     * 
     */
    public PatchedCommand createPatchedCommand() {
        return new PatchedCommand();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link RoutePointWhisperStartedEvent }
     * 
     */
    public RoutePointWhisperStartedEvent createRoutePointWhisperStartedEvent() {
        return new RoutePointWhisperStartedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceSubscriptionEvent }
     * 
     */
    public MeetMeConferenceSubscriptionEvent createMeetMeConferenceSubscriptionEvent() {
        return new MeetMeConferenceSubscriptionEvent();
    }

    /**
     * Create an instance of {@link FileResource }
     * 
     */
    public FileResource createFileResource() {
        return new FileResource();
    }

    /**
     * Create an instance of {@link AgentStateInformation }
     * 
     */
    public AgentStateInformation createAgentStateInformation() {
        return new AgentStateInformation();
    }

    /**
     * Create an instance of {@link TimeSchedule }
     * 
     */
    public TimeSchedule createTimeSchedule() {
        return new TimeSchedule();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantLeftEvent }
     * 
     */
    public CollaborateRoomParticipantLeftEvent createCollaborateRoomParticipantLeftEvent() {
        return new CollaborateRoomParticipantLeftEvent();
    }

    /**
     * Create an instance of {@link ExecutiveCallFilteringCriteriaFromDn }
     * 
     */
    public ExecutiveCallFilteringCriteriaFromDn createExecutiveCallFilteringCriteriaFromDn() {
        return new ExecutiveCallFilteringCriteriaFromDn();
    }

    /**
     * Create an instance of {@link CommPilotExpressRedirection }
     * 
     */
    public CommPilotExpressRedirection createCommPilotExpressRedirection() {
        return new CommPilotExpressRedirection();
    }

    /**
     * Create an instance of {@link CallRecordingResumedEvent }
     * 
     */
    public CallRecordingResumedEvent createCallRecordingResumedEvent() {
        return new CallRecordingResumedEvent();
    }

    /**
     * Create an instance of {@link PriorityAlertCriteriaFromDn }
     * 
     */
    public PriorityAlertCriteriaFromDn createPriorityAlertCriteriaFromDn() {
        return new PriorityAlertCriteriaFromDn();
    }

    /**
     * Create an instance of {@link UserAdditionalEnterpriseGroupDetails }
     * 
     */
    public UserAdditionalEnterpriseGroupDetails createUserAdditionalEnterpriseGroupDetails() {
        return new UserAdditionalEnterpriseGroupDetails();
    }

    /**
     * Create an instance of {@link CommPilotExpressAvailableOutOfOffice }
     * 
     */
    public CommPilotExpressAvailableOutOfOffice createCommPilotExpressAvailableOutOfOffice() {
        return new CommPilotExpressAvailableOutOfOffice();
    }

    /**
     * Create an instance of {@link MeetMeLectureModeStartedEvent }
     * 
     */
    public MeetMeLectureModeStartedEvent createMeetMeLectureModeStartedEvent() {
        return new MeetMeLectureModeStartedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceLockedEvent }
     * 
     */
    public MeetMeConferenceLockedEvent createMeetMeConferenceLockedEvent() {
        return new MeetMeConferenceLockedEvent();
    }

    /**
     * Create an instance of {@link ACDSubscriptionEvent }
     * 
     */
    public ACDSubscriptionEvent createACDSubscriptionEvent() {
        return new ACDSubscriptionEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallForwardedTreatmentCompletedEvent }
     * 
     */
    public RoutePointCallForwardedTreatmentCompletedEvent createRoutePointCallForwardedTreatmentCompletedEvent() {
        return new RoutePointCallForwardedTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomEvent }
     * 
     */
    public CollaborateRoomEvent createCollaborateRoomEvent() {
        return new CollaborateRoomEvent();
    }

    /**
     * Create an instance of {@link RedirectionList }
     * 
     */
    public RedirectionList createRedirectionList() {
        return new RedirectionList();
    }

    /**
     * Create an instance of {@link VoiceMailMessageSummaryEvent }
     * 
     */
    public VoiceMailMessageSummaryEvent createVoiceMailMessageSummaryEvent() {
        return new VoiceMailMessageSummaryEvent();
    }

    /**
     * Create an instance of {@link ACDCallOfferedToAgentEvent }
     * 
     */
    public ACDCallOfferedToAgentEvent createACDCallOfferedToAgentEvent() {
        return new ACDCallOfferedToAgentEvent();
    }

    /**
     * Create an instance of {@link RoutePointQueueEntry }
     * 
     */
    public RoutePointQueueEntry createRoutePointQueueEntry() {
        return new RoutePointQueueEntry();
    }

    /**
     * Create an instance of {@link ACDCallForwardedEvent }
     * 
     */
    public ACDCallForwardedEvent createACDCallForwardedEvent() {
        return new ACDCallForwardedEvent();
    }

    /**
     * Create an instance of {@link CallOriginatedEvent }
     * 
     */
    public CallOriginatedEvent createCallOriginatedEvent() {
        return new CallOriginatedEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallTransferredEvent }
     * 
     */
    public RoutePointCallTransferredEvent createRoutePointCallTransferredEvent() {
        return new RoutePointCallTransferredEvent();
    }

    /**
     * Create an instance of {@link ConferenceEvent }
     * 
     */
    public ConferenceEvent createConferenceEvent() {
        return new ConferenceEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceParticipant }
     * 
     */
    public MeetMeConferenceParticipant createMeetMeConferenceParticipant() {
        return new MeetMeConferenceParticipant();
    }

    /**
     * Create an instance of {@link CallWaitingEvent }
     * 
     */
    public CallWaitingEvent createCallWaitingEvent() {
        return new CallWaitingEvent();
    }

    /**
     * Create an instance of {@link ACDQueueEntry }
     * 
     */
    public ACDQueueEntry createACDQueueEntry() {
        return new ACDQueueEntry();
    }

    /**
     * Create an instance of {@link MeetMeConferencingUserBridge }
     * 
     */
    public MeetMeConferencingUserBridge createMeetMeConferencingUserBridge() {
        return new MeetMeConferencingUserBridge();
    }

    /**
     * Create an instance of {@link MeetMeParticipantRetrievedEvent }
     * 
     */
    public MeetMeParticipantRetrievedEvent createMeetMeParticipantRetrievedEvent() {
        return new MeetMeParticipantRetrievedEvent();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link CollaborateInstantRoomDuration }
     * 
     */
    public CollaborateInstantRoomDuration createCollaborateInstantRoomDuration() {
        return new CollaborateInstantRoomDuration();
    }

    /**
     * Create an instance of {@link EnhancedCallLogsExtendedEntry }
     * 
     */
    public EnhancedCallLogsExtendedEntry createEnhancedCallLogsExtendedEntry() {
        return new EnhancedCallLogsExtendedEntry();
    }

    /**
     * Create an instance of {@link ACDCallPromotedEvent }
     * 
     */
    public ACDCallPromotedEvent createACDCallPromotedEvent() {
        return new ACDCallPromotedEvent();
    }

    /**
     * Create an instance of {@link MusicOnHoldEvent }
     * 
     */
    public MusicOnHoldEvent createMusicOnHoldEvent() {
        return new MusicOnHoldEvent();
    }

    /**
     * Create an instance of {@link ACDOutgoingCallInfo }
     * 
     */
    public ACDOutgoingCallInfo createACDOutgoingCallInfo() {
        return new ACDOutgoingCallInfo();
    }

    /**
     * Create an instance of {@link ServiceProvider }
     * 
     */
    public ServiceProvider createServiceProvider() {
        return new ServiceProvider();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceDuration }
     * 
     */
    public MeetMeConferencingConferenceDuration createMeetMeConferencingConferenceDuration() {
        return new MeetMeConferencingConferenceDuration();
    }

    /**
     * Create an instance of {@link RoutePointMOHCompletedEvent }
     * 
     */
    public RoutePointMOHCompletedEvent createRoutePointMOHCompletedEvent() {
        return new RoutePointMOHCompletedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantJoinedEvent }
     * 
     */
    public CollaborateRoomParticipantJoinedEvent createCollaborateRoomParticipantJoinedEvent() {
        return new CollaborateRoomParticipantJoinedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantUnmutedEvent }
     * 
     */
    public CollaborateRoomParticipantUnmutedEvent createCollaborateRoomParticipantUnmutedEvent() {
        return new CollaborateRoomParticipantUnmutedEvent();
    }

    /**
     * Create an instance of {@link ACDCallStrandedEvent }
     * 
     */
    public ACDCallStrandedEvent createACDCallStrandedEvent() {
        return new ACDCallStrandedEvent();
    }

    /**
     * Create an instance of {@link CallOriginatingEvent }
     * 
     */
    public CallOriginatingEvent createCallOriginatingEvent() {
        return new CallOriginatingEvent();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link SecurityClassificationInfo }
     * 
     */
    public SecurityClassificationInfo createSecurityClassificationInfo() {
        return new SecurityClassificationInfo();
    }

    /**
     * Create an instance of {@link MeetMeConferenceRecordingStartedEvent }
     * 
     */
    public MeetMeConferenceRecordingStartedEvent createMeetMeConferenceRecordingStartedEvent() {
        return new MeetMeConferenceRecordingStartedEvent();
    }

    /**
     * Create an instance of {@link HotelingGuestEvent }
     * 
     */
    public HotelingGuestEvent createHotelingGuestEvent() {
        return new HotelingGuestEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipants }
     * 
     */
    public CollaborateRoomParticipants createCollaborateRoomParticipants() {
        return new CollaborateRoomParticipants();
    }

    /**
     * Create an instance of {@link MeetMeConferenceStartedEvent }
     * 
     */
    public MeetMeConferenceStartedEvent createMeetMeConferenceStartedEvent() {
        return new MeetMeConferenceStartedEvent();
    }

    /**
     * Create an instance of {@link SimultaneousRingPersonalEvent }
     * 
     */
    public SimultaneousRingPersonalEvent createSimultaneousRingPersonalEvent() {
        return new SimultaneousRingPersonalEvent();
    }

    /**
     * Create an instance of {@link ConferenceCallMutedEvent }
     * 
     */
    public ConferenceCallMutedEvent createConferenceCallMutedEvent() {
        return new ConferenceCallMutedEvent();
    }

    /**
     * Create an instance of {@link ACDAgentJoinInfoList }
     * 
     */
    public ACDAgentJoinInfoList createACDAgentJoinInfoList() {
        return new ACDAgentJoinInfoList();
    }

    /**
     * Create an instance of {@link ChannelTerminatedEvent }
     * 
     */
    public ChannelTerminatedEvent createChannelTerminatedEvent() {
        return new ChannelTerminatedEvent();
    }

    /**
     * Create an instance of {@link ExecutiveDetails }
     * 
     */
    public ExecutiveDetails createExecutiveDetails() {
        return new ExecutiveDetails();
    }

    /**
     * Create an instance of {@link ExecutiveAssistantEndpoint }
     * 
     */
    public ExecutiveAssistantEndpoint createExecutiveAssistantEndpoint() {
        return new ExecutiveAssistantEndpoint();
    }

    /**
     * Create an instance of {@link CriteriaFromDn }
     * 
     */
    public CriteriaFromDn createCriteriaFromDn() {
        return new CriteriaFromDn();
    }

    /**
     * Create an instance of {@link CallCenterAgentMonitoringEvent }
     * 
     */
    public CallCenterAgentMonitoringEvent createCallCenterAgentMonitoringEvent() {
        return new CallCenterAgentMonitoringEvent();
    }

    /**
     * Create an instance of {@link RoutePointNightPolicyAppliedEvent }
     * 
     */
    public RoutePointNightPolicyAppliedEvent createRoutePointNightPolicyAppliedEvent() {
        return new RoutePointNightPolicyAppliedEvent();
    }

    /**
     * Create an instance of {@link NameDialingName }
     * 
     */
    public NameDialingName createNameDialingName() {
        return new NameDialingName();
    }

    /**
     * Create an instance of {@link CallForwardingAlwaysSecondaryEvent }
     * 
     */
    public CallForwardingAlwaysSecondaryEvent createCallForwardingAlwaysSecondaryEvent() {
        return new CallForwardingAlwaysSecondaryEvent();
    }

    /**
     * Create an instance of {@link CriteriaToDn }
     * 
     */
    public CriteriaToDn createCriteriaToDn() {
        return new CriteriaToDn();
    }

    /**
     * Create an instance of {@link CollaborateRoomClientSessionInfoUpdatedEvent }
     * 
     */
    public CollaborateRoomClientSessionInfoUpdatedEvent createCollaborateRoomClientSessionInfoUpdatedEvent() {
        return new CollaborateRoomClientSessionInfoUpdatedEvent();
    }

    /**
     * Create an instance of {@link ThirdPartyVoiceMailSupportEvent }
     * 
     */
    public ThirdPartyVoiceMailSupportEvent createThirdPartyVoiceMailSupportEvent() {
        return new ThirdPartyVoiceMailSupportEvent();
    }

    /**
     * Create an instance of {@link MeetMeParticipantLeftEvent }
     * 
     */
    public MeetMeParticipantLeftEvent createMeetMeParticipantLeftEvent() {
        return new MeetMeParticipantLeftEvent();
    }

    /**
     * Create an instance of {@link ACDCallStrandedTreatementCompletedEvent }
     * 
     */
    public ACDCallStrandedTreatementCompletedEvent createACDCallStrandedTreatementCompletedEvent() {
        return new ACDCallStrandedTreatementCompletedEvent();
    }

    /**
     * Create an instance of {@link RoutePointSilenceCompletedEvent }
     * 
     */
    public RoutePointSilenceCompletedEvent createRoutePointSilenceCompletedEvent() {
        return new RoutePointSilenceCompletedEvent();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereEvent }
     * 
     */
    public BroadWorksAnywhereEvent createBroadWorksAnywhereEvent() {
        return new BroadWorksAnywhereEvent();
    }

    /**
     * Create an instance of {@link ACDCallTransferredEvent }
     * 
     */
    public ACDCallTransferredEvent createACDCallTransferredEvent() {
        return new ACDCallTransferredEvent();
    }

    /**
     * Create an instance of {@link RoutePointEvent }
     * 
     */
    public RoutePointEvent createRoutePointEvent() {
        return new RoutePointEvent();
    }

    /**
     * Create an instance of {@link CommPilotExpressRedirectionWithException }
     * 
     */
    public CommPilotExpressRedirectionWithException createCommPilotExpressRedirectionWithException() {
        return new CommPilotExpressRedirectionWithException();
    }

    /**
     * Create an instance of {@link RoutePointHolidayPolicyTreatmentCompletedEvent }
     * 
     */
    public RoutePointHolidayPolicyTreatmentCompletedEvent createRoutePointHolidayPolicyTreatmentCompletedEvent() {
        return new RoutePointHolidayPolicyTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link HourMinute }
     * 
     */
    public HourMinute createHourMinute() {
        return new HourMinute();
    }

    /**
     * Create an instance of {@link MeetMeParticipantUnmutedEvent }
     * 
     */
    public MeetMeParticipantUnmutedEvent createMeetMeParticipantUnmutedEvent() {
        return new MeetMeParticipantUnmutedEvent();
    }

    /**
     * Create an instance of {@link MeetMeParticipantJoinedEvent }
     * 
     */
    public MeetMeParticipantJoinedEvent createMeetMeParticipantJoinedEvent() {
        return new MeetMeParticipantJoinedEvent();
    }

    /**
     * Create an instance of {@link AgentStateEvent }
     * 
     */
    public AgentStateEvent createAgentStateEvent() {
        return new AgentStateEvent();
    }

    /**
     * Create an instance of {@link SelectiveCallRejectionCriteriaFromDn }
     * 
     */
    public SelectiveCallRejectionCriteriaFromDn createSelectiveCallRejectionCriteriaFromDn() {
        return new SelectiveCallRejectionCriteriaFromDn();
    }

    /**
     * Create an instance of {@link CollaborateRoomSubscriptionResyncEvent }
     * 
     */
    public CollaborateRoomSubscriptionResyncEvent createCollaborateRoomSubscriptionResyncEvent() {
        return new CollaborateRoomSubscriptionResyncEvent();
    }

    /**
     * Create an instance of {@link CriteriaPhoneNumberList }
     * 
     */
    public CriteriaPhoneNumberList createCriteriaPhoneNumberList() {
        return new CriteriaPhoneNumberList();
    }

    /**
     * Create an instance of {@link HolidaySchedule }
     * 
     */
    public HolidaySchedule createHolidaySchedule() {
        return new HolidaySchedule();
    }

    /**
     * Create an instance of {@link CallCenterMonitoringEvent }
     * 
     */
    public CallCenterMonitoringEvent createCallCenterMonitoringEvent() {
        return new CallCenterMonitoringEvent();
    }

    /**
     * Create an instance of {@link CallCollectingEvent }
     * 
     */
    public CallCollectingEvent createCallCollectingEvent() {
        return new CallCollectingEvent();
    }

    /**
     * Create an instance of {@link ACDCallAnsweredByAgentEvent }
     * 
     */
    public ACDCallAnsweredByAgentEvent createACDCallAnsweredByAgentEvent() {
        return new ACDCallAnsweredByAgentEvent();
    }

    /**
     * Create an instance of {@link ACDCallStrandedUnavailableEvent }
     * 
     */
    public ACDCallStrandedUnavailableEvent createACDCallStrandedUnavailableEvent() {
        return new ACDCallStrandedUnavailableEvent();
    }

    /**
     * Create an instance of {@link CallToNumber }
     * 
     */
    public CallToNumber createCallToNumber() {
        return new CallToNumber();
    }

    /**
     * Create an instance of {@link CallReleasingEvent }
     * 
     */
    public CallReleasingEvent createCallReleasingEvent() {
        return new CallReleasingEvent();
    }

    /**
     * Create an instance of {@link PatchedEventPackage }
     * 
     */
    public PatchedEventPackage createPatchedEventPackage() {
        return new PatchedEventPackage();
    }

    /**
     * Create an instance of {@link ACDNightServiceEvent }
     * 
     */
    public ACDNightServiceEvent createACDNightServiceEvent() {
        return new ACDNightServiceEvent();
    }

    /**
     * Create an instance of {@link RoutePointRingbackCompletedEvent }
     * 
     */
    public RoutePointRingbackCompletedEvent createRoutePointRingbackCompletedEvent() {
        return new RoutePointRingbackCompletedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferencePorts }
     * 
     */
    public MeetMeConferencingConferencePorts createMeetMeConferencingConferencePorts() {
        return new MeetMeConferencingConferencePorts();
    }

    /**
     * Create an instance of {@link DoNotDisturbEvent }
     * 
     */
    public DoNotDisturbEvent createDoNotDisturbEvent() {
        return new DoNotDisturbEvent();
    }

    /**
     * Create an instance of {@link CallParkRetrievedEvent }
     * 
     */
    public CallParkRetrievedEvent createCallParkRetrievedEvent() {
        return new CallParkRetrievedEvent();
    }

    /**
     * Create an instance of {@link Events }
     * 
     */
    public Events createEvents() {
        return new Events();
    }

    /**
     * Create an instance of {@link MeetMeConferencingUserConference }
     * 
     */
    public MeetMeConferencingUserConference createMeetMeConferencingUserConference() {
        return new MeetMeConferencingUserConference();
    }

    /**
     * Create an instance of {@link DepartmentKey }
     * 
     */
    public DepartmentKey createDepartmentKey() {
        return new DepartmentKey();
    }

    /**
     * Create an instance of {@link RoutePointCallAnsweredByAgentEvent }
     * 
     */
    public RoutePointCallAnsweredByAgentEvent createRoutePointCallAnsweredByAgentEvent() {
        return new RoutePointCallAnsweredByAgentEvent();
    }

    /**
     * Create an instance of {@link ACDCallStrandedUnavailableTreatementCompletedEvent }
     * 
     */
    public ACDCallStrandedUnavailableTreatementCompletedEvent createACDCallStrandedUnavailableTreatementCompletedEvent() {
        return new ACDCallStrandedUnavailableTreatementCompletedEvent();
    }

    /**
     * Create an instance of {@link CallCenterAgentOnCallAlertInfo }
     * 
     */
    public CallCenterAgentOnCallAlertInfo createCallCenterAgentOnCallAlertInfo() {
        return new CallCenterAgentOnCallAlertInfo();
    }

    /**
     * Create an instance of {@link CallRecordingStartedEvent }
     * 
     */
    public CallRecordingStartedEvent createCallRecordingStartedEvent() {
        return new CallRecordingStartedEvent();
    }

    /**
     * Create an instance of {@link ACDCallUpdatedEvent }
     * 
     */
    public ACDCallUpdatedEvent createACDCallUpdatedEvent() {
        return new ACDCallUpdatedEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallUpdatedEvent }
     * 
     */
    public RoutePointCallUpdatedEvent createRoutePointCallUpdatedEvent() {
        return new RoutePointCallUpdatedEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallFailedEvent }
     * 
     */
    public RoutePointCallFailedEvent createRoutePointCallFailedEvent() {
        return new RoutePointCallFailedEvent();
    }

    /**
     * Create an instance of {@link RoutePointHolidayPolicyAppliedEvent }
     * 
     */
    public RoutePointHolidayPolicyAppliedEvent createRoutePointHolidayPolicyAppliedEvent() {
        return new RoutePointHolidayPolicyAppliedEvent();
    }

    /**
     * Create an instance of {@link SubscriptionTerminatedEvent }
     * 
     */
    public SubscriptionTerminatedEvent createSubscriptionTerminatedEvent() {
        return new SubscriptionTerminatedEvent();
    }

    /**
     * Create an instance of {@link ACDHolidayPolicyAppliedEvent }
     * 
     */
    public ACDHolidayPolicyAppliedEvent createACDHolidayPolicyAppliedEvent() {
        return new ACDHolidayPolicyAppliedEvent();
    }

    /**
     * Create an instance of {@link PlayCollectResult }
     * 
     */
    public PlayCollectResult createPlayCollectResult() {
        return new PlayCollectResult();
    }

    /**
     * Create an instance of {@link CallReleasedEvent }
     * 
     */
    public CallReleasedEvent createCallReleasedEvent() {
        return new CallReleasedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomStartedEvent }
     * 
     */
    public CollaborateRoomStartedEvent createCollaborateRoomStartedEvent() {
        return new CollaborateRoomStartedEvent();
    }

    /**
     * Create an instance of {@link CallCenterAgentMonitoringSubscriptionEvent }
     * 
     */
    public CallCenterAgentMonitoringSubscriptionEvent createCallCenterAgentMonitoringSubscriptionEvent() {
        return new CallCenterAgentMonitoringSubscriptionEvent();
    }

    /**
     * Create an instance of {@link ExecutiveDetailsList }
     * 
     */
    public ExecutiveDetailsList createExecutiveDetailsList() {
        return new ExecutiveDetailsList();
    }

    /**
     * Create an instance of {@link ACDNightPolicyTreatmentCompletedEvent }
     * 
     */
    public ACDNightPolicyTreatmentCompletedEvent createACDNightPolicyTreatmentCompletedEvent() {
        return new ACDNightPolicyTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link CallList }
     * 
     */
    public CallList createCallList() {
        return new CallList();
    }

    /**
     * Create an instance of {@link CallForwardedEvent }
     * 
     */
    public CallForwardedEvent createCallForwardedEvent() {
        return new CallForwardedEvent();
    }

    /**
     * Create an instance of {@link ConferenceParticipantList }
     * 
     */
    public ConferenceParticipantList createConferenceParticipantList() {
        return new ConferenceParticipantList();
    }

    /**
     * Create an instance of {@link MeetMeConferenceCallIdList }
     * 
     */
    public MeetMeConferenceCallIdList createMeetMeConferenceCallIdList() {
        return new MeetMeConferenceCallIdList();
    }

    /**
     * Create an instance of {@link RoutePointBusyStartedEvent }
     * 
     */
    public RoutePointBusyStartedEvent createRoutePointBusyStartedEvent() {
        return new RoutePointBusyStartedEvent();
    }

    /**
     * Create an instance of {@link RoutePointSilenceStartedEvent }
     * 
     */
    public RoutePointSilenceStartedEvent createRoutePointSilenceStartedEvent() {
        return new RoutePointSilenceStartedEvent();
    }

    /**
     * Create an instance of {@link CallForwardingBusyEvent }
     * 
     */
    public CallForwardingBusyEvent createCallForwardingBusyEvent() {
        return new CallForwardingBusyEvent();
    }

    /**
     * Create an instance of {@link AgentSubscriptionEvent }
     * 
     */
    public AgentSubscriptionEvent createAgentSubscriptionEvent() {
        return new AgentSubscriptionEvent();
    }

    /**
     * Create an instance of {@link AccessDevices }
     * 
     */
    public AccessDevices createAccessDevices() {
        return new AccessDevices();
    }

    /**
     * Create an instance of {@link RoutePointBusyCompletedEvent }
     * 
     */
    public RoutePointBusyCompletedEvent createRoutePointBusyCompletedEvent() {
        return new RoutePointBusyCompletedEvent();
    }

    /**
     * Create an instance of {@link MeetMeAutoLectureModeStartedEvent }
     * 
     */
    public MeetMeAutoLectureModeStartedEvent createMeetMeAutoLectureModeStartedEvent() {
        return new MeetMeAutoLectureModeStartedEvent();
    }

    /**
     * Create an instance of {@link CallAnsweredEvent }
     * 
     */
    public CallAnsweredEvent createCallAnsweredEvent() {
        return new CallAnsweredEvent();
    }

    /**
     * Create an instance of {@link CallDetachedEvent }
     * 
     */
    public CallDetachedEvent createCallDetachedEvent() {
        return new CallDetachedEvent();
    }

    /**
     * Create an instance of {@link ACDNightPolicyAppliedEvent }
     * 
     */
    public ACDNightPolicyAppliedEvent createACDNightPolicyAppliedEvent() {
        return new ACDNightPolicyAppliedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceRecordingPausedEvent }
     * 
     */
    public MeetMeConferenceRecordingPausedEvent createMeetMeConferenceRecordingPausedEvent() {
        return new MeetMeConferenceRecordingPausedEvent();
    }

    /**
     * Create an instance of {@link RoutePointRecoveredEvent }
     * 
     */
    public RoutePointRecoveredEvent createRoutePointRecoveredEvent() {
        return new RoutePointRecoveredEvent();
    }

    /**
     * Create an instance of {@link FlexibleSeatingGuestEvent }
     * 
     */
    public FlexibleSeatingGuestEvent createFlexibleSeatingGuestEvent() {
        return new FlexibleSeatingGuestEvent();
    }

    /**
     * Create an instance of {@link ACDCallAbandonedEvent }
     * 
     */
    public ACDCallAbandonedEvent createACDCallAbandonedEvent() {
        return new ACDCallAbandonedEvent();
    }

    /**
     * Create an instance of {@link RoutePointNightPolicyTreatmentCompletedEvent }
     * 
     */
    public RoutePointNightPolicyTreatmentCompletedEvent createRoutePointNightPolicyTreatmentCompletedEvent() {
        return new RoutePointNightPolicyTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link UserInfoList }
     * 
     */
    public UserInfoList createUserInfoList() {
        return new UserInfoList();
    }

    /**
     * Create an instance of {@link VoiceMailPartyInformation }
     * 
     */
    public VoiceMailPartyInformation createVoiceMailPartyInformation() {
        return new VoiceMailPartyInformation();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityEndpoint }
     * 
     */
    public BroadWorksMobilityEndpoint createBroadWorksMobilityEndpoint() {
        return new BroadWorksMobilityEndpoint();
    }

    /**
     * Create an instance of {@link CallReceivedEvent }
     * 
     */
    public CallReceivedEvent createCallReceivedEvent() {
        return new CallReceivedEvent();
    }

    /**
     * Create an instance of {@link SilentAlertingEvent }
     * 
     */
    public SilentAlertingEvent createSilentAlertingEvent() {
        return new SilentAlertingEvent();
    }

    /**
     * Create an instance of {@link ConferenceReleasedEvent }
     * 
     */
    public ConferenceReleasedEvent createConferenceReleasedEvent() {
        return new ConferenceReleasedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceRecordingResumedEvent }
     * 
     */
    public MeetMeConferenceRecordingResumedEvent createMeetMeConferenceRecordingResumedEvent() {
        return new MeetMeConferenceRecordingResumedEvent();
    }

    /**
     * Create an instance of {@link CommPilotExpressEvent }
     * 
     */
    public CommPilotExpressEvent createCommPilotExpressEvent() {
        return new CommPilotExpressEvent();
    }

    /**
     * Create an instance of {@link ThreeWayCallEvent }
     * 
     */
    public ThreeWayCallEvent createThreeWayCallEvent() {
        return new ThreeWayCallEvent();
    }

    /**
     * Create an instance of {@link CallSubscriptionResyncEvent }
     * 
     */
    public CallSubscriptionResyncEvent createCallSubscriptionResyncEvent() {
        return new CallSubscriptionResyncEvent();
    }

    /**
     * Create an instance of {@link MeetMeLectureModeStoppedEvent }
     * 
     */
    public MeetMeLectureModeStoppedEvent createMeetMeLectureModeStoppedEvent() {
        return new MeetMeLectureModeStoppedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantUpdatedEvent }
     * 
     */
    public CollaborateRoomParticipantUpdatedEvent createCollaborateRoomParticipantUpdatedEvent() {
        return new CollaborateRoomParticipantUpdatedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomSessionInfo }
     * 
     */
    public CollaborateRoomSessionInfo createCollaborateRoomSessionInfo() {
        return new CollaborateRoomSessionInfo();
    }

    /**
     * Create an instance of {@link SimultaneousRingLocation }
     * 
     */
    public SimultaneousRingLocation createSimultaneousRingLocation() {
        return new SimultaneousRingLocation();
    }

    /**
     * Create an instance of {@link ConferenceHeldEvent }
     * 
     */
    public ConferenceHeldEvent createConferenceHeldEvent() {
        return new ConferenceHeldEvent();
    }

    /**
     * Create an instance of {@link PersonalAssistantEvent }
     * 
     */
    public PersonalAssistantEvent createPersonalAssistantEvent() {
        return new PersonalAssistantEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomEventInfo }
     * 
     */
    public CollaborateRoomEventInfo createCollaborateRoomEventInfo() {
        return new CollaborateRoomEventInfo();
    }

    /**
     * Create an instance of {@link DeviceManagementUserNamePassword }
     * 
     */
    public DeviceManagementUserNamePassword createDeviceManagementUserNamePassword() {
        return new DeviceManagementUserNamePassword();
    }

    /**
     * Create an instance of {@link ConferenceParticipant }
     * 
     */
    public ConferenceParticipant createConferenceParticipant() {
        return new ConferenceParticipant();
    }

    /**
     * Create an instance of {@link CollaborateRoomScheduleDuration }
     * 
     */
    public CollaborateRoomScheduleDuration createCollaborateRoomScheduleDuration() {
        return new CollaborateRoomScheduleDuration();
    }

    /**
     * Create an instance of {@link FlexibleSeatingGuestAccessDevice }
     * 
     */
    public FlexibleSeatingGuestAccessDevice createFlexibleSeatingGuestAccessDevice() {
        return new FlexibleSeatingGuestAccessDevice();
    }

    /**
     * Create an instance of {@link RoutePointCallOverflowedEvent }
     * 
     */
    public RoutePointCallOverflowedEvent createRoutePointCallOverflowedEvent() {
        return new RoutePointCallOverflowedEvent();
    }

    /**
     * Create an instance of {@link ConferenceCallMadeUnDeafEvent }
     * 
     */
    public ConferenceCallMadeUnDeafEvent createConferenceCallMadeUnDeafEvent() {
        return new ConferenceCallMadeUnDeafEvent();
    }

    /**
     * Create an instance of {@link SecurityClassificationEvent }
     * 
     */
    public SecurityClassificationEvent createSecurityClassificationEvent() {
        return new SecurityClassificationEvent();
    }

    /**
     * Create an instance of {@link ConferenceRetrievedEvent }
     * 
     */
    public ConferenceRetrievedEvent createConferenceRetrievedEvent() {
        return new ConferenceRetrievedEvent();
    }

    /**
     * Create an instance of {@link RemoteOfficeEvent }
     * 
     */
    public RemoteOfficeEvent createRemoteOfficeEvent() {
        return new RemoteOfficeEvent();
    }

    /**
     * Create an instance of {@link ACDCallBouncedEvent }
     * 
     */
    public ACDCallBouncedEvent createACDCallBouncedEvent() {
        return new ACDCallBouncedEvent();
    }

    /**
     * Create an instance of {@link VoiceMessagingEvent }
     * 
     */
    public VoiceMessagingEvent createVoiceMessagingEvent() {
        return new VoiceMessagingEvent();
    }

    /**
     * Create an instance of {@link AlternateNumberEntry }
     * 
     */
    public AlternateNumberEntry createAlternateNumberEntry() {
        return new AlternateNumberEntry();
    }

    /**
     * Create an instance of {@link MeetMeConferenceSecurityClassificationUpdatedEvent }
     * 
     */
    public MeetMeConferenceSecurityClassificationUpdatedEvent createMeetMeConferenceSecurityClassificationUpdatedEvent() {
        return new MeetMeConferenceSecurityClassificationUpdatedEvent();
    }

    /**
     * Create an instance of {@link RoutePointCallForwardedEvent }
     * 
     */
    public RoutePointCallForwardedEvent createRoutePointCallForwardedEvent() {
        return new RoutePointCallForwardedEvent();
    }

    /**
     * Create an instance of {@link CommPilotExpressAvailableInOffice }
     * 
     */
    public CommPilotExpressAvailableInOffice createCommPilotExpressAvailableInOffice() {
        return new CommPilotExpressAvailableInOffice();
    }

    /**
     * Create an instance of {@link RoutePointCallReleasedEvent }
     * 
     */
    public RoutePointCallReleasedEvent createRoutePointCallReleasedEvent() {
        return new RoutePointCallReleasedEvent();
    }

    /**
     * Create an instance of {@link CallTransferredEvent }
     * 
     */
    public CallTransferredEvent createCallTransferredEvent() {
        return new CallTransferredEvent();
    }

    /**
     * Create an instance of {@link ACDCallReleasedEvent }
     * 
     */
    public ACDCallReleasedEvent createACDCallReleasedEvent() {
        return new ACDCallReleasedEvent();
    }

    /**
     * Create an instance of {@link ExecutiveAssistantDetails }
     * 
     */
    public ExecutiveAssistantDetails createExecutiveAssistantDetails() {
        return new ExecutiveAssistantDetails();
    }

    /**
     * Create an instance of {@link RoutePointCallOverflowedTreatmentCompletedEvent }
     * 
     */
    public RoutePointCallOverflowedTreatmentCompletedEvent createRoutePointCallOverflowedTreatmentCompletedEvent() {
        return new RoutePointCallOverflowedTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomSubscriptionEvent }
     * 
     */
    public CollaborateRoomSubscriptionEvent createCollaborateRoomSubscriptionEvent() {
        return new CollaborateRoomSubscriptionEvent();
    }

    /**
     * Create an instance of {@link EmptyContent }
     * 
     */
    public EmptyContent createEmptyContent() {
        return new EmptyContent();
    }

    /**
     * Create an instance of {@link Redirection }
     * 
     */
    public Redirection createRedirection() {
        return new Redirection();
    }

    /**
     * Create an instance of {@link RoutePointCallAbandonedEvent }
     * 
     */
    public RoutePointCallAbandonedEvent createRoutePointCallAbandonedEvent() {
        return new RoutePointCallAbandonedEvent();
    }

    /**
     * Create an instance of {@link CallSubscriptionEvent }
     * 
     */
    public CallSubscriptionEvent createCallSubscriptionEvent() {
        return new CallSubscriptionEvent();
    }

    /**
     * Create an instance of {@link ContactURL }
     * 
     */
    public ContactURL createContactURL() {
        return new ContactURL();
    }

    /**
     * Create an instance of {@link CallCenterAgentMonitoringStatus }
     * 
     */
    public CallCenterAgentMonitoringStatus createCallCenterAgentMonitoringStatus() {
        return new CallCenterAgentMonitoringStatus();
    }

    /**
     * Create an instance of {@link CallBargedInEvent }
     * 
     */
    public CallBargedInEvent createCallBargedInEvent() {
        return new CallBargedInEvent();
    }

    /**
     * Create an instance of {@link Redirect }
     * 
     */
    public Redirect createRedirect() {
        return new Redirect();
    }

    /**
     * Create an instance of {@link CallUpdatedEvent }
     * 
     */
    public CallUpdatedEvent createCallUpdatedEvent() {
        return new CallUpdatedEvent();
    }

    /**
     * Create an instance of {@link RoutePointSubscriptionResyncEvent }
     * 
     */
    public RoutePointSubscriptionResyncEvent createRoutePointSubscriptionResyncEvent() {
        return new RoutePointSubscriptionResyncEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomStoppedEvent }
     * 
     */
    public CollaborateRoomStoppedEvent createCollaborateRoomStoppedEvent() {
        return new CollaborateRoomStoppedEvent();
    }

    /**
     * Create an instance of {@link AccessEndpoint }
     * 
     */
    public AccessEndpoint createAccessEndpoint() {
        return new AccessEndpoint();
    }

    /**
     * Create an instance of {@link CommPilotExpressUnavailable }
     * 
     */
    public CommPilotExpressUnavailable createCommPilotExpressUnavailable() {
        return new CommPilotExpressUnavailable();
    }

    /**
     * Create an instance of {@link RoutePointCallOfferedToAgentEvent }
     * 
     */
    public RoutePointCallOfferedToAgentEvent createRoutePointCallOfferedToAgentEvent() {
        return new RoutePointCallOfferedToAgentEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceStoppedEvent }
     * 
     */
    public MeetMeConferenceStoppedEvent createMeetMeConferenceStoppedEvent() {
        return new MeetMeConferenceStoppedEvent();
    }

    /**
     * Create an instance of {@link EnhancedCallLogsEntry }
     * 
     */
    public EnhancedCallLogsEntry createEnhancedCallLogsEntry() {
        return new EnhancedCallLogsEntry();
    }

    /**
     * Create an instance of {@link ConferenceUpdatedEvent }
     * 
     */
    public ConferenceUpdatedEvent createConferenceUpdatedEvent() {
        return new ConferenceUpdatedEvent();
    }

    /**
     * Create an instance of {@link CallTransferEvent }
     * 
     */
    public CallTransferEvent createCallTransferEvent() {
        return new CallTransferEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomLockedEvent }
     * 
     */
    public CollaborateRoomLockedEvent createCollaborateRoomLockedEvent() {
        return new CollaborateRoomLockedEvent();
    }

    /**
     * Create an instance of {@link CallRecordingStartingEvent }
     * 
     */
    public CallRecordingStartingEvent createCallRecordingStartingEvent() {
        return new CallRecordingStartingEvent();
    }

    /**
     * Create an instance of {@link RoutePointTreatmentStartedEvent }
     * 
     */
    public RoutePointTreatmentStartedEvent createRoutePointTreatmentStartedEvent() {
        return new RoutePointTreatmentStartedEvent();
    }

    /**
     * Create an instance of {@link ACDCallOverflowedTreatmentCompletedEvent }
     * 
     */
    public ACDCallOverflowedTreatmentCompletedEvent createACDCallOverflowedTreatmentCompletedEvent() {
        return new ACDCallOverflowedTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link MeetMeParticipantHeldEvent }
     * 
     */
    public MeetMeParticipantHeldEvent createMeetMeParticipantHeldEvent() {
        return new MeetMeParticipantHeldEvent();
    }

    /**
     * Create an instance of {@link ConferenceCallUnMutedEvent }
     * 
     */
    public ConferenceCallUnMutedEvent createConferenceCallUnMutedEvent() {
        return new ConferenceCallUnMutedEvent();
    }

    /**
     * Create an instance of {@link RoutePointOutgoingCallOriginatedEvent }
     * 
     */
    public RoutePointOutgoingCallOriginatedEvent createRoutePointOutgoingCallOriginatedEvent() {
        return new RoutePointOutgoingCallOriginatedEvent();
    }

    /**
     * Create an instance of {@link ExecutiveAssistantDetailsList }
     * 
     */
    public ExecutiveAssistantDetailsList createExecutiveAssistantDetailsList() {
        return new ExecutiveAssistantDetailsList();
    }

    /**
     * Create an instance of {@link CallForwardingNoAnswerEvent }
     * 
     */
    public CallForwardingNoAnswerEvent createCallForwardingNoAnswerEvent() {
        return new CallForwardingNoAnswerEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipant }
     * 
     */
    public CollaborateRoomParticipant createCollaborateRoomParticipant() {
        return new CollaborateRoomParticipant();
    }

    /**
     * Create an instance of {@link RemoteOfficeEndpoint }
     * 
     */
    public RemoteOfficeEndpoint createRemoteOfficeEndpoint() {
        return new RemoteOfficeEndpoint();
    }

    /**
     * Create an instance of {@link CallMonitoredEvent }
     * 
     */
    public CallMonitoredEvent createCallMonitoredEvent() {
        return new CallMonitoredEvent();
    }

    /**
     * Create an instance of {@link ConferenceStartedEvent }
     * 
     */
    public ConferenceStartedEvent createConferenceStartedEvent() {
        return new ConferenceStartedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceSubscriptionResyncEvent }
     * 
     */
    public MeetMeConferenceSubscriptionResyncEvent createMeetMeConferenceSubscriptionResyncEvent() {
        return new MeetMeConferenceSubscriptionResyncEvent();
    }

    /**
     * Create an instance of {@link ACDHolidayServiceEvent }
     * 
     */
    public ACDHolidayServiceEvent createACDHolidayServiceEvent() {
        return new ACDHolidayServiceEvent();
    }

    /**
     * Create an instance of {@link ACDAgentJoinUpdateData }
     * 
     */
    public ACDAgentJoinUpdateData createACDAgentJoinUpdateData() {
        return new ACDAgentJoinUpdateData();
    }

    /**
     * Create an instance of {@link CallLogsEntry }
     * 
     */
    public CallLogsEntry createCallLogsEntry() {
        return new CallLogsEntry();
    }

    /**
     * Create an instance of {@link ACDDNISInfo }
     * 
     */
    public ACDDNISInfo createACDDNISInfo() {
        return new ACDDNISInfo();
    }

    /**
     * Create an instance of {@link ConferenceCallMadeDeafEvent }
     * 
     */
    public ConferenceCallMadeDeafEvent createConferenceCallMadeDeafEvent() {
        return new ConferenceCallMadeDeafEvent();
    }

    /**
     * Create an instance of {@link CollaborateRoomCallIdList }
     * 
     */
    public CollaborateRoomCallIdList createCollaborateRoomCallIdList() {
        return new CollaborateRoomCallIdList();
    }

    /**
     * Create an instance of {@link NWayCallEvent }
     * 
     */
    public NWayCallEvent createNWayCallEvent() {
        return new NWayCallEvent();
    }

    /**
     * Create an instance of {@link RoutePointRingbackStartedEvent }
     * 
     */
    public RoutePointRingbackStartedEvent createRoutePointRingbackStartedEvent() {
        return new RoutePointRingbackStartedEvent();
    }

    /**
     * Create an instance of {@link ACDCallAddedEvent }
     * 
     */
    public ACDCallAddedEvent createACDCallAddedEvent() {
        return new ACDCallAddedEvent();
    }

    /**
     * Create an instance of {@link NonNegativeIntWithSeverity }
     * 
     */
    public NonNegativeIntWithSeverity createNonNegativeIntWithSeverity() {
        return new NonNegativeIntWithSeverity();
    }

    /**
     * Create an instance of {@link ACDAgentJoinData }
     * 
     */
    public ACDAgentJoinData createACDAgentJoinData() {
        return new ACDAgentJoinData();
    }

    /**
     * Create an instance of {@link MeetMeConferenceRecordingStoppedEvent }
     * 
     */
    public MeetMeConferenceRecordingStoppedEvent createMeetMeConferenceRecordingStoppedEvent() {
        return new MeetMeConferenceRecordingStoppedEvent();
    }

    /**
     * Create an instance of {@link CallIdList }
     * 
     */
    public CallIdList createCallIdList() {
        return new CallIdList();
    }

    /**
     * Create an instance of {@link CallClientSessionInfoUpdatedEvent }
     * 
     */
    public CallClientSessionInfoUpdatedEvent createCallClientSessionInfoUpdatedEvent() {
        return new CallClientSessionInfoUpdatedEvent();
    }

    /**
     * Create an instance of {@link CommPilotExpressBusy }
     * 
     */
    public CommPilotExpressBusy createCommPilotExpressBusy() {
        return new CommPilotExpressBusy();
    }

    /**
     * Create an instance of {@link PartyInformation }
     * 
     */
    public PartyInformation createPartyInformation() {
        return new PartyInformation();
    }

    /**
     * Create an instance of {@link ACDSubscriptionResyncEvent }
     * 
     */
    public ACDSubscriptionResyncEvent createACDSubscriptionResyncEvent() {
        return new ACDSubscriptionResyncEvent();
    }

    /**
     * Create an instance of {@link CallCenterAgentOnCallAlertEvent }
     * 
     */
    public CallCenterAgentOnCallAlertEvent createCallCenterAgentOnCallAlertEvent() {
        return new CallCenterAgentOnCallAlertEvent();
    }

    /**
     * Create an instance of {@link CallPickedUpEvent }
     * 
     */
    public CallPickedUpEvent createCallPickedUpEvent() {
        return new CallPickedUpEvent();
    }

    /**
     * Create an instance of {@link SimultaneousRingLocationList }
     * 
     */
    public SimultaneousRingLocationList createSimultaneousRingLocationList() {
        return new SimultaneousRingLocationList();
    }

    /**
     * Create an instance of {@link CollaborateRoomParticipantList }
     * 
     */
    public CollaborateRoomParticipantList createCollaborateRoomParticipantList() {
        return new CollaborateRoomParticipantList();
    }

    /**
     * Create an instance of {@link CallRecordingPausedEvent }
     * 
     */
    public CallRecordingPausedEvent createCallRecordingPausedEvent() {
        return new CallRecordingPausedEvent();
    }

    /**
     * Create an instance of {@link ACDEvent }
     * 
     */
    public ACDEvent createACDEvent() {
        return new ACDEvent();
    }

    /**
     * Create an instance of {@link MeetMeParticipantMutedEvent }
     * 
     */
    public MeetMeParticipantMutedEvent createMeetMeParticipantMutedEvent() {
        return new MeetMeParticipantMutedEvent();
    }

    /**
     * Create an instance of {@link ACDForcedForwardingEvent }
     * 
     */
    public ACDForcedForwardingEvent createACDForcedForwardingEvent() {
        return new ACDForcedForwardingEvent();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereLocationInfoList }
     * 
     */
    public BroadWorksAnywhereLocationInfoList createBroadWorksAnywhereLocationInfoList() {
        return new BroadWorksAnywhereLocationInfoList();
    }

    /**
     * Create an instance of {@link SequentialRingLocation }
     * 
     */
    public SequentialRingLocation createSequentialRingLocation() {
        return new SequentialRingLocation();
    }

    /**
     * Create an instance of {@link MeetMeConferenceInfo }
     * 
     */
    public MeetMeConferenceInfo createMeetMeConferenceInfo() {
        return new MeetMeConferenceInfo();
    }

    /**
     * Create an instance of {@link CallRedirectedEvent }
     * 
     */
    public CallRedirectedEvent createCallRedirectedEvent() {
        return new CallRedirectedEvent();
    }

    /**
     * Create an instance of {@link CallForwarding }
     * 
     */
    public CallForwarding createCallForwarding() {
        return new CallForwarding();
    }

    /**
     * Create an instance of {@link RoutePointCallAddedEvent }
     * 
     */
    public RoutePointCallAddedEvent createRoutePointCallAddedEvent() {
        return new RoutePointCallAddedEvent();
    }

    /**
     * Create an instance of {@link ACDCallOverflowedEvent }
     * 
     */
    public ACDCallOverflowedEvent createACDCallOverflowedEvent() {
        return new ACDCallOverflowedEvent();
    }

    /**
     * Create an instance of {@link ACDWhisperStartedEvent }
     * 
     */
    public ACDWhisperStartedEvent createACDWhisperStartedEvent() {
        return new ACDWhisperStartedEvent();
    }

    /**
     * Create an instance of {@link HookStatusEvent }
     * 
     */
    public HookStatusEvent createHookStatusEvent() {
        return new HookStatusEvent();
    }

    /**
     * Create an instance of {@link Criteria }
     * 
     */
    public Criteria createCriteria() {
        return new Criteria();
    }

    /**
     * Create an instance of {@link ACDConfigurationSubscriptionEvent }
     * 
     */
    public ACDConfigurationSubscriptionEvent createACDConfigurationSubscriptionEvent() {
        return new ACDConfigurationSubscriptionEvent();
    }

    /**
     * Create an instance of {@link ACDAgentUnavailableCodeDetail }
     * 
     */
    public ACDAgentUnavailableCodeDetail createACDAgentUnavailableCodeDetail() {
        return new ACDAgentUnavailableCodeDetail();
    }

    /**
     * Create an instance of {@link CallSecurityClassificationUpdatedEvent }
     * 
     */
    public CallSecurityClassificationUpdatedEvent createCallSecurityClassificationUpdatedEvent() {
        return new CallSecurityClassificationUpdatedEvent();
    }

    /**
     * Create an instance of {@link ACDCallForwardedTreatmentCompletedEvent }
     * 
     */
    public ACDCallForwardedTreatmentCompletedEvent createACDCallForwardedTreatmentCompletedEvent() {
        return new ACDCallForwardedTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link MeetMeParticipantUpdatedEvent }
     * 
     */
    public MeetMeParticipantUpdatedEvent createMeetMeParticipantUpdatedEvent() {
        return new MeetMeParticipantUpdatedEvent();
    }

    /**
     * Create an instance of {@link CallCenterDetails }
     * 
     */
    public CallCenterDetails createCallCenterDetails() {
        return new CallCenterDetails();
    }

    /**
     * Create an instance of {@link RoutePointOutgoingCallAnsweredEvent }
     * 
     */
    public RoutePointOutgoingCallAnsweredEvent createRoutePointOutgoingCallAnsweredEvent() {
        return new RoutePointOutgoingCallAnsweredEvent();
    }

    /**
     * Create an instance of {@link CallHeldEvent }
     * 
     */
    public CallHeldEvent createCallHeldEvent() {
        return new CallHeldEvent();
    }

    /**
     * Create an instance of {@link ErrorEvent }
     * 
     */
    public ErrorEvent createErrorEvent() {
        return new ErrorEvent();
    }

    /**
     * Create an instance of {@link RoutePointFailedEvent }
     * 
     */
    public RoutePointFailedEvent createRoutePointFailedEvent() {
        return new RoutePointFailedEvent();
    }

    /**
     * Create an instance of {@link ACDAgentJoinUpdateEvent }
     * 
     */
    public ACDAgentJoinUpdateEvent createACDAgentJoinUpdateEvent() {
        return new ACDAgentJoinUpdateEvent();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereLocationInfo }
     * 
     */
    public BroadWorksAnywhereLocationInfo createBroadWorksAnywhereLocationInfo() {
        return new BroadWorksAnywhereLocationInfo();
    }

    /**
     * Create an instance of {@link MeetMeConferenceParticipants }
     * 
     */
    public MeetMeConferenceParticipants createMeetMeConferenceParticipants() {
        return new MeetMeConferenceParticipants();
    }

    /**
     * Create an instance of {@link CollaborateRoomUnlockedEvent }
     * 
     */
    public CollaborateRoomUnlockedEvent createCollaborateRoomUnlockedEvent() {
        return new CollaborateRoomUnlockedEvent();
    }

    /**
     * Create an instance of {@link ACDCallDispositionCodeDetail }
     * 
     */
    public ACDCallDispositionCodeDetail createACDCallDispositionCodeDetail() {
        return new ACDCallDispositionCodeDetail();
    }

    /**
     * Create an instance of {@link PlayCollectInfo }
     * 
     */
    public PlayCollectInfo createPlayCollectInfo() {
        return new PlayCollectInfo();
    }

    /**
     * Create an instance of {@link SubscriptionEvent }
     * 
     */
    public SubscriptionEvent createSubscriptionEvent() {
        return new SubscriptionEvent();
    }

    /**
     * Create an instance of {@link AccessDevice }
     * 
     */
    public AccessDevice createAccessDevice() {
        return new AccessDevice();
    }

    /**
     * Create an instance of {@link ACDCallInfo }
     * 
     */
    public ACDCallInfo createACDCallInfo() {
        return new ACDCallInfo();
    }

    /**
     * Create an instance of {@link RoutePointMOHStartedEvent }
     * 
     */
    public RoutePointMOHStartedEvent createRoutePointMOHStartedEvent() {
        return new RoutePointMOHStartedEvent();
    }

    /**
     * Create an instance of {@link CallParkedAgainstEvent }
     * 
     */
    public CallParkedAgainstEvent createCallParkedAgainstEvent() {
        return new CallParkedAgainstEvent();
    }

    /**
     * Create an instance of {@link CallRecordingStoppedEvent }
     * 
     */
    public CallRecordingStoppedEvent createCallRecordingStoppedEvent() {
        return new CallRecordingStoppedEvent();
    }

    /**
     * Create an instance of {@link CriteriaWithExecutiveFiltering }
     * 
     */
    public CriteriaWithExecutiveFiltering createCriteriaWithExecutiveFiltering() {
        return new CriteriaWithExecutiveFiltering();
    }

    /**
     * Create an instance of {@link SequentialRingEvent }
     * 
     */
    public SequentialRingEvent createSequentialRingEvent() {
        return new SequentialRingEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferenceClientSessionInfoUpdatedEvent }
     * 
     */
    public MeetMeConferenceClientSessionInfoUpdatedEvent createMeetMeConferenceClientSessionInfoUpdatedEvent() {
        return new MeetMeConferenceClientSessionInfoUpdatedEvent();
    }

    /**
     * Create an instance of {@link BroadWorksAnywhereEndpoint }
     * 
     */
    public BroadWorksAnywhereEndpoint createBroadWorksAnywhereEndpoint() {
        return new BroadWorksAnywhereEndpoint();
    }

    /**
     * Create an instance of {@link ACDCallReorderedEvent }
     * 
     */
    public ACDCallReorderedEvent createACDCallReorderedEvent() {
        return new ACDCallReorderedEvent();
    }

    /**
     * Create an instance of {@link ReleaseCause }
     * 
     */
    public ReleaseCause createReleaseCause() {
        return new ReleaseCause();
    }

    /**
     * Create an instance of {@link CommPilotExpressEmailNotify }
     * 
     */
    public CommPilotExpressEmailNotify createCommPilotExpressEmailNotify() {
        return new CommPilotExpressEmailNotify();
    }

    /**
     * Create an instance of {@link LastNumberRedialEvent }
     * 
     */
    public LastNumberRedialEvent createLastNumberRedialEvent() {
        return new LastNumberRedialEvent();
    }

    /**
     * Create an instance of {@link TimestampWithSeverity }
     * 
     */
    public TimestampWithSeverity createTimestampWithSeverity() {
        return new TimestampWithSeverity();
    }

    /**
     * Create an instance of {@link ColaborateRoomParticipant }
     * 
     */
    public ColaborateRoomParticipant createColaborateRoomParticipant() {
        return new ColaborateRoomParticipant();
    }

    /**
     * Create an instance of {@link MeetMeConferenceUnlockedEvent }
     * 
     */
    public MeetMeConferenceUnlockedEvent createMeetMeConferenceUnlockedEvent() {
        return new MeetMeConferenceUnlockedEvent();
    }

    /**
     * Create an instance of {@link ACDAgentJoinInfo }
     * 
     */
    public ACDAgentJoinInfo createACDAgentJoinInfo() {
        return new ACDAgentJoinInfo();
    }

    /**
     * Create an instance of {@link FileDescriptor }
     * 
     */
    public FileDescriptor createFileDescriptor() {
        return new FileDescriptor();
    }

    /**
     * Create an instance of {@link CallRetrievedEvent }
     * 
     */
    public CallRetrievedEvent createCallRetrievedEvent() {
        return new CallRetrievedEvent();
    }

    /**
     * Create an instance of {@link BroadWorksMobilityMobileNumbersAlertList }
     * 
     */
    public BroadWorksMobilityMobileNumbersAlertList createBroadWorksMobilityMobileNumbersAlertList() {
        return new BroadWorksMobilityMobileNumbersAlertList();
    }

    /**
     * Create an instance of {@link AgentDispositionCodeAddedEvent }
     * 
     */
    public AgentDispositionCodeAddedEvent createAgentDispositionCodeAddedEvent() {
        return new AgentDispositionCodeAddedEvent();
    }

    /**
     * Create an instance of {@link MeetMeConferencingBridgeHostList }
     * 
     */
    public MeetMeConferencingBridgeHostList createMeetMeConferencingBridgeHostList() {
        return new MeetMeConferencingBridgeHostList();
    }

    /**
     * Create an instance of {@link CallCenterMonitoringStatus }
     * 
     */
    public CallCenterMonitoringStatus createCallCenterMonitoringStatus() {
        return new CallCenterMonitoringStatus();
    }

    /**
     * Create an instance of {@link CallForwardingAlwaysEvent }
     * 
     */
    public CallForwardingAlwaysEvent createCallForwardingAlwaysEvent() {
        return new CallForwardingAlwaysEvent();
    }

    /**
     * Create an instance of {@link RoutePointTreatmentCompletedEvent }
     * 
     */
    public RoutePointTreatmentCompletedEvent createRoutePointTreatmentCompletedEvent() {
        return new RoutePointTreatmentCompletedEvent();
    }

    /**
     * Create an instance of {@link ACDCallEscapedEvent }
     * 
     */
    public ACDCallEscapedEvent createACDCallEscapedEvent() {
        return new ACDCallEscapedEvent();
    }

    /**
     * Create an instance of {@link Recurrence.RecurDaily }
     * 
     */
    public Recurrence.RecurDaily createRecurrenceRecurDaily() {
        return new Recurrence.RecurDaily();
    }

    /**
     * Create an instance of {@link Recurrence.RecurWeekly }
     * 
     */
    public Recurrence.RecurWeekly createRecurrenceRecurWeekly() {
        return new Recurrence.RecurWeekly();
    }

    /**
     * Create an instance of {@link Recurrence.RecurMonthlyByDay }
     * 
     */
    public Recurrence.RecurMonthlyByDay createRecurrenceRecurMonthlyByDay() {
        return new Recurrence.RecurMonthlyByDay();
    }

    /**
     * Create an instance of {@link Recurrence.RecurMonthlyByWeek }
     * 
     */
    public Recurrence.RecurMonthlyByWeek createRecurrenceRecurMonthlyByWeek() {
        return new Recurrence.RecurMonthlyByWeek();
    }

    /**
     * Create an instance of {@link Recurrence.RecurYearlyByDay }
     * 
     */
    public Recurrence.RecurYearlyByDay createRecurrenceRecurYearlyByDay() {
        return new Recurrence.RecurYearlyByDay();
    }

    /**
     * Create an instance of {@link Recurrence.RecurYearlyByWeek }
     * 
     */
    public Recurrence.RecurYearlyByWeek createRecurrenceRecurYearlyByWeek() {
        return new Recurrence.RecurYearlyByWeek();
    }

    /**
     * Create an instance of {@link CollaborateRoomSchedule.ScheduleReservationless }
     * 
     */
    public CollaborateRoomSchedule.ScheduleReservationless createCollaborateRoomScheduleScheduleReservationless() {
        return new CollaborateRoomSchedule.ScheduleReservationless();
    }

    /**
     * Create an instance of {@link CollaborateRoomSchedule.ScheduleOneTime }
     * 
     */
    public CollaborateRoomSchedule.ScheduleOneTime createCollaborateRoomScheduleScheduleOneTime() {
        return new CollaborateRoomSchedule.ScheduleOneTime();
    }

    /**
     * Create an instance of {@link CollaborateRoomSchedule.ScheduleRecurring }
     * 
     */
    public CollaborateRoomSchedule.ScheduleRecurring createCollaborateRoomScheduleScheduleRecurring() {
        return new CollaborateRoomSchedule.ScheduleRecurring();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceSchedule.ScheduleReservationless }
     * 
     */
    public MeetMeConferencingConferenceSchedule.ScheduleReservationless createMeetMeConferencingConferenceScheduleScheduleReservationless() {
        return new MeetMeConferencingConferenceSchedule.ScheduleReservationless();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceSchedule.ScheduleOneTime }
     * 
     */
    public MeetMeConferencingConferenceSchedule.ScheduleOneTime createMeetMeConferencingConferenceScheduleScheduleOneTime() {
        return new MeetMeConferencingConferenceSchedule.ScheduleOneTime();
    }

    /**
     * Create an instance of {@link MeetMeConferencingConferenceSchedule.ScheduleRecurring }
     * 
     */
    public MeetMeConferencingConferenceSchedule.ScheduleRecurring createMeetMeConferencingConferenceScheduleScheduleRecurring() {
        return new MeetMeConferencingConferenceSchedule.ScheduleRecurring();
    }

    /**
     * Create an instance of {@link Supervisors.CallCenters.CallCenter }
     * 
     */
    public Supervisors.CallCenters.CallCenter createSupervisorsCallCentersCallCenter() {
        return new Supervisors.CallCenters.CallCenter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallingLineIDBlockingOverride }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallingLineIDBlockingOverride")
    public JAXBElement<CallingLineIDBlockingOverride> createCallingLineIDBlockingOverride(CallingLineIDBlockingOverride value) {
        return new JAXBElement<CallingLineIDBlockingOverride>(_CallingLineIDBlockingOverride_QNAME, CallingLineIDBlockingOverride.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Call }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Call")
    public JAXBElement<Call> createCall(Call value) {
        return new JAXBElement<Call>(_Call_QNAME, Call.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallingLineIDDeliveryBlocking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallingLineIDDeliveryBlocking")
    public JAXBElement<CallingLineIDDeliveryBlocking> createCallingLineIDDeliveryBlocking(CallingLineIDDeliveryBlocking value) {
        return new JAXBElement<CallingLineIDDeliveryBlocking>(_CallingLineIDDeliveryBlocking_QNAME, CallingLineIDDeliveryBlocking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetMeConferencingUserConferences }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MeetMeConferencingUserConferences")
    public JAXBElement<MeetMeConferencingUserConferences> createMeetMeConferencingUserConferences(MeetMeConferencingUserConferences value) {
        return new JAXBElement<MeetMeConferencingUserConferences>(_MeetMeConferencingUserConferences_QNAME, MeetMeConferencingUserConferences.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MWIDeliveryToMobileEndpoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MWIDeliveryToMobileEndpoint")
    public JAXBElement<MWIDeliveryToMobileEndpoint> createMWIDeliveryToMobileEndpoint(MWIDeliveryToMobileEndpoint value) {
        return new JAXBElement<MWIDeliveryToMobileEndpoint>(_MWIDeliveryToMobileEndpoint_QNAME, MWIDeliveryToMobileEndpoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequentialRing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "SequentialRing")
    public JAXBElement<SequentialRing> createSequentialRing(SequentialRing value) {
        return new JAXBElement<SequentialRing>(_SequentialRing_QNAME, SequentialRing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveAssistant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveAssistant")
    public JAXBElement<ExecutiveAssistant> createExecutiveAssistant(ExecutiveAssistant value) {
        return new JAXBElement<ExecutiveAssistant>(_ExecutiveAssistant_QNAME, ExecutiveAssistant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ChannelHeartBeat")
    public JAXBElement<Object> createChannelHeartBeat(Object value) {
        return new JAXBElement<Object>(_ChannelHeartBeat_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetMeConference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MeetMeConference")
    public JAXBElement<MeetMeConference> createMeetMeConference(MeetMeConference value) {
        return new JAXBElement<MeetMeConference>(_MeetMeConference_QNAME, MeetMeConference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallForwardingNoAnswer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallForwardingNoAnswer")
    public JAXBElement<CallForwardingNoAnswer> createCallForwardingNoAnswer(CallForwardingNoAnswer value) {
        return new JAXBElement<CallForwardingNoAnswer>(_CallForwardingNoAnswer_QNAME, CallForwardingNoAnswer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMRNInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "IMRNInfo")
    public JAXBElement<IMRNInfo> createIMRNInfo(IMRNInfo value) {
        return new JAXBElement<IMRNInfo>(_IMRNInfo_QNAME, IMRNInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Event")
    public JAXBElement<BaseEvent> createEvent(BaseEvent value) {
        return new JAXBElement<BaseEvent>(_Event_QNAME, BaseEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoNotDisturb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "DoNotDisturb")
    public JAXBElement<DoNotDisturb> createDoNotDisturb(DoNotDisturb value) {
        return new JAXBElement<DoNotDisturb>(_DoNotDisturb_QNAME, DoNotDisturb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollaborateRoomInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CollaborateRoomInfo")
    public JAXBElement<CollaborateRoomInfo> createCollaborateRoomInfo(CollaborateRoomInfo value) {
        return new JAXBElement<CollaborateRoomInfo>(_CollaborateRoomInfo_QNAME, CollaborateRoomInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveAlerting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveAlerting")
    public JAXBElement<ExecutiveAlerting> createExecutiveAlerting(ExecutiveAlerting value) {
        return new JAXBElement<ExecutiveAlerting>(_ExecutiveAlerting_QNAME, ExecutiveAlerting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "PersonalAssistantAvailableCallToNumbers")
    public JAXBElement<CallToNumberList> createPersonalAssistantAvailableCallToNumbers(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_PersonalAssistantAvailableCallToNumbers_QNAME, CallToNumberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalAssistantExclusionNumberEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "PersonalAssistantExclusionNumber")
    public JAXBElement<PersonalAssistantExclusionNumberEntry> createPersonalAssistantExclusionNumber(PersonalAssistantExclusionNumberEntry value) {
        return new JAXBElement<PersonalAssistantExclusionNumberEntry>(_PersonalAssistantExclusionNumber_QNAME, PersonalAssistantExclusionNumberEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetMeConferencingConference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MeetMeConferencingConference")
    public JAXBElement<MeetMeConferencingConference> createMeetMeConferencingConference(MeetMeConferencingConference value) {
        return new JAXBElement<MeetMeConferencingConference>(_MeetMeConferencingConference_QNAME, MeetMeConferencingConference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallForwardingNotReachable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallForwardingNotReachable")
    public JAXBElement<CallForwardingNotReachable> createCallForwardingNotReachable(CallForwardingNotReachable value) {
        return new JAXBElement<CallForwardingNotReachable>(_CallForwardingNotReachable_QNAME, CallForwardingNotReachable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteOffice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "RemoteOffice")
    public JAXBElement<RemoteOffice> createRemoteOffice(RemoteOffice value) {
        return new JAXBElement<RemoteOffice>(_RemoteOffice_QNAME, RemoteOffice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "EventResponse")
    public JAXBElement<EventResponse> createEventResponse(EventResponse value) {
        return new JAXBElement<EventResponse>(_EventResponse_QNAME, EventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollaborateRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CollaborateRoom")
    public JAXBElement<CollaborateRoom> createCollaborateRoom(CollaborateRoom value) {
        return new JAXBElement<CollaborateRoom>(_CollaborateRoom_QNAME, CollaborateRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveCallFiltering }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveCallFiltering")
    public JAXBElement<ExecutiveCallFiltering> createExecutiveCallFiltering(ExecutiveCallFiltering value) {
        return new JAXBElement<ExecutiveCallFiltering>(_ExecutiveCallFiltering_QNAME, ExecutiveCallFiltering.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedLineIdentificationPresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ConnectedLineIdentificationPresentation")
    public JAXBElement<ConnectedLineIdentificationPresentation> createConnectedLineIdentificationPresentation(ConnectedLineIdentificationPresentation value) {
        return new JAXBElement<ConnectedLineIdentificationPresentation>(_ConnectedLineIdentificationPresentation_QNAME, ConnectedLineIdentificationPresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommPilotExpress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CommPilotExpress")
    public JAXBElement<CommPilotExpress> createCommPilotExpress(CommPilotExpress value) {
        return new JAXBElement<CommPilotExpress>(_CommPilotExpress_QNAME, CommPilotExpress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "RoutePointState")
    public JAXBElement<RoutePointState> createRoutePointState(RoutePointState value) {
        return new JAXBElement<RoutePointState>(_RoutePointState_QNAME, RoutePointState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveFilteringCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveFilteringCriteria")
    public JAXBElement<ExecutiveFilteringCriteria> createExecutiveFilteringCriteria(ExecutiveFilteringCriteria value) {
        return new JAXBElement<ExecutiveFilteringCriteria>(_ExecutiveFilteringCriteria_QNAME, ExecutiveFilteringCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Channel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Channel")
    public JAXBElement<Channel> createChannel(Channel value) {
        return new JAXBElement<Channel>(_Channel_QNAME, Channel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallWaiting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallWaiting")
    public JAXBElement<CallWaiting> createCallWaiting(CallWaiting value) {
        return new JAXBElement<CallWaiting>(_CallWaiting_QNAME, CallWaiting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimultaneousRingPersonal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "SimultaneousRingPersonal")
    public JAXBElement<SimultaneousRingPersonal> createSimultaneousRingPersonal(SimultaneousRingPersonal value) {
        return new JAXBElement<SimultaneousRingPersonal>(_SimultaneousRingPersonal_QNAME, SimultaneousRingPersonal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Executive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Executive")
    public JAXBElement<Executive> createExecutive(Executive value) {
        return new JAXBElement<Executive>(_Executive_QNAME, Executive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelingGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "HotelingGuest")
    public JAXBElement<HotelingGuest> createHotelingGuest(HotelingGuest value) {
        return new JAXBElement<HotelingGuest>(_HotelingGuest_QNAME, HotelingGuest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadWorksAnywhereInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "BroadWorksAnywhere")
    public JAXBElement<BroadWorksAnywhereInfo> createBroadWorksAnywhere(BroadWorksAnywhereInfo value) {
        return new JAXBElement<BroadWorksAnywhereInfo>(_BroadWorksAnywhere_QNAME, BroadWorksAnywhereInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InCallServiceActivation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "InCallServiceActivation")
    public JAXBElement<InCallServiceActivation> createInCallServiceActivation(InCallServiceActivation value) {
        return new JAXBElement<InCallServiceActivation>(_InCallServiceActivation_QNAME, InCallServiceActivation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveScreening }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveScreening")
    public JAXBElement<ExecutiveScreening> createExecutiveScreening(ExecutiveScreening value) {
        return new JAXBElement<ExecutiveScreening>(_ExecutiveScreening_QNAME, ExecutiveScreening.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalAssistant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "PersonalAssistant")
    public JAXBElement<PersonalAssistant> createPersonalAssistant(PersonalAssistant value) {
        return new JAXBElement<PersonalAssistant>(_PersonalAssistant_QNAME, PersonalAssistant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallTransferInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallTransfer")
    public JAXBElement<CallTransferInfo> createCallTransfer(CallTransferInfo value) {
        return new JAXBElement<CallTransferInfo>(_CallTransfer_QNAME, CallTransferInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallForwardingAlways }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallForwardingAlways")
    public JAXBElement<CallForwardingAlways> createCallForwardingAlways(CallForwardingAlways value) {
        return new JAXBElement<CallForwardingAlways>(_CallForwardingAlways_QNAME, CallForwardingAlways.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallingNameRetrieval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallingNameRetrieval")
    public JAXBElement<CallingNameRetrieval> createCallingNameRetrieval(CallingNameRetrieval value) {
        return new JAXBElement<CallingNameRetrieval>(_CallingNameRetrieval_QNAME, CallingNameRetrieval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallForwardingBusy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallForwardingBusy")
    public JAXBElement<CallForwardingBusy> createCallForwardingBusy(CallForwardingBusy value) {
        return new JAXBElement<CallForwardingBusy>(_CallForwardingBusy_QNAME, CallForwardingBusy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupNightForwarding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "GroupNightForwarding")
    public JAXBElement<GroupNightForwarding> createGroupNightForwarding(GroupNightForwarding value) {
        return new JAXBElement<GroupNightForwarding>(_GroupNightForwarding_QNAME, GroupNightForwarding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedLineIdentificationRestriction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ConnectedLineIdentificationRestriction")
    public JAXBElement<ConnectedLineIdentificationRestriction> createConnectedLineIdentificationRestriction(ConnectedLineIdentificationRestriction value) {
        return new JAXBElement<ConnectedLineIdentificationRestriction>(_ConnectedLineIdentificationRestriction_QNAME, ConnectedLineIdentificationRestriction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Conference")
    public JAXBElement<Conference> createConference(Conference value) {
        return new JAXBElement<Conference>(_Conference_QNAME, Conference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetMeConferencingConferenceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MeetMeConferencingConferenceInfo")
    public JAXBElement<MeetMeConferencingConferenceInfo> createMeetMeConferencingConferenceInfo(MeetMeConferencingConferenceInfo value) {
        return new JAXBElement<MeetMeConferencingConferenceInfo>(_MeetMeConferencingConferenceInfo_QNAME, MeetMeConferencingConferenceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallForwardingAlwaysSecondary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "CallForwardingAlwaysSecondary")
    public JAXBElement<CallForwardingAlwaysSecondary> createCallForwardingAlwaysSecondary(CallForwardingAlwaysSecondary value) {
        return new JAXBElement<CallForwardingAlwaysSecondary>(_CallForwardingAlwaysSecondary_QNAME, CallForwardingAlwaysSecondary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalAssistantAssignedCallToNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "PersonalAssistantAssignedCallToNumbers")
    public JAXBElement<PersonalAssistantAssignedCallToNumbers> createPersonalAssistantAssignedCallToNumbers(PersonalAssistantAssignedCallToNumbers value) {
        return new JAXBElement<PersonalAssistantAssignedCallToNumbers>(_PersonalAssistantAssignedCallToNumbers_QNAME, PersonalAssistantAssignedCallToNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegratedIMPService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "IntegratedIMPService")
    public JAXBElement<IntegratedIMPService> createIntegratedIMPService(IntegratedIMPService value) {
        return new JAXBElement<IntegratedIMPService>(_IntegratedIMPService_QNAME, IntegratedIMPService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeetMeConferencingUserBridges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "MeetMeConferencingUserBridges")
    public JAXBElement<MeetMeConferencingUserBridges> createMeetMeConferencingUserBridges(MeetMeConferencingUserBridges value) {
        return new JAXBElement<MeetMeConferencingUserBridges>(_MeetMeConferencingUserBridges_QNAME, MeetMeConferencingUserBridges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalAssistantExclusionNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "PersonalAssistantExclusionNumberList")
    public JAXBElement<PersonalAssistantExclusionNumberList> createPersonalAssistantExclusionNumberList(PersonalAssistantExclusionNumberList value) {
        return new JAXBElement<PersonalAssistantExclusionNumberList>(_PersonalAssistantExclusionNumberList_QNAME, PersonalAssistantExclusionNumberList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "Subscription")
    public JAXBElement<Subscription> createSubscription(Subscription value) {
        return new JAXBElement<Subscription>(_Subscription_QNAME, Subscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SilentAlerting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "SilentAlerting")
    public JAXBElement<SilentAlerting> createSilentAlerting(SilentAlerting value) {
        return new JAXBElement<SilentAlerting>(_SilentAlerting_QNAME, SilentAlerting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutiveAssistants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ExecutiveAssistants")
    public JAXBElement<ExecutiveAssistants> createExecutiveAssistants(ExecutiveAssistants value) {
        return new JAXBElement<ExecutiveAssistants>(_ExecutiveAssistants_QNAME, ExecutiveAssistants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlexibleSeatingGuest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "FlexibleSeatingGuest")
    public JAXBElement<FlexibleSeatingGuest> createFlexibleSeatingGuest(FlexibleSeatingGuest value) {
        return new JAXBElement<FlexibleSeatingGuest>(_FlexibleSeatingGuest_QNAME, FlexibleSeatingGuest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = BroadWorksMobilityMobileIdentity.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBroadWorksMobilityMobileIdentityDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, BroadWorksMobilityMobileIdentity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = SelectiveCallRejectionCriteriaFromDn.class)
    public JAXBElement<CriteriaPhoneNumberList> createSelectiveCallRejectionCriteriaFromDnPhoneNumberList(CriteriaPhoneNumberList value) {
        return new JAXBElement<CriteriaPhoneNumberList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, CriteriaPhoneNumberList.class, SelectiveCallRejectionCriteriaFromDn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = PriorityAlertCriteriaFromDn.class)
    public JAXBElement<CriteriaPhoneNumberList> createPriorityAlertCriteriaFromDnPhoneNumberList(CriteriaPhoneNumberList value) {
        return new JAXBElement<CriteriaPhoneNumberList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, CriteriaPhoneNumberList.class, PriorityAlertCriteriaFromDn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "timeSchedule", scope = BroadWorksMobilityCallAnchoringPolicy.class)
    public JAXBElement<TimeSchedule> createBroadWorksMobilityCallAnchoringPolicyTimeSchedule(TimeSchedule value) {
        return new JAXBElement<TimeSchedule>(_BroadWorksMobilityCallAnchoringPolicyTimeSchedule_QNAME, TimeSchedule.class, BroadWorksMobilityCallAnchoringPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolidaySchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "holidaySchedule", scope = BroadWorksMobilityCallAnchoringPolicy.class)
    public JAXBElement<HolidaySchedule> createBroadWorksMobilityCallAnchoringPolicyHolidaySchedule(HolidaySchedule value) {
        return new JAXBElement<HolidaySchedule>(_BroadWorksMobilityCallAnchoringPolicyHolidaySchedule_QNAME, HolidaySchedule.class, BroadWorksMobilityCallAnchoringPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "forwardToPhoneNumber", scope = CallForwarding.class)
    public JAXBElement<Address> createCallForwardingForwardToPhoneNumber(Address value) {
        return new JAXBElement<Address>(_CallForwardingForwardToPhoneNumber_QNAME, Address.class, CallForwarding.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "hostUserId", scope = FlexibleSeatingGuest.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFlexibleSeatingGuestHostUserId(String value) {
        return new JAXBElement<String>(_FlexibleSeatingGuestHostUserId_QNAME, String.class, FlexibleSeatingGuest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "unlockPhonePINCode", scope = FlexibleSeatingGuest.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFlexibleSeatingGuestUnlockPhonePINCode(String value) {
        return new JAXBElement<String>(_FlexibleSeatingGuestUnlockPhonePINCode_QNAME, String.class, FlexibleSeatingGuest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "fileUrl", scope = FileDescriptor.class)
    public JAXBElement<String> createFileDescriptorFileUrl(String value) {
        return new JAXBElement<String>(_FileDescriptorFileUrl_QNAME, String.class, FileDescriptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "agentUnavailableCode", scope = com.broadsoft.xsi.CallCenter.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallCenterAgentUnavailableCode(String value) {
        return new JAXBElement<String>(_CallCenterAgentUnavailableCode_QNAME, String.class, com.broadsoft.xsi.CallCenter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DNISKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "outgoingCallDNIS", scope = com.broadsoft.xsi.CallCenter.class)
    public JAXBElement<DNISKey> createCallCenterOutgoingCallDNIS(DNISKey value) {
        return new JAXBElement<DNISKey>(_CallCenterOutgoingCallDNIS_QNAME, DNISKey.class, com.broadsoft.xsi.CallCenter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BroadWorksMobilityMobileNumbersAlertList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "mobileNumbersAlertList", scope = BroadWorksMobilityAlertingPolicyInfo.class)
    public JAXBElement<BroadWorksMobilityMobileNumbersAlertList> createBroadWorksMobilityAlertingPolicyInfoMobileNumbersAlertList(BroadWorksMobilityMobileNumbersAlertList value) {
        return new JAXBElement<BroadWorksMobilityMobileNumbersAlertList>(_BroadWorksMobilityAlertingPolicyInfoMobileNumbersAlertList_QNAME, BroadWorksMobilityMobileNumbersAlertList.class, BroadWorksMobilityAlertingPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "transferPhoneNumber", scope = ACDNightService.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createACDNightServiceTransferPhoneNumber(String value) {
        return new JAXBElement<String>(_ACDNightServiceTransferPhoneNumber_QNAME, String.class, ACDNightService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "businessHours", scope = ACDNightService.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createACDNightServiceBusinessHours(String value) {
        return new JAXBElement<String>(_ACDNightServiceBusinessHours_QNAME, String.class, ACDNightService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "additionalPhoneNumberToRing", scope = CommPilotExpressAvailableInOffice.class)
    public JAXBElement<Address> createCommPilotExpressAvailableInOfficeAdditionalPhoneNumberToRing(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressAvailableInOfficeAdditionalPhoneNumberToRing_QNAME, Address.class, CommPilotExpressAvailableInOffice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "file4", scope = CallCenterAnnouncementFileList.class)
    public JAXBElement<LabeledMediaFileResource> createCallCenterAnnouncementFileListFile4(LabeledMediaFileResource value) {
        return new JAXBElement<LabeledMediaFileResource>(_CallCenterAnnouncementFileListFile4_QNAME, LabeledMediaFileResource.class, CallCenterAnnouncementFileList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "file2", scope = CallCenterAnnouncementFileList.class)
    public JAXBElement<LabeledMediaFileResource> createCallCenterAnnouncementFileListFile2(LabeledMediaFileResource value) {
        return new JAXBElement<LabeledMediaFileResource>(_CallCenterAnnouncementFileListFile2_QNAME, LabeledMediaFileResource.class, CallCenterAnnouncementFileList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "file3", scope = CallCenterAnnouncementFileList.class)
    public JAXBElement<LabeledMediaFileResource> createCallCenterAnnouncementFileListFile3(LabeledMediaFileResource value) {
        return new JAXBElement<LabeledMediaFileResource>(_CallCenterAnnouncementFileListFile3_QNAME, LabeledMediaFileResource.class, CallCenterAnnouncementFileList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "file1", scope = CallCenterAnnouncementFileList.class)
    public JAXBElement<LabeledMediaFileResource> createCallCenterAnnouncementFileListFile1(LabeledMediaFileResource value) {
        return new JAXBElement<LabeledMediaFileResource>(_CallCenterAnnouncementFileListFile1_QNAME, LabeledMediaFileResource.class, CallCenterAnnouncementFileList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "criteriaCallToNumber", scope = CriteriaWithFromDnAndCallToNumber.class)
    public JAXBElement<CallToNumberList> createCriteriaWithFromDnAndCallToNumberCriteriaCallToNumber(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_CriteriaWithFromDnAndCallToNumberCriteriaCallToNumber_QNAME, CallToNumberList.class, CriteriaWithFromDnAndCallToNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateNumbersList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "numbers", scope = AlternateNumbers.class)
    public JAXBElement<AlternateNumbersList> createAlternateNumbersNumbers(AlternateNumbersList value) {
        return new JAXBElement<AlternateNumbersList>(_AlternateNumbersNumbers_QNAME, AlternateNumbersList.class, AlternateNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = ExecutiveCallFilteringCriteriaFromDn.class)
    public JAXBElement<CriteriaPhoneNumberList> createExecutiveCallFilteringCriteriaFromDnPhoneNumberList(CriteriaPhoneNumberList value) {
        return new JAXBElement<CriteriaPhoneNumberList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, CriteriaPhoneNumberList.class, ExecutiveCallFilteringCriteriaFromDn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "excludedAddress1", scope = CommPilotExpressRedirectionWithException.class)
    public JAXBElement<Address> createCommPilotExpressRedirectionWithExceptionExcludedAddress1(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressRedirectionWithExceptionExcludedAddress1_QNAME, Address.class, CommPilotExpressRedirectionWithException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "forwardToAddress", scope = CommPilotExpressRedirectionWithException.class)
    public JAXBElement<Address> createCommPilotExpressRedirectionWithExceptionForwardToAddress(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressRedirectionWithExceptionForwardToAddress_QNAME, Address.class, CommPilotExpressRedirectionWithException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "excludedAddress3", scope = CommPilotExpressRedirectionWithException.class)
    public JAXBElement<Address> createCommPilotExpressRedirectionWithExceptionExcludedAddress3(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressRedirectionWithExceptionExcludedAddress3_QNAME, Address.class, CommPilotExpressRedirectionWithException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "excludedAddress2", scope = CommPilotExpressRedirectionWithException.class)
    public JAXBElement<Address> createCommPilotExpressRedirectionWithExceptionExcludedAddress2(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressRedirectionWithExceptionExcludedAddress2_QNAME, Address.class, CommPilotExpressRedirectionWithException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "hiranganaLastName", scope = UserInfo.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserInfoHiranganaLastName(String value) {
        return new JAXBElement<String>(_UserInfoHiranganaLastName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "firstName", scope = UserInfo.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserInfoFirstName(String value) {
        return new JAXBElement<String>(_UserInfoFirstName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "lastName", scope = UserInfo.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserInfoLastName(String value) {
        return new JAXBElement<String>(_UserInfoLastName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "hiranganaFirstName", scope = UserInfo.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUserInfoHiranganaFirstName(String value) {
        return new JAXBElement<String>(_UserInfoHiranganaFirstName_QNAME, String.class, UserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "criteriaCallToNumber", scope = CriteriaWithPriorityAlert.class)
    public JAXBElement<CallToNumberList> createCriteriaWithPriorityAlertCriteriaCallToNumber(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_CriteriaWithFromDnAndCallToNumberCriteriaCallToNumber_QNAME, CallToNumberList.class, CriteriaWithPriorityAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "callToNumberList", scope = PersonalAssistantAssignedCallToNumbers.class)
    public JAXBElement<CallToNumberList> createPersonalAssistantAssignedCallToNumbersCallToNumberList(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_PersonalAssistantAssignedCallToNumbersCallToNumberList_QNAME, CallToNumberList.class, PersonalAssistantAssignedCallToNumbers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "defaultForwardToPhoneNumber", scope = CallForwardingSelective.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallForwardingSelectiveDefaultForwardToPhoneNumber(String value) {
        return new JAXBElement<String>(_CallForwardingSelectiveDefaultForwardToPhoneNumber_QNAME, String.class, CallForwardingSelective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "monitoredUsers", scope = AttendantConsole.class)
    public JAXBElement<UserDetailInfoList> createAttendantConsoleMonitoredUsers(UserDetailInfoList value) {
        return new JAXBElement<UserDetailInfoList>(_AttendantConsoleMonitoredUsers_QNAME, UserDetailInfoList.class, AttendantConsole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttendantConsoleDisplayFieldList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "displayFields", scope = AttendantConsole.class)
    public JAXBElement<AttendantConsoleDisplayFieldList> createAttendantConsoleDisplayFields(AttendantConsoleDisplayFieldList value) {
        return new JAXBElement<AttendantConsoleDisplayFieldList>(_AttendantConsoleDisplayFields_QNAME, AttendantConsoleDisplayFieldList.class, AttendantConsole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "criteriaCallToNumber", scope = CriteriaWithSelectiveCall.class)
    public JAXBElement<CallToNumberList> createCriteriaWithSelectiveCallCriteriaCallToNumber(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_CriteriaWithFromDnAndCallToNumberCriteriaCallToNumber_QNAME, CallToNumberList.class, CriteriaWithSelectiveCall.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumber", scope = SpeedDial8Entry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpeedDial8EntryPhoneNumber(String value) {
        return new JAXBElement<String>(_SpeedDial8EntryPhoneNumber_QNAME, String.class, SpeedDial8Entry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = SpeedDial8Entry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpeedDial8EntryDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, SpeedDial8Entry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = PersonalAssistantExclusionNumberEntry.class)
    public JAXBElement<String> createPersonalAssistantExclusionNumberEntryDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, PersonalAssistantExclusionNumberEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutgoingDNorSIPURIList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = VoiceMessagingDistributionList.class)
    public JAXBElement<OutgoingDNorSIPURIList> createVoiceMessagingDistributionListPhoneNumberList(OutgoingDNorSIPURIList value) {
        return new JAXBElement<OutgoingDNorSIPURIList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, OutgoingDNorSIPURIList.class, VoiceMessagingDistributionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = VoiceMessagingDistributionList.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingDistributionListDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, VoiceMessagingDistributionList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "greetingOnlyForwardDestination", scope = VoiceMessagingGreetings.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingGreetingsGreetingOnlyForwardDestination(String value) {
        return new JAXBElement<String>(_VoiceMessagingGreetingsGreetingOnlyForwardDestination_QNAME, String.class, VoiceMessagingGreetings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = CriteriaFromDn.class)
    public JAXBElement<CriteriaPhoneNumberList> createCriteriaFromDnPhoneNumberList(CriteriaPhoneNumberList value) {
        return new JAXBElement<CriteriaPhoneNumberList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, CriteriaPhoneNumberList.class, CriteriaFromDn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "timeSchedule", scope = Criteria.class)
    public JAXBElement<TimeSchedule> createCriteriaTimeSchedule(TimeSchedule value) {
        return new JAXBElement<TimeSchedule>(_BroadWorksMobilityCallAnchoringPolicyTimeSchedule_QNAME, TimeSchedule.class, Criteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolidaySchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "holidaySchedule", scope = Criteria.class)
    public JAXBElement<HolidaySchedule> createCriteriaHolidaySchedule(HolidaySchedule value) {
        return new JAXBElement<HolidaySchedule>(_BroadWorksMobilityCallAnchoringPolicyHolidaySchedule_QNAME, HolidaySchedule.class, Criteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = SpeedDial100Entry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpeedDial100EntryDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, SpeedDial100Entry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "emailAddress", scope = CommPilotExpressEmailNotify.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommPilotExpressEmailNotifyEmailAddress(String value) {
        return new JAXBElement<String>(_CommPilotExpressEmailNotifyEmailAddress_QNAME, String.class, CommPilotExpressEmailNotify.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "timeSchedule", scope = ScheduleList.class)
    public JAXBElement<TimeSchedule> createScheduleListTimeSchedule(TimeSchedule value) {
        return new JAXBElement<TimeSchedule>(_BroadWorksMobilityCallAnchoringPolicyTimeSchedule_QNAME, TimeSchedule.class, ScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolidaySchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "holidaySchedule", scope = ScheduleList.class)
    public JAXBElement<HolidaySchedule> createScheduleListHolidaySchedule(HolidaySchedule value) {
        return new JAXBElement<HolidaySchedule>(_BroadWorksMobilityCallAnchoringPolicyHolidaySchedule_QNAME, HolidaySchedule.class, ScheduleList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "alternateCode", scope = FeatureAccessCodeEntry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFeatureAccessCodeEntryAlternateCode(String value) {
        return new JAXBElement<String>(_FeatureAccessCodeEntryAlternateCode_QNAME, String.class, FeatureAccessCodeEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumber", scope = ChargeNumber.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChargeNumberPhoneNumber(String value) {
        return new JAXBElement<String>(_SpeedDial8EntryPhoneNumber_QNAME, String.class, ChargeNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "criteriaCallToNumber", scope = CriteriaWithExecutiveFiltering.class)
    public JAXBElement<CallToNumberList> createCriteriaWithExecutiveFilteringCriteriaCallToNumber(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_CriteriaWithFromDnAndCallToNumberCriteriaCallToNumber_QNAME, CallToNumberList.class, CriteriaWithExecutiveFiltering.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "extension", scope = AlternateNumberEntry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAlternateNumberEntryExtension(String value) {
        return new JAXBElement<String>(_AlternateNumberEntryExtension_QNAME, String.class, AlternateNumberEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumber", scope = AlternateNumberEntry.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAlternateNumberEntryPhoneNumber(String value) {
        return new JAXBElement<String>(_SpeedDial8EntryPhoneNumber_QNAME, String.class, AlternateNumberEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateNumbersRingPatternEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "ringPattern", scope = AlternateNumberEntry.class, defaultValue = "Normal")
    public JAXBElement<AlternateNumbersRingPatternEnum> createAlternateNumberEntryRingPattern(AlternateNumbersRingPatternEnum value) {
        return new JAXBElement<AlternateNumbersRingPatternEnum>(_AlternateNumberEntryRingPattern_QNAME, AlternateNumbersRingPatternEnum.class, AlternateNumberEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = AlternateNumberEntry.class)
    public JAXBElement<String> createAlternateNumberEntryDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, AlternateNumberEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimultaneousRingLocationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "simRingLocations", scope = SimultaneousRingPersonal.class)
    public JAXBElement<SimultaneousRingLocationList> createSimultaneousRingPersonalSimRingLocations(SimultaneousRingLocationList value) {
        return new JAXBElement<SimultaneousRingLocationList>(_SimultaneousRingPersonalSimRingLocations_QNAME, SimultaneousRingLocationList.class, SimultaneousRingPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "hostUserId", scope = HotelingGuest.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHotelingGuestHostUserId(String value) {
        return new JAXBElement<String>(_FlexibleSeatingGuestHostUserId_QNAME, String.class, HotelingGuest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "extension", scope = FaxMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFaxMessagingExtension(String value) {
        return new JAXBElement<String>(_AlternateNumberEntryExtension_QNAME, String.class, FaxMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumber", scope = FaxMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFaxMessagingPhoneNumber(String value) {
        return new JAXBElement<String>(_SpeedDial8EntryPhoneNumber_QNAME, String.class, FaxMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "voiceMessageDeliveryEmailAddress", scope = VoiceMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingVoiceMessageDeliveryEmailAddress(String value) {
        return new JAXBElement<String>(_VoiceMessagingVoiceMessageDeliveryEmailAddress_QNAME, String.class, VoiceMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "transferPhoneNumber", scope = VoiceMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingTransferPhoneNumber(String value) {
        return new JAXBElement<String>(_ACDNightServiceTransferPhoneNumber_QNAME, String.class, VoiceMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "voiceMessageCarbonCopyEmailAddress", scope = VoiceMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingVoiceMessageCarbonCopyEmailAddress(String value) {
        return new JAXBElement<String>(_VoiceMessagingVoiceMessageCarbonCopyEmailAddress_QNAME, String.class, VoiceMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "voiceMessageNotifyEmailAddress", scope = VoiceMessaging.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoiceMessagingVoiceMessageNotifyEmailAddress(String value) {
        return new JAXBElement<String>(_VoiceMessagingVoiceMessageNotifyEmailAddress_QNAME, String.class, VoiceMessaging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "forwardToPhoneNumber", scope = ACDForcedForwarding.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createACDForcedForwardingForwardToPhoneNumber(String value) {
        return new JAXBElement<String>(_CallForwardingForwardToPhoneNumber_QNAME, String.class, ACDForcedForwarding.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "forwardingAddress", scope = CommPilotExpressRedirection.class)
    public JAXBElement<Address> createCommPilotExpressRedirectionForwardingAddress(Address value) {
        return new JAXBElement<Address>(_CommPilotExpressRedirectionForwardingAddress_QNAME, Address.class, CommPilotExpressRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "userDetailsList", scope = CallPark.class)
    public JAXBElement<UserDetailsList> createCallParkUserDetailsList(UserDetailsList value) {
        return new JAXBElement<UserDetailsList>(_CallParkUserDetailsList_QNAME, UserDetailsList.class, CallPark.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "outboundAlternateNumber", scope = BroadWorksAnywhereLocation.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBroadWorksAnywhereLocationOutboundAlternateNumber(String value) {
        return new JAXBElement<String>(_BroadWorksAnywhereLocationOutboundAlternateNumber_QNAME, String.class, BroadWorksAnywhereLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "description", scope = BroadWorksAnywhereLocation.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBroadWorksAnywhereLocationDescription(String value) {
        return new JAXBElement<String>(_BroadWorksMobilityMobileIdentityDescription_QNAME, String.class, BroadWorksAnywhereLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "mobilePhoneNumber", scope = MWIDeliveryToMobileEndpoint.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMWIDeliveryToMobileEndpointMobilePhoneNumber(String value) {
        return new JAXBElement<String>(_MWIDeliveryToMobileEndpointMobilePhoneNumber_QNAME, String.class, MWIDeliveryToMobileEndpoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "callToNumberList", scope = PersonalAssistant.class)
    public JAXBElement<CallToNumberList> createPersonalAssistantCallToNumberList(CallToNumberList value) {
        return new JAXBElement<CallToNumberList>(_PersonalAssistantAssignedCallToNumbersCallToNumberList_QNAME, CallToNumberList.class, PersonalAssistant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "expirationTime", scope = PersonalAssistant.class)
    public JAXBElement<XMLGregorianCalendar> createPersonalAssistantExpirationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PersonalAssistantExpirationTime_QNAME, XMLGregorianCalendar.class, PersonalAssistant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "attendantNumber", scope = PersonalAssistant.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPersonalAssistantAttendantNumber(String value) {
        return new JAXBElement<String>(_PersonalAssistantAttendantNumber_QNAME, String.class, PersonalAssistant.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "remoteOfficeNumber", scope = RemoteOffice.class)
    public JAXBElement<Address> createRemoteOfficeRemoteOfficeNumber(Address value) {
        return new JAXBElement<Address>(_RemoteOfficeRemoteOfficeNumber_QNAME, Address.class, RemoteOffice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "phoneNumberList", scope = CriteriaToDn.class)
    public JAXBElement<CriteriaPhoneNumberList> createCriteriaToDnPhoneNumberList(CriteriaPhoneNumberList value) {
        return new JAXBElement<CriteriaPhoneNumberList>(_SelectiveCallRejectionCriteriaFromDnPhoneNumberList_QNAME, CriteriaPhoneNumberList.class, CriteriaToDn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "url1", scope = CallCenterAnnouncementURLList.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallCenterAnnouncementURLListUrl1(String value) {
        return new JAXBElement<String>(_CallCenterAnnouncementURLListUrl1_QNAME, String.class, CallCenterAnnouncementURLList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "url2", scope = CallCenterAnnouncementURLList.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallCenterAnnouncementURLListUrl2(String value) {
        return new JAXBElement<String>(_CallCenterAnnouncementURLListUrl2_QNAME, String.class, CallCenterAnnouncementURLList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "url3", scope = CallCenterAnnouncementURLList.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallCenterAnnouncementURLListUrl3(String value) {
        return new JAXBElement<String>(_CallCenterAnnouncementURLListUrl3_QNAME, String.class, CallCenterAnnouncementURLList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "url4", scope = CallCenterAnnouncementURLList.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCallCenterAnnouncementURLListUrl4(String value) {
        return new JAXBElement<String>(_CallCenterAnnouncementURLListUrl4_QNAME, String.class, CallCenterAnnouncementURLList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "allowedUsers", scope = Privacy.class)
    public JAXBElement<UserDetailInfoList> createPrivacyAllowedUsers(UserDetailInfoList value) {
        return new JAXBElement<UserDetailInfoList>(_PrivacyAllowedUsers_QNAME, UserDetailInfoList.class, Privacy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "listURI", scope = BusyLampField.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBusyLampFieldListURI(String value) {
        return new JAXBElement<String>(_BusyLampFieldListURI_QNAME, String.class, BusyLampField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "monitoredUserList", scope = BusyLampField.class)
    public JAXBElement<UserDetailInfoList> createBusyLampFieldMonitoredUserList(UserDetailInfoList value) {
        return new JAXBElement<UserDetailInfoList>(_BusyLampFieldMonitoredUserList_QNAME, UserDetailInfoList.class, BusyLampField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "monitoredUsers", scope = BroadWorksReceptionist.class)
    public JAXBElement<UserDetailInfoList> createBroadWorksReceptionistMonitoredUsers(UserDetailInfoList value) {
        return new JAXBElement<UserDetailInfoList>(_AttendantConsoleMonitoredUsers_QNAME, UserDetailInfoList.class, BroadWorksReceptionist.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "address", scope = SequentialRingLocation.class)
    public JAXBElement<Address> createSequentialRingLocationAddress(Address value) {
        return new JAXBElement<Address>(_SequentialRingLocationAddress_QNAME, Address.class, SequentialRingLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "accountCode", scope = MeetMeConferencingConference.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMeetMeConferencingConferenceAccountCode(String value) {
        return new JAXBElement<String>(_MeetMeConferencingConferenceAccountCode_QNAME, String.class, MeetMeConferencingConference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutgoingDNList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "outgoingSMDIMWIPhoneNumberList", scope = OutgoingMWI.class)
    public JAXBElement<OutgoingDNList> createOutgoingMWIOutgoingSMDIMWIPhoneNumberList(OutgoingDNList value) {
        return new JAXBElement<OutgoingDNList>(_OutgoingMWIOutgoingSMDIMWIPhoneNumberList_QNAME, OutgoingDNList.class, OutgoingMWI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushToTalkAccessListSelection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "accessListSelection", scope = PushToTalk.class)
    public JAXBElement<PushToTalkAccessListSelection> createPushToTalkAccessListSelection(PushToTalkAccessListSelection value) {
        return new JAXBElement<PushToTalkAccessListSelection>(_PushToTalkAccessListSelection_QNAME, PushToTalkAccessListSelection.class, PushToTalk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "allowedUsers", scope = PushToTalk.class)
    public JAXBElement<UserIdList> createPushToTalkAllowedUsers(UserIdList value) {
        return new JAXBElement<UserIdList>(_PrivacyAllowedUsers_QNAME, UserIdList.class, PushToTalk.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommPilotExpressProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/xsi", name = "profile", scope = CommPilotExpress.class)
    public JAXBElement<CommPilotExpressProfile> createCommPilotExpressProfile(CommPilotExpressProfile value) {
        return new JAXBElement<CommPilotExpressProfile>(_CommPilotExpressProfile_QNAME, CommPilotExpressProfile.class, CommPilotExpress.class, value);
    }

}
