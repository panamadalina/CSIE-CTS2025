package composite;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//level 0
		 Structure structuraMeniu = new Structure("Meniu restaurant");
		
		//level 1
		Structure meniuBauturi = new Structure("Bauturi");
		Structure meniuMancare = new Structure("Mancare");
		structuraMeniu.addNode(meniuBauturi);
		structuraMeniu.addNode(meniuMancare);
		
		//level 2 Bauturi
		meniuBauturi.addNode(new Product("Cafea",14));
		meniuBauturi.addNode(new Product("Coca cola",8));
		
		//level 2 Mancare
		Structure meniuPizza = new Structure("Pizza");
		Structure meniuPaste = new Structure("Paste");
		meniuMancare.addNode(meniuPizza);
		meniuMancare.addNode(meniuPaste);
		
		//level 3 Pizza
		meniuPizza.addNode(new Product("Pizza Romana",27));
		meniuPizza.addNode(new Product("Pizza Picanta",29));
		
		//level 3 Paste
		meniuPaste.addNode(new Product("Paste carbonara",31));
		meniuPaste.addNode(new Product("Paste bologneze",29));
		
		//afisare elem structura
		System.out.println(structuraMeniu.getInfo());
	}

}
