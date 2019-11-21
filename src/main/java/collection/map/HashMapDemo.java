package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// map is a interface map implemented classes are hashMap, LinkedHashMap, hashTable, TreeMap
		// map contains key and value pair
		// HashMap can not allow duplicate keys
		// HashMap follow random access
		
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "seshu");
		map.put("dob", "01/06/1993");
		map.put("role", "tester");
		map.put("company", "altosurce");
		
		Set s = map.keySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			String str = (String) itr.next(); 
			System.out.println(str + " : "+map.get(str));
		}
	}

}
