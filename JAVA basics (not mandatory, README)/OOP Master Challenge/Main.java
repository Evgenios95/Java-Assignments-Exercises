public class Main {
    public static void main(String[] args) {
        Hamburger burger = new Hamburger("Base", "Simple", "Beef", 8);
        System.out.println("\n");
        burger.printMenu();
        burger.addAdditionalIngredients(2);
        burger.addAdditionalIngredients(3);
        burger.addAdditionalIngredients(4);
        burger.addAdditionalIngredients(1);
        burger.addAdditionalIngredients(1);
        burger.orderComplete();

        Hamburger healthy = new HealthyHamburger();
        healthy.printMenu();
        healthy.addAdditionalIngredients(2);
        healthy.addAdditionalIngredients(4);
        healthy.addAdditionalIngredients(1);
        healthy.addAdditionalIngredients(5);
        healthy.addAdditionalIngredients(6);
        healthy.orderComplete();

        Hamburger deluxe = new DeluxeBurger();
        deluxe.printMenu();
        deluxe.addAdditionalIngredients(2);
        deluxe.addAdditionalIngredients(1);
        deluxe.orderComplete();


    }
}
