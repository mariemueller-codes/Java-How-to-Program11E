package chapter2Exercises;

import java.util.Scanner;

public class Exercise2_35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total miles driven per day: ");
		int totalMiles = input.nextInt();
		
		System.out.print("Enter cost of gallon of gasoline: $");
		double gasCost = input.nextDouble();
				
		System.out.print("Enter average miles per gallon of gasoline: ");
		int milesPerGallon = input.nextInt();
		
		System.out.print("Enter parking fees: $");
		double parkingFees = input.nextDouble();
		
		System.out.print("Enter amount of tolls per day: $");
		double tolls = input.nextDouble();
		
		double drivingCost = (gasCost * totalMiles) / milesPerGallon + parkingFees + tolls;
		
		System.out.printf("\nDaily Driving Cost: $ %.2f",  drivingCost);
		

	} // end main method
} // end class Exercise2_35