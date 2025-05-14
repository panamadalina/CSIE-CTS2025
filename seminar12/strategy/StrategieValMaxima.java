package strategy;

public class StrategieValMaxima implements IStrategy{

	@Override
	public int process(int[] valori) {
		int max = valori[0];
		for(int i=1;i<valori.length;i++) {
			if(max < valori[i])
				max = valori[i];
		}
		return max;
	}
}
