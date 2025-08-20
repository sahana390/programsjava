class MejesticRunner{

public static void main(String []args){
	
Bustand bustand = new Bustand();
bustand.name="Mejestic bus stand";
bustand.location="Bangalore";
bustand.totalPlatform=20;
bustand.oPeratingHours="24/7";
bustand.facilitiesAvailable=true;
bustand.managingAuthority="BMTC";


Platform platform = new Platform();
platform. platformNo=5;
platform.type="Arrival";
platform.busRoutes="500K";
platform.shelterAvailable=true;
platform. displayBoard="digital";


bustand.platform = platform;

Mejestic mejestic = new Mejestic();

mejestic. name="mejestic";
mejestic.location="Bangalore";
mejestic.type="KSRTC";
mejestic.platforms=10;

mejestic.bustand = bustand;

mejestic.getMejesticInfo();


}
}
