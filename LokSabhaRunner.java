class LokSabhaRunner{

public static void main(String []args){
	
Seat seat= new Seat();
seat. seatNo=12;
seat. occupiedSeats=10;
seat. speakerName="Om Birla";



Politician politician = new Politician();
politician. name="Nirmala Sitharaman";
politician. age=64;
politician. party="Barthiya jantha party";
politician. consitituency="Rajya Sabha";
politician. position="Finance Minister";



seat.politician = politician;

LokSabha lokSabha = new LokSabha();

lokSabha. loksabhaNo=17;
lokSabha. startDate="2019-06-17";
lokSabha. endDate="2025-07-26";
lokSabha. totalMembers=545;


lokSabha.seat = seat;

lokSabha.getLokSabhaInfo();


}
}
