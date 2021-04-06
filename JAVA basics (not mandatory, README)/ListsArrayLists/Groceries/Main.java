package Groceries;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceries = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int chooseOption = 0;
        getInstructions();
        // continue processing till the user wants to quit
        while (!quit) {
            System.out.println("Enter choice below: \r");
            chooseOption = scanner.nextInt();
            // to clear the input buffer.
            scanner.nextLine();

            switch (chooseOption) {
                case 0:
                    getInstructions();
                    break;
                case 1:
                    groceries.printGroceryList();
                    break;
                case 2:
                    addTheItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                // case 6:
                //     processArrayList();
                //     break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void getInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the whole list.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an already existing item.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        // System.out.println("\t 6 - To process the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addTheItem() {
        System.out.print("Please enter the item: ");
        groceries.addgroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter the replacement item: ");
        String item = scanner.nextLine();
        // why deducting 1? the index starts from 0. But the user will start from 1.
        groceries.modifyGroceryItem(oldItem, item);
    }

    public static void removeItem() {
        System.out.print("Enter the name of the item you want to remove: ");
        String removed = scanner.nextLine();
        groceries.removeGroceryItem(removed);
    }

    public static void searchItem() {
        String searchTerm = scanner.nextLine();
        if (groceries.onFile(searchTerm)) {
            System.out.println("Found " + searchTerm + " in the grocery list :D");
        } else {
            System.out.println(searchTerm + " not found.");
        }
    }

    // public static void processArrayList() {
    //     // ArrayList<String> newList = new ArrayList<>();
    //     // //take the elements of the arraylist and put them in the new arraylist.
    //     // newList.addAll(groceries.getGroceries());

    //     // //same thing of copying it but when we initialize it.
    //     // ArrayList<String> newList2 = new ArrayList<>(groceries.getGroceries());

    //     //3rd way: passing them to an array. firstly we need to declare the size.
    //     //Secondly we need to get the arraylist and convert it to an array.
    //     // String[] myArray = new String[groceries.getGroceries().size()];
    //     // myArray = groceries.getGroceries().toArray(myArray);

    // }

}
