package basePrograms;

import java.util.Scanner;

public class RevOprators {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num: ");
		
		int n = sc.nextInt();
		
		int no=n,rem = 0;
		
			while(n>0) {
				
				rem = rem*10 + n % 10;
				
				n=n/10;
			}System.out.println(rem);
		
		
		
	}
}
