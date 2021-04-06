package ConstructorsClasses;

public class VipBankAccount {

    private String name;
    private int creditLimit;
    private String emailAddress;


    public VipBankAccount() {
        this("Default name", 0, "noone@itu.dk");
    }

    public VipBankAccount(String name, int creditLimit) {
        this(name, creditLimit, "unknown@itu.dk");
    }

    public VipBankAccount(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public static void main(String[] args) {
        VipBankAccount bank1 = new VipBankAccount();
        System.out.println(bank1.getName());
        System.out.println(bank1.getCreditLimit());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        VipBankAccount bank2 = new VipBankAccount("Evgenios1", 4000);
        System.out.println(bank2.getName());
        System.out.println(bank2.getCreditLimit());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        VipBankAccount bank3 = new VipBankAccount("Evgenios2", 5000, "evgpa@itu.dk");
        System.out.println(bank3.getName());
        System.out.println(bank3.getCreditLimit());
    }
}
