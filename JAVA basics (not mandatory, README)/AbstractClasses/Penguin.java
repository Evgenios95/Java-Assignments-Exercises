public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    //we leave it here to have a specific functionalityyyy
    @Override
    public void fly() {
        super.fly();
        System.out.println(getName()+ " can't fly but can swim.");
    }
    
    
}
