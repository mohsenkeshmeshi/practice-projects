package t9;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double mountlySalary;
	private LocalDate hireDate;
	
	public Employee(String name,double mountlySalary,LocalDate hireDate) {
		this.name = name;
		this.mountlySalary = mountlySalary;
		this.hireDate = hireDate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getMountlySalary() {
		return mountlySalary;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setMountlySalary() {
		this.mountlySalary = mountlySalary;
	}
	
	public double getNetSalary() {
		return mountlySalary * 0.91; 
		
	}

}
