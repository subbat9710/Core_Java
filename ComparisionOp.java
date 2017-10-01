/*We have six relational operators in Java: ==, !=, >, <, >=, <=
== returns true if both the left side and right side are equal
!= returns true if left side is not equal to the right side of operator
> returns true if left side is greater then right
< return true if left side is smaller then right
>= returns true if left side is greater then or equal to right
<= return true if left side is smaller then or equal to right
*/

public class ComparisionOp {

	public static void main(String args[]) {

		int num1 = 10;
		int num2 = 50;
		if(num1==num2) {
			System.out.println("num1 and num2 are equal");
		}
		else {
			System.out.println("num1 and num2 are not equal");
		}

		if(num1 != num2) {
			System.out.println("num1 and num2 are not equal");
		}
		else {
			System.out.println("num1 and num2 are equal");
		}

		if(num1 > num2) {
			System.out.println("num1 is greater the num2");
		}
		else {
			System.out.println("num1 is not grater than num2");
		}

        if(num1 >= num2) {
        	System.out.println("num1 is grater than or equal to num2");
        }
        else {
        	System.out.println("num1 is less than num2");
        }

        if(num1 < num2) {
        	System.out.println("num1 is less than num2");
        }
        else {
        	System.out.println("num1 is not less than num2");
        }

        if(num1 <= num2) {
        	System.out.println("num1 is less than or equal to num2");
        }
        else {
        	System.out.println("num1 is not less than or equal to num2");
		}
	}
}