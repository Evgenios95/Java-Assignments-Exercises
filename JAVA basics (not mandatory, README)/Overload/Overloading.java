package Overload;

public class Overloading {
    public static void main(String[] args) {
        calculateScore("Evgenios", 100);
        calculateScore(1003);
        calculateScore();
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("Player scored no points.");
        return 0;
    }
}
