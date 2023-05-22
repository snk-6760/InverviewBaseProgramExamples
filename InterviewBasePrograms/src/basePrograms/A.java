package basePrograms;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
//		String s = "nimmin";
//		StringBuilder sb = new StringBuilder(s);
//		
//			StringBuilder rev = sb.reverse();
//			
//			System.out.println(rev);
//			
//			if(rev.equals(s)) {
//				System.out.println("palindrome");
//			}else {
//				System.out.println("Not a palindrome");
//			}

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the word: ");
		String s = scan.next();
		
		
		String s2="";
		
		for (int i =s.length()-1; i >=0; i--) {
			
			s2 = s2+ s.charAt(i);//""+t, it become ="t"
			
		}System.out.print(s2);
		System.out.println();
		if(s.equals(s2)) {
			System.out.println("given word paly");
		}else {
			System.out.println("Not paly");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
