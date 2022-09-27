package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Declarations
		final double APPLES = 2.35;
		final double PEARS = 1.95;
		double kgApples, kgPears, result;
		System.out.print("Enter the amount of apple kilograms that have been sold this year: "); //Printing of outputs and asking for input
		kgApples = sc.nextDouble();
		System.out.print("Enter the amount of pear kilograms that have been sold this year: ");
		kgPears = sc.nextDouble();
		result = ((kgApples * APPLES) + (kgPears * PEARS)); //Math between variables
		System.out.println("This is the amount of profit your company has made this year: " + result); //Result is shown.
		sc.close(); //Closing scanner
	}
}
