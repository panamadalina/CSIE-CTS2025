package decorator;

public class DecoratorPizza extends APizza{

	protected APizza pizza;
	
	public DecoratorPizza(APizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return pizza.getIngredient();
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

	
}
