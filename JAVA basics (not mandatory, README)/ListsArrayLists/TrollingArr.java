import java.util.ArrayList;

public class TrollingArr {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Lich King");
        arr.add("Gul' Dan");
        arr.add("Falric");
        arr.add("Marwyn");
        arr.add("Rotface");

        //printing the whole arraylist.
        System.out.println(arr+"\n");

        //Different values.index.
        System.out.println("The value of index 0 is: " + arr.get(0));
        System.out.println("The value of index 1 is: " + arr.get(1));
        System.out.println("The value of index 2 is: " + arr.get(2));
        System.out.println("The value of index 3 is: " + arr.get(3)+"\n");

        //adding values
        arr.add("Twin Emperors"); arr.add("Professor Putricide"); arr.add("Kael'thas");
        System.out.println(arr+"\n");

        //adding values to specific index. They are assigned this position and then the rest of the array moves rightwise.
        arr.add(2, "Algalon");
        arr.add(4, "Cyanigosa"); 
        System.out.println(arr +"\n");

        //value 2 was Falric but not it's Algalon. Falric's index:3
        System.out.println("The value of index 2 is: " + arr.get(2));
        System.out.println("The value of index 3 is: " + arr.get(3) +"\n");

        //So, let's replace Rotface with Dreamscythe and Professor Putricide with Argus.
        arr.set(6, "Dreamscythe");
        arr.set(8, "Argus");
        System.out.println("The values in index 6 & 8 are: " + arr.get(6)+ " and "+ arr.get(8));
        System.out.println(arr+"\n");

        //Let's remove some values now. We know that Twin Emperor's index is 7. so if x>7 that means that the bosses after 7 will be removed. After that I'll also remove 0 and 4.
        for (int x = arr.size() -1; x>7; x--){
            arr.remove(x);
        }
        arr.remove(0);
        arr.remove(4);
        System.out.println(arr + "\n");
        
        //Number of elements in an arraylist. (int index)
        System.out.println(arr.size() + "\n");

        //another for loop. If i is smaller than the size of my array which is 6, it should post the bosses names.
        for (int i = 0; i<arr.size(); i++){
            System.out.println(arr.get(i) + "" );
        }

        System.out.println("\n");

        //representation of the collection.
        for (String num : arr){
            System.out.println(num + "");   
        }
        System.out.println("\n" + arr); // returns string representation of the collection, which consists of every element in the order they are returned by iterator.

        //Checking out if the arraylist is empty. But it's not.
        System.out.println("\nIs the arraylist empty? -> " +arr.isEmpty()+ "\n");

        //if i remove every item and then check if its empty then it returns true.

        // arr.removeAll(arr);
        // System.out.println(arr + " \n" + arr.isEmpty());

        //checking if an arraylist contains specific elements.
        System.out.println("If the arraylist contains Gul'dan give me true: " +arr.contains("Gul' Dan"));
        System.out.println("If the arraylist contains Valyria give me false: " +arr.contains("Valyria") +"\n");

        //I need the index of some elements. Careful! If it's not there it will return -1
        System.out.println("Index is : " +arr.indexOf("Gul' Dan"));
        System.out.println("Index is : " +arr.indexOf("Twin Emperors"));
        System.out.println("Index is : " +arr.indexOf("Will return -1")+ 
        "\n");


        // Now we will remove everything like we did with arr.removeAll
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);

    }
}
