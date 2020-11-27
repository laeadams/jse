package m1.s19;

public class Simple {
    static String h() {
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }
    
    // Posso avere un metodo con nome uguale ma signature diversa (dato che i parametri hanno tipo differente [il nome...
    // del parametro non conta])
    //String f(String a, int b) {
    //    return a + b;
    //}

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
}