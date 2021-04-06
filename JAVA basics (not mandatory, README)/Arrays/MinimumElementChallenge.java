import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count) {
        System.out.println("Enter the numbers below: \r");
        int[] myArray = new int[count];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    private static int findMin(int[] myArray) {
        int minHolder = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minHolder) {
                minHolder = myArray[i];
            }
        }
        return minHolder;
    }

    public static void main(String[] args) {
        int[] myArray = readIntegers(8);
        System.out.println("Minimum number is : " + findMin(myArray));
    }

}
