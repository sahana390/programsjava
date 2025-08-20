class ForestSafariRunner{



public static void main(String paper[]){
	
System.out.println("main started");


 ForestSafari forestsafari = new ForestSafari();






forestsafari.safariName="bandipur jungle safari";
forestsafari.location="karnataka";
forestsafari.areaInSqKm=25.68;
forestsafari.entryFee=40.00;
forestsafari.maxVisitorsPerDay=6;
forestsafari.openTime="six o'clock";
forestsafari.closeTime="seven o'clock";
forestsafari.availableGuides=55;
forestsafari.wildlifeSpecies="tiger";
forestsafari.safariType="jeep safari";
forestsafari.nearestCity="mysore";
forestsafari.rating="fivestar";
forestsafari.reviews="super";
forestsafari.rulesAndRegulations=" do not feed animals";
forestsafari.facilitiesAvailable=" drinking water";



forestsafari.getForestSafariInfo();

System.out.println("main ended");



}

}

