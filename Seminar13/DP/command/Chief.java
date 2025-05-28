package dp.behavioral.command;

public class Chief {

	private String name;
	
	public Chief(String name) {
		this.name=name;
	}
	
	public void cookPizza(String typePizza) {

		System.out.println("The Chief "+this.name+" cooked pizza " + typePizza);
	}
	public void cookPasta(String typePasta) {

		System.out.println("The Chief "+this.name+" cooked pasta " + typePasta);
	}
}
