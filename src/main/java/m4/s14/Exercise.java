package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {
	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public List<Integer> evens(int[] data) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				result.add(data[i]);
			}
		}
		return result;
	}

	public int[] evensRaw(int[] data) {

		int counter = 0;
		for (int i = 0; i < data.length; i++) {

			if (data[i] % 2 == 0) {
				counter += 1;
			}
		}
		int[] result = new int[counter];
		for (int i = 0, j = 0; i < data.length; i++) {

			if (data[i] % 2 == 0) {
				result[j] = data[i];
				j++;
			}
		}
		return result;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4, 5, 6} -> out {2, 3}
	 * 
	 */
	public List<Integer> singles(int[] data) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < data.length; i++) {
			int counter = 0;
			for (int j = 0; j < data.length; j++) {

				if (data[i] == data[j]) {
					counter += 1;
				}
			}
			if (counter == 1) {
				result.add(data[i]);
			}
		}
		return result;
	}

	/**
	 * As above, but with a n-log n time algorithm
	 * 
	 * @param data
	 * @return
	 */
	public List<Integer> singlesLog(int[] data) {
		
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(data);
		
		if (data[0] != data[1]) {
			result.add(data[0]);
		}
		if (data[data.length - 1] != data[data.length - 2]) {
			result.add(data[data.length]);
		}
		for (int i = 1; i < data.length - 1; i++) {
			if (data[i] != data[i + 1] && data[i] != data[i - 1]) {
				result.add(data[i]);
			}
		}
		return result;
	}

}
