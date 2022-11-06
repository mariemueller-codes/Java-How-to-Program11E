import java.util.Scanner;

public class Multiples {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
			
		while(true){
			System.out.print("Enter a pair of space separated integers (-1 exit): ");
			int x = input.nextInt();
			
			if(x!=-1){
				int y = input.nextInt();
				
				System.out.printf("%d as multiple of %d = %s%n",
						x, y, (isMultiple(x,y) == true ? "true" : "false"));
			}
			break;
		}
	}
	public static boolean isMultiple(int x, int y){
		return(y % x == 0) ? true : false;
	}

}
