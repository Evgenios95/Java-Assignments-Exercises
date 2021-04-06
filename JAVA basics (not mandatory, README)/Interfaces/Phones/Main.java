public class Main {
    public static void main(String[] args) {
        ITelephone evgenPhone;
        evgenPhone = new DeskPhone(27542311);
        evgenPhone.powerOn();
        evgenPhone.callPhone(27542311);
        evgenPhone.answer(); 

        System.out.println("=====================");
        System.out.println("=====================");

        evgenPhone = new MobilePhone(32345231);
        evgenPhone.powerOn();
        evgenPhone.callPhone(32345231);
        evgenPhone.answer();
        };
    }

