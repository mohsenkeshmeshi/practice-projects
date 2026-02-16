package t26;

public class Employee {

	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double increaseSalary() {
		return this.salary *= 1.10;
	}
	@Override
	public String toString() {
		return "Name : %s , Salary : %.2f".formatted(name,salary);
	}

}
