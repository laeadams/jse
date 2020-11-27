package m4.s16;

import java.util.HashSet;
import java.util.Set;

public class Exercise {
	/**
	 * Generate an array that contains only once each value (possibly duplicated) in
	 * the input array
	 * 
	 * <pre>
	 * Example: { 12, 53, 12, 35 } -> { 12, 53, 35 }
	 * 
	 * Note: Result is not expected in any specific order
	 * </pre>
	 * 
	 * @param data an array with duplicates
	 * @return a stripped copy of the original array
	 */
	public Integer[] singles(int[] data) {

		if (data == null) {
			throw new IllegalArgumentException("null");
		}

		Set<Integer> result = new HashSet<Integer>(); 
		// facendo TreeSet ottengo la stessa cosa ma con 2 differenze: 
		// 1) gli elementi saranno in ordine
		// 2) avrò un leggero peggioramento delle performance: da O(N) a O(N log N)
		
		for (int value : data) {
			result.add(value);
		}
		
		return result.toArray(new Integer[result.size()]);
										// gli passo la dimensione corretta così è più rapido
		
		// SOLUZIONE QUADRATICA
//		ArrayList<Integer> dataList = new ArrayList<Integer>();
//		for (int i = 0; i < data.length; i++) {
//			dataList.add(data[i]);
//		}
//		ArrayList<Integer> index = new ArrayList<Integer>();
//
//		for (int i = 0; i < data.length; i++) {
//			for (int j = i; j < data.length; j++) {
//				if (data[i] == data[j] && i != j) {
//					index.add(j);
//				}
//			}
//		}
//		if (!dataList.isEmpty()) {
//			for (int j = 0; j < index.size(); j++) {
//				dataList.remove(index.get(index.size() - j - 1));
//			}
//		}
//
//		return (Integer[]) dataList.toArray();

	}
}
