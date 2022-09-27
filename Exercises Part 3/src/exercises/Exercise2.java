package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		boolean verification;
		System.out.print("Insert your age: ");
		age = sc.nextInt();
		if (age >= 18) {
			verification = true;
		}
		else {
			verification = false;
		}
		if (verification = true) {
			System.out.print("Congrats! You are an adult!");
		}
		else {
			System.out.print("You´re currently not an adult. Access denied!");
		}
		sc.close();
	}
}
