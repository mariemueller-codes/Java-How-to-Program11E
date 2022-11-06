
public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(){
		this.length = 1.0;
		this.width = 1.0;
		
	}
	
	public void setLength(double length){
		if(length > 0.0 && length < 20.00){
			this.length = length;
		}
		else
			throw new IllegalArgumentException("length must be between 0.0 and 20.0");
	}
	
	public void setWidth(double width){
		if(width > 0.0 && width < 20.00){
			this.width = width;
		}
		else
			throw new IllegalArgumentException("wdith must be between 0.0 and 20.0");
	}
	
	public double getLength(){return length;}
	
	public double getWidth(){return width;}
	
	public double calculatePerimeter(){
		double perimeter = 2 * (width + length);
		return perimeter;
	}
	
	public double calculateArea(){
		double area = width * length;
		return area;
	}
	
	public String toString(){
		return String.format("Width: %.2f%nLength: %.2f%nPerimeter: %.2f%nArea: %.2f%n", 
				getWidth(), getLength(), calculatePerimeter(), calculateArea());
	}

}
