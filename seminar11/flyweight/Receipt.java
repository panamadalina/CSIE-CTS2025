package flyweight;

public class Receipt implements IReceipt{
	private EReceiptType tip;//stare permanenta
	//nume restaurant
	//adresa restaurant
	
	public Receipt(EReceiptType tip) {
		this.tip = tip;
		//nume restaurant
		//adresa restaurant
	}
	
	public EReceiptType getTip() {//stare permanenta
		return tip;
	}

	@Override
	public void printReceipt(ReceiptData bon) {
		System.out.println("Bonul cu consumatia " + 
	bon.getPretConsumatie() + " in format "+ tip);//stare temporara
	}

}


