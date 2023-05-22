package interviewQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateWord {

	
	public static void main(String[] args) {
		
		String s = "Hi guys hello everybody hello guys Hi everybody";
		
		String[] split = s.split(" ", 0);
		
		Set<String> set = new LinkedHashSet<>();
		
		for (String str : split) {
			
			set.add(str);
			
			//System.out.println(str);
		}
		
		//in this for 
		for (String x : set) {
			System.out.println(x);
		}
		
	}
}
