class JioHoster{
public static String logIn(String password , String email){
String name = null;

if(email == "riya.ag@gmail.com"){
password = "@Riya10";
name="Riya";
return name;
}

if(email == "sanjana.ag@gmail.com"){
password = "@sanjana10";
name="Sanjana";
return name;
}

return name;
}

public static String logIn(long phoneNumber , String password){
String name = null;

if(phoneNumber==7019167380L){
password = "@Riya10";
name = "Riya";
}

if(phoneNumber==9685741203L){
password = "sanjana@12";
name = "Sanjana";
}


return name;
}
}