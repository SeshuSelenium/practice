package seleniumMaven.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashmapMultipleValues {
	public static void main(String[] args) throws IOException {
		
		try {
				
			String subjects ="Telugu,English,Maths,Science,Social,Hindi"; 
			
			String [] sgl = subjects.split(",");
			
			System.out.println("How many Student Records you need to Store : ");
			
			Scanner h = new Scanner(System.in);
			
			HashMap<String,ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
			
			int ssize = h.nextInt();
			
			for (int k = 0; k < ssize; k++) {//dd
			
			int score;
			String Name;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Please Enter a Student Name :");
			
			Name= s.nextLine();
			
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			
			for (int i = 0; i < 5; i++) {
				
				Scanner d = new Scanner(System.in);
				
				System.out.println("Enter Marks in "+ sgl[i]);
				
				score = d.nextInt();
				
				al.add(score);
			}
			
			
			
			hm.put(Name, al);
			
			System.out.println("-----------------------------Please Enter New Record------------------------------------");				
			
			}
			
			Set s3 = hm.keySet();
			
			Iterator<String> it = s3.iterator();
			
			while(it.hasNext()) {
				
				String str = it.next();
				
				System.out.println(str + " : " + hm.get(str));
				
			}
			
			System.out.println(hm);
			
			String b = hm.toString();
			
			FileWriter fo = new FileWriter("E://SeshuHashMap.txt");
			
			BufferedWriter bo = new BufferedWriter(fo);
			
			bo.write(b);
			
			bo.flush();
			
			bo.close();
			
			
			} catch (InputMismatchException e) {
				System.out.println("Please Enter Digits");
			}
		
			
			
			
		}

}
