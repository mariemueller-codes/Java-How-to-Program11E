
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	// setters
	public void setFirstName(String firstname){
		this.firstName = firstname;
	} 
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	} 
	
	public void setSalary(double salary){
		if(salary > 0)
			this.salary = salary;
	} 
	
	public void setRaise(double percentage){
		setSalary(salary += (salary / 100) * percentage);
	}
	
	// getters
	
	public String getFirstname(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public double getYearlySalary(){
		return getSalary() * 12;
	}

}
