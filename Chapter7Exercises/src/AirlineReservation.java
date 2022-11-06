import java.util.Scanner;

public class AirlineReservation {
	boolean [] seatArray = new boolean[10];
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Airline Reservation System\n");
		
		while(seatAvailable()){
			
		}
		
		
		
	}
	
	// method to check number of seats in each section
	private int avaiableSeat(String section){
		int total = 0;
		if(section == "firstClass"){
			// first class section (seats 1 - 5) (array 0 - 4)
			for(int i = 0; i < 5; i++){
				if(seatArray[i] == false)
					total += 1;
			}
		}
		else if(section == "economy"){
			// economy section (seats 6 - 10) (array 5-9)
			for(int i = 5; i<seatArray.length; i++){
				if(seatArray[i] == false)
					total += 1;
			}
		}
		return total;
	}
	
	// method to check to if all seats are booked
	public boolean seatAvailable(){
		// if seat is empty return true
		for (boolean seat : seatArray)
			if(seat == false)
				return true;
		// if no seat return false
		return false;
	}
	
	// method to print boarding pass
	private void printBoardingPass(int seat){
		System.out.println("\nAirline Boarding Pass");
		System.out.printf("%nSection No: %s%nSeat Number: %d%n",
				(seat < 5) ? "first" : "economy", seat + 1);
	}

}
