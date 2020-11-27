package mx;

import java.util.logging.Logger;

public class Prova {
	
	private static final Logger LOG = Logger.getGlobal();
	
	static int[] sumUp(int[] v1, int[] v2) {
		int[] result = new int[v1.length];
		if (v1.length != v2.length) {
			LOG.info("Arrays have different length!");
			return result;
		}	
		for (int i = 0; i < v1.length; i++) {	
			result[i] = v1[i]+v2[i];
		}
		return result;	
	}
	
	public static void main(String[] args) {
		
		int[] v1 = {1,2,3,4};
		int[] v2 = {10,2,4,8};
		
		int[] v3 = sumUp(v1,v2); // potrei fare sumUp(new int[] {1,2,3}, new int[] {2,3,4});
		
		System.out.println(v3);
		
		//LOG.info("Voglio sapere la somma tra due array");
		
		
	}
	

}
