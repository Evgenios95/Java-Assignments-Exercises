import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food{
	
	protected List<String> toppings = new ArrayList<String>();
	
	public Pizza() {
		super.setName("Pizza");
		super.setPrice(45);
		toppings.clear();
	}
	
	
	public void addTopping(String topping) {
		toppings.add(topping);
		int price = super.getPrice() + 10;
		super.setPrice(price);
	}

	
	@Override
	public void display() {
		super.display();
		String separator = " ";  // first, no space
		System.out.print(" {");
		for (String word : toppings) {
		    System.out.print(separator);
		    System.out.print(word);
		    separator = ", ";    // after first iteration, a space between the words
		}
		System.out.println(" }");
	}


	@Override
	public void setName(String name) {
		super.setName(name);
	}

}
