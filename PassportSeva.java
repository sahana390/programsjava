class PassportSeva{

static String giveName;
static String surName;
static String password;
static String confirmPassword;

public static boolean registerUser(String gName, String sName, String pwd, String cpwd){
	          boolean isUserRegistered = false;
			  
			  //validation of gName, sName,pwd, cpwd
			  boolean giveNameValid=false;
			  boolean surNameValid = false;
			  boolean passwordValid =false;
			  boolean confirmPassword=false;
			  
			  
			 if(gName !=null){
				  giveName = gName;
				  giveName = true;
			  }else{
				  
				  System.out.println("given name  is not valid");
			  }
			  if(sName !=null){
                  surName =  sName;
				  return isUserRegistered;
				  
			  }else{
				  System.out.println("sur name is not valid");
			  }
			  if(pwd !=null){
				  password=pwd;
				  password=true;
			  }else{
				  System.out.println("password is not valid");
			  }
			  if(confirmPassword!=null)
				  confirmPassword=cpwd;
			  confirmPassword=true;
			  }else{
				  System.out.println("confirmPassword is not valid");
			  }
					if(giveNameValid == true && surNameValid == true){
								isUserRegistered = true;
					}
					
								return isUserRegistered ;

}

public static void getUserInfo(){
	
	giveName = PassportUserValidator.givenName;
	surName = PassportUserValidator.surName;
	password=PassportUserValidator.password;
	confirmPassword=PassportUserValidator.confirmPassword;
	
System.out.println("The given Name is "+PassportUserValidator.giveName);
System.out.println("The sur Name is "+PassportUserValidator.surName);
System.out.println("The password Name is "+PassportUserValidator.passwordName);
System.out.println("The confirmPassword Name is "+PassportUserValidator.confirmPasswordName);
}
}

}


}