class Flowers{
	Flower(){
		
		System.out.println("Flower con is invoked");
	}
   Flower(String name,String color,String fragrance,int petalCount,int height,int temperatureTolerance){
	   
	   System.out.printl("Flower parametrized cons is invoked");
	   this.name=name;
	   this.color=color;
	   this.fragrance=fragrance;
	   this.bloomingSeason=bloomingSeason;
	   this.petalCount=petalCount;
	   this.height=height;
	   this.temperatureTolerance=temperatureTolerance;
   }
   String name;
   String color;
   String fragrance;
   String bloomingSeason;
   int petalCount;
   int height;
   int temperatureTolerance;  
    
	
	public void getFlowersInfo(){
	
	System.out.println("The  name"+name);
System.out.println("The  color"+color);
System.out.println("The  fragrance"+fragrance);
System.out.println("The  bloomingSeason"+bloomingSeason);
System.out.println("The  height"+height);
System.out.println("The  temperatureTolerance"+temperatureTolerance);


	}
}
