package InheritanceChallenge68;

// steer = odhgw, kateuthynw/ velocity= taxythta, kyriws kateythynshs,h anemou / gear = granazi, taxythta aytokinhtou

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at: " + currentDirection);
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at: " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
