package chapter2Exercises;

/*Write an application that inputs three integers from the user 
 * and displays the sum, average, product, smallest and largest of the numbers. 
 * Use the techniques shown in Fig. 2.15. 
 * [Note: The calculation of the average in this exercise should result in an 
 * integer representation of the average. So, if the sum of the values is 7, 
 * the average should be 2, not 2.3333….]
 */

import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		int product = num1 * num2 * num3;
		int average = (num1 + num2 + num3) / 3;
		
		int smallest = num1; // assume smallest is the first number
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;
		
		int largest = num1; // assume largest is the first number
		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;
		
		System.out.printf("\nSum is %d%n", sum);
		System.out.printf("Average is %d%n", average);
		System.out.printf("Product is %d%n", product);
		System.out.printf("\nSmallest number is %d%n", smallest);
		System.out.printf("Largest number is %d%n", largest);
		
	} // end main method
} // end class Exercise2_17
