package m2.s16;

public class Cat extends Mammal {
	private Tail tail; // proprietà che deve poi essere definita nel costruttore. Questa è una
						// relazione di aggregazione --> la proprietà di Cat è l'istanza della classe Tail

	public Cat(int gestationDays, int tailLen) {
		super(gestationDays); // per costruire il Cat devo prima costruire quello che c'è dentro il Mammal.
								// Questo viene fatto con il comando super(). Se avessi in Mammal un costruttore
								// senza parametri [vedi quello commentato in Mammal], potrei non mettere questa
								// frase dato che il compilatore mette automanticamente il comando super().
		this.tail = new Tail(tailLen);
	}

	@Override
	public String toString() {
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
