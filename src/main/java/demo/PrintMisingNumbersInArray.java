package demo;

import java.util.ArrayList;

import javafx.scene.shape.Arc;

public class PrintMisingNumbersInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(9);
		
		for (int i = 0; i < 10; i++) {
			if(!al.contains(i)) {
				al1.add(i);
			}
		}
		System.out.println(al);
		
		System.out.println(al1);
	}

}
