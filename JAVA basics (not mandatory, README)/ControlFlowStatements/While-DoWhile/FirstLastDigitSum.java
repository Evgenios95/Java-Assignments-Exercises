public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(158));
        System.out.println(sumFirstAndLastDigit(1583));
        System.out.println(sumFirstAndLastDigit(-158));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number;
        int lastDigit = number % 10;

        do {
            firstDigit = number % 10;
            number /= 10;
        } while (number > 0);
        return (firstDigit + lastDigit);
    }

}