package simplemath;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Problem Description Given an integer N, find the number of distinct factors
 * and the sum of these factors.
 * 
 * Input format One line of input, containing the integer N.
 * 
 * Output format Print two space separated integers, first integer representing
 * the number of distinct factors, second would be the sum of factors.
 * 
 * Sample Input 1 4
 * 
 * Sample Output 1 3 7
 * 
 * Constraints 0 <= N <= 100
 * 
 * Explanation The factors of 4 are 1,2,4 and their sum is 7.
 */

public class NineFindFactors {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans[] = numberOfDivisorsAndSum(n);
		System.out.println(ans[0] + " " + ans[1]);
	}

	// TODO: Implement this method

	static int[] numberOfDivisorsAndSum(int n) {

		int[] results = new int[2];

		ArrayList<Integer> divisors = new ArrayList<>();
		int sumOfDivisors = 0;
		// Collecting all divisors
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {

				if (divisors.isEmpty()) {
					divisors.add(i);
					sumOfDivisors += i;
					System.out.println("sumOfDivisors:" + sumOfDivisors);
				} else {
					if (!(divisors.contains(i))) {
						divisors.add(i);
						sumOfDivisors += i;
					}
				}

			}
		}

		results[0] = divisors.size();
		System.out.println("Size:" + divisors.size());
		results[1] = sumOfDivisors;

		return results;
	}
}
