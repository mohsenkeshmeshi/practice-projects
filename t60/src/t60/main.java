package t60;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {

		Set<String> userPermission = new HashSet<>();
		
		userPermission.add("READ");
		userPermission.add("WRITE");
		userPermission.add("DELETE");
		userPermission.add("ADMIN");

		boolean isAdmin = userPermission.contains("ADMIN");
		System.out.println("Has Admin Permission: "+ isAdmin);
		
		Set<String> requiredPermission = new HashSet<>();
		
		requiredPermission.add("READ");
		requiredPermission.add("ADMIN");
		
		Set<String> intersection = new HashSet<>(userPermission);
		intersection.retainAll(requiredPermission);
		
		for(String p : intersection) {
			System.out.println(p);
		}
	}

}
