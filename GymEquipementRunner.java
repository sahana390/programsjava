class GymEquipementRunner{

public static void main(String clips[]){
System.out.println("main started");

GymEquipement gymEquipement = new GymEquipement();

gymEquipement.equipmentID=1001;
gymEquipement.name="Dumbbell";
gymEquipement.type="Flexibility";
gymEquipement.brand="Decathlon";
gymEquipement.material="Plastic";
gymEquipement.weight=20.5f;
gymEquipement.dimensions="120×60×150";
gymEquipement.color="Silver";
gymEquipement.price=14999.99;
gymEquipement.inStock=true;
gymEquipement.quantityAvailable=12;
gymEquipement.usageArea="Outdoor";
gymEquipement.adjustable=true;
gymEquipement.electricPowered=true;
gymEquipement.maxWeight=120;
gymEquipement.manufactureDate="2024-12-01";
gymEquipement.warrantyPeriod=12;
gymEquipement.maintenanceRequired=true;
gymEquipement.safetyCertified=true;
gymEquipement.descriptionText="Heavy-duty elliptical machine";


gymequipement.getGymEquipementInfo();


System.out.println("main ended");



}



}