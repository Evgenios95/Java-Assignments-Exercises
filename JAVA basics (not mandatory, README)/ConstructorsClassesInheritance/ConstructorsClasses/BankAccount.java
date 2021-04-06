package ConstructorsClasses;

public class BankAccount {
    private String accountNumber;
    private String customerName;
    private int balance;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        // this will call the next constructor because it's in the first line
        this("432313", "Default name", 0, "Default email", 0000000000);
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this("432313", customerName, 0, email, phoneNumber);
    }

    // keep the initialization in one constructor and use the others to call this
    // constructor.
    public BankAccount(String accountNumber, String customerName, int balance, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmailAddress() {
        return email;
    }

    public void setEmailAddress(String address) {
        this.email = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int number) {
        this.phoneNumber = number;
    }

    public void depositFunds(int fund) {
        balance += fund;
    }

    public void withdrawFunds(int withdrawMoney) {
        if (getBalance() > withdrawMoney) {
            balance -= withdrawMoney;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("134000", "Leeroy Jenkins", 30000, "jenkins@itu.dk", 27329501);
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());
        System.out.println(bank.getCustomerName());
        System.out.println(bank.getEmailAddress());
        System.out.println(bank.getPhoneNumber());

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        BankAccount bank2 = new BankAccount("Stav poleo", "evpas@itu.dk", 83123131);
        System.out.println(bank2.getAccountNumber());
        System.out.println(bank2.getBalance());
        System.out.println(bank2.getCustomerName());
        System.out.println(bank2.getEmailAddress());
        System.out.println(bank2.getPhoneNumber());

    }
}
