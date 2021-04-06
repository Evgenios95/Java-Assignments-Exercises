package ConstructorsClasses;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getAdditionResult() {
        double sum = getFirstNumber() + getSecondNumber();
        return sum;
    }

    public double getSubtractionResult() {
        double sum = getFirstNumber() - getSecondNumber();
        return sum;
    }

    public double getMultiplicationResult() {
        double sum = getFirstNumber() * getSecondNumber();
        return sum;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0d;
        }
        double sum = getFirstNumber() / getSecondNumber();
        return sum;
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(5.0);
        calc.setSecondNumber(4);
        System.out.println("add= " + calc.getAdditionResult());
        System.out.println("subtract= " + calc.getSubtractionResult());
        calc.setFirstNumber(5.25);
        calc.setSecondNumber(0);
        System.out.println("multiply= " + calc.getMultiplicationResult());
        System.out.println("divide= " + calc.getDivisionResult());
    }

}