package CodingHmwrk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Week4HashMaps {

	public static void main(String[] args) {
		
		Map<String, String> candies = new HashMap<String, String>();
				candies.put("First", " Reeses");
				candies.put("Second", "Twix");
				candies.put("Third", " Snickers");
				
		Set<String> favorites = candies.keySet();
			for (String favorite : favorites) {
				System.out.println(favorite + ":  " + candies.get(favorite)); 
			}	
	}

}
