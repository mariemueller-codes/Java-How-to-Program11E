
public class TrafficLightTest {
	public static void main (String [] agrs){
		for(TrafficLight light : TrafficLight.values()){
			System.out.printf("%s : %d%n",light, light.getDuration());
		}
	}

}
