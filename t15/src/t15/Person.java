package t15;

public class Person {
	
	private String name;
	private String nationalId;
	
	public Person(String name, String nationalId) {
		this.name = name;
		this.nationalId = nationalId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(obj == null || getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return nationalId.equals(other.nationalId);
	}
	@Override
	public int hashCode() {
		return nationalId.hashCode();
	}
	@Override
	public String toString() {
		return "Person = {Name is %s,NationalId is %s}".formatted(name,nationalId);
	}

}
