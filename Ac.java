class Ac{
static boolean isConnected;
static int currentTemperature;
static int maxTemperature =30;
static int minTemperature=3;
//onOrOff
//increaseTemperature
//decreaseTemperature

public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Ac is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Ac is turned off");
}
}
//increase Temperature
public static void increaseTemperature() {
System.out.println("Increse temperature started");
if(isConnected==true) {
	if(currentTemperature <= maxTemperature){
	currentTemperature=currentTemperature + 1;
	
System.out.println("The current temperature is" +currentTemperature);
	}else{
	System.out.println("Max Temperature reached");
}	

}else{
	System.out.println("Turn on the AC");
}
System.out.println("increase Temperature is ended");	
	}


//decrease Temperature
public static void decreaseTemperature() {
	System.out.println("Decrease Temperature started");
if(isConnected==true) {
	if(currentTemperature >= minTemperature){
	currentTemperature=currentTemperature - 1;
System.out.println("The current temperature is" +currentTemperature);
	}
	else {
	System.out.println("Min temperature reached");
}
}else{
	System.out.println("Turn on the mixer");
	
}
System.out.println("decrease temperature is ended");	

}	
}