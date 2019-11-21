package collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// list is non-synchronized it is not thread safe
		// list can access multiple threads at a time
		// List is a collection it is list interface 
		// LinkedList implementation classes are ArrayList, LinkedList, Vector, Stack
		// LinkedList can allow duplicate elements
		// LinkedList follow insertion order
		// LinkedList is fast for manipulation
		// it have double node
		// we can not insert elements using index
		
		
		List<String> list = new LinkedList<>();
		
		
		list.add("seshu");
		list.add("reddy");
		list.add("Chiripi");
		list.add("reddy");
		list.add("naga");
		list.add("naveen");
		list.add("sutha");
		list.add("jyothi");
		
		for (String str : list) {
			
			System.out.println(str);
			
		}

	}

}
