package m2.s03;

public class MyMath {

	private MyMath() { // in questo modo la classe non potrà essere usata per create un oggetto. Può
	} // solo essere usata come classe

	// oppure posso creare un singleton --> creare un solo oggetto per classe
	private static MyMath instance = new MyMath();

	public static MyMath getInstance() {
		return instance;
	}
	// in questo modo potro' costrutirmi un oggetto MyMath ma solo una volta con il
	// comando new MyMath.getInstance()

}
