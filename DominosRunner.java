class DominosRunner {

public static void main(String []meals) {
String food="Brownie Pack";
double foods =Dominos.search(food);
System.out.println("the price is "+foods);
int quantity = 3;
double pricewithQuantity = Dominos.search(food,quantity);
System.out.println("the food bought"+food +"the price for"+quantity+"is"+pricewithQuantity);
}
}

