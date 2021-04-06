import java.util.ArrayList;
import java.util.List;

public class Order{

	protected List<Food> ordered = new ArrayList<Food>();

	public Order() {
		ordered.clear();
	}

	public void addFood(Food food) {
		ordered.add(food);
	}

	public int total() {

		int totalPrice = 0;
		for (Food total : ordered) {
			totalPrice += total.getPrice();
		}
		return totalPrice;
	}

	public void display() {

		String separator = ""; // first, no space
		for (Food total : ordered) {
			System.out.print(separator);
			total.display();
			separator = "\n"; // after first iteration, a space between the words
		}
		int totalPrice = total();
		System.out.print("\n" + totalPrice + " kr TOTAL");
	}
	public boolean payWith(CreditCard card) {
		if (card.withdraw(total())){
			return card.withdraw(total());
		} else {
			System.out.println("ERROR: Payment failed");
			return card.withdraw(total());
		}
}
}
