package Encapsulation1;

public class Main {
    public static void main(String[] args) {
        // Player player1 = new Player();
        // // manually set the values for the field since there's no constructor.
        // player1.fullName = "Garona";
        // player1.health = 3000;
        // player1.weapon = "Torkarpus";

        // int damage = 1900;
        // player1.loseHealth(damage);
        // System.out.println("The remaining health of " + player1.fullName + " is: " + player1.healthRemaining());

        // damage = 2100;
        // player1.health = 2200;
        // player1.loseHealth(damage);
        // System.out.println("The remaining health of " + player1.fullName + " is: " + player1.healthRemaining());

        EnhancedPlayer ePlayer = new EnhancedPlayer("Garona", 50, "Sylvanium");
        System.out.println("Initial health is " + ePlayer.getHealth()+".");
    }
}
