public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private int price;
    private int additionalPrice;

    public Hamburger(String name, String breadRollType, String meat, int price) {
        this.breadRollType = breadRollType;
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    public void printMenu() {
        System.out.println("======== EVGENIOS BEST BURGERS  =======");
        System.out.println("1. Lettuce 	  || Base price: €1");
        System.out.println("2. Tomato  	  || Base price: €1");
        System.out.println("3. Cheese  	  || Base price: €2");
        System.out.println("4. Pickles	  || Base price: €1");
    }

    public void addAdditionalIngredients(int choose){
        if (choose > 0 && choose <=4) {
            switch (choose) {
                case 1:
                int addLettucePrice = 1;
                setAdditionalPrice(getAdditionalPrice() + addLettucePrice);
                System.out.println("Lettuce added.");
                break;
                case 2:
                int addTomatoPrice = 1;
                setAdditionalPrice(getAdditionalPrice() + addTomatoPrice);
                System.out.println("Tomato added.");
                break;
                case 3:
                int addCheesePrice = 2;
                setAdditionalPrice(getAdditionalPrice() + addCheesePrice);
                System.out.println("Cheese added.");
                break;
                case 4:
                int addPicklesPrice = 1;
                setAdditionalPrice(getAdditionalPrice() + addPicklesPrice);
                System.out.println("Pickles added.");
                break;
            }
        }
    }

    public void orderComplete(){
        System.out.println("\n==================== CHECK OUT ORDER ====================");
        System.out.println("Congrats on choosing the " + getName() + " burger!");
        System.out.println("The initial cost is " + getPrice()+ " €.");
        System.out.println("The cost of your additional ingredients is " + getAdditionalPrice() + " €.\nThe total cost of your order is " + getTotalPrice()+ " €.\n");
    }

    public String getName() {
        return this.name;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }

    public String getMeat() {
        return this.meat;
    }

    public int getPrice() {
        return this.price;
    }

    public int getAdditionalPrice() {
        return this.additionalPrice;
    }
 
    public void setAdditionalPrice(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public int getTotalPrice(){
        return this.price += getAdditionalPrice();
    }
}

class HealthyHamburger extends Hamburger{

    public HealthyHamburger() {
        super("Healthy", "Vegan based buns", "Chicken breast", 10);
    }

    @Override
    public void printMenu() {
        super.printMenu();
        System.out.println("5. Onion	  || Base price: €1");
        System.out.println("6. Guacamole      || Base price: €3");
    }

    @Override
    public void addAdditionalIngredients(int choose) {
        super.addAdditionalIngredients(choose);
        switch (choose) {
            case 5:
            int addOnionsPrice = 1;
            setAdditionalPrice(getAdditionalPrice() + addOnionsPrice);
            System.out.println("Onions added.");
            break;
            case 6:
            int addGuacamolePrice = 3;
            setAdditionalPrice(getAdditionalPrice() + addGuacamolePrice);
            System.out.println("Guacamole added.");
            break;
        }
    }
    @Override
    public void orderComplete() {
        super.orderComplete();
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Bun with bacon", "Beef", 11);
    }

    @Override
    public void addAdditionalIngredients(int choose) {
        switch (choose) {
            case 1:
            int addChipsPrice = 3;
            setAdditionalPrice(getAdditionalPrice() + addChipsPrice);
            System.out.println("Chips added.");
            break;
            case 2:
            int addCokePrice = 2;
            setAdditionalPrice(getAdditionalPrice() + addCokePrice);
            System.out.println("Coke added.");
            break;
        }
    }

    @Override
    public void printMenu() {
        System.out.println("======== EVGENIOS BEST BURGERS  =======");
        System.out.println("1. Chips 	  || Base price: €3");
        System.out.println("2. Coke  	  || Base price: €2");
    }

    @Override
    public void orderComplete() {
        super.orderComplete();
    }

}
