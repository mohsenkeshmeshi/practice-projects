package t24;

public class SuccessCallback implements PaymentCallback{

	@Override
	public void onSuccess(double amount) {
		System.out.println("پرداخت موفق مبلغ : "+ amount);
	}
	
	@Override
	public void onFailure(String reason) {
		System.out.println("خطا : "+ reason);
	}
}
