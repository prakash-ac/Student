import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class ProductDriver {
	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(dtf.format(now));
		
		int initialSku = 1000000000;
		
		ArrayList<Product> products = new ArrayList<Product>();
		for(int i=initialSku;i<initialSku+10; i++) {
			new Electronic(i, "Phillips Trimmer");
			new HealthCare(i, "Oral B Tooth Brush", 9.99);
		}
		
		products = Product.getAllProducts();
		Collections.sort(products, new Product.ProductSkuComparator());
		
		for(Product pr: products) {
			System.out.println(pr);
		}
	}
}
