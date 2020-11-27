package mx;

public class S08 {
	
	/**
	 * Binary addition on strings
	 * 
	 * <pre>
	 * "10" + "11" = "101"
	 * </pre>
	 * 
	 * @param left  binary represented on string
	 * @param right binary represented on string
	 * 
	 * @return left + right as binary on string
	 * @throws IllegalArgumentException different sizes
	 */
	
	/**
	 *   "101" + "111"   +    0
	 * 		a       b	      q
	 * 
	 *   case 1:  1,1,0 --> "0" + q = 1
	 *   
	 *   check  |    " " / q
	 *   ---------------------
	 *    3     |	 "1" / 1
	 *    2     |	 "0" / 1
	 *    1     |	 "1" / 0
	 *    0     |	 "0" / 0
	 * 
	 */
	
	public static int getInt(char s) {
		if (s == '1') {
			return 1;
		} else {
			return 0;
		}
	}

	public static String binarySum(String left, String right) {

		StringBuilder sum = new StringBuilder();

		if (left.length() != right.length()) {
			throw new IllegalArgumentException("Strings have different size");
		}
		
		int qNew = 0;
		for (int i = left.length() - 1; i >= 0; i--) {

			int q = qNew;
			int check = getInt(left.charAt(i)) + getInt(right.charAt(i)) + q;

			if (check == 3) {
				if (i == 0) {
					sum.append("11");
					continue;
				}
				sum.append('1');
				qNew = 1;
			} else if (check == 2) {
				if (i == 0) {
					sum.append("01");
					continue;
				}
				sum.append('0');
				qNew = 1;
			} else if (check == 1) {
				if (i == 0) {
					sum.append("10");
					continue;
				}
				sum.append('1');
				qNew = 0;
			} else {
				if (i == 0) {
					sum.append("00");
					continue;
				}
				sum.append('0');
				qNew = 0;
			}
		}

		return sum.reverse().toString();
	}

	/**
	 * Merge sorted arrays in a new array still sorted
	 * 
	 * <pre>
	 * [1,2,4,6,7], [3,4,4,6] -> [1,2,3,4,4,4,6,6,7]
	 * </pre>
	 * 
	 * @param left  a sorted array
	 * @param right a sorted array
	 * 
	 * @return a merge of the two input parameters
	 */
	public static int[] mergeSorted(int[] left, int[] right) {
		
		
		
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Get the only single value in an array of couples
	 * 
	 * <pre>
	 * [1,4,2,3,3,2,1] -> 4
	 * </pre>
	 * 
	 * @param values an array
	 * 
	 * @return the only single value
	 */
//	public static int getSingle(int[] values) {
//		throw new UnsupportedOperationException("Not yet implemented");
//	}
	public static int getSingle(int[] data) {

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				
				if(data[i]==data[j]) {
					continue;
				}
				if (j==data.length-1) {
					result =  data[i];
				}
				
			}
		}
		return result;
	}

	/**
	 * Check for duplicate characters in a string
	 * 
	 * <pre>
	 * "hello" -> false, "helo" -> true
	 * </pre>
	 * 
	 * @param s a string
	 * 
	 * @return true if no duplicates in
	 */
	public static boolean hasOnlyUnique(String s) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Check for anagram
	 * 
	 * @param s
	 * @param t
	 * @return true if s is an anagram of t
	 */
	public static boolean isAnagram(String s, String t) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * not sorted -> O(n)
	 * 
	 * sorted -> O(lg n)
	 * 
	 * @param data
	 * @param target
	 * @return
	 */
	boolean find(int[] data, int target) {
		return false;
	}
}
