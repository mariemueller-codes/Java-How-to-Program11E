import java.util.Scanner;

public class SeparatingDigits {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		SeparatingDigits sd = new SeparatingDigits();
		
		System.out.print("Enter an integer between 0 - 99999: ");
		sd.displayDigits(input.nextInt());
	}
	
	// A - calculate the integer part of the quotient when
	// integer a is divided by integer b
	private int getQuotient(int a, int b){
		return a % b;
	}
	
	// B - calculate the integer remain when 
	// integer a is divided by integer b
	private int getRemainder(int a, int b){
		return a / b;
	}
	
	public void displayDigits(int x){
		int [] numVal = new int[String.valueOf(x).length()];
		
		// add separated digits to list
		for(int i = numVal.length-1; i>=0; i--){
			numVal[i] = getQuotient(x, 10);
			x = getRemainder(x, 10);
		}
		
		for(int i=0; i<numVal.length; i++){
			System.out.printf("%d ", numVal[i]);
		}
		
		System.out.println();
	}

}
