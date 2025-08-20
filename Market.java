class Market {

    static String name = "RR Market";
    static String location = " Rajajinagar";
    static int numberOfShops = 3;
    static boolean isOpen = false;
    static String openingHours = "fivehours";

    static String getName() { return name; }
    static String getLocation() { return location; }
    static int getNumberOfShops() { return numberOfShops; }
    static boolean getIsOpen() { return isOpen; }
    static String getOpeningHours() { return openingHours; }
	
	public static void market(){
		
		System.out.println("name: "+ getName());
        System.out.println("location: " + getLocation());
        System.out.println("numberOfShops:" + getNumberOfShops());
		System.out.println("isOpen:"+ getIsOpen ());
		System.out.println("openingHours :"+ getOpeningHours());
	
	}
	
}