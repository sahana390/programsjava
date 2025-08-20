 class CoinsRunner {
    public static void main(String[] args) {
		
		String material[]={"Copper","Nickel","India","2 Rupee"};
String material1[]={"Zinc","Bimetallic","Steel"};
        
        // Creating coin using coinId and material
		
		Coins coins1=new Coins();
		coins.country="India";
		coins1.material=material;
		coins1.getCoinDetails();
       
        Coins coins2 = new Coins(101, materials);
		coins.coinId="2 Rupee";
        coins2.material=material1;
        coins2.getCoinDetails();

        // Creating coin using country and value
        

        // Creating coin using only denomination
        Coins coins3 = new Coins();
		coins.weight=100f;
        coins3.material=material1;
        coins3.getCoinDetails();

        // Creating coin using weight
        Coins coins4 = new Coins();
		coins.denomination="2 Rupee";
        coins4.material=material1;
        coins4.getCoinDetails();
    }
}
