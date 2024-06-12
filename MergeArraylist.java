package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list1=Arrays.asList("Apple","Banana","Orange");
		List<String>list2=Arrays.asList("Chikku","Guava","Apple");
		List<String>merge=new ArrayList<>(list1);
		
		merge.addAll(list2);
		System.out.println(merge);
	}

}
