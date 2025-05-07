package flyweight;

public class TestFlyweight {

	//partajare memorie!!
	//zona comuna + zona nepartajata de memorie
	public static void main(String[] args) {
		Receipt[] listaBonuri = new Receipt[50];
		ReceiptData[] listaDateBonuri = new ReceiptData[50];
		
		int nrBonuriPrintate =50;
		
		for(int i=0;i<nrBonuriPrintate;i++) {
			listaBonuri[i] = (Receipt) FlyweightFactoryBon.getBon(EReceiptType.valueOf("FORMAT"+(i%3+1)));
			listaDateBonuri[i] = new ReceiptData(150+i);
		}
		
		for(int i=0;i<nrBonuriPrintate;i++) {
			listaBonuri[i].printReceipt(listaDateBonuri[i]);
		}
		
		System.out.println("\nNr bonuri create "+FlyweightFactoryBon.getNrBonuri());

	}

}
