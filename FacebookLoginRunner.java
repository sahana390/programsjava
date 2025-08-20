public class FacebookLoginRunner {

    public static void main(String[] login) {

        boolean userIsRegistered = FacebookLogin.loginUser("Sahana", "A","26-07-2002",9353234527L,"sahana@123");

        System.out.println("Is user Registered: " + userIsRegistered);

        FacebookLogin.getUserInfo();
    }
}