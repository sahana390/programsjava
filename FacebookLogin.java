class FacebookLogin {

    static String firstName;
    static String surName;
    static String dateOfBirth;
    static long mobilNumber;
    static String newPassword;

    public static boolean loginUser(String fName, String sName, String dob, long mobNumber, String pass) {

        boolean isUserRegistered = false;
        boolean firstNameValid = false;
        boolean surNameValid = false;
        boolean dateOfBirthValid = false;
        boolean mobilNumberValid = false;
        boolean newPasswordValid = false;

        if (fName != null) {
            firstName = fName;
            firstNameValid = true;
        }

        if (sName != null) {
            surName = sName;
            surNameValid = true;
        }

        if (dob != null) {
            dateOfBirth = dob;
            dateOfBirthValid = true;
        }

        if (mobNumber != 0) {
            mobilNumber = mobNumber;
            mobilNumberValid = true;
        }

        if (pass != null) {
            newPassword = pass;
            newPasswordValid = true;
        }

        if (firstNameValid && surNameValid && dateOfBirthValid && mobilNumberValid && newPasswordValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("The first name is: " + firstName);
        System.out.println("The sur name is: " + surName);
        System.out.println("The date of birth is: " + dateOfBirth);
        System.out.println("The mobile number is: " + mobilNumber);
        System.out.println("The new password is: " + newPassword);
    }
}