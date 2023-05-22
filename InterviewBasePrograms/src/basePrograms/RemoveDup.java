package basePrograms;

public class RemoveDup {
	
	public static void main(String[] args) {
		
		String s = "sivakumar";
		
		int i = s.length();
		System.out.println(i);
		
		String replace = s.replace("a", "");
		int length = replace.length();
		System.out.println(length);
		System.out.println(replace);
		
		int count = i-length;
		
		System.out.println("Repated value :"+count);
		
	}

}
