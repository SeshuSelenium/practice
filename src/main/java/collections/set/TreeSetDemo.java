package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> s = new TreeSet<>();
		
		// set is collection it is a interface Set implementation classes is hashSet, LinkedHashSet, TreeSet
		// set can not allow duplicate elements
		// TreeSet can access ascending order or descending order
		// it is implemented by

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

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
