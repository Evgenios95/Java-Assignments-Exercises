public class GetEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(132));
        System.out.println(getEvenDigitSum(278546342));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEvens = 0;
/**
 * While the number is greate than zero, then: 1) store the remainder in a variable called numStorage. If this variable is even then add it to the evensum. After that, devide the number by 10, in order to get rid of the last digit. The while loop continues till the number is 0.
 */
        while (number > 0) {
            int numStorage = number % 10;
            if (numStorage % 2 == 0) {
                sumOfEvens += numStorage;
            }
            number /= 10;
        }
        return sumOfEvens;
    }

}
