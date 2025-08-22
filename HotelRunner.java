class HotelRunner{


public static void main(String []args){



Room room = new Room();
room.roomSize="long";
room.roomNo=3;
room.type="three sharing";
room.balconyAvailable= false;
room. bedType="singlebedroom";

Floor floor = new Floor();
floor. type = "parking";
floor.noOffloor=5;
floor. floorName="ground floor";
floor. floorMaterial="wood";



floor.room = room;

Hotel hotel = new Hotel();

hotel.hotelName = "Taj";
hotel.onwerName= "Raj";
hotel.noOfworkers = 222;

hotel.floor = floor;

hotel.getHotelInfo();


}
}