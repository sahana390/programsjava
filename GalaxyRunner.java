class GalaxyRunner{


public static void main(String []args){
	
Planet planet = new Planet();
planet.planetName="Earth";
planet.noOfdiscoveryyear=3;
planet.color="blue";
planet.planetId="unique";
planet.type="jupiter";


Solarsystems solarsystems = new Solarsystems();
solarsystems.solarsystemsName="sun";
solarsystems.noOfplanets=51;
solarsystems.noOfmoons=7;
solarsystems.galaxyname="milkyway";




solarsystems.planet = planet;

Galaxy galaxy = new Galaxy();
galaxy.galaxyName = "black eye galaxy";
galaxy.galaxyType= "spiral";
galaxy.year = 5;

galaxy.solarsystems = solarsystems;

galaxy.getGalaxyInfo();


}
}