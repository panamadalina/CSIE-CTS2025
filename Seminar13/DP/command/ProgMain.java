package dp.behavioral.command;

public class ProgMain {
	/*
	 * Lista de actiuni/comenzi ce pot fi executate mai tarziu
	Se decupleaza executia intarziata a unei actiuni de proprietar/declansator
	*/
	public static void main(String[] args) {
		
		Chief b1 = new Chief("John");
		Chief b2 = new Chief("Michael");
		
		Waiter waiter = new Waiter();
		
		waiter.noteOrder(new PastaOrder(b1,"carbonara"));
		waiter.noteOrder(new PizzaOrder(b2, "diavola"));
		waiter.noteOrder(new PastaOrder(b1, "with chicken"));
		
		//plasarea intarziata a tuturor comenzilor
		waiter.sendOrders();
		
	}
}
