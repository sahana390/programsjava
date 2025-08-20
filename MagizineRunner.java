class MagizineRunner{


public static void main(String []args){
	
Article article = new Article();
article.authorName="radha";
article.wordCount=3;
article.articleTitle="Future of article";
article.content= "artifical";
article.category="technology";


Page page = new Page();
page.sectionName = "sectionpages";
page.noOfimagecount=51;
page.noOfpagenumber=8;
page.fontUsed="highpages";
page.marginSize=70.00;



page.article = article;

Magizine magizine = new Magizine();

magizine.magiziniName = "national geographic";
magizine.language= "english";
magizine.noOfpages = 77;

magizine.page = page;

magizine.getMagizineInfo();


}
}
