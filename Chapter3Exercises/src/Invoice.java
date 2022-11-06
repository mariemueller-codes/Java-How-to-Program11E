
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double unitPrice;
	
	public Invoice(String partNumber, String description, int quantity, double unitPrice){
		this.partNumber = partNumber;
		this.partDescription = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	// setters
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity){
		this.quantity = (quantity < 0) ? 0 : quantity;
	}
	
	public void setunitPrice(double unitPrice){
		this.unitPrice = (unitPrice < 0.0) ? 0.0 : unitPrice;
	}
	
	// getters
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getUnitPrice(){
		return unitPrice;
	}
	
	public double getInvoiceAmount(){
		return getQuantity() * getUnitPrice();
	}

}
