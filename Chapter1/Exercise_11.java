package Chapter_01;
/**
 * Chapter 1 Exercise 11:
 *      (Population projection) 
 *      The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 */
public class Exercise_11 {

	public static void main(String[] args) {
		
		double birth_rate_per_sec = 7.0;
		double death_rate_per_sec = 13.0;
		double immigrant_rate_per_sec = 45.0;
		
		double current_pop = 312032486;
		double sec_in_yrs = 365 * 24* 60 * 60;
		
		double num_births = sec_in_yrs / birth_rate_per_sec;
		double num_deaths = sec_in_yrs / death_rate_per_sec;
		double num_immigrant = sec_in_yrs / immigrant_rate_per_sec;
		
		for(int i = 1; i <=5; i++){
			current_pop += num_births - num_deaths + num_immigrant;
			System.out.println("Year " + i + " = " + (int) current_pop);
		}
	} // end main method
} // end class Exercise_11
