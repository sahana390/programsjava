class Seat{

int seatNo;
int occupiedSeats;
String speakerName;

Politician politician;

public void getSeatInfo(){
	
	System.out.println("Fetching Seat info");
	System.out.println("The seatNo is:"+seatNo);
	System.out.println("The occupiedSeats is:"+occupiedSeats);
	System.out.println("The speakerName is:"+speakerName);
	

	this.politician.getPoliticianDetails();
	
	
}

}