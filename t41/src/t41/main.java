package t41;

public class main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(3500);
		
		try {
			account.withdraw(1500);
			account.withdraw(2500);
		}
		catch(InsufficientFundsException e) {
			System.out.println("خطای خاص : "+e.getMessage());
		}
		catch(PaymentException e) {
			System.out.println("خطای عمومی : "+e.getMessage());
		}

	}

}
