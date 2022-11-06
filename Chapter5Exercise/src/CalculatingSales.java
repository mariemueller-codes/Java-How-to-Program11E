import java.util.Scanner;

public class CalculatingSales {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		double total = 0;
		int quantity;
		int productNo; 
		
		do{
			productNo = requestInput("Enter product number 1 - 5 (-1 to quit): ", input);
			
			if((productNo != -1) && !(productNo > 5)){
				quantity = requestInput("Enter quantity for product no." + productNo + ":", input );
				total += addProduct(productNo, quantity)* quantity;
				
			}
		}
		while(productNo != -1);
		
		System.out.printf("Total: %.2f%n", total);
		
	}
	public static double addProduct(int productNo, int quantity){
		double total = 0;
		switch(productNo){
		case 1: 
			total += 2.98 * quantity;
			break;
		case 2: 
			total += 4.5 * quantity;
			break;
		case 3: 
			total += 9.98 * quantity;
			break;
		case 4: 
			total += 4.49 * quantity;
			break;
		case 5: 
			total += 6.87 * quantity;
			break;
		}
		return total;
		
	}
	
	public static int requestInput(String user, Scanner input){
		System.out.print(user);
		return input.nextInt();
	}

}
