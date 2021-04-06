public class DeskPhone implements ITelephone {

    //in order to be a valid class, these are the methods with the parameters etc. that we need so that the class is valid and complete
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No actions taken, no power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " +phoneNumber+" on deskphone.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone.");
            isRinging = false;
            //because we answered it
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("RIIIIIIIIIIIIIIIIIING RINGGGGGGG");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
    
}
