package dp.behavioral.command;

public class PizzaOrder implements IOrder{

	private Chief chief;
	private String typePizza;
	
	
	
	public PizzaOrder(Chief chief, String typePizza) {
		super();
		this.chief = chief;
		this.typePizza = typePizza;
	}



	@Override
	public void process() {
		// TODO Auto-generated method stub
		chief.cookPizza(typePizza);
	}

}
