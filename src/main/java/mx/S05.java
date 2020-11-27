package mx;

import java.util.logging.Logger;

public class S05 {

	public final static Logger LOG = Logger.getGlobal();

	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {

		StringBuilder supp = new StringBuilder(s);
		return supp.reverse().toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {

		return (s.equals(reverse(s)));

//		Altro metodo per fare il check delle lettere step by step
//		for (int i =0, j = s.length()-1; i<j;i++,j--) {
//			is (s.charAt(i)!=s.chart){
//				return false
//			}
//		}

	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {

		StringBuilder supp = new StringBuilder(s);

		String[] vowels = { "a", "e", "i", "o", "u" };

		for (int i = 0; i < vowels.length - 1; i++) {

			int ind = 0;

			while (ind != -1) {

				ind = supp.indexOf(vowels[i]);

				if (ind != -1) {
					supp.deleteCharAt(ind);
				}
			}
		}
		return supp.toString();

	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {

		int result = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				result += Math.pow(2, (s.length() - 1 - i));
			}
		}
		return result;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];

		for (int i = 0; i < data.length; i++) {

			result[i] = data[data.length - i - 1];
		}
		return result;
	}
	
	public static void reverseInPlace(int[] data) {

		for (int i = 0, j = data.length-1; i<j; i++, j--) {

			int swap = data[i];
			data[i] = data[j];	
			data[j] = swap;
		}

	}

	
	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {

		double result = 0;

		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		return result / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {

		if (data == null) {
			return Integer.MAX_VALUE;
		}

		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
}
