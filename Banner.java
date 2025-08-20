class Banner {


   static  String message = "X-workz";
    static String color =" orange";
    static int width = 5;
    static int height = 15 ;
   static  boolean digital = false;

    static String getMessage() { return message; }
    static String getColor() { return color; }
    static int getWidth() { return width; }
    static int getHeight() { return height; }
   static  boolean getDigital() { return digital; }
   
   public static  void banner(){
	    
	    System.out.println("message: " + getMessage());
        System.out.println("color: " + getColor());
        System.out.println("width: " + getWidth());
		System.out.println("height:"+ getHeight ());
		System.out.println("digital :"+ getDigital());
   
   
}
}