package chapter2Exercises;

import java.util.Scanner; // program uses class Scanner

public class Exercise2_15 {
	
/*Write an application that asks the user to enter two integers, 
 * obtains them from the user 
 * and prints their sum, product, difference and quotient (division).
*/
	public static void main(String[] args) {
		// create Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read the first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read the second number from user
		
		int sum = number1 + number2; // add numbers, then store total in sum
		int product = number1 * number2; // multiply numbers, then store total in product
		int difference = number1 - number2; // subtract numbers, then store total in difference
		int quotient = number1 / number2; // divide numbers, then store total in quotient
		
		System.out.printf("\nSum is %d%n", sum); // display sum
		System.out.printf("Product is %d%n", product); // display product
		System.out.printf("Difference is %d%n", difference); // display difference
		System.out.printf("Quotient is %d%n", quotient); // display quotient
				
	} // end main method
} // end class Exercise2_15
