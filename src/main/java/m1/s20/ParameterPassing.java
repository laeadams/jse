package m1.s20;

public class ParameterPassing {
    /**
     * No side effect
     * 
     * @param parameter being a primitive, it is just a local copy
     */
    static void primitive(int parameter) {
        parameter += 1;
        System.out.println("parameter is " + parameter);
    }

    /**
     * No side effect
     * 
     * @param parameter being an immutable, its associated value can't change
     */
    static void immutableReference(String parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
//        Objects.requireNonNull(parameter, "Parameter should not be null");

        System.out.println("parameter id was " + System.identityHashCode(parameter));
        parameter += " there";
        System.out.println("Now parameter id is " + System.identityHashCode(parameter));
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Side effect
     * 
     * @param parameter being a reference, its associated value could change
     */
    static void reference(StringBuilder parameter) {
        if (parameter == null) {
            System.out.println("Nothing to do here");
            return;
        }

        // alternatively: if parameter is null throws a NullPointerException
        // Objects.requireNonNull(parameter, "Parameter should not be null");

        parameter.append(" there");
        System.out.println("parameter value is " + parameter);
    }

    /**
     * Array is a reference
     * 
     * @param data being a reference, its associated values could change
     */
    static void reference(int[] data) {
        if (data == null || data.length == 0) { // check tipico sugli array!!
            System.out.println("Nothing to do here");
            return;
        }

        data[0] += 1;
        System.out.println("data[0] is " + data[0]);
    }

    public static void main(String[] args) {
        int primitiveValue = 12;

        // Così vedi che il primitiveValue non cambia dato che il parametro è passato "by value"
        System.out.println("primitiveValue has been initialized to " + primitiveValue);
        primitive(primitiveValue);
        System.out.println("primitiveValue is still " + primitiveValue);

        // La string, anche se reference, sarà immutabile
        String string = "Hi";

        System.out.println("string has been initialized to " + string);
        immutableReference(string);
        System.out.println("string is still " + string);

        // lo stringBuilder invece è mutabile! In questo caso l'oggetto muterà dopo il metodo
        StringBuilder referenceValue = new StringBuilder("Hi");

        System.out.println("referenceValue has been initialized to " + referenceValue);
        reference(referenceValue);
        System.out.println("referenceValue now is " + referenceValue);

        // Per cambiare il primitivo in un metodo posso usare due strade:
        // 1. lo metto in un array (che è un reference mutabile)
        int[] array = { 42 };

        System.out.println("array[0] is " + array[0]);
        reference(array);
        System.out.println("array[0] now is " + array[0]);

        // 2. oppure lo faccio così esplicito
        int other = 12;
        other = increase(other);
        System.out.println(other);
    }

    static int increase(int value) {
        return value + 1;
    }
}
