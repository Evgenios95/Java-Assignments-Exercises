package UnAutoBoxing.BankingApplication.java;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        return (findBranch(branchName) == null) ? this.branches.add(new Branch(branchName)) : false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch existing = findBranch(branchName);

        return (existing != null) ? existing.newCustomer(customerName, initialTransaction) : false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch existing = findBranch(branchName);

        return (existing != null) ? existing.addCustomerTransaction(customerName, transaction) : false;

    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch existing = branches.get(i);
            if (existing.getName().equals(branchName)) {
                return existing;
            }
        }
        return null;
    }


    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
 
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}