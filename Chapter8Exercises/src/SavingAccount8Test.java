
public class SavingAccount8Test {
	public static void main(String [] args){
		SavingAccount8 saver1 = new SavingAccount8(2000);
		SavingAccount8 saver2 = new SavingAccount8(3000);
		
		SavingAccount8.modifyInterestRate(0.04);
		
		System.out.println("saver1 monthly balance");
		System.out.printf("initial balance: %.2f%n", saver1.getSavingsBalance());
		for(int i = 0; i < 12; i++){
			saver1.calculateMonthlyInterest();
			System.out.printf("%nmonth %d: %,.2f", i + 1, saver1.getSavingsBalance());
		}
		
		System.out.println("\n\nsaver2 monthly balance");
		System.out.printf("initial balance: %.2f%n", saver2.getSavingsBalance());
		for(int i = 0; i < 12; i++){
			saver1.calculateMonthlyInterest();
			System.out.printf("%nmonth %d: %,.2f", i + 1, saver2.getSavingsBalance());
		}
		
		SavingAccount8.modifyInterestRate(0.05);
		
		System.out.println("\n\nIncrease interest to 5%");
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("%nsaver1 - 1 month at 5%% interest: %,.2f%n", saver1.getSavingsBalance());
		System.out.printf("saver2 - 1 month at 5%% interest: %,.2f%n", saver2.getSavingsBalance());
	}

}
