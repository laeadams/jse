package m3.s03;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptional {
	private static final Logger LOG = Logger.getGlobal();

	public void f() {
		// ...

		// ...
		try {
			g();
		} catch (Exception ex) {  // questo sotto () -> è un supplier di Java 8, non farti preoccupare
			LOG.log(Level.SEVERE, ex, () -> "Exception caught in f()");
		} finally {
			cleanup();
		}
	}

	public void f2() throws Exception { // in questo caso non so bene cosa farà f2 dato che non gli ho dato il 
										//  blocco try-catch quindi lascio gestire l'eccezione alla JVM richiamando
		// ...								a sua volta il throws
		g();
	}

	public void g() throws Exception {
		// ...
		if (somethingUnexpected()) { // Devo mettere throws per forza quando uso una checked exception!! 
			throw new Exception();
		}
	}

	private void cleanup() {
		LOG.info("performing cleanup");
	}

	private boolean somethingUnexpected() {
		return true;
	}

	public static void main(String[] args) throws Exception {
		Exceptional exceptional = new Exceptional(); // creo un oggetto della classe stessa

		// esempio 1: chiamo f() che sa gestire l'eccezione di g()
		LOG.info("I'm about to call f(), it won't throw exceptions");
		exceptional.f();

		// esempio 2: chiamo direttamente g() che da sola non ha un catch ma la metto io in un blocco try-catch
		LOG.info("Calling g() could be dangerous");
		try {
			// exceptional.f2();
			exceptional.g();
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e, () -> "Something went wrong");
		}

		// esempio 3: chiamo g() senza try-catch. Posso avviare per (vedi commento sotto) ma non saprà che fare
		LOG.info("Final call to g(), exception passed on to JVM");
		exceptional.g(); // qua non metto un blocco try-catch quindi non funzionerà. Ma nel main ho messo
							// la possibilità dell'eccezione quindi il programma verrà svolto ma giunto a
							// questo punto di interropmerà. Infatti la riga successiva non verrà stampata

		LOG.info("This statement won't be reached");
	}
}
