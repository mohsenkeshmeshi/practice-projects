package t36;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Product> products = Arrays.asList(new Product(1, "Samsung", 164000000, "Electronic"),
								  new Product(2, "IPhone", 230000000, "Electronic"),
								  new Product(3, "LG", 3000000, "Electronic"),
								  new Product(4, "Samsung", 350000, "Electronic"),
								  new Product(5, "Cable", 300000, "Accessories"));
		
		List<Product> cheap = ProductUtils.filterProducts(products, p -> p.getPrice() < 500000);
		
		List<Product> electronic = ProductUtils.filterProducts(products, p -> p.getCategroy().equals("Electronic"));
		
		List<Product> samsung = ProductUtils.filterProducts(products, p -> p.getName().contains("Samsung"));
		
		System.out.println("ارزان ها :");
		cheap.forEach(System.out :: println);
		
		System.out.println("الکترونیک : ");
		electronic.forEach(System.out :: println);
		
		System.out.println("سامسونگ ها :");
		samsung.forEach(System.out :: println);

	}

}
