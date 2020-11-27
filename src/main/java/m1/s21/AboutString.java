package m1.s21;

public class AboutString {

    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));  // .charAt è un metodo d'istanza 
        																// quindi lo chiamo sulla stringa s

        // per confrontare l'ordine alfabetico in due stringhe [procede confrontanto lettera per lettere finchè sono diverse]
        System.out.println("s < t: " + s.compareTo(t)); // output: -15 perchè hello è prima di world
        System.out.println("t > s: " + t.compareTo(s)); // output: 15 perchè wolrd è dopo hello

        System.out.println("concat s and t: " + s.concat(t)); // è come fare s + t --> crea una nuova stringa!

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3); // estrai una sotto-stringa dalla stringa t nella posizione [1,3): uno compreso e tre escluso
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); // così parti dalla pos. 3 fino in fondo

        System.out.println("u equals u2? " + u.equals(u2)); // questo fa il confronto nello heap quindi sono uguali!
        System.out.println("u == u2? " + (u == u2)); // in questo caso fa il confronto con il reference e quindi sono diversi!

        System.out.println("First index of 'l' is s: " + s.indexOf('l')); // primo indice della stringa con il carattere indicato
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l')); // stesa cosa ma dalla fine
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); // così ritorna -1 --> il char non c'è nella stringa
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll")); // posso anche passare una stringa --> overload
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); // NOTA BENE: posso invocare un metodo direttamente sulla stringa!
        // String x = new String("");
        // x.isEmpty();
        // es: boolean x = "hello".contains("ll"); 
       

        System.out.println("s length: " + s.length()); // per le stringhe .length() è un metodo, per array era una proprietà array.length

        String s2 = s.replace('l', 'q'); //nella stringa s, cambia le l con le q su una nuova stringa
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");
        System.out.println("Splitting: ");
        for (String token : splits) { // ciclo for each
            System.out.println(token);
        }
        String joined = String.join(" ", splits); // join è un metodo statico, lavora sulla classe
//        String joined = String.join(",", "a", "b", "c");
        System.out.println("Joining back [" + joined + "]");

        String myS = s.toUpperCase();
        System.out.println("upper: " + myS);
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); // trim elimina gli spazi bianchi all'inizio e alla fine della stringa (solo agli estremi)

        int a = 42;
        String b = "hello";
        double c = 10 / 3.0;
        System.out.println(String.format("An integer %d, a string %s, and a floating point %.3f", a, b, c)); // format è un altro metodo statico
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
        
        
		char c1 = 'R';		
		c1 += 7;
		System.out.println(c1);
    }
}
