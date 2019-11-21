package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		
		// set is collection it is a interface Set implementation classes is hashSet, LinkedHashSet, TreeSet
		// set can not allow duplicate elements
		// HashSet can allow random access 
		// it is implemented by hashTable
		
		s.add("seshu");
		s.add("reddy");
		s.add("Chiripi");
		s.add("reddy");
		s.add("naga");
		s.add("naveen");
		s.add("sutha");
		s.add("jyothi");
		
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
	}

}
