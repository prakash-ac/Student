
public class Address {
	private String number, street, street2, city, state, zip1, zip2, country;
	
	private Address(AddressBuilder builder) {
		this.number = builder.number;
		this.street = builder.street;
		this.zip1 = builder.zip1;
		this.city = builder.city;
		this.state = builder.state;
		this.zip2 = builder.zip2;
		this.street2 = builder.street2;
		this.country = builder.country;
	}

	public static class AddressBuilder{
		private String number, street, city, zip1;
		private String street2 = "", state = "", zip2 = "", country = "";
		
		public AddressBuilder(String number, String street, String city, String zip1) {
			this.number = number;
			this.city = city;
			this.street = street;
			this.zip1 = zip1;
		}
		
		public AddressBuilder street2(String var) {
			this.street2 = var;
			return this;
		}
		
		public AddressBuilder zip2(String var) {
			this.zip2 = var;
			return this;
		}
		
		
		public AddressBuilder state(String var) {
			this.state = var;
			return this;
		}
		
		public AddressBuilder country(String var) {
			this.country = var;
			return this;
		}
		
		public Address build() {
			return new Address(this);
		}
		
	}
	
}
