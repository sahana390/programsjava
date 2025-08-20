class Floor{


String type;
int noOffloor;
String floorName;
String floorMaterial;
Room room;


public void getFloorInfo(){
	
	System.out.println("Fetching floor info");
	System.out.println("The type is:"+type);
	System.out.println("The noOffloor is:"+noOffloor);
	System.out.println("The floorName is:"+floorName);
	System.out.println("The floorMaterial is:"+floorMaterial);
	this.room.getRoomDetails();
	
}

}