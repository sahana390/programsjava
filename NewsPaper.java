class NewsPaper{
//design 

NewsPaper(){
	
	System.out.println("NewsPaper Constructer is invoked");
}

NewsPaper(int newsPaperId,int noOfPages,String language,String date,String day,String companyName){

this.newsPaperId=newsPaperId;
this.noOfPages=noOfPages;
this.language=language;
this.date=date;
this.day=day;
this.companyName=companyName;
}
int newsPaperId;
	int noOfPages;
	String language;
	 String date;
	 String day;
	String companyName;
	
	public void getNewsPaperInfo(){
		
System.out.println("The news paper id is"+newsPaperId);
System.out.println("The news paper companyName is "+companyName);
System.out.println("the language available is "+language);
System.out.println("the no of page is "+noOfPages);
System.out.println("the no of is "+date);
System.out.println("the no of is "+day);
	
		
		
		
		
	}
	



}