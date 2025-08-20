class WhatsApp{
public static String logIn(String fName, String lName, String password , String email){
String name = null;

if(email == "sahana.ag@gmail.com"){
password = "@Sahana10";
fName = "Sahana A";
lName = "A";
name="Sahana";	1	
return name;
}

if(email == "annaiah.ag@gmail.com"){
password = "@annaiah10";
fName = "Annaiah";
lName = "M";
name="Annaiah";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password, String fName, String lName){
String name = null;

if(phoneNumber==7019167380L){
password = "@Sahana10";
fName = "Sahana";
lName = "A";
name = "Sahana";
}

if(phoneNumber==9685741203L){
password = "annaiah@12";
fName = "Annaiah";
lName = "M";
name = "Annaiah";
}


return name;
}
}