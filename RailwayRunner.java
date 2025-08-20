class RailwayRunner{

public static void main(String arg[]){

Train.train=new Train();
train.trainNo=12623;
train.trainName="Talaguppa Express" ;
train.sourceStation=bangalore;
train.destinationStation=talaguppa;
train.isExpress=true;

Station.station=new Station();
station.stationName="KempeGowda Railway Station";
station.stationCode="SMG";
station.noOfPlatforms=10;
station.isJunction=true;
station.location="Bangalore";

station.train=train;



Railway.railway=new Railway();
railway.railwayName="Indian Railway";
railway.totalTracks="7";
railway.isElectrified=true;
railway.headquartersLocation="New Delhi";
railway.yearEstablished=1853;

railway.station=station;

railway.getRailwayInfo();




}




}