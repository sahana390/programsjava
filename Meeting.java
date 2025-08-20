class Meeting{

String meetingId;
String meetingTitle;
int noOfremainder;
String startTime;
String endingTime;


Invitee invitee;


public void getMeetingInfo(){
	
	System.out.println("Fetching Meeting info");
	System.out.println("The meetingId is:"+meetingId);
	System.out.println("The meetingTitle is:"+meetingTitle);
	System.out.println("The noOfremainder is:"+noOfremainder);
	System.out.println("The startTime is:"+startTime);
	System.out.println("The endingTime is:"+endingTime);
	this.invitee.getInviteeDetails();
	
}

}

