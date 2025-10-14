public class Address{

	String number;
	String street;
	String city;
	String state;
	int zip;
	
	public Address(String numberIn, String street, String cityIn, String stateIn, int zipIn){
		this.number = numberIn;
		this.street = street;
		this.city = cityIn;
		this.state = stateIn;
		this.zip = zipIn;
	}

	public String toString(){
		return "\n\t" + number + " " + street + "\n\t" + city + ", " + state + " " + zip;
	}
}