import java.util.Scanner;

public class AccountTest {
	public static void main(String[]args){
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// display initial value of name for each object
		System.out.printf("%s balance: $%.2f%n", account1.getName(),
				account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(),
				account2.getBalance());
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//deposit
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n",  depositAmount);
		account1.deposit(depositAmount); // add to account1's balance
		
		//withdrawal
		System.out.print("Enter withdraw amount for account1: "); // prompt
		double withdrawAmount = input.nextDouble();
		System.out.printf("%ndeducting %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdrawal(withdrawAmount);
		
		// display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		//deposit
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n",  depositAmount);
		account2.deposit(depositAmount); // add to account2's balance
		
		//withdrawal
		System.out.print("Enter withdraw amount for account2: "); // prompt
		double withdrawAmount1 = input.nextDouble();
		System.out.printf("%ndeducting %.2f to account1 balance%n%n", withdrawAmount1);
		account2.withdrawal(withdrawAmount1);
		
		// display balances
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
	} // end main method
} // end class AccountTest
