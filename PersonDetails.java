 class PersonDetails {
    String firstName = "sahana";
    String lastName = "A";
    int age = 23;
	long phoneNumber = 9980189156L;
	String address = "Shivamogga";
	long pinCode = 522772L;
	

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }
	
	long getphoneNumber(){
	return  phoneNumber;	
	}
	
	String getaddress(){
		return address;
	}
	
	long getpinCode(){
		return pinCode;
	}
	

    void details() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
		System.out.println("phone Number:"+ getphoneNumber ());
		System.out.println("address :"+ getaddress ());
		System.out.println("pinCode:"+ getpinCode ());
    }
}