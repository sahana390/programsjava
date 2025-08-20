class HairClipRunner{

public static void main(String clips[]){
System.out.println("main started");

HairClip hairClip = new HairClip();

hairClip.hairClipId=1;
hairClip.name="Butterfly Clip";
hairClip.material="Plastic";
 hairClip.color="Black";
hairClip.type="Banana";
hairClip.length=5.5f;
hairClip.width=2.0f;
hairClip.weight=12.5f;
hairClip.IsDecorated=true;
hairClip.decorationType="Beads";
hairClip.quantityInPack=6;
hairClip.price=49.99;
hairClip.brand="Vega";
hairClip.availability=true;
hairClip.madeIn="India";
hairClip.reusable=true;
hairClip.gripStrength="Strong";
hairClip.ageGroup="Kids";
hairClip.waterResistant=false;
hairClip.dateAdded="2025-07-22";


hairClip.getHairClipInfo();


System.out.println("main ended");



}



}