
class Ipl{

/*static String rcb="RCB";
static String rr="RR";
static String lsg="LSG";
static String pbks="PBKS";
static String kkr="KKR";
static String mi="MI";
static String gt="GT";
static String csk="CSK";
static String srh="SRH";
static String teamNames[] ={"RCB","RR","LSG","PBKS","KKR","MI","GT","CSK","SRH"};*/



public static void main(String[] args){
System.out.println("main started");
String rcb="RCB";
String rr="RR";
String lsg="LSG";
String pbks="PBKS";
String kkr="KKR";
String mi="MI";
String gt="GT";
String csk="CSK";
String srh="SRH";
String teamNames[] ={"RCB","RR","LSG","PBKS","KKR","MI","GT","CSK","SRH"};
//System.out.println("The no of teamNames added are"+teamNames.length);
//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+" "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);
System.out.println("The no of Teams adde are :");
for(String teamName:teamNames){
	System.out.println(teamName);
}
	System.out.println("main ended");
}
}