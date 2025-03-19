package prototype;

public class Book implements Cloneable{

	String name;
	String autor;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String name, String autor, int price) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n\tBook [name=" + name + ", autor=" + autor + ", price=" + price + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
}
