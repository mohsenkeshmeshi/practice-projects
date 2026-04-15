package t46;

public class main {

	public static void main(String[] args) {
		
		Box<String> productName = new Box<String>("Laptop");
		Box<Integer> quantity = new Box<Integer>(5);
		Box<Order> order = new Box<Order>(new Order("Laptop",5000));
		
		System.out.println("Product: "+productName.get());
		System.out.println("Quantity: "+quantity.get());
		System.out.println("Order: "+order.get());

	}

}
