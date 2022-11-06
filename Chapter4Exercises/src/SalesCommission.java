import java.util.Scanner;

public class SalesCommission {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int item = 0;
		double total = 0;
		double weeklyPay = 500.00;
		double commissionRate = 0.09;
		double totalCommission = 0;
		
		while (item!=9){
			System.out.print("Enter the number of the item sold (9 to exit): ");
			item = input.nextInt();
			
			switch(item){
				case 1:
					total += 239.99;
					break;
				case 2:
					total += 129.75;
					break;
				case 3:
					total += 99.95;
					break;
				case 4:
					total += 350.89;
					break;
					}
			
			totalCommission = weeklyPay + (total * commissionRate);			
		}
		System.out.printf("%nWeekly sales: %.2f%n", total);
		System.out.printf("Weekly earnings: %.2f%n", totalCommission);
	
	}

}
