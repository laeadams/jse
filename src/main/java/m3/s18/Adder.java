package m3.s18;

import java.util.Scanner;

public class Adder {
	public static void main(String[] args) {
		System.out.println("Please, enter a few numbers");
		double result = 0;

		// N.B: sul Mac blocco tutto con Control+D
		Scanner scanner = new Scanner(System.in); // lo scanner è agganciato alla tastiera ora
		while (scanner.hasNext()) { // sostanzialmente vuol dire "leggi riga per riga finchè non finisce il file"
			if (scanner.hasNextDouble()) { // guarda se c'è un double
				result += scanner.nextDouble(); // legge il double 
			} else {
				System.out.println("Bad input, discarded: " + scanner.next());
			}
		}
		scanner.close(); // see try-with-resources
		System.out.println("Total is " + result);
	}
}
