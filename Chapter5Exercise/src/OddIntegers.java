public class OddIntegers {
	public static void main(String[]args){
		int product = 1;
		
		for(int i = 1; i <=15; i+=2){
			product *= i;
			System.out.println(i);
		}
		
		System.out.printf("%nThe product of odd integers from 1 - 15 is: %d%n", product);
	}

}
