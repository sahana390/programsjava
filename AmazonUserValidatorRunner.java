public class AmazonUserValidatorRunner {

    public static void main(String[] login) {

        boolean userIsRegistered = AmazonLogin.registerUser("Sahana","A","26-07-2002",9353234527L,"asahana@gmaol.com");

        System.out.println("Is user Registered: " + userIsRegistered);

        AmazonLogin.getUserInfo();
    }
}