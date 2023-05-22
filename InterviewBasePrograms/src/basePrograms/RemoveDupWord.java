package basePrograms;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDupWord {
	public static void main(String[] args) {
			
		String s = "hello world hi world hi set set hash hash apple "; //Literals
		
		String[] split = s.split(" ");
		
		Set<Object> set = new TreeSet<>();
		
		for (String string : split) {
			
			set.add(string);
//			System.out.println(string);
		}
		
		System.out.println(set);
	} 
}
