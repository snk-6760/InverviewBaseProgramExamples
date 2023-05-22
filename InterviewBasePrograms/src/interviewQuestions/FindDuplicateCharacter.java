package interviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "ronaldo";
		
		Set<Object> set = new LinkedHashSet<Object>();
		
		for (int i = 0; i <s.length(); i++) {
			
			char c = s.charAt(i);
			set.add(c);
		}System.out.println(set);
		
		for (Object x : set) {
			
			System.out.print(x);
		}
	}
	
}
