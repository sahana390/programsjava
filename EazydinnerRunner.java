class EazydinnerRunner {

public static void main(String []meals) {
String food="Vaggie omelet";
double foods =Eazydinner.search(food);
System.out.println("the price is "+foods);
int quantity = 3;
double pricewithQuantity = Eazydinner.search(food,quantity);
System.out.println("the food bought"+food +"the price for"+quantity+"is"+pricewithQuantity);
}
}

