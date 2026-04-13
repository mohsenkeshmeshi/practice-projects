package t41;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount)throws PaymentException {
		if(amount > balance) {
			throw new InsufficientFundsException("موجودی کافی نیست. موجودی فعلی : "+balance);
		}
		balance -= amount;
		System.out.println("برداشت موفق ||| موجودی جدید : "+balance);
	}
}
