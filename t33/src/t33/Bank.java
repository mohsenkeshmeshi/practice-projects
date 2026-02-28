package t33;

public class Bank {

	public static class Account {
		
		private String accountNumber;
		private double accountBalance;
		
		public Account(String accountNumber, double accountBalance) {
			this.accountNumber = accountNumber;
			this.accountBalance = accountBalance;
		}
		
		public String getAccountNumber() {
			return accountNumber;
		}
		
		public double getAccountBalance() {
			return accountBalance;
		}
		@Override
		public String toString() {
			return "Account Number : %s, Account Balance : %.2f ".formatted(getAccountNumber(),getAccountBalance());
		}
	}
}
