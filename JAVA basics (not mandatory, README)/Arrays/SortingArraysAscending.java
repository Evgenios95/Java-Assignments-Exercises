import java.util.Scanner;

public class SortingArraysAscending {

    private static Scanner scanner = new Scanner(System.in);

    static int[] getIntegers(int numberOfElements) {
        System.out.println("Enter " + numberOfElements + " numbers below: \r");
        int[] integersArray = new int[numberOfElements];
        for (int i = 0; i < integersArray.length; i++) {
            integersArray[i] = scanner.nextInt();
        }
        return integersArray;
    }

    static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " is: " + myArray[i]);
        }
    }

    static int[] SortingArrayDescending(int[] myArray) {
        // initialize a new array with the length of the imported array
        int[] sortedArray = new int[myArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            // we store every number of the give array to the array which will short our
            // ints
            sortedArray[i] = myArray[i];
        }
        boolean loopStopper = true;
        int sorterVar;
        while (loopStopper) {
            loopStopper = false;
            // if the index of the sorted array is less than the next one, then assign this
            // number to temp.. we store it. 5.Then we are swapping them through saying that
            // [i+1] goes int the [i][position] and then we assign the temp variable back.
            for (int i = 0; i < sortedArray.length; i++) {
                for (int j = i + 1; j < sortedArray.length; j++) {
                    if (sortedArray[i] > sortedArray[j]) {
                        sorterVar = sortedArray[i];
                        sortedArray[i] = sortedArray[j];
                        sortedArray[j] = sorterVar;
                        loopStopper = true;
                    }
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[] sortedArray = SortingArrayDescending(myArray);
        printArray(sortedArray);
    }

}
