class Radio {
	
    static String brand = "sony";
    static int volume 10;
    static  double frequency = 34;
    static boolean isOn = false;
    static String color = "black" ;

     static String getBrand() { return brand; }
    static int getVolume() { return volume; }
    static double getFrequency() { return frequency; }
    static  boolean getIson() { return isOn; }
    static String getColor() { return color; }
	
   public static void radio() {
        System.out.println("brand: " + getBrand());
        System.out.println("volume: " + getVolume());
        System.out.println("frequency: " + getFrequency());
		System.out.println("isOn:"+ getIson ());
		System.out.println("color :"+ getColor());

    }	
  }
