package Testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BetterProgrammerTaskIII {
	
	public static void main(String[] args) {

		WriteOnceMap<String,String> map = new WriteOnceMap<String,String>();
		String key = new String("key");
		String key2 = new String("key2");
		map.put(key,"2");
		
		WriteOnceMap<String,String> map2 = new WriteOnceMap<String,String>();
//		map2.put(key,"2");
		map2.put(key2,"3");
		map2.putAll(map);
		System.out.println(map2);
		
	}
	
	public static class WriteOnceMap<K, V> extends HashMap<K, V> {

	        public V put(K key, V value) {
	            /*
	             WriteOnceMap is a map that does not allow changing value for a particular key.
	             It means that put() method should throw IllegalArgumentException if the key is already
	             assosiated with some value in the map.

	             Please implement this method to conform to the above description of WriteOnceMap.
	            */
	        	
	        	
	        	if (this.containsKey(key)) {
	        		throw new IllegalArgumentException();
	        	}
	        	
	        	return super.put(key, value);
	        }


	        public void putAll(Map<? extends K, ? extends V> m) {
	            /*
	             Pleaase implement this method to conform to the description of WriteOnceMap above.
	             It should either
	             (1) copy all of the mappings from the specified map to this map or
	             (2) throw IllegalArgumentException and leave this map intact
	             if the parameter already contains some keys from this map.
	            */
	        	
	        	Set<? extends K> setMap1 = this.keySet();
	        	Set<? extends K> setMap2 = m.keySet();
	        	
	        	for (K k : setMap1) {
					
	        		if (setMap2.contains(k)){
	        			throw new IllegalArgumentException();
	        		}
	        			
				}
	        	
	        	super.putAll(m);
	        }
	    }
}
