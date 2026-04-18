package t53;

import java.util.List;

public class Utility {

	public static double totalPrice(List<? extends Product> products) {
		
		double sum = 0.0;
		
		for(Product p: products) {
			sum += p.getPrice();
		}
		
		return sum;
	}
}
