public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(32.4));
        System.out.println(area(32, 24));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) {
        if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
            return -1.0;
        }

        double rectangleArea = x * y;
        return rectangleArea;
    }
}

// OUTPUTS: 3297.918304032421 and 768.0 <3