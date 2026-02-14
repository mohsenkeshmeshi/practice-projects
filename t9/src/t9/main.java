package t9;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Employee emp = new Employee("Taha Ahadi", 3000, LocalDate.of(2025, 2, 14));
		
		double netSalary = emp.getNetSalary();
		System.out.printf("%.2f",netSalary);

	}

}
