import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = input.nextInt();
		System.out.print(getSum(number));

	}

	private static int getSum(int number) {
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}
}
