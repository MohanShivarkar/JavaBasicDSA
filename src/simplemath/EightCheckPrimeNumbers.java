package simplemath;

import java.util.*;

/**
 * Problem Description Given a number, find if it is a prime number or not. This
 * question may also be phrased in interviews as ‘check for primality’.
 * 
 * Input format There are T+1 lines of input.
 * 
 * First line will contain a number T, the number of test cases.
 * 
 * Each of the next T lines contains an integer N.
 * 
 * Output format In each line print "true" if it is a prime number otherwise
 * "false". Ensure all lowercase to pass all tests.
 * 
 * Sample Input 1 2 1 2
 * 
 * Sample Output 1 false
 * 
 * true
 * 
 * Constraints 1 <= T <= 10
 * 
 * 0 <= N <= 500
 * 
 * Explanation 1 is not a prime number whereas 2 is a prime.
 */

public class EightCheckPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			nums.add(n);
		}

		ArrayList<Boolean> ans = checkPrime(t, nums);

		for (boolean res : ans) {
			System.out.println(res);
		}
	}

	// TODO: Implement this method
	static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) {
		ArrayList<Boolean> results = new ArrayList<>();

		for (int i = 0; i < t; i++) {
			int number = nums.get(i);

			if (isPrime(number)) {
				results.add(true);
			} else {
				results.add(false);
			}
		}

		return results;
	}

	// Time Complexity is O(n)
	static boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	// Time Complexity O(sqrt(n))

	// Note: Using the libraries such as sqrt() can sometimes give unexpected
	// values. Hence, instead of checking for i < sqrt(n) in the for loop, we check
	// for i*i< n.
	static boolean isPrime1(int n) {

		if (n == 1) {
			return false;
		}

		for (int i = 2; i * i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

}
