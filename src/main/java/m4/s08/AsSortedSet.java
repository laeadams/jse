package m4.s08;

import java.util.Arrays;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class AsSortedSet {
	public static void main(String[] args) {
		Collection<Integer> coll = Arrays.asList(12, 18, -5, -2233);
		SortedSet<Integer> sortedSet = new TreeSet<Integer>(coll); // la classe TreeSet viene usata per ampliare la
																	// SortedSet. Per albero si intende di solito i
																	// Binary Sorted Tree BST senza duplicati
		System.out.println(coll + " -> " + sortedSet);
		System.out.println("First: " + sortedSet.first());
		System.out.println("Last: " + sortedSet.last());
		System.out.println("Subset [second, last): " + sortedSet.subSet(sortedSet.first() + 1, sortedSet.last()));
	}
}

// [-2233, -5, 12, 18]    gli algoritmi per la creazione di alberi cercano di farli crescere il più lentamente 
// . . . -5 . . .         possibile per evitare che creascano di livelli in maniera sbilanciate, formando una 
// -2233 ... 12           sorta di lista
//  ... ... ... 18 

// un albero è ordinato quando i numeri sono in ordine crescente da sinistra a destra

// volendo aggiungere il 20, non faccio così perchè l'albero sarà sbilanciato
//. . . -5 . . .          
//-2233 ... 12          
//... ... ... 18 
// .............20