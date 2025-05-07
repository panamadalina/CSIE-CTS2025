package adapter1;

public class EvaluareFirmaA implements IEvaluareFirmaA {

	@Override
	public double evaluareClientA(int costTotal) {
		System.out.println("Apelare metoda firma A");
		if(costTotal>1000) {
			return 0.1;
		
		}
		if(costTotal>500) {
			return 0.05;
		}
		return 0;
	}

}
