import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0;

        //why did we set reversed values? Any number that the user enters will be equal or in the range of those 2 numbers in general. For example number we insert will always be smaller than the max int. So after the 2nd is used in the terminal and since it's going to be less than the maximum, the else if statememnt will be executed, as the currentnumber is less than the maximum, and less than the minimum, which is actually the highest possible value for an int.
        
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInteger = scanner.hasNextInt();

            if (hasNextInteger) {
                currentNumber = scanner.nextInt();

                if (currentNumber > maximum) {
                    maximum = currentNumber;
                } else if (currentNumber < minimum) {
                    minimum = currentNumber;
                }

            } else {
                System.out.println("Invalid Value");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + minimum + " Maximum = " + maximum);
        scanner.close();
    }
}
