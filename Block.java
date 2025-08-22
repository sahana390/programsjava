class Block{

String name;
String blockCode;
String district;
String state;

Company company;

public void getBlockInfo(){
	
	System.out.println("Fetching Block info");
	System.out.println("The name is:"+name);
	System.out.println("The blockCode is:"+blockCode);
	System.out.println("The district is:"+district);
		System.out.println("The state is:"+state);
	

	this.company.getCompanyDetails();
	
	
}

}