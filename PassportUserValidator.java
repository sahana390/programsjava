public class PassportUserValidator {

    static String givenName;
    static String surName;

    public static boolean validatorPassportUser(String gName, String sName) {
        boolean isUserRegistered = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;

        if (gName != null && !gName.isEmpty()) {
            givenName = gName;
            givenNameValid = true;
        } else {
            System.out.println("Given name is not valid");
        }

        if (sName != null && !sName.isEmpty()) {
            surName = sName;
            surNameValid = true;
        } else {
            System.out.println("Surname is not valid");
        }

        if (givenNameValid && surNameValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The Given Name is: " + givenName);
        System.out.println("The Surname is: " + surName);
    }

    // For testing the class
    public static void main(String[] args) {
        boolean result = PassportUserValidator.validatorPassportUser("Sahana", "A");
        System.out.println("Is user registered? " + result);
        PassportUserValidator.getUserInfo();
    }
}