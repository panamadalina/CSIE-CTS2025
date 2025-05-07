package decorator;

public class PizzaChicken extends DecoratorPizza{

	public PizzaChicken(APizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return super.getIngredient()+",chicken";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+10;
	}
	

}
