package demo;

public class DemoTest {

	public static void main(String[] args) {

		String s = "cgicgicgi";
		String s1 = "cgi";
		int count = 0;
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			j = 0;
			if (s.charAt(i) == s1.charAt(0)) {

				i++;
				if (s.charAt(i) == s1.charAt(1)) {
					i++;
					if (s.charAt(i) == s1.charAt(2)) {

						count++;

					}
				}
			}
		}
		System.out.println(count);
	}

}
