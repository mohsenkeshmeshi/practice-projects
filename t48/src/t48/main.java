package t48;

public class main {

	public static void main(String[] args) {
		
		Product[] products = {
				new Product("Laptop", 200000000),
				new Product("PC", 150000000),
				new Product("Mouse", 3500000),
				new Product("Keyboard", 5000000)
		};
		
		Product maxProduct = Utility.max(products);
		System.out.println("Max Product: "+maxProduct);
		
		String[] names = {"Taha","Nima","Sina","Javid"};
		
		String maxName = Utility.max(names);
		System.out.println("Max Name: "+maxName);
		
		for(Product p: products)
			System.out.println(p);

	}

}
