package dp.behavioral.chain;

public abstract class Handler {
	protected Handler succesor = null;

	public void setSuccesor(Handler successor) {
		this.succesor = successor;
	}

	protected abstract void processOrder(Order c1);

}
