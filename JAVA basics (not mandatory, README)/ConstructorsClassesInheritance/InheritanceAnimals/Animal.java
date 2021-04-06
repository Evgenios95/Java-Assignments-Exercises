package InheritanceAnimals;

public class Animal {
    private String name;
    private int body;
    private int brain;
    private int size;
    private int weight;


    public Animal(String name, int body, int brain, int size, int weight) {
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " +speed);
    }

    public String getName() {
        return this.name;
    }

    public int getBody() {
        return this.body;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

}
