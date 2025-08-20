class Solarsystems{

String solarsystemsName;
int noOfplanets;
int noOfmoons;
String galaxyname;


Planet planet;


public void getSolarsystemsInfo(){
	
	System.out.println("Fetching Solarsystems info");
	System.out.println("The solarsystemsName is:"+solarsystemsName);
	System.out.println("The noOfplanets is:"+noOfplanets);
	System.out.println("The noOfmoons is:"+noOfmoons);
	System.out.println("The galaxyname is:"+galaxyname);
	
	this.planet.getPlanetDetails();
	
}

}
