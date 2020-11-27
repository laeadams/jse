package m3.s05;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE"); // passo questo message in caso di eccezione
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);// qua mi creo una mia exception
		}
		return -value;
	}

	// per avviarlo a linea di comando vai in target/classes e va lì fai java m3.s05.Simple
	// e in questo caso posso dare un paramentro:   java m3.s05.Simple 12 --> mi ritornerà -12
	public static void main(String[] args) {
		Simple simple = new Simple();

		try {
			int value = args.length == 0 ? Integer.MIN_VALUE : Integer.parseInt(args[0]);
			System.out.println("Negate " + value);
			int x = simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (NumberFormatException e) {
			System.out.println("Pass me an integer!");
			return;
		} catch (MyNegateException mne) {
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
			return;
		}
	}
}

class MyNegateException extends Exception {
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() {
		return alternativeValue;
	}
}
