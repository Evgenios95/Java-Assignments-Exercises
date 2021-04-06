import java.util.Scanner;

public class ResizeArray {
    private static int[] myArray = new int[7];
    private static Scanner scanner = new Scanner(System.in);
    

    private static void getArrayInput() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            // to print it vertically
            // System.out.println();
        }
    }

    private static void resizeArray() {
        int[] original = myArray;
        myArray = new int[12];

        for (int i = 0; i < original.length; i++) {
            myArray[i] = original[i];
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 7 ints: ");
        getArrayInput();
        printArray(myArray);
        resizeArray();

        System.out.println("\nEnter 9 numbers: ");
        getArrayInput();
        printArray(myArray);
    }
}
