package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> s = new LinkedHashSet<>();

		// set is collection it is a interface Set implementation classes is hashSet, LinkedHashSet, TreeSet
		// set can not allow duplicate elements
		// LinkedHashSet can follow insertion order 
		// it is implemented by hashTable and double Linked List
		// default size : 
		
		
		
		s.add("seshu");
		s.add("reddy");
		s.add("Chiripi");
		s.add("reddy");
		s.add("naga");
		s.add("naveen");
		s.add("sudha");
		s.add("jyothi");

		System.out.println(s);

		Iterator<String> it = s.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
