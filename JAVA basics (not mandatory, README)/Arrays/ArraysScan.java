import java.util.Scanner;

public class ArraysScan {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " +i+ " typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getArrayAverage(myIntegers));
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter " + num + " integer values.\r");
        int[] values = new int[num];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getArrayAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) (sum/array.length);
    }
}
