package t58;

public class User {

	private String name;
	private String email;
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if(!(obj instanceof User))
			return false;
		
		User other = (User) obj;
		
		return this.email.equals(other.email);
	}
	
	@Override
	public int hashCode() {
		return email.hashCode();
	}
	
	@Override
	public String toString() {
		return name + "(" + email + ")";
	}
}
