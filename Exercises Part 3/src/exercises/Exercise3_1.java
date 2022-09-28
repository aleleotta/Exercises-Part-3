package exercises;

import java.util.Scanner;

public class Exercise3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean even;
		System.out.print("Type a number: ");
		number = sc.nextInt();
		even = number % 2 == 0;
		System.out.println("The number is even: " + (even));
		sc.close();
	}
}
