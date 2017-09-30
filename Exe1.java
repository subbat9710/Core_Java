//Descriptioon: Program to calculate the area of the triangle
//with user interaction. program will promote uer to enter the base width and height of the triangle

import java.util.Scanner;

class Exe1 {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the width of the traingle:");
		double base = scan.nextDouble();

		System.out.println("Enter the height of the triangle:");
		double height = scan.nextDouble();

		//Area of triangle = (width*height)/2
		double area = (base* height)/2;
		System.out.println("Area of Triangle is: " + area);
	}
}

//with no user interaction
// class Exe1 {
    
//     public static void main(String args[]) {
//     	double base = 20.0;
//     	double height = 100.5;
//     	double area = (base * height)/2;

//     	System.out.println("Area of the Triangle is: "+ area);
//     }
//}