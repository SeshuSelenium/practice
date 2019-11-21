package seleniumMaven.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("sirisha");
		list.add("seshu");
		list.add("reddy");
		System.out.println(list.lastIndexOf("reddy"));
		System.out.println(list.indexOf("sirisha"));
		System.out.println(list.contains("seshu"));

		for (String li : list) {
			System.out.println(li);

		}

	}
}
