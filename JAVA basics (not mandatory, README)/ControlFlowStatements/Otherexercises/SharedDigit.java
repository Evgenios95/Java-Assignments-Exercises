public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(72, 29));
        System.out.println(hasSharedDigit(1, 29));
        System.out.println(hasSharedDigit(11, -29));
        System.out.println(hasSharedDigit(3, 229));
        System.out.println(hasSharedDigit(11, 91));
    }

    public static boolean hasSharedDigit (int number1, int number2){
        if ((number1<10 || number1>99) || (number2<10 || number2>99)) {
            return false;
        }

        int firstDigitOf1 = number1 / 10;
        int secondDigitOf1 = number1 % 10;
        int firstDigitOf2 = number2 / 10;
        int secondDigitOf2 = number2 % 10;

        return (firstDigitOf1 == firstDigitOf2) || (firstDigitOf1 == secondDigitOf2) || (secondDigitOf1==secondDigitOf2)||(secondDigitOf1==firstDigitOf2);
        }
    }


