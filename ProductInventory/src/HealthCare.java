import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.time.LocalDateTime;    
public class HealthCare extends Product{
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	//LocalDateTime now = LocalDateTime.now();
	private String expirationDate;
	private static final String DEFAULT_LOCATION = "Health Care";
	private static ArrayList<HealthCare> hcProducts = new ArrayList<HealthCare>();
	
	public HealthCare(int sku, String name, double price, String location) {
		super(sku, name, price, location);
		this.expirationDate = dtf.format(LocalDate.now().plusMonths(3));
		hcProducts.add(this);
		
	}
	
	public HealthCare(int sku, String name, double price) {
		this(sku, name, price, DEFAULT_LOCATION);
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public static ArrayList<HealthCare> getAllHCProducts() {
		return hcProducts;
	}
	
	@Override
	public String toString() {
		String product = super.toString();
		product += "\nExpiration Date: " + expirationDate;
		return product;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String sellItem(){
		return "The item is just sold";
	}
}	
