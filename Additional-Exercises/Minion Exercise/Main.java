public class Main {
    public static void main(String[] args) {
        
        Minion a = new Minion ("Gouda");
        Minion b = new Minion ("Edam");
        Minion c = new Minion ("BlueCheesor");

        // System.out.println(a.getName()+ "\n"+ b.getName()+ "\n"+ c.getName()+ "\nWoooohooo they are registered correctly");

        // System.out.println ( a.getMinionPoints())+ "\n" + b.getMinionPoints()+ "\n" + c.getMinionPoints());

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());

        System.out.println ( a.getMinionPoints());
        System.out.println ( b.getMinionPoints());
        System.out.println ( c.getMinionPoints());


        System.out.println("I guess it's time to test if our evil laugh works.");
        System.out.println(a.evilLaugh());

        //calling the print status method
        a.printMinionStatus();
        b.printMinionStatus();
        c.printMinionStatus();

        // minions were nasty they need to lose their privileges
        a.undoMinion();
        b.undoMinion();
        c.undoMinion();
        
        // let's see are they minions now? I guess not.
        a.printMinionStatus();
        b.printMinionStatus();
        c.printMinionStatus();

        // now we need to swap their status to true again. Easy.
        a.makeMinion();  
        b.makeMinion();
        c.makeMinion();

        a.printMinionStatus();
        b.printMinionStatus();
        c.printMinionStatus();

        //assigning positive values
        a.givePoints(100);
        System.out.println(a.getName() + " has " + a.getMinionPoints() + " points");

        b.givePoints(300);
        System.out.println(b.getName() + " has " + b.getMinionPoints() + " points");

        c.givePoints(521);
        System.out.println(c.getName() + " has " + c.getMinionPoints() + " points.");

        //assigning negative values. Nothing.
        c.givePoints(-5);
        System.out.println(c.getName() + " has " + c.getMinionPoints() + " points.");

        //positive again.
        c.givePoints(5);
        System.out.println(c.getName() + " has " + c.getMinionPoints() + " points.");
    
        //revoke points.
        a.revokePoints(32);
        System.out.println(a.getName() + " has " + a.getMinionPoints() + " points");
        
        b.revokePoints(258);
        System.out.println(b.getName() + " has " + b.getMinionPoints() + " points");

        // revoke under 0 gives a false value.
        c.revokePoints(5483);
        System.out.println(c.getName() + " has " + c.getMinionPoints() + " points.");
        c.printMinionStatus();
    }
}
