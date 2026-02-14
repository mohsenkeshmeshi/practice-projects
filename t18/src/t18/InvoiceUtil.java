package t18;

public class InvoiceUtil {
	
	public static void printInvoices(double ... amounts) {
		
		double total = 0;
		
		for(double a : amounts) {
			total += a;
		}
		
		System.out.println("تعداد فاکتورها : "+ amounts.length);
		System.out.println("جمع کل : "+ total);
	}
	

}
