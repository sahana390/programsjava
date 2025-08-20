class EcommerceRunner{

public static void main(String []args){
	
Category category = new Category();
category. categoryId=101;
category.name="Electronics";
category.description="laptop";
category.activeStatus=true;
category.noOfItems=250;


Product product = new Product();
product. productId=110;
product. name="Bluetooth";
product. price=2000.00;
product. inStock=true;
product. description="Wirless";
product.category="electronics";

System.out.println(category.product.ecommerce);
category.product = product;

Ecommerce ecommerce = new Ecommerce();

ecommerce. productName="Wirless Mouse";
ecommerce.price=5000.00;
ecommerce.inStock=true;
ecommerce.paymentMethods="creditcard";
ecommerce.customerRating=4;


ecommerce.category = category;

ecommerce.getEcommerceInfo();


}
}
