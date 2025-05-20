package composite;

public class Product extends ANode{
	String name;
	float price;
	
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	String getName() {
		return this.name;
	}

	@Override
	float getPrice() {
		return this.price;
	}

}
