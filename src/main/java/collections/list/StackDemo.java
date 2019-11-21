package collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// stack implemented by list interface
		// stack follow LIFO (first in last out)
		// it can allow duplicate elements
		
		//push();
		//peek();

		Stack s = new Stack();
		
		s.add("seshu");
		s.add("reddy");
		s.add("Chiripi");
		s.add("reddy");
		s.add("naga");
		s.add("naveen");
		s.add("sutha");
		s.add("jyothi");
		
		System.out.println(s.get(3));
		
	}

}
