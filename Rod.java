class Rod{


int rodId;
String rodName;
String indegreints[];
float length;
float diameter;
float weight;
String type;
String color;
String coating;
String brand;
String grade;

Rod(){
	
}

Rod(int rodId,String indegreints[],String type){
	this.rodId = rodId;
	this.indegreints = indegreints;
	this.type=type;
}

Rod(float length,float weight,String color){
	this.length=length;
	
	this.weight=weight;
	this.color=color;
	
}
Rod(String grade,String rodName){
	this.grade = grade;
	this.rodName=rodName;
	
}

Rod(String coating,String brand,float diameter){
	this.coating=coating;
	this.brand=brand;
	this.diameter=diameter;
}


public void getRodDetails(){
	System.out.println("---------------------------");
	System.out.println("The indegreints of"+rodName+"are");
	for(String indegreints : indegreints){
		System.out.println(indegreints);
	
	
	}	
}
}