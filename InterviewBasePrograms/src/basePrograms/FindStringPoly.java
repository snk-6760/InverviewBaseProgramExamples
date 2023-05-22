package basePrograms;

import java.util.Scanner;

public class FindStringPoly {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String s = scan.next();
		
		String b = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			b = b + s.charAt(i);
		}
		System.out.print(b);	
		
		System.out.println("");
		
		if(s.equals(b)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		scan.close();
	}

}
