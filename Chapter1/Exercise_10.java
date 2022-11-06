package Chapter_01;
/**
 * Chapter 1 Exercise 10:
 *      (Average speed in miles) 
 *      Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *      Write a program that displays the average speed in miles per hour.
 *      (Note that 1 mile is 1.6 kilometers.)
 */
public class Exercise_10 {

	public static void main(String[] strings) {
		
		double kilometers = 14;
		double miles = kilometers / 1.6;
		
		double rate = (((45.0 * 60.0) + 30.0) / (60.0 * 60.0));
		double mph = miles / rate;
		
		System.out.println(mph);
		
	} // end main method
} // end class Exercise_10
