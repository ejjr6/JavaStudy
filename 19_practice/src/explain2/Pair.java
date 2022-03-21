package explain2;

public class Pair<K, V> {
	
	private K key;
	private V vlaue;
	
	public Pair(K key, V vlaue) {
		this.key = key;
		this.vlaue = vlaue;
	}

	public K getKey() {
		return key;
	}

	public V getVlaue() {
		return vlaue;
	}
	
}
