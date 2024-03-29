import java.util.Scanner;
import java.util.Arrays;

public class DuplicateEliminate {
	private static int[] arrValues = new int[5];
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int remaining = 5;
		
		while(remaining != 5){
			System.out.printf("Enter the value %d/5 between 10 and 100: ", remaining - 1);
			int num = input.nextInt();
			
			// ensure the input is within range
			if(num<10 || num>100)
				continue;
			
			// print unique value
			if(isUnique(num))
				System.out.printf("Unique value: ", num);
			
			try{
				// add to array and increase counter
				arrValues[remaining++] = num;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			
			 // display complete set of unique values
            printUnique();
        }
    }

    // ensure value is unique
    // Arrays.binarySearch() for some reason does not work so needed this
    public static boolean isUnique(int num){
        for(int i=0; i<arrValues.length; i++){
            if(arrValues[i] == num)
                return false;
        }
        return true;
    }

    // display complete set of unique values

    public static void printUnique(){
        System.out.println("\nUnique values:\n");
        // base case is always first element
        System.out.print(arrValues[0] + " ");
        // unique value storage
        int unique = 0;
        // loop through remainder
        for(int i=1; i<arrValues.length; i++){
            // only check if value > 0
            // avoids redundant checking before array is filled
            if(arrValues[i] > 0){
                // loop backwards checking for duplicates
                for(int j=i-1; j>=0; j--){
                    if(arrValues[i] == arrValues[j]){
                        unique = 0;
                        break;
                    }else{
                        unique = arrValues[i];
                    }
                }
                if(unique > 0)
                    System.out.print(unique + " ");
            }else{
                continue;
            }
        }
        System.out.println();
    }
}