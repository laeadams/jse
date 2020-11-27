package m2.s03;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name; // questa è la proprietà della classe

    public Dog() { // questo è un costruttore
        name = "No name";
        LOG.info("A new anonymous dog has been created");
    }

    // not a good parameter name, see "this"
    public Dog(String nm) { // questo è un costruttore
        name = nm;
        LOG.info("A new dog named " + name + " has been created");
    }

    public void bark() { // questo è un metodo dato che dopo public è il tipo del return, i costruttori non lo hanno
        System.out.println(name + ": woof");
    }
}
