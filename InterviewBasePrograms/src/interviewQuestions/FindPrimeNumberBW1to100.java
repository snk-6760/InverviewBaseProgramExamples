package interviewQuestions;

public class FindPrimeNumberBW1to100 {

	public static void main(String[] args) {

		// prime number is divisible by 1 and itself (count=2)

		for (int i = 2; i <= 100; i++) {

			int count = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
				}

			}

			if (count == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
