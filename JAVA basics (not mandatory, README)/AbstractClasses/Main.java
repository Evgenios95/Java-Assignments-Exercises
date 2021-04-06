public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Casper");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Papas");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin peng = new Penguin("Pengugugugu");
        peng.breathe();
        peng.eat();
        peng.fly();
    }
}
