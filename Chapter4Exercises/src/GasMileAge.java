import java.util.Scanner;

public class GasMileAge {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int milesDriven;
		int gallon;
		int counter = 0;
		char x = 'y';
		double totalMilesDriven = 0;
		double totalGallonsUsed = 0;
		
		while(x != 'n'){
			System.out.print("Enter miles driven for this trip: ");
			milesDriven = input.nextInt();
			totalMilesDriven += milesDriven;
			
			System.out.print("Enter gallons used for this trip: ");
			gallon = input.nextInt();
			totalGallonsUsed += gallon;
			
			double MPG = milesDriven / gallon;
			
			System.out.printf("%nYour MPG for this trip is %.2f%n", MPG);
			
			System.out.print("\nAdd another trip (y/n)?");
			x = input.next().charAt(0);
		}
		
		System.out.printf("%nTotal Miles Driven: %.2f", totalMilesDriven);
		System.out.printf("%nTotal Gallons used: %.2f", totalGallonsUsed);
		
		double totalMPG = totalMilesDriven / totalGallonsUsed;
		System.out.printf("%nYour total MPG is : %.2f", totalMPG);
		
	}

}
