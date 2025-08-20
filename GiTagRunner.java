class GiTagRunner{

public static void main(String paper[]){
	
System.out.println("main started");


 GiTag gitag = new GiTag();


gitag.tagId=56;
gitag.productName="name of the GI product";
gitag.state="karnataka";
gitag.district="hassan";
gitag.category="food agriculture";
gitag.applicationNumber="GI applicationNumber";
gitag.registrationDate="22-07-2025";
gitag.applicationdate="21-07-2026";
gitag.registerdBy="name of the authority";
gitag.productDescription="Short description of product";
gitag.geographicalArea="location area";
gitag.contactEmail="email communication";
gitag.website="official website";
gitag.popularityLevel=10;
gitag.annualProduction=23.00;
gitag.renewalDueDate="gitag date";
gitag.logolmageUrl="url to product";



gitag.getGiTagInfo();

System.out.println("main ended");



}

}



