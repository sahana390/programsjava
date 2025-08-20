class Blazzer{

int blazzerId;
String blazzerName
int noOfItems[];
String colors;
String brand;
String type;
double prize;
String size;
float quantity;

Blazzer(){
	Blazzer(int blazzerId,int noOfItems[],String type){
		this.blazzerId=blazzerId;
		this.noOfItems=noOfItems;
		this.type=type;
	}
	Blazzer(double prize,String colors){
		this.prize=prize;
		this.colors=colors;
	}
	Blazzer(String brand,String blazzerName){
		this.brand=brand;
		this.blazzerName=blazzerName;
	}
	Blazzer(String size,float quantity){
		this.size=size;
		this.quantity=quantity;
	}
	public void getBlazzerInfo(){
	System.out.println("The noOfItems is "+noOfItems+"are");
    for(String noOfItems : noOfItems)
    System.out.println(noOfItems)		
}





}



}