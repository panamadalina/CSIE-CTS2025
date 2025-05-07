package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryBon {
	private static Map<EReceiptType, IReceipt> bonuri = new HashMap<EReceiptType, IReceipt>();
	
	public static IReceipt getBon(EReceiptType tip) {
		IReceipt bon = bonuri.get(tip);
		
		if(bon == null) {//daca NU exista
			bon = new Receipt(tip);
			//creez un nou bon de acel tip
			bonuri.put(tip, bon);
		}
		
		return bon;
	}
	
	public static int getNrBonuri() {
		return bonuri.size();
	}
}
