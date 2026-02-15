package t24;

public class main {

	public static void main(String[] args) {
		
		PaymentProcessor process = new PaymentProcessor();
		
		PaymentCallback callback = new SuccessCallback();
		process.processPayment(500, callback);

	}

}
