package t16;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<CustomerManagement> customers = new ArrayList<>();
		
		customers.add(new CustomerManagement("Taha","123"));
		customers.add(new CustomerManagement("Nima","321"));
		customers.add(new CustomerManagement("Sina","456"));
		customers.add(new CustomerManagement("Javid","654"));
		customers.add(new CustomerManagement("Ali","890"));
		
		String targetName = "Taha";
		
		for(CustomerManagement c : customers) {
			if(c.getName().equals(targetName)) {
				System.out.println("مشتری پیدا شد : " + c.getName() + c.getNationalNumber());
			}
		}
		
		customers.removeIf(c -> c == customers.get(customers.size() - 1));
		
		for(CustomerManagement c : customers) {
			System.out.println(c.getName() +","+ c.getNationalNumber());
		} 
		

	}

}
