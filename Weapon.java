class Weapon{

Weapon(){
	
	
	class Weapon{


int weaponId;
String weaponName;
String type;
String material[];
float range;                                
String manufacture;
int yearIntroduced;                           

Weapon(){



Weapon(int weaponId,String material[],String type){
	this.weaponId = weaponId;
	this.material = material;
	this.type=type;
}
Weapon(float range,String weaponName){
	this.range=range;
	this.name=name;
	
}
Weapon(String manufacture){
	this.manufacture=manufacture;
	this.rodName=rodName;
	
}

Weapon(int yearIntroduced){
	this.yearIntroduced=yearIntroduced;
	
}


public void getWeaponDetails(){
	System.out.println("---------------------------");
	System.out.println("The material of"+weaponName+"are");
	for(String material : material){
		System.out.println(material);

	}
}
}


