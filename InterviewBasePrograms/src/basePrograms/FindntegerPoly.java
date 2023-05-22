package basePrograms;

import java.util.Scanner;

public class FindntegerPoly {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int no = scan.nextInt();

		int no2 = no, rem = 0;

		while (no != 0) {

			rem = rem * 10 + no % 10;
			no = no / 10;

		}

		System.out.print(rem);
		System.out.println("");

		if (rem == no2) {
			System.out.println("The given Number is a Palindrome");
		} else {
			System.out.println("The given Number is not a Palindrome");
		}
		scan.close();
	}

}
