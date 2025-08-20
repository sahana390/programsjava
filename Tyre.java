class Tyre {
	
    static String brand;
   static int diameter;
    static String type; 
    static int pressure;
    static boolean isNew;

    static String getBrand() { return brand; }
    static int getDiameter() { return diameter; }
    static String getType() { return type; }
    static int getPressure() { return pressure; }
    static boolean getIsNew() { return isNew; }
	
	public static void tyre(){
		System.out.println("brand:"+getBrand());
		System.out.println("diameter:"+getDiameter());
		System.out.println("type:"+getType());
		System.out.println("pressure:"+getPressure());
		System.out.println("isNew:"+getIsNew());

}
}