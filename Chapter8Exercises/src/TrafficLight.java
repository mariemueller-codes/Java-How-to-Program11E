
public enum TrafficLight {
	RED(45),
	GREEN(90),
	YELLOW(15);
	
	// instance field
	private final int duration;
	
	// constructor
	TrafficLight(int duration){
		this.duration = duration;
	}
	
	public int getDuration(){return this.duration;}
}
