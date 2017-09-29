import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String args[]) {
		/* This reads the input provided by user
		using kayboard */
		Scanner scan = new Scanner(System.in);
		System.out.print("Emter the First number: ");

		//This number reads the number provided by the keyboard
		int num1 = scan.nextInt();
		System.out.println("Enter the second Number: ");
		int num2 = scan.nextInt();

		//Closing scanner after the use
		scan.close();

		// Calculating product of two numbers
		int product = num1*num2;

		//Displaying the multiplication result
		System.out.println("Output: "+product);
	}
}