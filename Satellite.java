class Satellite {

        static String satelliteName;
        static String country;
        static String organization;
        static String missionType;
        static String orbitType;
        static double launchMassKg;
        static String launchDate;
        static String launchVehicle;
        static String launchSite;
        static int powerCapacityWatts;
        static int transpondersCband;
        static int transpondersKuband;
        static double designLifeYears;
        static String coverageArea;
        
    public static void main(String[] args) {

        System.out.println("The Satellite Name is " + satelliteName);
        System.out.println("The Country is " + country);
        System.out.println("The Organization is" + organization);
        System.out.println("The Mission Type is" + missionType);
        System.out.println("The Orbit Type is " + orbitType);
        System.out.println("The Launch Mass kg is" + launchMassKg);
        System.out.println("The Launch Date is " + launchDate);
        System.out.println("The Launch Vehicle is " + launchVehicle);
        System.out.println("The Launch Site is " + launchSite);
        System.out.println("The Power Capacity Watts is" + powerCapacityWatts);
		System.out.println("The C-band Transponders is " + transpondersCband);
        System.out.println("The Ku-band Transponders is " + transpondersKuband);
        System.out.println("The Design Life years is " + designLifeYears);
        System.out.println("The Coverage Area is " + coverageArea);
		
		//re-init
		
		 String satelliteName = "GSAT-30";
         String country = "India";
         String organization = "ISRO";
         String missionType = "Communication";
         String orbitType = "Geostationary";
         double launchMassKg = 3357.0;
         String launchDate = "January 17, 2020";
         String launchVehicle = "Ariane 5 VA251";
         String launchSite = "Guiana Space Centre, French Guiana";
         int powerCapacityWatts = 6000;
         int transpondersCband = 12;
         int transpondersKuband = 12;
         double designLifeYears = 15.0;
         String coverageArea = "Indian Mainland & Islands";
		
		System.out.println("The Satellite Name is " + satelliteName);
        System.out.println("The Country is " + country);
        System.out.println("The Organization is" + organization);
        System.out.println("The Mission Type is" + missionType);
        System.out.println("The Orbit Type is " + orbitType);
        System.out.println("The Launch Mass kg is" + launchMassKg);
        System.out.println("The Launch Date is " + launchDate);
        System.out.println("The Launch Vehicle is " + launchVehicle);
        System.out.println("The Launch Site is " + launchSite);
        System.out.println("The Power Capacity Watts is" + powerCapacityWatts);
		System.out.println("The C-band Transponders is " + transpondersCband);
        System.out.println("The Ku-band Transponders is " + transpondersKuband);
        System.out.println("The Design Life years is " + designLifeYears);
        System.out.println("The Coverage Area is " + coverageArea);
        
    }
}
