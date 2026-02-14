package t14;

public class main {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = {new Vehicle(),
							  new Motorcycle(),
							  new Car()};
		
		for(Vehicle v : vehicles) {
			v.startEngine();
		}
	}

}
