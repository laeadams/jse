package m2.s04;

public class Main {
    public static void main(String[] args) {
        String boolAsStringClassic = "" + true;
        System.out.println("A boolean converted to string: " + boolAsStringClassic);

        String boolAsStringModern = String.valueOf(true);
        System.out.println("Another boolean converted to string: " + boolAsStringModern);

        Dog[] dogs = new Dog[4];

        // questi sono gli Static Method factory
        dogs[0] = Dog.createWithNames("Tom", "Giulio");
        dogs[1] = Dog.createWithNameButNoOwner("Bob");
        dogs[2] = Dog.createWithNoName();
        dogs[3] = Dog.createWithOwnerName("Caio");

        for (Dog dog : dogs) {
            dog.bark();
        }
    }
}
