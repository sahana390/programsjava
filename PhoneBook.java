class PhoneBook{

String contactName;
String phoneNumber;
String address;

Contacts contacts;

public void getPhoneBookInfo(){
	
	System.out.println("Fetching PhoneBook info");
	System.out.println("The contactName is:"+contactName);
	System.out.println("The phoneNumber is:"+phoneNumber);
		System.out.println("The address is:"+address);
	

	this.contacts.getContactsDetails();
	
	
}

}