import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a 5-digit positive integer:");
		int input = in.nextInt();
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println("The sum of the digits is" + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " " + "=" + " " + getSum(input));

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
