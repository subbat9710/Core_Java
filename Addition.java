// public class Addition {

// 	public static void main(String args[]) {
      
//         int num1 = 5, num2 = 10, sum;
//         sum = num1 + num2;

//         System.out.println("Sum of these numbers: "+sum);

// 	}
// }

//Sum of two number using Scanner
import java.util.Scanner;
public class Addition {
     
    public static void main(String args[]) {
         
        int num1, num2, sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        num1 = scan.nextInt();

        System.out.println("Enter the Second number: ");
        num2 = scan.nextInt();

        scan.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
         
    }
}