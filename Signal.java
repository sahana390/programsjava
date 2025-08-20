class Signal {


    static String type;
    static int strength;
    static boolean isstable;
    static String location;
    static String status;

    static String getType() { return type; }
    static int getStrength() { return strength; }
    static boolean getIsstable() { return isstable; }
    static String getLocation() { return location; }
    static String getStatus() { return status; }
	
	public static void signal(){
		
		System.out.println("type: "+ getType());
        System.out.println("strength: " + getStrength());
        System.out.println("isstable:" + getIsstable());
		System.out.println("location:"+ getLocation ());
		System.out.println("status :"+ getStatus());
	
	}	
}