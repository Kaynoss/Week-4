package CodingHmwrk;

import java.util.HashSet;

public class Week4Hashset {

	public static void main(String[] args) {
	
		HashSet<String> sports = new HashSet<String>();
		sports.add("Baseball");
		sports.add("Football");
		sports.add("MMA");
			for (String sport: sports) {
				System.out.println(sport);
			}
			
	}

}
