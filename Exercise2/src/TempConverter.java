import java.util.Scanner;

public class TempConverter {
	public static void main(String[] args) {
		Scanner input_f = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit temperature: ");
		int fahrenheit = input_f.nextInt();
		int convert_to_celcius = ((fahrenheit - 32) * 5 / 9);
		System.out.println(fahrenheit + "F" + " " + "is equivilent to" + " " + convert_to_celcius + "C");

		Scanner input_c = new Scanner(System.in);
		System.out.print("Enter a Celcius temperature: ");
		int celcius = input_c.nextInt();
		int convert_to_fahrenheit = ((celcius * 9 / 5) + 32);
		System.out.print(celcius + "C" + " " + "is equivilent to" + " " + convert_to_fahrenheit + "F");
	}
}
