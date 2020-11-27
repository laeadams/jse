package m2.s04;

import java.util.logging.Logger;

public class Dog {
    private static final Logger LOG = Logger.getGlobal();

    private String name;
    private String owner;
    // se mettessi private static ... varrebbe per tutti i cani

    // not a good parameter name, see "this"
    private Dog(String nm, String newnm) { // adesso è privato per forzare gli utenti a usare gli static factory method
        name = nm;
        owner = newnm;
        LOG.info(String.format("A new dog has been created with name [%s] and owner [%s]", name, owner));
    }
    
    public static Dog createWithNames(String name, String owner) {

        return new Dog(name,owner);
    }

    public static Dog createWithNoName() {
        /*
         * 1. fetch images for components a: nose b: tail c: ... 2. goto database for
         * info on dog breed ...
         */

        return new Dog("No name","no name");
    }

    public static Dog createWithNameButNoOwner(String name) {
        return new Dog(name, "no name");
    }
    
    public static Dog createWithOwnerName(String owner) {

        return new Dog("No name",owner);
    }

    public void bark() {
        System.out.println(name + ": woof");
    }
}
