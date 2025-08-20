class Busstand{

String name;
String location;
int totalPlatform;
String oPeratingHours;
String facilitiesAvailable;
String managingAuthority;
Platform platform;


public void getBusstandInfo(){
	
	System.out.println("Fetching Busstand info");
	System.out.println("The name is:"+name);
	System.out.println("The location is:"+location);
	System.out.println("The totalPlatform is:"+totalPlatform);
	System.out.println("The operatingHours is:"+oPeratingHours);
	System.out.println("The facilitiesAvailable is:"+facilitiesAvailable);
	System.out.println("The managingAuthority is:"+managingAuthority);
	this.platform.getPlatformDetails();
	
}

}