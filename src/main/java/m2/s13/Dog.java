package m2.s13;

public class Dog implements WaggingBarker {
    private final int WAG_COUNT; //Poodle non potrà accedere direttamente questo ma comunque lo eredita

    public Dog(int wagCount) {
        WAG_COUNT = wagCount;
    }

    public Dog() {
        WAG_COUNT = DEFAULT_WAG_COUNT;
    }

    @Override
    public String bark() {
        return "Woof";
    }
    
    public void eat() {
    	System.out.println("I'm hungry");
    }

    // questo è un overload
    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public String wag() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < WAG_COUNT; i++) {
            sb.append("Wag");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Dog [WAG_COUNT=" + WAG_COUNT + "]";
    }
}