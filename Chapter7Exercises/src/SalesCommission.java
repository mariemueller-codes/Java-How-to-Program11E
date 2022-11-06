import java.util.Scanner;

public class SalesCommission {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] frequency = new int[9];
		
		while(true){
			System.out.print("Enter salespersons to (-1 to exit): ");
			int response = input.nextInt();
			
			if(response<0)
				break;
			
			if(response < 200)
				continue;
			else if(response>1000)
				response = 1000;
			
			// -2 to account for sales amounts starting at 200
			// avoid having unnecessary extra array elements
			++frequency[(response/100)-2];
		}
		for(int i = 0; i < frequency.length; i++){
			if( i == 8)
				System.out.printf("$%d00+   : %d\n", i + 2, frequency[i]);
			else
				System.out.printf("$%d00-$%d99: %d\n", i + 2, i + 2, frequency[i]);
			
		}
		
	}

}
