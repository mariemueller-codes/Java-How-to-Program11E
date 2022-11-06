
public class BasePlusCommission9 extends CommissionEmployee9{
	private double baseSalary;
	
	public BasePlusCommission9(String fname, String lname, String ssn, double sales, double rate, 
			double salary){
		super(fname, lname, ssn, sales, rate);
		
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = salary;
	}
	
	public void setBaseSalary(double salary){
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = salary;
	}
	
	public double getBaseSalary(){return baseSalary;}
	
	@Override
	public double earnings(){return getBaseSalary() + super.earnings();}
	
	@Override 
	public String toString(){
		return String.format("%s %s%n%s: %,.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
	}

}
