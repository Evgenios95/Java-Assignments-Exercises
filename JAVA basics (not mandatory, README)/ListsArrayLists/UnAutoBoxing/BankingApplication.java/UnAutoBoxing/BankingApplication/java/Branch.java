package UnAutoBoxing.BankingApplication.java;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customer, double initialTransaction) {
        if (findCustomer(customer) == null) {
            customers.add(new Customer(customer, initialTransaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customerFound = customers.get(i);
            if (customerFound.getName().equals(customerName)) {
                return customerFound;
            }
        }
        return null;
    }

}
