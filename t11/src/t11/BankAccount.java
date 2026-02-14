package t11;

public class BankAccount {

	private String accountNumber;
	private double balance;
	
	{
		balance = 0;
	}
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}

}
