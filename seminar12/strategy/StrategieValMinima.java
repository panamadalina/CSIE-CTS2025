package strategy;

public class StrategieValMinima implements IStrategy{

	@Override
	public int process(int[] valori) {
		int min = valori[0];
		for(int i=1;i<valori.length;i++) {
			if(min > valori[i])
				min = valori[i];
		}
		return min;
	}

}
