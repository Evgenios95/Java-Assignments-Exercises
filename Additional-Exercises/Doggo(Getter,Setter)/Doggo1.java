public class Doggo1 {

    private String name;

    public Doggo1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName) {
        return this.name = newName;
    }

    public void makeBark() {
        System.out.println(getName() + " woof");
    }

    public static void main(String[] args) {
        Doggo1 dog = new Doggo1("Casper");
        dog.makeBark();
        System.out.println(dog.getName());
        System.out.println(dog.setName("bagira"));
        System.out.println(dog.getName());
        dog.makeBark();
    }

}
