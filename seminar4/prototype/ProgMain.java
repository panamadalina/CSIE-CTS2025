package prototype;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bookshop bs=new Bookshop();
		//assign the values from main
		//bs.setName("lala");
		
		//or from database
		bs.loadDataDB("Carturesti"); //aceasta metoda dureaza prea mult!!
		System.out.println(bs);
		//fara clone
		
		//////////////////////////////////////////////////////////////
		
		
		//SHALLOW COPY!!
		System.out.println("---SHALLOW COPY---");
		Bookshop bsClone;
		bsClone=bs;//shallow copy!!!!!!
		
		System.out.println(bsClone);
		bsClone.setShopName("Diverta");
		System.out.println(bsClone.getShopName());
		System.out.println(bs.getShopName());//shallow copy
		
		//////////////////////////////////////////////////////////////
		
		
		//DEEP COPY!!!
		System.out.println("---DEEP COPY---");
		bs.setShopName("Carturesti");
		Bookshop bsClone2;
		try {
			bsClone2 = (Bookshop) bs.clone(); //new Bookshop();   //without fatching data from DB
			//adauga clonable!!

			bsClone2.setShopName("Elefant");
			System.out.println(bsClone2);
			
		
			bs.setShopName("change!");
			System.out.println(bsClone2.getShopName());	
			
			
			//Case 3:
			System.out.println("FAKE DEEP COPY");
			bs.books.remove(2);
			System.out.println(bsClone2);
			
			//change the clone() method;// ruleaza din nou, acum e ok
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
	}

}
