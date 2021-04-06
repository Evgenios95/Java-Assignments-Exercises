

public class Main {
    public static void main(String[] args) {
        // Gearbox mclaren = new Gearbox(6);
        //we need a static nested class.
        //this would be right if the inner class was public.
        // Gearbox.Gear first = mclaren.new Gear(1, 12.3);

        //we cant do the following. not an enclosing class. In the second class we need the mclaren.new in order to create the instance
        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        // Gearbox.Gear third = new mcLaren.Gear(3, 17.8);

        Gearbox toyota = new Gearbox(5);
        toyota.operateClutch(true);
        toyota.changeGear(1);
        toyota.operateClutch(false);
        System.out.println(toyota.wheelSpeed(1000));
        toyota.changeGear(2);
        System.out.println(toyota.wheelSpeed(3000));
        toyota.operateClutch(true);
        toyota.changeGear(3);
        toyota.operateClutch(false);
        System.out.println(toyota.wheelSpeed(6000));

        
    }
}
