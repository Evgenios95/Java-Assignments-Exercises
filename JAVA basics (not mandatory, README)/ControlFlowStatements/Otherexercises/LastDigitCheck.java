public class LastDigitCheck {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(331, 154, 322));
        System.out.println(hasSameLastDigit(331, 154, 324));
        System.out.println(hasSameLastDigit(-331, -151, 322));
        System.out.println(hasSameLastDigit(332, 150, 912));
        System.out.println(hasSameLastDigit(425, 15, 19));
        System.out.println(hasSameLastDigit(311, 10, 320));
        System.out.println(isValid(35));
        System.out.println(isValid(-35));
    }

    public static boolean hasSameLastDigit(int x, int y, int a) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (a < 10 || a > 1000)) {
            return false;
        }

        int lastDigitx = x % 10;
        int lastDigity = y % 10;
        int lastDigita = a % 10;

        return (lastDigita == lastDigitx) || (lastDigita == lastDigity) || (lastDigitx == lastDigity);
    }

    public static boolean isValid(int validation) {
        return validation >= 10 && validation <= 1000;
    }

}
