package CarpetCostCalculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(9d);
        Floor floor = new Floor(3.9, 4.7);
        Calculator calc = new Calculator(floor, carpet);
        System.out.println(calc.getTotalCost());
    }

}
