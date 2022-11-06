import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class RandomSentences {
	private static SecureRandom randomGenerator = new SecureRandom();
	
	public static void main(String[] args){
		String [] article = {"the", "a", "one", "some", "any"};
		String [] noun = {"boy", "girl", "dog", "town", "car"};
		String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
		String [] preposition = {"to", "from", "over", "under", "on"};
		
		String randomArt = article[randomGenerator.nextInt(5)];
		String randomNoun = noun[randomGenerator.nextInt(5)];
		String randomPrep = preposition[randomGenerator.nextInt(5)];
		String randomArt2 = article[randomGenerator.nextInt(5)];
		String randomNoun2 = noun[randomGenerator.nextInt(5)];

		char upper = Character.toUpperCase(randomArt.charAt(0));
		String newWord = randomArt.replace(randomArt.charAt(0), upper);
		String sentence2 = newWord+" "+randomNoun+" "+randomPrep+" "+randomArt2+" "+randomNoun2;

		System.out.println(sentence2+".");
		
	}
	

}
