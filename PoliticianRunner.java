class PoliticianRunner{

public static void main(String a[]){
	
	String policeofficer[]={"Kiran bedi","Amitabh thakur","A.K.Pandey"};
	String policeofficer1[]={"Dinesh tripathi","K.Vijay"};
	
	Politician politician = new Politician();
	politician.politicianName="Inspector";
	politician.policeofficer=policeofficer;
	politician.getPoliticianDetails();
	
	Politician politician1 = new Politician();
	politician.politicianName="Sub-inspector";
	politician1.policeofficer=policeofficer1;
	politician1.getPoliticianDetails();
	
	
}
}