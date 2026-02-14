package t10;

public class main {

	public static void main(String[] args) {
		double grossSalary = 4000;
		
		double tax = MathUtil.colculateTax(grossSalary);
		double net = grossSalary - tax;
		
		System.out.println("مالیات = "+MathUtil.formatCurrency(tax));
		System.out.println("حقوق خالص = "+ MathUtil.formatCurrency(net));

	}

}
