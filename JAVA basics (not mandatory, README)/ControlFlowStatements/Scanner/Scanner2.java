import java.util.Scanner;
/**
 * The user will add 10 numbers that he wants. After adding the 10th one the counting will stop and all of these numbers will be added in the sum variable. If you give it a string you need to type an int. It doesn't accept it.
 */
public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {

            int i = count + 1;
            System.out.println("Enter number #" + i);

            boolean hasNextInteger = scanner.hasNextInt();

            if (hasNextInteger){
                int number = scanner.nextInt();
                count++;
                sum += number;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number.");
            } 
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
