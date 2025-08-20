class RodRunner{

public static void main(String a[]){
	
	String indegreints[]={"Cork","rubber","aluminum","plastic","cast iron"};
	String indegreints1[]={"Rod blank","grip","reel seat","guides","ferrules"};
	
	Rod rod = new Rod();
	rod.rodName="Temptation";
	rod.indegreints=indegreints;
	rod.getRodDetails();
	
	Rod rod1 = new Rod();
	rod.rodName="Safari";
	rod1.indegreints=indegreints1;
	rod1.getRodDetails();
	
	
}
}