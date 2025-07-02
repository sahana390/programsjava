class ChatShop{

/*static String paniPuri="PaniPuri";
static String bhelPuri="BhelPuri";
static String sevPuri="SevPuri";
static String dahiPuri="DahiPuri";
static String alooChaat="AlooChaat";
static String cornChaat="CornChaat";
static String masalaPuri="MasalaPuri"
static String kurkurechaat="KurkureChaat";
static String sweetcorn="SweetCorn";


static String chats[]={"PaniPuri","BhelPuri","SevPuri","DahiPuri","AlooChaat","CornChaat","MasalaPuri","KurkureChaat","SweetCorn"};*/



public static void main(String[] food) {
    
 String paniPuri="PaniPuri";
 String bhelPuri="BhelPuri";
 String sevPuri="SevPuri";
 String dahiPuri="DahiPuri";
 String aloochaat="AlooChaat";
 String cornchaat="CornChaat";
 String masalapuri="MasalaPuri";
 String kurkurechaat="KurkureChaat";
 String sweetcorn="SweetCorn";
String chats[] = {"PaniPuri", "BhelPuri", "SevPuri", "DahiPuri","AlooChat", "CornChaat", "MasalaPuri", "KurkureChat", "SweetCorn"};
System.out.println("main started");
//System.out.println("The no of chats added are"+chats.length);
//System.out.println(chats[0]+" "+chats[1]+" "+chats[2]+" "+chats[3]+" "+chats[4]+" "+chats[5]+" "+chats[6]+" "+chats[7]+" "+chats[8]+" "+chats[9]);
System.out.println("The no of Chats added:");
for(String chat:chats) {
            System.out.println(chat);

        System.out.println("main ended");
    }
}
}