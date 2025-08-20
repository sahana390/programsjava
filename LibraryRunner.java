class LibraryRunner{

public static void main(String []args){
	
Book book = new Book();
book.publisher="shaurya kapoor";
book.bookid=3;
book.title="The art of not overthinking";
book.price= 23.00;
book. author="kapoor";
book.language="english";

Shelf shelf = new Shelf();
shelf. shelfName = "poetry";
shelf.noOfrows=5;
shelf. material="falstic";
shelf. shelfColor="white";



shelf.book = book;

Library library = new Library();

library.libraryName = "central city library";
library.location= "delhi";
library.noOfbooks = 222;

library.shelf = shelf;

library.getLibraryInfo();


}
}
