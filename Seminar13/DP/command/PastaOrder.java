package dp.behavioral.command;

public class PastaOrder implements IOrder{

	private Chief chief;
	private String typePasta;
	
	
	
	public PastaOrder(Chief chief, String typePasta) {
		super();
		this.chief = chief;
		this.typePasta = typePasta;
	}



	@Override
	public void process() {
		// TODO Auto-generated method stub
		chief.cookPasta(typePasta);
		
	}

}
