class BlazzerRunner{

public static void main(String a[]){
	
	String noOfItems[]={"Cork","rubber","aluminum","plastic","cast iron"};
	String noOfItems1[]={"Rod blank","grip","reel seat","guides","ferrules"};
	
	Blazzer blazzer = new Blazzer();
	blazzer.blazzerName="Temptation";
	blazzer.noOfItems=noOfItems;
	blazzer.getBlazzerDetails();
	
	Rod blazzer1 = new Blazzer();
	blazzer.blazzerName="Safari";
	blazzer1.noOfItems=noOfItems;
	blazzer1.getBlazzerDetails();
	
	
}
}