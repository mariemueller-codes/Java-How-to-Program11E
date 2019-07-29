import java.util.Scanner;

public class Exercise2_17 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = user.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = user.nextInt();
		System.out.print("Enter third integer: ");
		int num3 = user.nextInt();
		
		int sum = num1 + num2 + num3;
		int product = num1 * num2 * num3;
		int average = (num1 + num2 + num3) / 3;
		
		int smallest = num1; 
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;
		
		int largest = num1; 
		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;
		
		System.out.printf("\nSum is %d%n", sum);
		System.out.printf("Average is %d%n", average);
		System.out.printf("Product is %d%n", product);
		System.out.printf("\nSmallest number is %d%n", smallest);
		System.out.printf("Largest number is %d%n", largest);
	}
}
