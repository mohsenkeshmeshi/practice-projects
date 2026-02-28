package t36;

import java.util.ArrayList;
import java.util.List;

public class ProductUtils {

	private List<Product> products;
	private Filter<Product> filter;
	
	public ProductUtils(List<Product> products, Filter<Product> filter) {
		this.products = products;
		this.filter = filter;
	}
	
	public static List<Product> filterProducts(List<Product> products, Filter<Product> filter) {
		
		List<Product> result = new ArrayList<>();
		
		for(Product p : products) {
			if(filter.test(p)) {
				result.add(p);
			}
		}
		return result;
	}
}
