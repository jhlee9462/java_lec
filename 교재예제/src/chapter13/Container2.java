package chapter13;

public class Container2<K, V> {
	
	private K key;
	private V value;
	
	public Container2() {
		// TODO Auto-generated constructor stub
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
}
