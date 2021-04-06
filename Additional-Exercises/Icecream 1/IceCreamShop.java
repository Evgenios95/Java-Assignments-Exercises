import java.util.ArrayList;

public class IceCreamShop {

    private String shopName;
    private ArrayList<String> myArr;

    public IceCreamShop(String myShopsName) {
        this.shopName = myShopsName;
        // new icecreamshops which have different names.
        myArr = new ArrayList<>();
        // When we initialize an arraylist dont fucking use anything before the name.
    }

    public String getName() {
        return shopName;
    }

    public ArrayList<String> getVariants() {
        return myArr;
    }

    public void addFlavours(String flavour) {

        if (!myArr.contains(flavour)) {
            myArr.add(flavour);
        }
    }

    public void removeFlavours(String flavour) {
        if (myArr.contains(flavour)) {
            myArr.remove(flavour);
        }
    }

    public int amountOfVariants() {
        return myArr.size();
    }

    public void printFlavours() {

        System.out.print(shopName + " has " + myArr.size() + " different flavours: ");

        for (int i = 0; i < myArr.size(); i++) {
            System.out.print(myArr.get(i) + " ");

        }

    }

}
