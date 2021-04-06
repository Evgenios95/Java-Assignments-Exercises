public class WhileNumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(1543));
        System.out.println(isPalindrome(342));
        System.out.println(isPalindrome(232));
        System.out.println(isPalindrome(-11311));
    }

    public static boolean isPalindrome (int number) {
        if (number == 0) {
            return false;
        }
        
        int reverse = 0;
        int lastDigit = 0;
        int testingNumber = number;

        while (number != 0) {
            lastDigit = number % 10;
            number /= 10;
            reverse = (reverse * 10) + lastDigit;
        }
        return (testingNumber==reverse);
    }

}
