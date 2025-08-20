class Shelf{

String shelfName;
int noOfrows;
String material;
String shelfColor;
Book book;


public void getShelfInfo(){
	
	System.out.println("Fetching shelf info");
	System.out.println("The shelfName is:"+shelfName);
	System.out.println("The noOfrows is:"+noOfrows);
	System.out.println("The material is:"+material);
	System.out.println("The shelfColor is:"+shelfColor);
	this.book.getBookDetails();
	
}

}