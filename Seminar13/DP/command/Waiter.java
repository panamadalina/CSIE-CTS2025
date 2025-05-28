package dp.behavioral.command;

import java.util.ArrayList;

public class Waiter {

	private ArrayList<IOrder> ordersList = new ArrayList<>();
	
	public void noteOrder(IOrder comanda) {
		ordersList.add(comanda);
	}
	
	public void sendOrders() {
		for(IOrder o: ordersList)
			o.process();
		ordersList.clear();
	}
}
