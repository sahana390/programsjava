class Category{

int categoryId;
String name;
String description;
boolean activeStatus;
int noOfItems;

Product product;

public void getCategoryInfo(){
	
	System.out.println("Fetching category info");
	System.out.println("The categoryId is:"+categoryId);
	System.out.println("The name is:"+name);
	System.out.println("The description is:"+description);
	System.out.println("The activeStatus is:"+activeStatus);
	System.out.println("The noOfItems is:"+noOfItems);

	this.product.getProductDetails();
	
	
}

}