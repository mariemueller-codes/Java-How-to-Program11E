
public class CommissionEmployeeTest9 {
	public static void main(String[]args){
		Employee9 employee = new Employee9("Bob", "Lewis", "333-33-3333");
		
		// test output
		System.out.printf("Super class 'Employee' %n");
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First Name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last Name is", employee.getLastName());
		System.out.printf("%s %s%n", "SSN is", employee.getSocialNumber());
		
		System.out.printf("%ntoString method: Super class 'Employee'");
		System.out.printf(employee.toString());
		
		CommissionEmployee9 employee1 = new CommissionEmployee9("Bob1", "Lewis1", "333-33-3334", 5000, 0.04);
		
		// test output
		System.out.printf("%nSubclass 'Commission Employee' %n");
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First Name is", employee1.getFirstName());
		System.out.printf("%s %s%n", "Last Name is", employee1.getLastName());
		System.out.printf("%s %s%n", "SSN is", employee1.getSocialNumber());
		System.out.printf("%s %,.2f%n", "Gross sales is", employee1.getGrossSales());
		System.out.printf("%s %,.2f%n", "Commission Rate is", employee1.getCommissionRate());
				
		System.out.printf("%ntoString method: Subclass 'Commission Employee'%n");
		System.out.printf(employee1.toString());
		
		BasePlusCommission9 employee2 = new BasePlusCommission9("Bob2", "Lewis2", "333-33-3335", 5001, 0.05, 300);
		
		// test output
		System.out.printf("%n%nSubclass 'Base Plus Commission Employee' %n");
		System.out.printf("Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "First Name is", employee2.getFirstName());
		System.out.printf("%s %s%n", "Last Name is", employee2.getLastName());
		System.out.printf("%s %s%n", "SSN is", employee2.getSocialNumber());
		System.out.printf("%s %,.2f%n", "Gross sales is", employee2.getGrossSales());
		System.out.printf("%s %,.2f%n", "Commission Rate is", employee2.getCommissionRate());
				
		System.out.printf("%ntoString method: Subclass 'Base Plus Commission Employee'%n");
		System.out.printf(employee2.toString());
	}

}
