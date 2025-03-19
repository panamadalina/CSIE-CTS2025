package prototype;

import java.util.ArrayList;
import java.util.List;

public class Bookshop implements Cloneable{

	String shopName;
	ArrayList<Book>books=new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Bookshop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public void loadDataDB(String bookshopName) {
		this.shopName=bookshopName;
		Book b;
		for(int i=0;i<10;i++) {
			//load data from database
			b=new Book();
			b.setName(bookshopName+" - "+i);
			b.setAutor("Mada - "+i);
			b.setPrice(i*10);
			this.books.add(b);
			b=null;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//FAKE DEEP COPY //
		
		//return super.clone();//lasa asa pana la case3
		Bookshop bsClone=new Bookshop();
		bsClone.setShopName(this.shopName);
		bsClone.books=(ArrayList<Book>) this.books.clone();
		
		return bsClone;
		
		
		/*
		 * If the class has only primitive data type members 
		 * then a completely new copy of the object will be created and 
		 * the reference to the new object copy will be returned.
If the class contains members of any class type 
then only the object references to those members are copied and hence
 the member references in both the original object as well 
 as the cloned object refer to the same object.*/
		
	}
	
	
	
	
}
