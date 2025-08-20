class MakeUpKit {
    static String brand;
    static int numberOfItems;
    static boolean waterproof;
    static String colorPalette;
    static boolean mirror;

    static  String getBrand() { return brand; }
    static int getNumberOfItems() { return numberOfItems; }
    static boolean getWaterproof() { return waterproof; }
    static String getColorPalette() { return colorPalette; }
    static boolean getMirror() { return mirror; }
	
	
	public static void makeupkit(){
	
		System.out.println("brand:"+getBrand());
		System.out.println("numberOfItems:"+getNumberOfItems());
		System.out.println("waterproof:"+getWaterproof());
		System.out.println("colorPalette:"+getColorPalette());
		System.out.println("mirror:"+getMirror());
		
		
	}
}