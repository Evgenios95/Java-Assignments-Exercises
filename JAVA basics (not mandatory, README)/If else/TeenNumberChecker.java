public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(13, 2, 32));
        System.out.println(TeenNumberChecker.hasTeen(19, 20, 30));
        System.out.println(TeenNumberChecker.hasTeen(1, 2, 322));
        System.out.println(isTeen(1));
        System.out.println(isTeen(15));
    }

    public static boolean hasTeen(int first, int second, int third) {
        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int maybeTeenager) {
        if (maybeTeenager >= 13 && maybeTeenager <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
