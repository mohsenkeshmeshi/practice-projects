package t15;

public class main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Taha","0123456789");
		Person p2 = new Person("Nima","0123456789");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("شماره ملی ها برابر هستند");
		}
		else {
			System.out.println("شماره ملی ها برابر نیستند");
		}

	}

}
