package Chapter_01;
/**
 * Chapter 1 Exercise 9:
 *      (Area and perimeter of a rectangle) 
 *      Write a program that displays the area and 
 *      perimeter of a rectangle with the width of 4.5 and height of 7.9
 */
public class Exercise_09 {

	public static void main(String[] string) {
		
		final double width = 4.5;
		final double height = 7.9;
		
		double area = width * height;
		
		System.out.printf("%.1f * %.1f = %.2f", width, height, area);

	} // end main method
} // end class Exercise_09
