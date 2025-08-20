class WeaponRunner{

public static void main(String a[]){
	
	String material[]={"Iron","Steel","bronze","wood","stone"};
	String material[]={"carbon fiber","titanium","plastic","aluminum","polymer"};
	
	Weapon weapon = new Weapon();
	weapon.weaponName="Iron gun";
	weapon.material=material;
	weapon.getWeaponDetails();
	
	Weapon weapon1 = new Weapon();
	weapon.weaponName="Ak 47";
	weapon1.main=material1;
	weapon1.getWeaponDetails();
	
	
}
}