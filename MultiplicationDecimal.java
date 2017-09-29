import java.util.Scanner;

public class MultiplicationDecimal {

	public static void main(String args[]) {
        
        // This read the number provided by the user using keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");

        // This method reads the number provided using keyboard
		double num1 = scan.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = scan.nextDouble();

		//closing scanner after the use 
		scan.close();

		// Calculating the product of two numbers
		double product = num1*num2;

		//Displaying the multiple result
		System.out.println("Output: "+product);

	}
}