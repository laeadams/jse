package m2.s13;

public class Fox implements Barker {
	
	// questa è un'annotazione, dice che bark non nasce qui ma arriva da un'altra parte (Barker in questo caso)
    @Override
    public String bark() {
        return "Yap";
    }
    
    // quest non è un override perchè non è legata a Dog e nell'interfaccia non c'è
    public void eat() {
    	System.out.println("I'm also hungry");
    }
}