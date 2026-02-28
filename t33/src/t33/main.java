package t33;

public class main {

	public static void main(String[] args) {
		
		Bank.Account accounts1 = new Bank.Account("0012345678901", 10000000);
		Bank.Account accounts2 = new Bank.Account("0098541236987", 25000000);
		Bank.Account accounts3 = new Bank.Account("0024587625491", 149000000);
		Bank.Account accounts4 = new Bank.Account("0054832754963", 1257600000);
		
		System.out.println(accounts1);
		System.out.println(accounts2);
		System.out.println(accounts3);
		System.out.println(accounts4);
		
		
	}

}
