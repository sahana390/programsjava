class AmazonLogin {

    static String firstName;
    static String surName;
    static String addressName;
    static long mobilNumber;
    static String newEmail;

    public static boolean loginUser(String fName, String sName, String addName , long mobNumber, String pay) {

        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean surNameValid = false;
        boolean addressNameValid = false;
        boolean mobilNumberValid = false;
        boolean newEmailValid = false;

        if (fName != null) {
            firstName = fName;
            firstNameValid = true;
        }

        if (sName != null) {
            surName = sName;
            surNameValid = true;
        }

        if (addName != null) {
            addressName = addName;
            addressNameValid = true;
        }

        if (mobNumber != 0) {
            mobilNumber = mobNumber;
            mobilNumberValid = true;
        }

        if (mail != null) {
            newEmail = mail;
            newEmailValid = true;
        }

        if (firstNameValid && surNameValid && addressNameValid && mobilNumberValid && newEmailValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The first name is: " + firstName);
        System.out.println("The sur name is: " + surName);
        System.out.println("The address name is: " + addressName);
        System.out.println("The mobile number is: " + mobilNumber);
        System.out.println("The email is: " + newEmail);
    }
}