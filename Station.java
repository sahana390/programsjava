class Station{

String stationName;
String stationCode;
int noOfPlatforms;
boolean isJunction;
String location;
train train;

public void getStation(){
System.out.println("Station info is been fetched");
System.out.println("The stationName is: "+ stationName);
System.out.println("The stationCode is: "+ stationCode);
System.out.println("The noOfPlatforms is: "+noOfPlatforms);
System.out.println("The isJunction is:"+isJunction);
System.out.println("The location is:"+location);

this.train.getTrainDetails();



}




}