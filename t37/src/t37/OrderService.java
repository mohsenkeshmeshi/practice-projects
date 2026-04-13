package t37;

public class OrderService {
	
	public void placeOrder(double amount) {
		
		try {
			if(amount < 0) {
				throw new InvalidOrderException("مبلغ نمیتواند منفی باشد");
			}
			System.out.println("سفارش با مبلغ "+amount+"ثبت شد");
		}
		catch(InvalidOrderException e) {
			System.out.println("خطا : "+e.getMessage());
		}
	}

}
