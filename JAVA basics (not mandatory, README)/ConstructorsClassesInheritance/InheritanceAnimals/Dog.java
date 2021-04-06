package InheritanceAnimals;

public class Dog extends Animal {
    private int tail;
    private int teeth;
    private int ears;
    private int legs;
    private int eyes;

    public int getTail() {
        return this.tail;
    }

    public int getTeeth() {
        return this.teeth;
    }

    public int getEars() {
        return this.ears;
    }

    public int getLegs() {
        return this.legs;
    }

    public int getEyes() {
        return this.eyes;
    }

    public Dog(int tail, int teeth, int ears, int legs, int eyes, int size, int weight, String name) {
        super(name, 1, 1, size, weight);
        this.tail = tail;
        this.teeth = teeth;
        this.ears = ears;
        this.legs = legs;
        this.eyes = eyes;
    }

@Override
public void eat() {
    super.eat();
    chew();
    System.out.println("Dog.eat() called");
}

public void chew (){
    System.out.println("chew() called");
}


public void walk() {
    System.out.println("Dog.walk() called");
    super.move(5);
}

public void run () {
    System.out.println("Dog.run() called");
    move(13);
}



}
