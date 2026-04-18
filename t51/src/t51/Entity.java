package t51;

public abstract class Entity implements Identifiable{

	private String id;
	
	public Entity(String id) {
		this.id = id;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
