class Tailor {
	
    static String name = "Nisha";
    static int experienceYears = 3;
    static String specialty = " varity";
    static boolean ownsshop = false;
    static  int pendingOrders = 1;

    static String getName() { return name; }
    static int getExperienceYears() { return experienceYears; }
    static String getSpecialty() { return specialty; }
    static boolean getOwnsshop() { return ownsshop; }
    static int getPendingOrders() { return pendingOrders; }

      public static void tailor(){
		  
		  
		System.out.println("name:"+getName());
		System.out.println("experienceYears:"+getExperienceYears());
		System.out.println("specialty:"+getSpecialty());
		System.out.println("ownsshop:"+getOwnsshop());
		System.out.println("pendingOrders:"+getPendingOrders());

}	
}

