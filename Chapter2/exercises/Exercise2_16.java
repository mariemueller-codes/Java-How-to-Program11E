package chapter2Exercises;

import java.util.Scanner;

public class Exercise2_16 {
	
/* Write an application that asks the user to enter two integers, 
 * obtains them from the user and 
 * displays the larger number followed by the words "is larger". 
 * If the numbers are equal, print the message "These numbers are equal". 
 */
	
	public static void main(String[] args) {
		
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read the first number from user
		
		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read the second number from user
		
		if (number1 == number2){
			System.out.print("These numbers are equal.\n");
			System.out.printf("%d == %d%n", number1, number2);
		}
		
		if (number1 > number2){
			System.out.printf("%d is larger than %d%n", number1, number2);
		}
		
		if (number2 > number1){
			System.out.printf("%d is larger than %d%n", number2, number1);
		}
						
	} // end main method
} // end class Exercise2_16
