public class Food {
	
	protected String name = null;
	protected int price = 0;
	
	public Food() {

	}
	
	public Food(String name, int price) {
//		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	
	public void display() {
		
		System.out.print(price + " kr " + name);
		
	}
}
