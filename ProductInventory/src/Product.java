import java.util.ArrayList;
import java.util.Comparator;

public abstract  class Product implements Comparable<Product>{
	
	private int sku;
	private String name, location;
	private double price;
	
	
	private static ArrayList<Product> allProducts = new ArrayList<Product>();
	protected static final double DEFAULT_PRICE = 0;
	protected static final String DEFAULT_LOCATION = "Recieving";
	
	public Product(int sku, String name, double price, String location ) {
		this.sku = sku;
		this.name = name;
		this.price = price;
		this.location = location;
		allProducts.add(this);
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
	
	public static ArrayList<Product> getAllProducts() {
		return allProducts;
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
	
	
	public static class ProductSkuComparator implements Comparator<Product> {
		@Override
		public int compare(Product p1, Product p2) {
			return Integer.compare(p1.sku, p2.sku);
			
		}
		
	}
	
	public static class ProductNameComparator implements Comparator<Product>{
		@Override
		public int compare(Product p1, Product p2) {
			return p1.name.compareTo(p2.name);
		}
	}
	
	public abstract String sellItem(); 


}
