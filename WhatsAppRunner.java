class WhatsAppRunner{
public static void main(String smi[]){
String pwd="@Sahana10";
String mail="annaiah.ag@gmail.com";
long phone = 7019167380L;
String fName ="Sahana";
String lName = "A";

String whatsAppName=WhatsApp.logIn(pwd, mail, fName, lName);
System.out.println("the name of the user is:" +whatsAppName);

whatsAppName=WhatsApp.logIn(phone , pwd, fName, lName);
System.out.println("the name of the user is:" +whatsAppName);
}
}