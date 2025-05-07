package dp.behavioral.chain;

public class ProgMain {

	/*
	 * 
	 * Definirea unui lant de responsabili ce pot trata un eveniment
Nivel de importanta atasat evenimentului -> o clasa particulara ce poate trata respectivul eveniment

	 * */
	public static void main(String[] args) {
		Order c1 = new Order("coffee", 3);
		Order c2 = new Order("pizza", 15);
		
		//creare lant 
		Handler waiter = new Waiter();
		Handler chef = new Chef();
		waiter.setSuccesor(chef);
		
		//trimitere comenzi la first handler
		waiter.processOrder(c1);
		waiter.processOrder(c2);
	}
}
