package m2.s16;

public abstract class Mammal {
	protected int gestation;

	// avendo messo questo costruttore, per istanziare il Mammal dovrò sempre fare
	// riferimento a questo costruttore
	public Mammal(int gestation) {
		this.gestation = gestation;
	}
	
//	Costruttore senza parametri per il commento in Cat
//	public Mammal() {
//		this.gestation =100;
//	}
	

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}
}
