package simplemath;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Problem Description
 * 
 * There are two numbers, given as strings. The numbers may be very large (may
 * not fit even in long long int). You need to find the sum of these two
 * numbers.
 * 
 * Note : No inbuilt function such as Big Integer() to be used
 * 
 * Input format First line contains two space separated strings s1 and s2.
 * 
 * Output format An integer representing the sum of s1 and s2..
 * 
 * Sample Input 1 10 24
 * 
 * Sample Output 1 34
 * 
 * Constraints 1 <= |s1| , |s2| <= 500.
 * 
 * Where |s| is the length of s, in this case the number of digits in the
 * number.
 * 
 * Explanation The sum of 10 and 24 is 34.
 */

public class TenAddTwoIntegersRepreAsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();

		String ans = bigIntegerAddition(num1, num2);
		System.out.println(ans);
		
		
		
		System.out.println(new StringBuilder(num1).reverse().toString());
		
		
		
	}

	// TODO: Implement this method
	static String bigIntegerAddition(String num1, String num2) {
		// Before proceeding further, make sure length
		// of num2 is larger.
		if (num1.length() > num2.length()) {
			String t = num1;
			num1 = num2;
			num2 = t;
		}

		// Take an empty String for storing result
		String str = "";

		// Calculate length of both String
		int n1 = num1.length(), n2 = num2.length();

		// Reverse both of Strings
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();

		int carry = 0;
		for (int i = 0; i < n1; i++) {
			// Do school mathematics, compute sum of
			// current digits and carry
			int sum = ((int) (num1.charAt(i) - '0') + (int) (num2.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');

			// Calculate carry for next step
			carry = sum / 10;
		}

		// Add remaining digits of larger number
		for (int i = n1; i < n2; i++) {
			int sum = ((int) (num2.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');
			carry = sum / 10;
		}

		// Add remaining carry
		if (carry > 0)
			str += (char) (carry + '0');

		// reverse resultant String
		str = new StringBuilder(str).reverse().toString();

		return str;

	}

}
