public class NumberToWord {

    public static void main(String[] args) {
        numberToWords(13245);
        numberToWords(3241412);
        numberToWords(0);
        numberToWords(1);
        numberToWords(-32);
        numberToWords(10000);
    }

    public static void numberToWords(int number) {
        if (number < 0)
            System.out.println("Invalid Value");

        int countNumbers = getDigitCount(number);
        number = reverse(number);

        for (int i = 0; i < countNumbers; i++) {
            int lastDigitExtraction = number % 10;
            switch (lastDigitExtraction) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                default:
                    break;
            }

            number /= 10;
        }
    }

    public static int reverse(int number) {

        int reversingNumber = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            reversingNumber = (reversingNumber * 10) + digit;
            number /= 10;
        }
        return reversingNumber;
    }


    //shmantiko einai panta na afairoume to teleytaio pshfio gia na synexizei to count!!!
    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int counter = 0;
        // for (int i = 1; i < number; i++) {
        // counter++;
        // number/=10;
        // }
        do {
            counter++;
            number /= 10;
        } while (number > 0);
        return counter;
    }
}
