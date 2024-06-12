package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicateremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("apple","orange","chikku","apple","banana","chikku");
		Set<String> remove=new TreeSet<>(list);
		System.out.println(remove);
		
	}

}
