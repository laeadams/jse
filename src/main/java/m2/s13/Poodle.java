package m2.s13;

public class Poodle extends Dog{
	
	@Override
	public String bark() {
		return "wif";
	}
	
	// questo è un override perchè Poodle è figlia di Dog
	@Override
	public void eat() {
		System.out.println("I'm very hungry");
	}
	
	// questo è un overload semplice dato che in Dog e in Poodle non c'è il metodo eat(int)
	public void eat(int meat) {
		System.out.println("I'm very hungry" + meat);
	}

}
