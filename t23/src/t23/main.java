package t23;

public class main {

	public static void main(String[] args) {
		
		Invoice inv1 = new Invoice(2000);
		Invoice inv2 = new Invoice(5000);
		Invoice inv3 = new Invoice(7000);
		
		System.out.println("Invoice 1 : Amount = "+inv1.getAmount()+ "  "+ "Final Amount = "+ inv1.getFinalAmount());
		System.out.println("Invoice 2 : Amount = "+inv2.getAmount()+ "  "+ "Final Amount = "+ inv2.getFinalAmount());
		System.out.println("Invoice 3 : Amount = "+inv3.getAmount()+ "  "+ "Final Amount = "+ inv3.getFinalAmount());

	}

}
