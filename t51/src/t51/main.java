package t51;

public class main {

	public static void main(String[] args) {
		
		Repository<Customer> customerRep = new Repository<>();
		Repository<Product> productRep = new Repository<>();
		
		Customer c1 = new Customer("C101", "Taha", "taha@gmail.com");
		Customer c2 = new Customer("C102", "Javid", "javid@gmail.com");
		Customer c3 = new Customer("C103", "Nima", "nima@gmail.com");
		Customer c4 = new Customer("C104", "Sina", "sina@gmail.com");
		
		customerRep.save(c1);
		customerRep.save(c2);
		customerRep.save(c3);
		customerRep.save(c4);
		
		Product p1 = new Product("P201", "Laptop", 180000000.0);
		Product p2 = new Product("P202", "PC", 200000000.0);
		Product p3 = new Product("P203", "Xbox", 80000000.0);
		Product p4 = new Product("P204", "Mobile", 45000000.0);
		
		productRep.save(p1);
		productRep.save(p2);
		productRep.save(p3);
		productRep.save(p4);
		
		System.out.println(customerRep.findById("C103"));
		System.out.println(productRep.findById("P204"));
	}

}
