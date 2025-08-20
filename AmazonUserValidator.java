public class AmazonUserValidator {

    static String firstName;
    static String surName;
    static String addressName;
    static long mobilNumber;
    static String newEmail;

    public static boolean validatorPassportUser(String gName, String sName) {
        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean surNameValid = false;

        if (fName != null && !fName.isEmpty()) {
            firstName = fName;
            firstNameValid = true;
        } else {
            System.out.println("first name is not valid");
        }

        if (sName != null && !sName.isEmpty()) {
            surName = sName;
            surNameValid = true;
        } else {
            System.out.println("Surname is not valid");
        }

        if (firstNameValid && surNameValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The first Name is: " + firstName);
        System.out.println("The Surname is: " + surName);
    }

    // For testing the class
    public static void main(String[] args) {
        boolean result = AmazonUserValidator.validatorAmazonUser("Sahana", "A");
        System.out.println("Is user registered? " + result);
        AmazonUserValidator.getUserInfo();
    }
}