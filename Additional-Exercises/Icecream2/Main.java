
public class Main {
    public static void main(String[] args) {
        
       
        IceCreamShop myShop = new IceCreamShop("Minions");
        IceCreamShop myShop2 = new IceCreamShop("Minions2");
        System.out.println(myShop.getName());
        myShop.addFlavours("banana");
        myShop.addFlavours("strawberry");
        myShop.addFlavours("avocado");
        myShop2.addFlavours("avocado");
        myShop2.addFlavours("strawberry");
        myShop2.addFlavours("banana");
        // myShop.removeFlavours("avocado");
        // myShop.removeFlavours("banana");
        System.out.println(myShop.getVariants());
        System.out.println(myShop.amountOfVariants());
        myShop.printFlavours();
        System.out.println("\n");
        
        Shops newShopsList = new Shops ();
        newShopsList.addShop(myShop);
        newShopsList.addShop(myShop2);
        newShopsList.printShops("banana");
        newShopsList.printShops("avocado");
        newShopsList.printShops("water");

    }
}