import java.util.Scanner;

public class Exercise2_15 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = user.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = user.nextInt();
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1 - num2;
		int quotient = num1 / num2;
		
		System.out.println("Sum of two integers: " + sum);
		System.out.println("Product of two integers: " + product);
		System.out.println("Difference of two integers: " + difference);
		System.out.println("Quotient of two integers: " + quotient);
		
	}
}
