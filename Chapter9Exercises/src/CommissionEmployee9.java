
public class CommissionEmployee9 extends Employee9{
	private double grossSales; 
	private double commissionRate;
	
	public CommissionEmployee9(String fname, String lname, String ssn, double sales, double rate){
		super(fname, lname, ssn);
		
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		// if commissionRate is invalid throw exception
		/*if(commissionRate <= 0.0 || commissionRate >=1.0){
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}*/
		
		this.grossSales = sales;
		this.commissionRate = rate;
	}
	
	public void setGrossSales(double grossSales){
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
	}
	
	public double getGrossSales(){return grossSales;}
	
	public void setCommissionRate(double commissionRate){
		if(commissionRate <= 0.0 || commissionRate >= 1.0){
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and <= 1.0");
		}
		
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate(){return commissionRate;}
	
	public double earnings(){
		return getCommissionRate() * getGrossSales();
		}
	
	@Override // indicates that this method overrides a superclass method
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
				"commission employee", getFirstName(), getLastName(),
				"social security number", getSocialNumber(),
				"gross sales", getGrossSales(), 
				"commission rate", getCommissionRate());
	}

}
