package t24;

public interface PaymentCallback {
	
	void onSuccess(double amount);
	void onFailure(String reason);

}
