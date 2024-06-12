package programs;

import java.util.HashMap;
import java.util.Map;

public class MapUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Map<String, Integer> ages = new HashMap<>();

	        // Adding key-value pairs
	        ages.put("Alice", 25);
	        ages.put("Bob", 30);
	        ages.put("Charlie", 28);

	        // Iterating through entries
	        System.out.println("HashMap Entries:");
	        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + " years old");
	        }
	       
	        // Removing a key-value pair
	        ages.remove("Bob");

	        // Displaying the updated entries
	        System.out.println("\nUpdated HashMap Entries:");
	        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + " years old");
	        }		
		
	}

}
