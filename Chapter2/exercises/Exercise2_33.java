import java.util.Scanner;

public class Exercise2_33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your Height in Inches: ");
		double height = input.nextDouble();
		
		System.out.print("Enter your weight in Pounds: ");
		double weight = input.nextDouble();
		
		double bmi = (weight * 703) / (height * height);
		
		System.out.printf("Your Body Mass Index (BMI) is %.2f\n", bmi);
		
		System.out.println("BMI VALUES\n");
		System.out.println("Underweight: 	less than 18.5");
		System.out.println("Normal: 	between 18.5 and 24.9");
		System.out.println("Overweight: 	between 25 and 29.9");
		System.out.println("Obese: 		30 or greater ");
		
	} 
}
