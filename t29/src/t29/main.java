package t29;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<>();
		
		products.add(new Product("Playstation5", 75000000));
		products.add(new Product("Laptop", 89000000));		
		products.add(new Product("Playstation4", 61000000));
		products.add(new Product("Xbox x", 113000000));
		products.add(new Product("PC", 120000000));
		products.add(new Product("Xbox s", 64000000));
		
		System.out.println("مرتب سازی نزولی بر اساس قیمت :");
		products.sort((a, b) -> {
			int c = Double.compare(b.getPrice(), a.getPrice());
				return c;
		});
		products.forEach(System.out :: println);
		
		System.out.println("==========================================");
		System.out.println("مرتب سازی صعودی بر اساس نام :");
		products.sort((a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		
		products.forEach(System.out :: println);
		

	}

}
