import java.util.Scanner;

public class CreditLimit {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int acctNum;
		int begBal;
		int charges;
		int credits;
		int creditLimit;
		char user = 'y';
		
		while (user != 'n'){
			System.out.print("Enter Account Number: ");
			acctNum = input.nextInt();
			
			System.out.print("Enter Allowed Credit Limit: ");
			creditLimit = input.nextInt();
		
			System.out.print("Enter Balance - Beg. Month: ");
			begBal = input.nextInt();
		
			System.out.print("Enter Total Charges for this Month: ");
			charges = input.nextInt();
		
			System.out.print("Enter Total Credits Applied this Month: ");
			credits = input.nextInt();
			
			int newBalance = begBal + charges - credits;
			
			System.out.printf("%nCredit Information for Account Number %d%n", acctNum);
			System.out.printf("Credit Limit: %d%n", creditLimit);
			System.out.printf("Starting Balance: %d%n", begBal);
			System.out.printf("Total Charges for this Month: %d%n", charges);
			System.out.printf("Total Credits Applied this Month: %d%n", credits);
			System.out.printf("New Balance: %d%n", newBalance);
			
			if(newBalance > creditLimit){
				System.out.println("\nCredit limit exceeded.");
			}
			
			
			System.out.print("\nCalculate credit for another account (y/n)? ");
			user = input.next().charAt(0);
		}
		
	}

}
