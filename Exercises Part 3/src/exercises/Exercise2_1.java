package exercises;
import java.util.*;

public class Exercise2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		boolean verification;
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		verification = age >= 18;
		System.out.println("You are an adult: " + (verification));
		sc.close();
	}
}

