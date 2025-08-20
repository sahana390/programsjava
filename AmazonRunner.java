class AmazonRunner{
public static void main(String smi[]){
String pwd="@shra04";
String mail="manjula.ag@gmail.com";
long phone = 9632617985L;

String amazonName=Amazon.logIn(pwd, mail);
System.out.println("the name of the user is:" +amazonName);

amazonName=Amazon.logIn(phone , pwd);
System.out.println("the name of the user is:" +amazonName);
}
}