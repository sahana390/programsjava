class Jwellery{



int jwelleryId;
String name;
String material;
float grams;
String type;
double price;
boolean availability;

public Jwellery(){
	System.out.println("Default constructor invoked");
}

public Jwellery(int jwelleryId,String name,double price){
	this.jwelleryId=jwelleryId;
	this.name=name;
	this.price;
	System.out.println("Cons with 2 parameters");
}
public Jwellery(int jwelleryId,String name,double price,float grams){
	this.jwelleryId=jwelleryId;
	this.name=name;
	this.price=price;
	this.grams=grams;
	System.out.println("Cons with 3 parameters");
}
public Jwellery(int jwelleryId,String name,double price,float grams,String material){
	this.jwelleryId=jwelleryId;
	this.name=name;
	this.price=price;
	this.grams=grams;
	this.material=material;
	System.out.println("Cons with 4 parameters");
}
public Jwellery(int jwelleryId,String name,double price,float grams,String material,boolean availability){
	this.jwelleryId=jwelleryId;
	this.name=name;
	this.price=price;
	this.grams=grams;
	this.material=material;
	this.availability=availability;
	System.out.println("Cons with 5 parameters");
}
public Jwellery(int jwelleryId,String name,double price,float grams,String material,boolean availability,String type){
	this.jwelleryId=jwelleryId;
	this.name=name;
	this.price=price;
	this.grams=grams;
	this.material=material;
	this.availability=availability;
	this.type=type;
	System.out.println("Cons with 6 parameters");
}

	
	 public void getJwelleryInfo() {
        System.out.println("Jwellery ID: " + jwelleryId);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Grams: " + grams);
		System.out.println("Material: " + material);
		System.out.println("Availability:"+availability);
        System.out.println("Type: " + type);
       
        System.out.println("---------------");

}


}
