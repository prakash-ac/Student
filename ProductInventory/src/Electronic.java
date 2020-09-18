import java.util.ArrayList;

public class Electronic extends Product {
	
	private int warrantyYears;
	private boolean hasWarranty;
	private static String DEFAULT_LOCATION = "Electronic Department";
	private static ArrayList<Electronic> eProducts = new ArrayList<Electronic>();

	
	public Electronic(int sku, String name, double price, String location, 
			boolean hasWarranty) {
		
		super(sku, name, price, location);
		this.hasWarranty = true;
		if(hasWarranty==true) {
			this.warrantyYears = 2;
		}else {
			this.warrantyYears = 0;
		}
	}
	
	public Electronic(int sku, String name) {
		
		this(sku, name, Product.DEFAULT_PRICE, DEFAULT_LOCATION, false);
		
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		if(hasWarranty==true) {
			this.warrantyYears = warrantyYears;
		}
	
	}

	public boolean hasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}
	
	public static ArrayList<Electronic> getAllHCProducts() {
		return eProducts;
	}
	
	@Override
	public String toString() {
		String product = super.toString();
		product += hasWarranty? "\nWarranty: " + warrantyYears : "No Warranty Available"; 
		return product;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String sellItem() {
		return "The item is just sold";
	}
	
}
