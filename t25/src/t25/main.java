package t25;

import java.util.Arrays;
import java.util.function.Predicate;

public class main {

	public static void main(String[] args) {
		
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("Taha", 28, "Kermanshah");
		customers[1] = new Customer("Nima", 45, "Tehran");
		customers[2] = new Customer("Ali", 39, "Tehran");
		customers[3] = new Customer("Navid", 17, "Hamedan");
		customers[4] = new Customer("Sina", 22, "Mashhad");
		
		Predicate<Customer> p = c -> c.getName().startsWith("A") && c.getAge() > 18 && c.getCity().equals("Tehran");
		
		Customer[] result = Arrays.stream(customers).filter(p).toArray(Customer[] :: new);
		
		Arrays.stream(result).forEach(c -> System.out.println("Name : "+ c.getName()+ "	Age : "+ c.getAge()+ "	City : "+ c.getCity()));
		
		
		

	}

}
