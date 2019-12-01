import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit temperature: ");
		int fahrenheit = input.nextInt();
		int convert_to_celcius = ((fahrenheit - 32) * 5 / 9);
		System.out.print(fahrenheit + "F" + " " + "is equivilent to" + " " + convert_to_celcius + "C");
	}
}
