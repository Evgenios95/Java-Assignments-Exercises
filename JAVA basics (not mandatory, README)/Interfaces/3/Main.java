import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Evgenios", 10, 15);
        System.out.println(player.toString());
        saveObject(player);
        player.setHitPoints(8);
        System.out.println(player);
        player.setWeapon("Ragnaros");
        saveObject(player);
        loadObject(player);
        System.out.println(player);

        ISaveable werewolf = new Monster("WereWoolf", 40, 32);
        System.out.println(((Monster)werewolf).getName());
        saveObject(werewolf);







    }

    public static ArrayList <String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

        while (!quit) {
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                
                case 1:
                System.out.print("Enter a string: ");
                String stringInput = sc.nextLine();
                values.add(index, stringInput);
                index++;
                break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
           System.out.println("Saving " + objectToSave.write().get(i) + " to storage device"); 
        }
    }

    public static void loadObject (ISaveable obhectToLoad){
        ArrayList<String> values = readValues();
        obhectToLoad.read(values);
    }
}
