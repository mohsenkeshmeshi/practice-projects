package t11;

public class main {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456");
		BankAccount acc2 = new BankAccount("654321",5000);
		
		System.out.println("شماره حساب 1 : "+acc1.getAccountNumber()+" | موجودی : "+acc1.getBalance());
		System.out.println("شماره حساب 2 : "+acc2.getAccountNumber()+" | موجودی : "+acc2.getBalance());

	}

}
