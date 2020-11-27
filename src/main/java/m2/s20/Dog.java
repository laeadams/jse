package m2.s20;

public class Dog extends Pet {
	private double speed;

	public Dog(String name) {
		this(name, 0.0);
	}

	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	@Override
	public String toString() { // così richiamo il toString del Pet. Se non ci fosse super si formerebbe un
								// loop infinito con la chiamata ricorsiva di toString()
		return "Dog [speed=" + speed + "] " + super.toString();
	}
}