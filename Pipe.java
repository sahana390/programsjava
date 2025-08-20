class Pipe{


    String material;           
    double length;            
    String indegreints[];         
    String pipeName;    
    String color;           
    double pressureRating;     
    String manufacturer;   
    String grade;            
    
    String usage;              
    double weight;             
    
    String coatingType;       
    int warrantyYears;         
             
      

Pipe(){
	
}

Pipe(String material,String indegreints[],double length,String pipeName,String color){
	this.material = material;
	this.indegreints = indegreints;
	this.length=length;
	this.pipeName=pipeName;
	this.color=color;
	
}

Pipe(double pressureRating,String manufacturer,String grade){
	this.pressureRating=pressureRating;
	
	this.manufacturer=manufacturer;
	this.grade=grade;
	
}
Pipe(String usage,double weight){
	this.usage = usage;
	this.weight=weight;
	
}

Pipe(String coatingType,int warrantyYears){
	this.coatingType=coatingType;
	this.warrantyYears=warrantyYears;
	
}


public void getPipeDetails(){
	System.out.println("---------------------------");
	System.out.println("The indegreints of"+pipeName+"are");
	for(String indegreints : indegreints){
		System.out.println(indegreints);
	
	
	}	
}
}