class FestivalsRunner{

public static void main(String paper[]){
	
System.out.println("main started");


Festivals festivals = new Festivals();

festivals.name="ganesha chathurthi";
festivals.country="india";
festivals.state="karnataka";
festivals.religion="hindhu";
festivals.day="Tuesday";
festivals.month="may";
festivals.durationDays=52;
festivals.mainDeity="lakshmi";
festivals.mainDish="Sweets";
festivals.yearStarted=6;
festivals.activites="fasting";
festivals.culturalImportance="very high";
festivals.mainColorTheme="yellow and pink";
festivals.decoration="Rangoli";

festivals.getFestivalsInfo();




System.out.println("main ended");



}

}