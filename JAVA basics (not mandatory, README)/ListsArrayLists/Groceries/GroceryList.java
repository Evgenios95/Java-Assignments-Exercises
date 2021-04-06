package Groceries;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<>();

    public ArrayList<String> getGroceries() {
        return this.groceries;
    }

    public void addgroceryItem(String item) {
        groceries.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceries.size() + " items in your grocery list.");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.get(i));
        }
    }

    // making it private because we need them to use the other one.
    private void modifyGroceryItem(int position, String newItem) {
        groceries.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public int findItem(String searchTerm) {
        return groceries.indexOf(searchTerm);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceries.get(position);
        groceries.remove(position);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}