package adapter1;

public class EvaluareFirmaB implements IEvaluareFirmaB {

	@Override
	public double evaluareClientB(Client client) {
		System.out.println("Apelare metoda firma A");
		double total=0;
		for(int i=0;i<client.getNrEvenimente();i++) {
			total+=client.getCostEvenimente()[i];
		}
		if(total>1000) {
			return 0.1;
		
		}
		if(total>500) {
			return 0.05;
		}
		
		return 0;
	
	}


}
