package CarpetCostCalculator;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost < 0d ? 0d : cost;
    }

    public double getCost () {
        return cost;
    }

}
