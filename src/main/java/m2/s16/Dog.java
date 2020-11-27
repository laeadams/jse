package m2.s16;

public class Dog extends Mammal {
    private Tail tail;

    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }

    // faccio la delegation, non posso fare l'override con l'aggregazione
    public void wag() {
        tail.wag();
    }
}
