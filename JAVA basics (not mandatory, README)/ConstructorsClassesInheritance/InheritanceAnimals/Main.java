package InheritanceAnimals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 3, 1, 32, 32);
        Dog doggo = new Dog(1, 56, 2, 4, 2, 12, 49, "Cindy");
        doggo.eat();
        System.out.println("----------------");
        animal.eat();
        System.out.println("----------------");
        animal.move(32);
        System.out.println("----------------");
        doggo.walk();
        System.out.println("----------------");
        doggo.run();
        System.out.println("----------------");

        Dog doggo2 = doggo;
        System.out.println(doggo.getName());
        System.out.println(doggo2.getName());
        System.out.println("----------------");

        doggo2.setName("Casper");
        System.out.println(doggo.getName());
        System.out.println(doggo2.getName());

        System.out.println("----------------");
        Dog doggo3 = new Dog(1, 32, 2, 4, 2, 32, 132, "Zeus");
        doggo2 = doggo3;
        System.out.println(doggo.getName());
        System.out.println(doggo2.getName());
        System.out.println(doggo3.getName());

        System.out.println("----------------");
        doggo3.setName("Rex");
        // doggo2.setName("Rex"); Same output with the doggo3, they point at the same object
        System.out.println(doggo.getName());
        System.out.println(doggo2.getName());
        System.out.println(doggo3.getName());

        System.out.println("----------------");
        doggo3 = doggo;
        System.out.println(doggo.getName());
        System.out.println(doggo2.getName());
        System.out.println(doggo3.getName());
    }
}
