package m1.s19;

public class MethodCaller {
    public static void main(String[] args) { // questo serve per eseguire il codice sorgente
        System.out.println(Simple.h()); // h è static quindi non devo crare un'istanza. La posso chiamare senza ricorrere all'oggetto Simple
        
        Simple reference = new Simple(); // per usare gli altri metodi devo invece crare un oggetto "reference" per poi poter invocare i metodi
        
        int result = reference.f(7, 6);
        System.out.println(result);
        
        reference.g(true);
        reference.g(false);
    }
}
