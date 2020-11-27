package m4.s15;

/**
 * Exercise: write a simple linked list.
 * 
 * @see tester for expected results
 * @author manny
 */
public class MyList{

	private Node head; // definisco la testa della lista. Head è un reference all'oggetto Node
	private Node tail;

	public MyList() {
		this.head = null;
		this.tail = null;
	}

	public int size() {

		int counter = 0;

		Node current = head; // nodo di appoggio per non cambiare head

		while (current != null) {
			counter += 1;
			current = current.getNext(); // prendi il successore di current
		}
		return counter;
	}

	public void add(int value) {
		Node node = new Node(value);

		if (tail == null) { // se la collezione era vuota, inserisco il primo nodo
			tail = node;
			head = node;
		} else {
			Node prevTail = tail;
			tail = node; // la nuova coda è il nodo che mi sono appena creato
			prevTail.setNext(tail); // la coda di prima avrà ora il reference alla nuova coda
		}

	}

	public int get() { // prende il valore in head
		if (head == null) {
			throw new NullPointerException("The list is empty");
		}
		return head.getValue();
	}

	// elimina il valore in testa
	public int pop() {
		if (head == null) {
			throw new NullPointerException("The list is empty");
		}

		int result = head.getValue();		
		head = head.getNext();
		// metti che quando head = null anche tail dovrà essere null

		return result;
	}
	
	public String toString() {
		if (head == null) {
			throw new NullPointerException("The list is empty");
		}
		StringBuilder str = new StringBuilder();
		
		str.append('[');
		while(head!=null) {
			str.append(head.getValue());
			str.append(',');
			head = head.getNext();
		}
		str.deleteCharAt(str.lastIndexOf(","));
		str.append(']');		
		return str.toString();
	}
		
}
