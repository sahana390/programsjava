class Amazon{
public static String logIn(String password , String email){
String name = null;

if(email == "manjula.ag@gmail.com"){
password = "@Manjula04";
name="Manjula";
return name;
}

if(email == "lalitha.ag@gmail.com"){
password = "@lalitha27";
name="Lalitha";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber==9980189165L){
password = "@shra04";
name = "Shravan";
}

if(phoneNumber==9632617985L){
password = "nisha@27";
name = "Nisha";
}


return name;
}
}