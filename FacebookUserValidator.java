public class FacebookUserValidator {

    static String firstName;
    static String surName;
    static String dateOfBirth;
    static long mobilNumber;
    static String newPassword;;

    public static boolean validatorFacebookUser(String gName, String sName) {
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
            System.out.println("Sur name is not valid");
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
        boolean result = FacebookUserValidator.validatorFacebookUser("Sahana", "A");
        System.out.println("Is user registered? " + result);
        PassportUserValidator.getUserInfo();
    }
}