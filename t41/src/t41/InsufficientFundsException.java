package t41;

public class InsufficientFundsException extends PaymentException{

	public InsufficientFundsException(String message) {
		super(message);
	}

}
