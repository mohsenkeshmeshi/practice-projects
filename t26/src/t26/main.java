package t26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("Taha",3500));
		employees.add(new Employee("Nima",4000));
		employees.add(new Employee("Ali",2000));
		employees.add(new Employee("Navid",3000));
				
		List<Employee> afterIncrease = new ArrayList<>(employees);
		afterIncrease.forEach(Employee :: increaseSalary);
		afterIncrease.forEach(System.out::println);
		
//		for(Employee e: afterIncrease) {
//			System.out.println(e.getName()+e.getSalary());
//		}

	}

}
