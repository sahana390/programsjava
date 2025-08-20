class Blade{
	
int bladeId;
String bladeName;
String ingrediance
double prize;
int noOfItems;
String sharpness;
String material;
double length;
String edgeType;


Blade(int bladeId,String bladeName,String ingrediance){
	this.ingrediance=ingrediance;
	this.bladeId=bladeId;
	this.bladeName=bladeName;
}
Blade(double prize,String sharpness){
	this.prize=prize;
	this.sharpness=sharpness;
	
}
Blade(int noOfItems,String material){
	this.noOfItems=noOfItems;
	this.material;
	
}
Blade(double length,String edgeType){
	this.length=length;
	this.edgeType;
}


public void getBladeInfo(){

System.out.println("The ingrediance of "+bladeName+"are");
for(String ingrediance :ingrediance)
System.out.println(ingrediance);
}









}