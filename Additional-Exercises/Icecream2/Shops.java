import java.util.ArrayList;

public class Shops {
    // takes the whole class and puts it inside it.
    private ArrayList<IceCreamShop> shops;

    public Shops() {

        shops = new ArrayList<IceCreamShop>();

    }

    public ArrayList<IceCreamShop> getIceCreamShops() {
        return shops;
    }

    public void addShop(IceCreamShop iceCreamShop) {
        if (!shops.contains(iceCreamShop)) {
            shops.add(iceCreamShop);
        }
    }

    public void removeShop(IceCreamShop iceCreamShop) {
        if (shops.contains(iceCreamShop)) {
            shops.remove(iceCreamShop);
        }
    }

    public int amountOfShops() {
        return shops.size();
    }

    public ArrayList<IceCreamShop> shopsWithFlavour(String flavour) {

        // so now we need to create a new and that's why we use ArrayList<IceCreamShop>
        // in the front

        ArrayList<IceCreamShop> shops2 = new ArrayList<IceCreamShop>();

        for (IceCreamShop iceCreamShop : shops) {

            if ((iceCreamShop.getVariants()).contains(flavour)) {

                shops2.add(iceCreamShop);

            }

        }

        return shops2;
    }

    public void printShops (String flavour){
        if (shopsWithFlavour(flavour).isEmpty()){
            System.out.println("Oh no, there are no shops with the " +  flavour + " variant");
        } else {
            System.out.println("These are the shops that have the " + flavour + " variant: ");
            for (IceCreamShop iceCreamShop : shopsWithFlavour(flavour)) {
               System.out.println(iceCreamShop.getName()); 
            }
        }

        
    }

}