package adapter1;

public class Client {

	private String nume;
	private int nrEvenimente;
	private int[] costEvenimente;
	public Client(String nume, int nrEvenimente, int[] costEvenimente) {
		super();
		this.nume = nume;
		this.nrEvenimente = nrEvenimente;
		this.costEvenimente = costEvenimente;
	}
	public String getNume() {
		return nume;
	}
	public int getNrEvenimente() {
		return nrEvenimente;
	}
	public int[] getCostEvenimente() {
		return costEvenimente;
	}
	
	
}
