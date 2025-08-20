class River {
    static String name = "Kaveri";
    static double length = 89;
    static String origin = "Purewater";
    static String destination = "Landmark";
    static boolean navigable = false;

    static String getName() { return name; }
    static double getLength() { return length; }
    static String getOrigin() { return origin; }
    static String getDestination() { return destination; }
    static boolean getNavigable() { return navigable; }
	
	public static void river(){
		 
		System.out.println("name:"+getName());
		System.out.println("length:"+getLength());
		System.out.println("origin:"+getOrigin());
		System.out.println("destination:"+getDestination());
		System.out.println("navigable:"+getNavigable());
		
	}
}
