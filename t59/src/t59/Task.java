package t59;

public class Task {

	private int id;
	private String description;
	private int priority;
	
	public Task(int id, String description, int priority) {
		this.id = id;
		this.description = description;
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public boolean equals(Object obj) {
	
		if(this == obj)
			return true;
		
		if(!(obj instanceof Task))
			return false;
		
		Task other = (Task) obj;
		return this.id == other.id;
	}
	
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}
	
	@Override
	public String toString() {
		return "Task{Id: "+id+"  Desc: "+description+"  Priority: "+priority+"}";
	}
}
