class Defence{

String name;
String type;
int range;
String manufacturer;
String country;
boolean isInService;

Army army;

public void getDefenceInfo(){
	System.out.println("Defence Info is been fetched.... ");
	System.out.println("The name is:"+name);
	System.out.println("The type is:"+type);
	System.out.println("The range is:"+range);
	System.out.println("The manufacturer is:"+manufacturer);
	System.out.println("The country is:"+country);
	System.out.println("The isInService is:"+isInService);
	
	

this.army.getArmyInfo();
}
}