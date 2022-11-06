
public class SavingAccount8 {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingAccount8(double balance){
		this.savingsBalance = balance;
	}
	
	public void setSavingsBalance(double balance){
		this.savingsBalance = balance;
	}
	
	public double getSavingsBalance(){return this.savingsBalance;}
	
	public double calculateMonthlyInterest(){
		return savingsBalance += savingsBalance * (annualInterestRate / 12);
	}
	
	public static double modifyInterestRate(double value){
		return annualInterestRate = value;
	}

}
