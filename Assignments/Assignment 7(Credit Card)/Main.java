public class Main {

	public static void main(String[] args) {

		Pizza Pizza1 = new Pizza();
		Food Burger = new Food("Burger", 65);
		Food Coke = new Food("Coke", 25);
		Order Order = new Order();
		
		
		Pizza1.addTopping("Pepperoni");
		Pizza1.addTopping("Pineapple");
		Pizza1.addTopping("Onion");
		
		Order.addFood(Burger);
		Order.addFood(Coke);
		Order.addFood(Pizza1);
		
		Order.display();
	}

}
