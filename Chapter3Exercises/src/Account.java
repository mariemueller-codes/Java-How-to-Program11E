public class Account {
	private String name; // instance variable
	private double balance; // instance variable
	
	// Account3 constructor that receives two parameters
	public Account(String name, double balance) { // constructor name is class name
		this.name = name; // assign name to instance variable
		
		// validate that the balance is greater than 0.0 if it's not
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0){ // if balance is valid
			this.balance = balance; // assign it to instance variable balance
		} // end if statement
	} // end Account3 constructor
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount){
		if (balance > 0.0){ // if the depositAmount is valid
			balance = balance + depositAmount; // add it to the balance
		} // end if statement
	} // end deposit method
	
	// method return the account balance
	public double getBalance(){
		return balance;
	} // end getBalance method
	
	public boolean withdrawal(double withdrawAmount){
		if (withdrawAmount > balance)
			return false;
		
		balance -= withdrawAmount;
		return true;
	}
	
	// method to set the name in the object
	public void setName(String name){
		this.name = name; // store the name
	} // end setName method
	
	// method to retrieve the name from the object
	public String getName() {
		return name; // return value of the name to caller
	} // end getName method
} // end class Account
