package ternary;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 43));
        System.out.println(isCatPlaying(false, 32));
        System.out.println(isCatPlaying(false, 42));
        System.out.println(isCatPlaying(true, 1));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        // if ((summer && temperature >= 25 && temperature <= 45) || (temperature >= 25 && temperature <= 35)) {
        //     return true;
        // } else {
        //     return false;
        // }

        return (temperature >= 25 && temperature <= (summer ? 45 : 35));
    }
}
