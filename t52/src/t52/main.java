package t52;

public class main {

	public static void main(String[] args) {
		
		GenericList<Employee> empList = new GenericList<>();
		GenericList<Manager> mngList = new GenericList<>();
		
		GenericList raw = mngList;
		raw.set(new Employee());
		
		System.out.println(mngList.get());
		Manager m = mngList.get();
		System.out.println(m);

	}

}
