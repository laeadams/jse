package m2.s16;

import java.util.logging.Logger;

				   // questo non lo scrivo tanto è sottointeso
public class Tail /*extends Object*/ {
    private static final Logger LOG = Logger.getGlobal();
    private int size;

    public Tail(int size) {
        this.size = size;
    }

    // questo è un metodo "getter"
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }

    public void wag() {
        LOG.info(toString());
    }
}
