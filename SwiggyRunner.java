class SwiggyRunner {
    public static void main(String[] meals) {
		String food = "Vegetable Dosa";
        double foods = Swiggy.search(food);
		   System.out.println("the price is " + foods);
		   int quantity =3;
		double pricewithQuantity	= Swiggy.search(food, quantity);
        System.out.println("the food bought " + food + " the price for  " + quantity + " is " + pricewithQuantity);
    }
}