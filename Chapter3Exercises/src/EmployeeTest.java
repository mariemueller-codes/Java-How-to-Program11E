public class EmployeeTest {
	public static void main(String[]args){
		Employee employee1 = new Employee("John", "Doe", 1000.00);
		Employee employee2 = new Employee("Jane", "Doe", 2000.00);
		
		System.out.println("Before the raise:");
		
		System.out.printf("%n%s %s%nSalary: %,.2f%nYearly Salary: %,.2f%n",
				employee1.getFirstname(),
				employee1.getLastName(),
				employee1.getSalary(),
				employee1.getYearlySalary());
		
		System.out.printf("%n%s %s%nSalary: %,.2f%nYearly Salary: %,.2f%n",
				employee2.getFirstname(),
				employee2.getLastName(),
				employee2.getSalary(),
				employee2.getYearlySalary());
		
		System.out.println("\nAfter the raise:");
		
		employee1.setRaise(10);
		employee2.setRaise(5);
		
		System.out.printf("%n%s %s%nSalary: %,.2f%nYearly Salary: %,.2f%n",
				employee1.getFirstname(),
				employee1.getLastName(),
				employee1.getSalary(),
				employee1.getYearlySalary());
		
		System.out.printf("%n%s %s%nSalary: %,.2f%nYearly Salary: %,.2f%n",
				employee2.getFirstname(),
				employee2.getLastName(),
				employee2.getSalary(),
				employee2.getYearlySalary());
		
		
	}

}
