public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	public String getName() {return name;}

	public double getBalance() {return balance;}

	public void setName(String name) {this.name = name;}

	public void setBalance(double balance) {this.balance = balance;}
	
	public void deposit(double depositAmt) {
		if(balance > 0.0) {
			balance = balance + depositAmt;
		}
	}
	
	public boolean withdraw(double withdrawAmt) {
		if(withdrawAmt > balance) {
			return false;
		}
		balance -= withdrawAmt;
		return true;
	}
}
