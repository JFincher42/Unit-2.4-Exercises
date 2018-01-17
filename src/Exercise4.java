import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		
		int average = console.nextInt();
		average += console.nextInt();
		average += console.nextInt();
		average /= 3;
		System.out.println("The average is " + average);

	}
}
