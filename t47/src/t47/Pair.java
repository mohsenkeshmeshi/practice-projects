package t47;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public static <K, V> void swap(Pair<K, V> p1, Pair<K, V> p2) {
		
		K tempKey = p1.getKey();
		V tempValue = p1.getValue();
		
		p1.setKey(p2.getKey());
		p1.setValue(p2.getValue());
		
		p2.setKey(tempKey);
		p2.setValue(tempValue);	
	}
	
	@Override
	public String toString() {
		return "{"+key+" , "+value+"}";
	}
	

}
