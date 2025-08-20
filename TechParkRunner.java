class TechParkRunner{

public static void main(String []args){
	
Block block= new Block();
block.name="Chanarayapatna";
block. blockCode="CRP123";
block. district="Hasan";
block. state="Karnataka";



Company company = new Company();
company. name="Infosys";
company. year=1981;
company. industry="Information technology";



block.company = company;

TechPark techPark = new TechPark();

String name="Manyata techPark";
String location="Bangalore";
int areaInAcres=300;
int noOfCompanies=120;

techPark.block = block;

techPark.getTechParkInfo();


}
}
