package m2.s21;

public class Main {
	public static void main(String[] args) {
//		Cat cat = (Cat) new Dog(); // non posso creare un cane e metterlo in un gatto!!!

		Pet pet = new Dog("Bob"); // upcasting, si èuò fare ed è sempre sicuro! Adesso il Dog è dentro Pet

		// risky
		Dog dog = (Dog) pet; // un downcasting potrebbe essere rischioso
		dog.bark();

		// next line leads to a ClassCastException
//        Cat cat = (Cat) pet; // così voglio castare un Dog in un Cat... NON SI PUO' FARE!!
		// next line is just not to have a warning for unused cat on the previous line
//        System.out.println(System.identityHashCode(cat));

		// così mi chiedo se pet è davvero un Cat, e in tal caso potrei farlo miagolare
		if (pet instanceof Cat) {
			Cat tom = (Cat) pet; // in questo caso non sarà così quindi il nostro pet non miagolerà
			tom.meow();
		} else {
			System.out.println("This pet is not a cat!");
		}

		Pet[] pets = { new Dog("Tom"), new Cat("Bob") };

		f(pets);
	}

	static void f(Pet[] pets) {
		if (pets == null) {
			return;
		}

		// in questo modo, se il pet è un Cat verrà downcastato nel Cat è poi miagolerà;
		// analogamente se si tratta di un Dog
		for (Pet pet : pets) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.bark();
			}
			if (pet instanceof Cat) {
				Cat cat = (Cat) pet;
				cat.meow();
//				((Cat)pet).meow();
			}
		}
	}
}
