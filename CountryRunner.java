class CountryRunner{

public static void main(String []args){
	
State state= new State();
state. stateName="karnataka";
state. capitalCity="Bangalore";
state. address="Shivamogga";


City city = new City();
city. cityName="Shivamogga";
city. pincode="577227";
city. cityState="Karnataka";



state.city = city;

Country country = new Country();

country.countryName="India";
country.capital="delhi";
country. currency=91;

country.state = state;

country.getCountryInfo();


}
}
