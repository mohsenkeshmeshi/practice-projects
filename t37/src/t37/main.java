package t37;

public class main {

	public static void main(String[] args) {
		OrderService service = new OrderService();
		
		service.placeOrder(-2000.00);
		
		service.placeOrder(45000.00);

	}

}
