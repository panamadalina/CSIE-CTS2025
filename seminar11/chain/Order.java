package dp.behavioral.chain;

public class Order {

	private String product;
	//private int price;
	private int difficulty;
	
	public Order(String product, int i) {
		// TODO Auto-generated constructor stub
		this.product=product;
		this.difficulty=i;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	

}
