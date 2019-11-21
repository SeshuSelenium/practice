package demo;

import java.util.Scanner;

public class FindPrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 'x' value");
		int x = s.nextInt();
		int count = 0;

		if (x % 2 == 0) {
			count++;

		}

		if (count == 0) {
			System.out.println(x + " : " + "it is prime number");
			
		} else {
			System.out.println(x + " : " + "it is not prime number");
		}

	}

}
