import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a 5-digit positive integer:");
		int input = in.nextInt();
		if ((input < 10000) || (input > 99999 || input < 0)) {
			// error message
			System.out.println("Invalid format");
		} else {
			int num_1 = input / 10000 % 10;
			int num_2 = input / 1000 % 10;
			int num_3 = input / 100 % 10;
			int num_4 = input / 10 % 10;
			int num_5 = input % 10;

			System.out.println("The sum of the digits is" + " " + num_1 + " " + "+" + " " + num_2 + " " + "+" + " "
					+ num_3 + " " + "+" + " " + num_4 + " " + "+" + " " + num_5 + " " + "=" + " " + getSum(input));
		}

	}

	private static int getSum(int in) {
		int sum = 0;
		while (in != 0) {
			sum = sum + in % 10;
			in = in / 10;
		}
		return sum;
	}
}
