package t51;

import java.util.HashMap;
import java.util.Map;

public class Repository<T extends Entity & Identifiable> {

	private Map<String, T> storage = new HashMap<>();
	
	public T findById(String id) {
		return storage.get(id);
	}
	
	public void save(T item) {
		storage.put(item.getId(), item);
	}
}
