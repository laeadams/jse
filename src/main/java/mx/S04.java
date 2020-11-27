package mx;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {

		long result = 0;

		for (int i = first; i <= last; i++) {

			result += i;
		}
		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {

		long result = 0;

		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}
		return result;

//		In alternativa posso fare:
//			if (first%2==1) {
//				first +=1;
//			}
//		for (int i = first, i <=last, i+=2) {
//			result+=i;
//		}

	}

	/**
	 * Generate an array on n strings like "X", but sized 1 .. n
	 * 
	 * @param n
	 * @return the generated array
	 */
	public static String[] pyramid(int n) {

		String[] result = new String[n];
		StringBuilder supp = new StringBuilder();

		for (int i = 0; i < n; i++) {

			result[i] = supp.append('X').toString();

		}
		return result;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
//	public static double sqrt(double value) {
//		
//		double eps = 1E-3;
//		
//		while (err > eps) {
//			
//			d
//			
//			
//			
//			
//		}
//		// TODO
//		return 0.0;
//	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		// TODO
		return 0.0;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {

		if (value < 0) {
			return 0L;
		}

		long result = value;
		for (int i = 1; i < value; i++) {
			result *= (value - i);
		}

		return result;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

//		value +=1;
//		int[] supp = new int[value];
//		supp[0] = 0;
//		supp[1] = 1;
//		
//		for (int i = 2; i <value; i++) {
//			
//			supp[i] = supp[i-2]+supp[i-1];
//		}
//		
//		return supp[value-1];

		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		} else {
			return fibonacci(value - 1) + fibonacci(value - 2);
		}

	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[0][0];

		// TODO

		return result;
	}
}
