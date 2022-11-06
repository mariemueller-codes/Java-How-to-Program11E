public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// setters
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int month){
		this.day = day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	// getters
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getYear(){
		return year;
	}
	
	public void displayDate(){
		System.out.printf("%d/%d/%d",
				getMonth(),
				getDay(),
				getYear());
	}


}
