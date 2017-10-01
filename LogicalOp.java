/* Logical Operators
 Logical Operators are used with binary variables. They are mainly used in conditional statements and loops 
  for evaluating a condition.
 Logical operators in java are: &&, ||, !
 Let’s say we have two boolean variables b1 and b2.
 b1&&b2 will return true if both b1 and b2 are true else it would return false.
 b1||b2 will return false if both b1 and b2 are false else it would return true.
 !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true.*/

 public class LogicalOp {

 	public static void main(String args[]){

 		boolean b1 = true;
 		boolean b2 = false;

 		System.out.println("b1 && b2: " + (b1&&b2));
 		System.out.println("b1 || b2: " + (b1||b2));
 		System.out.println("!(b1 && b2): " + !(b1&&b2));
 	}
 }