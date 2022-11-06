
public class InvoiceTest {
	public static void main(String [] agrs){
		Invoice input = new Invoice("N123", "Nails", 15, 12.5);
		
		System.out.printf("%s: %s - %d * %.2f = %.2f\n", 
				input.getPartNumber(), 
				input.getPartDescription(),
				input.getQuantity(),
				input.getUnitPrice(),
				input.getInvoiceAmount());
		
		Invoice input1 = new Invoice("G456", "Hammer", -7, 0.0);
		
		System.out.printf("%s: %s - %d * %.2f = %.2f\n", 
				input1.getPartNumber(), 
				input1.getPartDescription(),
				input1.getQuantity(),
				input1.getUnitPrice(),
				input1.getInvoiceAmount());
	}

}
