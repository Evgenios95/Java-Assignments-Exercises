package ConstructorsClasses;

public class WallAreaExercise {
    private double width;
    private double height;

    public WallAreaExercise() {
        this(0d, 0d);
    }

    public WallAreaExercise(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return (width * height);
    }

    public static void main(String[] args) {
        WallAreaExercise wall = new WallAreaExercise(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(7);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
