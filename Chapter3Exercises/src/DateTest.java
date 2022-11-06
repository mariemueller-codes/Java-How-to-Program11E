import java.util.Scanner;

public class DateTest {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		Date newDate = new Date(requestInput("Enter month: ", input),
				requestInput("Enter day: ", input),
				requestInput("Enter year: ", input));
		
		newDate.displayDate();
	}

	public static int requestInput(String user, Scanner input){
		System.out.print(user);
		return input.nextInt();
	}
}
