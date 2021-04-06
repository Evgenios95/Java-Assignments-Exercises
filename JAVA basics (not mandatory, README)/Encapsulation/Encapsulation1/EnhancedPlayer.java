package Encapsulation1;

public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    //health getter is public but it's calling a private field with a different name like hitpoints. Since it can only be accessed by this class and it's private, nothing will change. We can do it with everything that we dont want to be exposed. It is just a black box.

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints > 0 && hitPoints <=100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth (int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player is dead.");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.hitPoints;
    }

    public String getWeapon() {
        return this.weapon;
    }
}