package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// list is non-synchronized it is not thread safe
		// list can access multiple threads at a time
		// List is a collection it is list interface
		// ArrayList implementation classes are ArrayList, LinkedList, Vector, Stack
		// ArrayList can allow duplicate elements
		// ArrayList follow insertion order
		// ArrayList is slow for deletion
		// ArrayList is index based

		List<String> list = new ArrayList<>();

		list.add("seshu");
		list.add("reddy");
		list.add("Chiripi");
		list.add("reddy");
		list.add("naga");
		list.add("naveen");
		list.add("sudha");
		list.add("jyothi");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

}
