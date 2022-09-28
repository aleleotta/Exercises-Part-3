package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean rain;
		boolean homework;
		boolean library;
		System.out.println("Is it raining currently at your location? ");
		rain = sc.nextBoolean();
		System.out.println("Have you done your homework? ");
		homework = sc.nextBoolean();
		System.out.println("Do you need to head to a library? ");
		library = sc.nextBoolean();
		System.out.println(!rain && homework || library);
		sc.close();
	}
}
