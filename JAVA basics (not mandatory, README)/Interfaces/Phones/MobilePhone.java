public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " +phoneNumber+" on mobile phone.");
        } else {
            System.out.println("Phone still switched off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
            //because we answered it
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("RIIIIIIIIIIIIIIIIIING RINGGGGGGG");
        } else {
            isRinging = false;
            System.out.println("Phone not on or false number.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
