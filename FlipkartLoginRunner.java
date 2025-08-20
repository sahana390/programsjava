public class FlipkartLoginRunner {

    public static void main(String[] login) {

        boolean userIsRegistered = FlipkartLogin.loginUser("Sahana", "A","Shiavamogga",9353234527L,"Thousandruppes");

        System.out.println("Is user Registered: " + userIsRegistered);

        FlipkartLogin.getUserInfo();
    }
}