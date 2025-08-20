class MobileRunner{

public static void main(String []args){
	
PhoneBook phoneBook= new PhoneBook();
phoneBook.contactName="Sahana";
phoneBook.phoneNumber="9685741236";
phoneBook.address="Shivamogga";



Contacts contacts = new Contacts();
contacts.name="Shravani";
contacts.email="shravani123@gmail.com";
contacts.group="friends";



phoneBook.contacts = contacts;

Mobile mobile = new Mobile();

mobile.brand="OPPO A79";
mobile. model="Galaxy S23";
mobile. price=20000.00;
mobile. batteryCapacity=5000;

mobile.phoneBook = phoneBook;

mobile.getMobileInfo();


}
}
