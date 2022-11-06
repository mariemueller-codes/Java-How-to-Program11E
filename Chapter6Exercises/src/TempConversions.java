import java.util.Scanner;

public class TempConversions {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		TempConversions tc = new TempConversions();
		
		while(true){
			tc.printMenu();
			int choice = input.nextInt();
			
			if(choice == 9)
				break;
			
			if(choice == 1){
				System.out.print("\nTemperature in Celsius: ");
				System.out.printf("%nTemperature in Fahrenheit: %.2f%n%n",
						tc.fahrenheit(input.nextDouble()));
			}
			else{
				System.out.print("\nTemperature in Fahrenheit: ");
				System.out.printf("%nTemperature in Celsius: %.2f%n%n",
						tc.celsius(input.nextDouble()));
			}
		}
	}
	
	private double celsius(double fahrenheit){
		return 5.0 / 9.0 * (fahrenheit - 32);
	}
	
	private double fahrenheit(double celsius){
		return 9.0 / 5.0 * celsius + 32;
	}
	
	private void printMenu(){
		System.out.println("********");
		System.out.println("1. Celsius to Farenheit");
        System.out.println("2. Farenheit to Celsius");
        System.out.println("9. Quit.");
        System.out.println("********");
        System.out.print("> ");
	}

}
