package m2.s13;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		// non si può creare un oggetto da un'interfaccia
		// Barker barker = new Barker(); --> questo non funziona!!

		// Posso però creare un array di Barker:

		// metodo 1:
//        Barker[] group = new Barker[3];
//        
//        group[0] = new Fox();
//        group[1] = new Dog();
//        group[2] = new Robot();

		// metodo 2:
		Barker[] barkers = { new Fox(), new Dog(), new Robot(), new Poodle() };
		// NOTA BENE: nella OOP, se una classe implementa Barker allora è un Barker. Per
		// questo posso usare la notazione sopra! Implementare è la stessa proprietà
		// dell'ereditarietà delle classi: Poodle extends Dog

		System.out.println(barkers);
		System.out.println(Arrays.toString(barkers)); // in Dog ho fatto l'override di toString, e il Poodle l'ha
														// ereditatp

		for (Barker aBarker : barkers) { // foreach sull'array di Barkers
			System.out.println(aBarker.bark()); // il metodo giusto di bark() è definito dal polimorfismo
		}

		// così creo un cane che abbaia e scondinzola --> less is more! Devo cercare di
		// accedere solo a quello che mi serve
		WaggingBarker baw = new Dog();
		System.out.println(baw.wag());

		// questo è giusto ma se non mi serve non ha senso accedere a tutto il cane
		Dog dog = new Dog();
		System.out.println(dog.bark(3));

		// il reference di dog lo posso passare a un metodo
		interact(dog);

		// Object è alla base della gerarchia di tutte le classi quindi posso anche fare
		// questo chiamata
		Object obj = new Dog();
		System.out.println(obj.toString());
	}

	// questo metodo ha come input quegli elementi che hanno l'interfaccia Barker
	static void interact(Barker barker) {
		System.out.println(barker.bark());
	}

	static void interact(Object obj) {
		System.out.println(obj.toString());
	}
}
