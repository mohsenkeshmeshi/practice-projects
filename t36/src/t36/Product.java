package t36;

public class Product {

	private int id;
	private String name;
	private double price;
	private String category;
	
	public Product(int id, String name, double price, String category) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategroy() {
		return category;
	}
	@Override
	public String toString() {
		return "Id : %d, Name : %s, Price : %.0f, Category : %s".formatted(id, name, price, category);
	}

}
