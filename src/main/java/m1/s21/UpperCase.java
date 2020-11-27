package m1.s21;

public class UpperCase {
	
	static String toUpper(String input) {
		
		if (input == null || input.isEmpty()) {
			return input;
		}
		
		int drift = 32; 
		
		StringBuilder result = new StringBuilder();
		
		
		for (int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
					
			if (c>='a' && c<='z') {
				char k = (char) (c - drift);
				result.append(k);
			} else {				
				result.append(c);
			}
		}
			return result.toString();
		}
	
	public static void main(String[] args) {
		
		String testo = "Ciao, c++++ome stai?";
		
		String nuovoTesto = toUpper(testo);
		
		System.out.println(testo);
		System.out.println(nuovoTesto);
		
		System.out.println(30%26);
				
		
	}

}
