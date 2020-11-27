package m2.s15;

// The type Concrete must implement the inherited abstract method
//public class Concrete extends Abstract {
//}

public class Concrete extends Abstract { // la mia nuova classe può essere concreta dato che ho ridefinito il metodo
											// astratto della classe astratta estesa
	@Override
	public void anAbstractMethod() {
		System.out.println("not abstract anymore");
	}
}
