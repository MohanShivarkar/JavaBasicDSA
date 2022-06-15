package simplemath;

import java.util.*;

/**
 * 
 * Problem Description Given a number n, you have to calculate the factorial of
 * that number.
 * 
 * Note : No inbuilt function to be used
 * 
 * Input format First line contains an integer - n.
 * 
 * Output format Print the factorial of the given number.
 * 
 * Sample Input-1 3
 * 
 * Sample Output-1 6
 * 
 * Explanation 1 3! = 3.2.1 = 6
 * 
 * Constraints 0 <= n <= 10
 * 
 */

public class ElevenFactorialOfGivenNumber {

	// NOTE: Please do not modify this function
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);

		System.out.println(result);
	}

	// TODO: Implement this method
	static int factorial(int n) {

		int factorial = 1;

		if (n == 0) {
			return factorial;
		}

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		return factorial;
	}
}
