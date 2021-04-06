
public class Main {
    public static void main(String[] args) {
        
       
        IceCreamShop myShop = new IceCreamShop("Minions");
        System.out.println(myShop.getName());
        myShop.addFlavours("banana");
        myShop.addFlavours("strawberry");
        myShop.addFlavours("avocado");
        myShop.addFlavours("avocado");
        // myShop.removeFlavours("avocado");
        // myShop.removeFlavours("banana");
        myShop.removeFlavours("salami");
        System.out.println(myShop.getVariants());
        System.out.println(myShop.amountOfVariants());
        myShop.printFlavours();
        

    }
}