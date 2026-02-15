package t21;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		var products = new Product[4];
		
		products[0] = new Product(1, "Ram", 6000000);
		products[1] = new Product(2, "CPU", 15000000);
		products[2] = new Product(3, "Mainboard", 30000000);
		products[3] = new Product(4, "Monitor", 25000000);
		
		Arrays.sort(products);
		
		System.out.println("مرتب سازی بر اساس قیمت");
		for(Product p : products) {
			System.out.println(p);
		}
		
		Arrays.sort(products, new ProductNameSort());
		
		System.out.println("مرتب سازی بر اساس نام");
		for(Product p : products) {
			System.out.println(p);
		}
		

	}

}
