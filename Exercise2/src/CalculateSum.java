import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		int number = input.nextInt();
		int number = 12345;
		
        System.out.print("Sum of the digits of " + number + " is: " + getSum(number));
	}
		  public static int getSum(int number) {
		        int sum = 0;
		        while (number != 0) {
		            sum = sum + number % 10;
		            number = number/10;
}
		  return sum; 
		  }
	}
	
	

