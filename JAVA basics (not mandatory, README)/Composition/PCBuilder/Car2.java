package PCBuilder;

public class Car2 extends Vehicle2 {
    private int doors;
    private int engineCapacity;

    public Car2(int doors, int engineCapacity, String name) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }
}
