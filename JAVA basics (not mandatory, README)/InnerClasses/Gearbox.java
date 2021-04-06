import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.gears = new ArrayList<>();
        this.maxGears = maxGears;
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!");
            return 0d;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // we are not interested in the Gear objects themselves but we expose the Gear
    // inner class through GearBox. It doesn't make sense to make it public as well.
    //This is also a nice way to understand the philosophy of encapsulation. We keep the gear private inner class invisible and it can be reached by the GearBox class. You dont access Gear at all other than the Gearbox class itself.

    //This also called as a local inner class. There are also the anonymous inner classes. Local classes are between brackets.
    private class Gear {
        private int gearNumber;
        private double ratio;

        // in inner classes this.ratio for example, refers to the fields of the
        // innerclass and not to the other classes or the main class. So Gear and not
        // Gearbox in this case.
        public Gear(int gearNumber, double ratio) {
            this.ratio = ratio;
            this.gearNumber = gearNumber;
        }

        public double getRatio() {
            return this.ratio;
        }

        // public double driveSpeed(int revs) {
        // return revs * (this.ratio);
        // }

    }

}
