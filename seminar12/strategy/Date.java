package strategy;

public class Date {
	private int[] values = null;
	private IStrategy strategy;

	public Date(int[] valori) {
		super();
		this.values = valori;
	}
	
	public Date(int nr) {
		values = new int[nr];
		for(int i=0;i<nr;i++)
			values[i]=100+i;
	}

	public void setStrategie(IStrategy strategie) {
		this.strategy = strategie;
	}
	
	public int processValues() {
		return strategy.process(values);
	}
	
}
