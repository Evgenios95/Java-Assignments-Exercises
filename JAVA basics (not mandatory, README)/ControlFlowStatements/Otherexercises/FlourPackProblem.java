public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(5, 4, 19));
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        return ((bigCount * 5) + smallCount >= goal) && (goal%5 <= smallCount) && ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0));
    }
}
