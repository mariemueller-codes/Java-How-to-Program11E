import java.util.Scanner;

public class Exercise2_16 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int num1 = user.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = user.nextInt();
		
		if(num1 == num2) {
			System.out.println("These numbers are equal.");
		} else if(num1 > num2) {
			System.out.println("First integer is greater than second integer");
		} else if(num1 < num2) {
			System.out.println("First integer is less than second integer");
		} else {
			System.out.println("Invalid input");
		}
	}
}
