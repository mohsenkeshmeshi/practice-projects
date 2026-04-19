package t58;

import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		
		Collection<User> listA = new ArrayList<>();
		listA.add(new User("Taha", "taha@gmail.com"));
		listA.add(new User("Nima", "nima@gmail.com"));
		listA.add(new User("Sina", "sina@gmail.com"));

		Collection<User> listB = new ArrayList<>();
		listB.add(new User("Javid", "javid@gmail.com"));
		listB.add(new User("Sina", "sina@gmail.com"));
		listB.add(new User("Sasan", "sasan@gmail.com"));
		
		Collection<User> merged = new ArrayList<>(listA);
		merged.addAll(listB);
		
		for(User u: merged) {
			System.out.println(u);
		}
		
		Collection<User> duplicates = new ArrayList<>();
		for(User u : listA) {
			if(listB.contains(u)){
				duplicates.add(u);
			}
		}
		
		merged.removeAll(duplicates);
		
		System.out.println("آیا merged شامل همه عناصر listA است ؟: "+merged.contains(listA));
		
		for(User u: merged) {
			System.out.println(u);
		}
		
	}

}
