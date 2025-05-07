package dp.behavioral.chain;

public class Chef extends Handler {



	@Override
	protected void processOrder(Order o) {
		// TODO Auto-generated method stub
		if(o.getDifficulty()>=5 )
			System.out.println("The Chief processed the order " +o.getProduct());
	
			
	}

}
