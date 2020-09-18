
public class Product implements Comparable<Product>{
	
	private int sku;
	private String name, location;
	private double price;
	
	
	public static int numberAvailable = 0;
	private static final double DEFAULT_PRICE = 0;
	private static final String DEFAULT_LOCATION = "Recieving";
	
	public Product(int sku, String name, double price, String location ) {
		this.sku = sku;
		this.name = name;
		this.price = price;
		this.location = location;
		numberAvailable++;
	}
	
	public Product(int sku, String name) {
		this(sku, name, DEFAULT_PRICE, DEFAULT_LOCATION);
	}
	
	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		String product = "Product Name: " + name + "\nSku: " + sku +
				"\nPrice: " + price;
		return product;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			Product pd = (Product) obj;
			
			return sku==pd.sku && name.equalsIgnoreCase(pd.name);
		}
		return false;
	}
	
	@Override
	public int compareTo(Product product) {
		return Integer.compare(sku, product.sku);
	}


}
