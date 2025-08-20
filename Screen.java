class Screen{

String screenName;
int noOfseat;
int noOfrows;
String soundSystem;
int emergencyExitcount;
Movie movie;


public void getScreenInfo(){
	
	System.out.println("Fetching screen info");
	System.out.println("The screenName is:"+screenName);
	System.out.println("The noOfseat is:"+noOfseat);
	System.out.println("The noOfrows is:"+noOfrows);
	System.out.println("The soundSystem is:"+soundSystem);
	System.out.println("The emergencyExitcount is:"+emergencyExitcount);
	this.movie.getMovieDetails();
	
}

}
