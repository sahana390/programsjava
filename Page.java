class Page{

String sectionName;
int noOfimagecount;
int noOfpagenumber;
String fontUsed;
double marginSize;

Article article;


public void getPageInfo(){
	
	System.out.println("Fetching page info");
	System.out.println("The sectionName is:"+sectionName);
	System.out.println("The noOfimagecount is:"+noOfimagecount);
	System.out.println("The noOfpagenumber is:"+noOfpagenumber);
	System.out.println("The fontUsed is:"+fontUsed);
	System.out.println("The marginSize is:"+marginSize);
	this.article.getArticleDetails();
	
}

}
