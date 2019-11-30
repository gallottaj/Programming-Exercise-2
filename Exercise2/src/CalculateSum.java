import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number:");
		double number = input.nextDouble();
		double sum = number + number;
		System.out.println("The sum is" + " " + sum);
	}
}
