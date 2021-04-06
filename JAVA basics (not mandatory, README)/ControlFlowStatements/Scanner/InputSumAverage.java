import java.util.Scanner;

public class InputSumAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0l;

        while (true) {
            boolean hasNextInteger = sc.hasNextInt();

            if (hasNextInteger) {
                int number = sc.nextInt();
                sum += number;
                count++;
                average = Math.round((double)sum / count);
            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " +average);
        sc.close();
    }

}
