package m1.s21;

import java.util.logging.Logger;

public class Caesar {
	
	private static final Logger LOG = Logger.getGlobal();
	
	
	// method for encrypting
	static String encrypt(String input, int drift) {
		
		if (input == null || input.isEmpty()) {
			LOG.info("WARNING: input is null!");
			return input;
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			// caratteri non alfabetici non vengono trattati
			if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
				result.append(c);
				continue;
			}
			
			if (Character.isUpperCase(c)){
				
				char k = (char) ('A' + ((c - 'A' + drift ) % 26)); 
				result.append(k);
			} else if(Character.isLowerCase(c)) {
				char k = (char) ('a' + ((c - 'a' + drift ) % 26)); 
				result.append(k);
			}
		}		
		return result.toString();
	}
	
	// method for decrypting
	static String decrypt(String input, int drift) {
		
		if (input == null || input.isEmpty()) {
			LOG.info("WARNING: input is null!");
			return input;
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			
			if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
				result.append(c);
			}
			
			if (Character.isUpperCase(c)) {
				char k = (char) ('Z' - (('Z' - c - drift ) % 26)); 
				
				result.append(k);
			} else if (Character.isLowerCase(c)) {
				char k = (char) ('z' - (('z' -c - drift ) % 26)); 
				result.append(k);
			}	
		}
	
		return result.toString();
	}
	
	
	// ******************************************************
	public static void main(String[] args) {
		
		// A -> +7 = H or Z -> +7 = G
		String message = "Messaggio criptato!";
		int drift = 7;
		String crypto  = encrypt(message, drift);
		String decrypto = decrypt(crypto, -drift);
		
		// System.out.println(message + " -> " + crypto);
		// System.out.println(crypto  + " -> " + decrypto);
		
		LOG.info(message + " -> " + crypto);
		LOG.info(crypto  + " -> " + decrypto);

	}
}
