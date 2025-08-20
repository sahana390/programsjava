class DisneyLand {
	
   static  String location;
   static  int numberOfRides;
   static  double entryFee;
   static  boolean openToday;
    static int dailyVisitors;

    static String getLocation() { return location; }
    static int getNumberOfRides() { return numberOfRides; }
   static double getEntryFee() { return entryFee; }
    static boolean getOpenToday() { return openToday; }
    static int getDailyVisitors() { return dailyVisitors; }

public static void disneyland(){
		System.out.println("location:"+getLocation());
		System.out.println("numberOfRides:"+getNumberOfRides());
		System.out.println("entryFee:"+getEntryFee());
		System.out.println("openToday:"+getOpenToday());
		System.out.println("dailyVisitors:"+getDailyVisitors());

}

}






