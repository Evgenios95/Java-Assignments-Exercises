package PCBuilder;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("C10", "Razer", "240", dimensions);
        // create an instnace of a class
        Monitor theMonitor = new Monitor("C1234", "Asus", 28, new Resolution(1080, 1920));

        Motherboard theMotherBoard = new Motherboard("UL-2384", "Dell", 2, 3, "v 2.99");

        PC myPc = new PC(theCase, theMonitor, theMotherBoard);
        // when it's about composition the way to access the methods in the classes that
        // comprise the pc is riding the name of the instance, then the getter method of
        // the pc class and then the method.

        // myPc.getTheCase().pressPowerButton();
        // myPc.getTheMotherBoard().loadProgram("World of Warcraft");
        // myPc.getTheMonitor().drawPixelAt(100, 232, "red");

        //calling them in the pc method, no use of getters in this version
        myPc.powerUp();

    }
}
