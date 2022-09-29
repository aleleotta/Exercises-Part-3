package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstTrim, secondTrim, thirdTrim;
		System.out.println("Input the first trimester: ");
		firstTrim = sc.nextInt();
		System.out.println("Input the second trimester: ");
		secondTrim = sc.nextInt();
		System.out.println("Input the third trimester: ");
		thirdTrim = sc.nextInt();
		int total = (firstTrim + secondTrim + thirdTrim) / 3;
		double totalAcademic = (double) (firstTrim + secondTrim + thirdTrim) / 3;
		System.out.println("This is your grade average: " + total);
		System.out.println("This is your academic grade average: " + totalAcademic);
		sc.close();
	}
}
