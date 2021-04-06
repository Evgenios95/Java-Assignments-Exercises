import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DinoDatabase {

    private Map<String, Integer> dinos;

    public DinoDatabase() {
        dinos = new HashMap<>();
    }

    public int size() {
        return dinos.size();
    }

    public void addDino(String newDino, int weight) {

        if (!dinos.containsKey(newDino)) {
            dinos.put(newDino, weight);
            System.out.println(newDino + " added. Weight: " + weight + "kg");
        } else {
            System.out.println(newDino + " cannot be added. It is already in the database!");
        }
    }

    public void updateDino(String newDino, int weight) {
        if (!dinos.containsKey(newDino)) {
            System.out.println(newDino + " cannot be updated. It is not in the database!");
        } else {
            dinos.replace(newDino, weight);
            System.out.println(newDino + " updated. Weight: " + weight + "kg");
        }
    }

    public void removeDino(String removedDino) {
        if (!dinos.containsKey(removedDino)) {
            System.out.println(removedDino + " cannot be removed. It is not in the database!");
        } else {
            dinos.remove(removedDino);
            System.out.println(removedDino + " removed");
        }
    }

    public int getWeight(String name) {
        if (dinos.containsKey(name)) {
            // The get method in the map goes throught the map and searches for the key that
            // you put in and then returns the value that you put for that. And then it
            // returns the value return = 0; which is actually connected to the key.
            return dinos.get(name);
        } else {
            System.out.println(name + " cannot be found in the database!");
            return 0;
        }
    }

    public Set<String> getDinoNames() {
        Set<String> names = new HashSet<>(dinos.keySet());
        return names;
    }

    public String getHeaviest() {
        String returnString = "";
        if (dinos == null) {

            return returnString;
        } else {

            int returnInt = 0;
            Collection<String> weightStrings;
            weightStrings = dinos.keySet();
            int i = 0;
            for (String string : weightStrings) {
                String makeThisAnIntegerPlease;
                makeThisAnIntegerPlease = dinos.get(string).toString();
                i = Integer.parseInt(makeThisAnIntegerPlease);
                if (i > returnInt) {
                    returnInt = i;
                    returnString = string;
                }
            }

            return returnString;

        }

    }
}