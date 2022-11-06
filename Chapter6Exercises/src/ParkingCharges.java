import java.util.Scanner;

public class ParkingCharges {
	private static final double PARKING_CHARGE = 2.00;
	private static final double ADDL_CHARGE = 0.50;
	private static final double MAX_Charge = 10.00;
	
	private static double TOTAL = 0.0F;
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double time = 0.0f;
		
		do{
			time = requestInput("Enter hours parked (-1 to exit): ", input);
			if(time > 0)
				System.out.printf("Charges: %.2f%n", calculateCharges(time));
			TOTAL += calculateCharges(time);
		}while (time != -1);
		System.out.printf("%nTotal parking charges: %.2f%n", TOTAL);
	}
	
	public static double requestInput(String user, Scanner input){
		System.out.print(user);
		return input.nextDouble();
	}
	
	public static double calculateCharges(double time){
		if (time > 3.0){
			double parkingFee = PARKING_CHARGE + ADDL_CHARGE * (time - 3.0);
			return parkingFee;
		}
		else{
			return PARKING_CHARGE;
		}
	}

}
