class CalenderRunner{

public static void main(String []args){
	
Invitee invitee = new Invitee();
invitee.senderName="krish";
invitee.meetingId=3;
invitee.recipientName="ani";
invitee.messageBody= "messagedecalring";
invitee.eventLocation="pune";


Meeting meeting = new Meeting();
meeting.meetingId = "maindiscuss project";
meeting.meetingTitle="projectlines";
meeting.noOfremainder=8;
meeting.startTime="nine";
meeting.endingTime="six";



meeting.invitee = invitee;

Calender calender = new Calender();

calender.calenderName = "team calenderName";
calender.type= "work academic";
calender.noOfevents = 77;

calender.meeting = meeting;

calender.getCalenderInfo();


}
}
