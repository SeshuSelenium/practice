package collections.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		// list allow duplicate elements
		// vector is synchronized it is thread safe
		// it can allow one thread at a time its can not allow multiple threads at a time
		// it is legacy class
		// vector implemented by list
		// it is index based class
		
		Vector v = new Vector();
		
		v.add("seshu");
		v.add("reddy");
		v.add("Chiripi");
		v.add("reddy");
		v.add("naga");
		v.add("naveen");
		v.add("sutha");
		v.add("jyothi");
		
		System.out.println(v.get(5));
		
		System.out.println(v);

	}

}
