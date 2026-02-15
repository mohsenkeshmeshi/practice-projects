package t24;

public class PaymentProcessor {

	public void processPayment(double amount, PaymentCallback callback) {
		
		System.out.println("سیستم در حال پردازش است ...");
		
		boolean success = Math.random() < 0.5;
		
		if(success) {
			callback.onSuccess(amount);
		}
		else {
			callback.onFailure("پرداخت ناموفق بود");
		}
	}
}
