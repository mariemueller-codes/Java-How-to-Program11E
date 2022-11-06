import java.util.Scanner;

public class SmallestValue {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int numValue = requestInput("Enter number of values to sort: ", input);
		
		int smallest = requestInput("Enter value: ", input);
		--numValue;
		
		while(numValue > 0){
			int current = requestInput("Enter value: ", input);
			smallest = Math.min(current, smallest);
			--numValue;
		}
		
		System.out.printf("The smallest value is %d%n.", smallest);
	}
	public static int requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();

    }

}
