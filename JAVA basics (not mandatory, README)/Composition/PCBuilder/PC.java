package PCBuilder;

public class PC {
    // it's comprised of the motherboard,case and monitor. it's going to have all of
    // these objects. There would be limitations with inheritance.

    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherBoard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawTheLogo();
        theMotherBoard.loadProgram("Windows 10");
    }

    private void drawTheLogo() {
        theMonitor.drawPixelAt(1322, 45, "blue");
    }

    // public Case getTheCase() {
    // return this.theCase;
    // }

    // public Monitor getTheMonitor() {
    // return this.theMonitor;
    // }

    // public Motherboard getTheMotherBoard() {
    // return this.theMotherBoard;
    // }

}
