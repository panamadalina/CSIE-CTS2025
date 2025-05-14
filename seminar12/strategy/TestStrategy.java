package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Date date = new Date(40);
		date.setStrategie(new StrategieValMaxima());
		System.out.println("Valoarea maxima: "+date.processValues());
		
		date.setStrategie(new StrategieValMinima());
		System.out.println("Valoarea minima: "+date.processValues());
	}

}
