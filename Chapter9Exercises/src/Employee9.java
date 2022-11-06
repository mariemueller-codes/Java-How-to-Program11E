
public class Employee9 {
	// attributes
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// constructor
	public Employee9(String fname, String lname, String ssn){
		this.firstName = fname;
		this.lastName = lname;
		this.socialSecurityNumber = ssn;
	}
	
	public String getFirstName(){return firstName;}
	
	public String getLastName(){return lastName;}
	
	public String getSocialNumber(){return socialSecurityNumber;}
	
	public String toString(){
		return String.format("%nFirst Name: %s%nLastName: %s%nSSN: %s%n", 
				firstName, lastName, socialSecurityNumber);
	}

}
