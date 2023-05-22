package basePrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		String s = "narmadhaa";
		
		Set<Object> set = new LinkedHashSet<Object>();
		
		for (int i = 0; i <s.length(); i++) {
			
			char c = s.charAt(i);
			set.add(c);
		}
		System.out.println(set);
	}
}
