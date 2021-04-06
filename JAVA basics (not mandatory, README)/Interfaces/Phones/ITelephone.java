public interface ITelephone {
    //we define the contract, that are valid for each method to make the classes valid
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
