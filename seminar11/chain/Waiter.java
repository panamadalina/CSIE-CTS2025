package dp.behavioral.chain;

public class Waiter extends Handler {


	@Override
	protected void processOrder(Order o) {
		// TODO Auto-generated method stub
	
		if(o.getDifficulty()<5)
		{
			System.out.println("The Waiter processed the order " +o.getProduct());		
		}
		else {
			System.out.println("The waiter cannot process the order.Send the request to the chief");
			if(this.succesor != null)
				this.succesor.processOrder(o);
		
		}
		
		
	}

}
