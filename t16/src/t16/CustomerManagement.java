package t16;

public class CustomerManagement {
	
	private String name;
	private String nationalNumber;
	
	public CustomerManagement(String name, String nationalNumber) {
		this.name = name;
		this.nationalNumber = nationalNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNationalNumber() {
		return nationalNumber;
	}

}
