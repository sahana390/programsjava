class JioHosterRunner{
public static void main(String smi[]){
String pwd="@Riya10";
String mail="sanjana.ag@gmail.com";
long phone = 7019167380L;

String jioHosterName=JioHoster.logIn(pwd, mail);
System.out.println("the name of the user is:" +jioHosterName);

jioHosterName=JioHoster.logIn(phone , pwd);
System.out.println("the name of the user is:" +jioHosterName);
}
}