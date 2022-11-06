import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		int x = input.nextInt();
		
		while(x != -1){		
			System.out.printf("%d is %s even number.%n", x, 
					(isEven(x) == true)? "" : " not");
			break;
		}
	}
	
	public static boolean isEven(int x){
		return (x % 2 == 0) ? true : false;
	}

}
