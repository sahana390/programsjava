class PeriodicTable{
/*static String hydrogen="Hydrogen";
static String helium="Helium";
static String lithium="Lithium";
static String carbon="Carbon";
static String nitrogen="Nitrogen";
static String Oxygen="Oxygen";
static String fluorine="Fluorine";
static String sodium="Sodium";
static String magnesium="Magnesium";
static String aluminium="Aluminium";
static String silicon="Silicon";
static String sulfur="Sulfur";
static String calcium="Calcium";


static String elements[] ={Hydrogen,Helium,Lithium,Carbon,"Nitrogen","Oxygen","Fluorine","Sodium","Magnesium","Aluminium","Silicon","Sulfur","Calcium"};*/
 


public static void main(String[] args){
 String hydrogen="Hydrogen";
 String helium="Helium";
 String lithium="Lithium";
 String carbon="Carbon";
 String nitrogen="Nitrogen";
 String Oxygen="Oxygen";
 String fluorine="Fluorine";
 String sodium="Sodium";
 String magnesium="Magnesium";
 String aluminium="Aluminium";
 String silicon="Silicon";
 String sulfur="Sulfur";
 String calcium="Calcium";
 String elements[] ={"Hydrogen","Helium","Lithium","Carbon","Nitrogen","Oxygen","Fluorine","Sodium","Magnesium","Aluminium","Silicon","Sulfur","Calcium"};
 
 
	  System.out.println("main started");

//System.out.println("The no of elements added are"+elements.length);
//System.out.println(elements[0]+" "+elements[1]+" "+elements[2]+" "+elements[3]+" "+elements[4]+" "+elements[5]+" "+elements[6]+" "+elements[7]+""+elements[8]+""+elements[9]);
System.out.println("Elements added are:");
	for(String element:elements){
	  System.out.println(element);
	}
	  System.out.println("main ended");
	  
}
}
