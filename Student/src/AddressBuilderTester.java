
public class AddressBuilderTester {

	public static void main(String[] args) {
		
		Address a1 = new Address.AddressBuilder("280", "Lake Merced Blvd", "Daly City", "94015")
				.country("United States")
				.street2("225")
				.zip2("94102")
				.state("CA")
				.build();
	}

}
