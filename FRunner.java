class FRunner{
public static void main(String[] fr){
System.out.println("main started");

System.out.println("Vegetables");

String vegetable = "Onion";
String quantity =  "50kg";
Customer.buy(vegetable,quantity);

System.out.println("main ended");
}
}