package m4.s04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterating {
	public static void main(String[] args) {

		List<Integer> aList = Arrays.asList(1, 3, 4, 2); // metodo statico .asList() prende come input una sequenza di
															// interi. Una lista è un interfaccia delle collection.

		// aList è quindi una lista di interi, Questo crea un array che viene associato
		// ad una lista ma questa lista sarà read-only. Non la potrò cambiare.

		Iterable<Integer> iterable = new ArrayList<Integer>(aList); // chiamo l'interfaccia Iterable. A questo punto
																	// ArrayList sarà modificabile.

		// N.B. con ArrayList devo lavorare con i reference. Il comodo degli Array
		// classici è che posso lavorare con i primitivi int[]

		// "while has next" loop
		Iterator<Integer> it = iterable.iterator(); // così creo un "iteratore"-> un'idea astratta di puntatore. Mi
													// permette di scandire una collezione di eventi passandoli tutti in
													// rassegna. In una collezione, quando l'it viene creato, si
													// posiziona prima del primo elemento, in una posizione "astratta".
													// Così se la collezione è vuota c'è comunque un iterator

		while (it.hasNext()) { // con il while passo in ressegna la collezione. Uso il metodo .hasNext()
								// sull'iteratore. Se c'è un elemento successivo, il it.hasNext() è true,
								// resituisce il valore successivo con it.next() e poi scatta di una posizione.
								// Quando sarò all'ultima posizione, it.hasNext() sarà False
			System.out.print(it.next() + " ");
		}
		System.out.println();

		// stesso risultato ma più semplice è il for each sottostante: 
		// for each
		for (Integer value : iterable) { // --> si può usare su tutte le collezioni iterable e sugli Array
			System.out.print(value + " ");
		}
		System.out.println();

		
		// da Java 8 ci sono questi nuovi metodi sottostanti per lo stesso scopo
		// Java8 forEach
		iterable.forEach(System.out::print);
		System.out.println();

		// Java8 forEach /2
		iterable.forEach((value) -> {
			System.out.print(value + " ");
		});
		System.out.println();
	}
}
