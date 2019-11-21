package seleniumMaven.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) {
		Scanner s3 = new Scanner(System.in);
		String s1 = "telugu hindi english maths scince social";
		String[] s2 = s1.split(" ");
		String name;
		int marks;
		System.out.println("enter numbe r of students : ");
		int students = s3.nextInt();
		

		HashMap<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();

		
		for (int i = 0; i < students; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter student name : ");
			
			name = s.nextLine();
			ArrayList<Integer> list = new ArrayList<>();
			
			
			for (int j = 0; j < s2.length; j++) {
				System.out.println(s2[j]+" : enter marks : ");
				marks = s.nextInt();
				list.add(marks);
			}
			hm.put(name, list);
			System.out.println(hm);
			System.out.println(hm.get(name));
		}
	}
	

}
