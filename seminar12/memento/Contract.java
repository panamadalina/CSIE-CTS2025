package memento;


public class Contract {//Originator
	private String clientName;
	private String clauseContract;
	
	public Contract(String numeClient) {
		super();
		this.clientName = numeClient;
		this.clauseContract = "";
	}
	
	public void addClauza(String clauza) {
		clauseContract += "\n" + clauza;
	}

	@Override
	public String toString() {
		return "Contract [clientName=" + clientName + ", clauzeContractuale=" + clauseContract + "]";
	}
	
	public void restoreFromVersion(ContractVersion versiuneContract){
		this.clauseContract = versiuneContract.getClauzeContractuale();
	}
	
	public ContractVersion saveVersiune(){
		System.out.println("Salvare versiune contract");
		return new ContractVersion(clauseContract);
	}
}
