class HatRunner{

public static void main(String arg[]){
System.out.println("main started");

Hat hat = new Hat();

hat.hatId=1;
hat. name="Baseball Cap";
hat. type="Beanie";
hat. material="Cotton";
hat. color="Black";
hat.size="S";
hat. adjustableStrap=true;
hat. price=599.99;
hat. brand="Nike";
hat. gender="Men";
hat .style="Casual";
hat. pattern="Solid";
hat .weight=150.0f;
hat .washable=true;
hat .countryOfOrigin="India";
hat .season="All Season";
hat .liningMaterial="Fleece";
hat .productID="HAT2023BLK";
hat .Stock=true;
hat .customerRating=4.5f;
hat .Protection=true;

hat.getHatInfo();

System.out.println("main ended");



}



}