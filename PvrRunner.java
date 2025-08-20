class PvrRunner{


public static void main(String []args){
	
Movie movie = new Movie();
movie.movieName="Appu";
movie.movieid=3;
movie.language="kannada";
movie.budgetIncrores= 530.00;
movie.directorName="Yogarajbhat";
movie.producerName="B.suresh";

Screen screen = new Screen();
screen. screenName = "pvrmax";
screen.noOfseat=51;
screen.noOfrows=8;
screen. soundSystem="high";
screen.emergencyExitcount=7;



screen.movie = movie;

Pvr pvr = new Pvr();

pvr.pvrName = "pvrcinemas";
pvr.pvrLocation= "bengaluru";
pvr.noOfmembers = 77;

pvr.screen = screen;

pvr.getPvrInfo();


}
}
