package chapter2Exercises;

import java.util.Scanner;

public class Exercise2_24 {

/*Write an application that reads five integers 
 * and determines and prints the largest and 
 * smallest integers in the group.
 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter fourth integer: ");
		int num4 = input.nextInt();
		
		System.out.print("Enter fifth integer: ");
		int num5 = input.nextInt();
		
		int largest = num1;
		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;
		if (num4 > largest)
			largest = num4;
		if (num5 > largest)
			largest = num5;
		
		int smallest = num1;
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;
		if (num4 < smallest)
			smallest = num4;
		if (num5 < smallest)
			smallest = num5;
		
		System.out.printf("\nThe smallest number is %d%n", smallest);
		System.out.printf("\nThe largest number is %d%n", largest);
		
	} // end main method
} // end class Exercise2_24
