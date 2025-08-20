class Park {

    static String name = "Gandhi Park";
    static String location = " Shivamogga";
    static double area =50;
    static int numberOfTrees = 100;
    static boolean Playground = false;

    static String getName() { return name; }
    static String getLocation() { return location; }
    static double getArea() { return area; }
    static int getNumberOfTrees() { return numberOfTrees; }
    static boolean getPlayground() { return Playground; }
	
	
	public static void park(){
		 
		System.out.println("name:"+getName());
		System.out.println("location:"+getLocation());
		System.out.println("area:"+getArea());
		System.out.println("numberOfTrees:"+getNumberOfTrees());
		System.out.println("playground:"+getPlayground());
		
	}	
}
