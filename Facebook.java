class Facebook{
public static String logIn(String password , String email){
String name = null;

if(email == "sahana.ag@gmail.com"){
password = "@Sahana10";
name="Sahana";
return name;
}

if(email == "annaiah.ag@gmail.com"){
password = "@sahana10";
name="Annaiah";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber==7019167380L){
password = "@Sahana10";
name = "Sahana";
}

if(phoneNumber==9685741203L){
password = "annaiah@12";
name = "Annaiah";
}


return name;
}
}