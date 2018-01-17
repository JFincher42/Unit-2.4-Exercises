import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the price of five items: ");
		double total = console.nextDouble();
		total += console.nextDouble();
		total += console.nextDouble();
		total += console.nextDouble();
		total += console.nextDouble();

		total *= 1.1;
		total += 7.95;
		
		System.out.println("Your total is $" + total);
	}

}
