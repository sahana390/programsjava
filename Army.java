class Army{

String name;
String country;
int fundedYear;
int activePersonnel;
String headquatersLocation;
boolean isActive;

Squad squad;

public void getArmyInfo(){
	
	System.out.println("Fetching Army info");
	System.out.println("The name is:"+name);
	System.out.println("The country is:"+country);
	System.out.println("The fundedYear is:"+fundedYear);
	System.out.println("The activePersonnel is:"+activePersonnel);
	System.out.println("The headquatersLocation is:"+headquatersLocation);
	System.out.println("The isActive is:"+isActive);

	this.squad.getSquadDetails();
	
	
}

}