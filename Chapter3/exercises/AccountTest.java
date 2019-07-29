import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		Account acct1 = new Account("Jane Doe", 50.00);
		Account acct2 = new Account("John Green", -7.53);
		
		System.out.printf("%s balance: $%.2f%n", acct1.getName(), acct1.getBalance());
		System.out.printf("%s balance: $%.2f%n", acct2.getName(), acct2.getBalance());
		
		System.out.print("Enter deposit amount for account 1: ");
		double depositAmt = user.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n",  depositAmt);
		acct1.deposit(depositAmt);
		
		System.out.print("Enter withdraw amount for account1: ");
		double withdrawAmt = user.nextDouble();
		System.out.printf("%ndeducting %.2f to account1 balance%n%n", withdrawAmt);
		acct1.withdraw(withdrawAmt);

		System.out.printf("%s balance: $%.2f%n", acct1.getName(), acct1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", acct2.getName(), acct2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmt = user.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",  depositAmt);
		acct2.deposit(depositAmt); 
		
		System.out.print("Enter withdraw amount for account2: "); 
		double withdrawAmount1 = user.nextDouble();
		System.out.printf("%ndeducting %.2f to account2 balance%n%n", withdrawAmount1);
		acct2.withdraw(withdrawAmount1);
		
		System.out.printf("%s balance: $%.2f%n", acct1.getName(), acct1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", acct2.getName(), acct2.getBalance());
	}

}
