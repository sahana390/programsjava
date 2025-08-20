class Politician{


String politicianId;
String fullName;
String policeofficer[];
String dateOfBirthDate;
int age;
String gender;
String nationality;
String politicalParty;
String spouse;
int children;
float netWorth; 
int criminalCases;
String officialWebsite;
String politicianName;



Politician(){
	
}

Politician(String politicianId,String fullName,String policeofficer[],String dateOfBirthDate){
	this.politicianId = politicianId;
	this.fullName = fullName;
	this.policeofficer=policeofficer;
	this.dateOfBirthDate=dateOfBirthDate;
}

Politician(int age,String gender,String nationality,String politicalParty){
	this.age=age;
	this.gender=gender;
	this.nationality=nationality;
	this.politicalParty=politicalParty;
	
}
Politician(String spouse,int children,float netWorth){
	this.spouse = spouse;
	this.children=children;
	this.netWorth=netWorth;
	
}

Politician(int criminalCases,String officialWebsite,String politicianName){
	this.criminalCases=criminalCases;
	this.officialWebsite=officialWebsite;
	this.politicianName=politicianName;
}


public void getPoliticianDetails(){
	System.out.println("---------------------------");
	System.out.println("The policeofficer of"+politicianName+"are");
	for(String policeofficer : policeofficer){
		System.out.println(policeofficer);
	
	
}	
}
}