
public class Electronic extends Product {
	
	private int warrantyYears;
	private boolean hasWarranty;
	private static String DEFAULT_LOCATION = "Electronic Department";
	
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
		
		super(sku, name);
		this.hasWarranty = true;
		if(hasWarranty==true) {
			this.warrantyYears = 2;
		}else {
			this.warrantyYears = 0;
		}
		
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
	
}
