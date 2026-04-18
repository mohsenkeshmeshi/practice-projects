package t54;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		Utility.addItems(products);
		
		System.out.println(products);

	}

}
