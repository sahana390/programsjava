class GamingPc {
   static  String processor;
    static int ram;
    static String graphicsCard;
    static int storage;
    static boolean RGB;

    static String getProcessor() { return processor; }
    static int getRam() { return ram; }
    static String getGraphicsCard() { return graphicsCard; }
    static int getStorage() { return storage; }
    static boolean hasRGB() { return hasRGB; }
	
	
	public static void gamingpc(){
		System.out.println("brand:"+getBrand());
		System.out.println("numberOfItems:"+getNumberOfItems());
		System.out.println("waterproof:"+getWaterproof());
		System.out.println("colorPalette:"+getColorPalette());
		System.out.println("mirror:"+getMirror());
		
		
	}	
}