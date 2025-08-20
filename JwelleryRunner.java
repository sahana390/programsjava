class JwelleryRunner{

public static void main(String args[]){
System.out.println("main started");

Jwellery jwellery1 = new Jwellery();

jwellery.jwelleryId=1;
jwellery. name="Gold Necklace";
jwellery. material="Gold";
jwellery. grams=15.75f;
jwellery. type="Ring";
jwellery. price=12000.50;
jwellery.availability=true;

Jwellery jwellery2 = new Jwellery(2);
System.out.println("Jwellery ID is: " + jwellery2.jwelleryId);

 Jwellery jwellery3 = new Jwellery(3, "Ring"); 
        System.out.println("Jwellery ID: " + jwellery3.jwelleryId + ", Name: " + jwellery3.name);
		
		Jwellery jwellery4 = new Jwellery(3, "Ring","silver"); 
        System.out.println("Jwellery ID: " + jwellery2.jwelleryId + ", Name: " + jwellery3.name +", Material: " + jwellery4.material);
		
		Jwellery jwellery5 = new Jwellery(3, "Ring","silver",20.25f); 
        System.out.println("Jwellery ID: " + jwellery2.jwelleryId + ", Name: " + jwellery3.name +", Material: " + jwellery4.material +", Grams: " + jwellery5.grams);
		
		Jwellery jwellery6 = new Jwellery(3, "Ring","silver",20.25f,"ring"); 
        System.out.println("Jwellery ID: " + jwellery2.jwelleryId + ", Name: " + jwellery3.name +", Material: " + jwellery4.material +", Grams: " + jwellery5.grams +",Type: " + jwellery6.type);
		
		
       Jwellery jwellery6 = new Jwellery(3, "Ring","silver",20.25f,"ring",50000.00); 
        System.out.println("Jwellery ID: " + jwellery2.jwelleryId + ", Name: " + jwellery3.name +", Material: " + jwellery4.material +", Grams: " + jwellery5.grams +",Type: " + jwellery6.type +", Price: " + jwellery7.price);
		
		Jwellery jwellery6 = new Jwellery(3, "Ring","silver",20.25f,"ring",50000.00,true); 
        System.out.println("Jwellery ID: " + jwellery2.jwelleryId + ", Name: " + jwellery3.name +", Material: " + jwellery4.material +", Grams: " + jwellery5.grams +",Type: " + jwellery6.type +", Price: " + jwellery7.price +", Availability: " + jwellery8.availability);
		
		
		Jwellery jwellery7 = new Jwellery(7, "earings", "gold", 20.00f, "ring", 10000.00, false); 
        System.out.println("Roti brand new full details set!");


jwellery1.getJwelleryInfo();
        jwellery2.getJwelleryInfo();
        jwellery3.getJwelleryInfo();
        jwellery4.getJwelleryInfo();
        jwellery5.getJwelleryInfo();
        jwellery6.getJwelleryInfo();
        jwellery7.getJwelleryInfo();
        System.out.println("Main ended");
	}
}