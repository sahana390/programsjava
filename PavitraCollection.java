class PavitraCollection{
/*static String top="Top";
static String geens="Geens";
static String babyshoes="Baby shoes";
static String shirt="Shirt";
static String kurtha="Kurtha";


static String brands[] ={"Top","Geens","Baby shoes","Shirt","Kurtha"};*/



public static void main(String[] args){
 String top="Top";
 String geens="Geens";
 String babyshoes="Baby shoes";
 String shirt="Shirt";
 String kurtha="Kurtha";
 String brands[] ={"Top","Geens","Baby shoes","Shirt","Kurtha"};


System.out.println("main started");
System.out.println("The no of brands added are"+brands.length);
System.out.println(brands[0]+" "+brands[1]+" "+brands[2]+" "+brands[3]);
System.out.println("The no of brands added are:");
	for(String brand:brands){
	  System.out.println(brand);
	}
	  System.out.println("main ended");
}
}
