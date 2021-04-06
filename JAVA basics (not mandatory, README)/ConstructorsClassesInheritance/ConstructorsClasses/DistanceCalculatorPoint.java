package ConstructorsClasses;

public class DistanceCalculatorPoint {
    private int x;
    private int y;

    public DistanceCalculatorPoint() {
        this(0, 0);
    }

    public DistanceCalculatorPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((getX() * getX()) + (getY() * getY()));

    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));

    }

    public double distance(DistanceCalculatorPoint another) {
        return distance(another.x, another.y);
    }

    public static void main(String[] args) {
        
    }
}
