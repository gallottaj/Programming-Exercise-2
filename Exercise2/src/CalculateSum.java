import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 5-digit positive integer:");
		int number = input.nextInt();
		if (number % 2 == 0)
			System.out.println("I am even");
		else
			System.out.println("I am NOT even");
	}
}
