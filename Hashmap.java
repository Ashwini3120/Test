package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Hashmap {
			//Find occurences in String
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("banana","apple","chikku","apple","apple");	
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String word:list) {
			if(word!=" ") {
				if(map.containsKey(word)) {
					map.put(word, map.get(word)+1);
				}
				else {
					map.put(word, 1);
				}
			}
		}System.out.println(map);
		
	}
}
