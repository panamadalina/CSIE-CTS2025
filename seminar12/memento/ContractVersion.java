package memento;

public class ContractVersion {//Memento
	private String clauseContract;

	public ContractVersion() {
		this.clauseContract = "";
	}

	public ContractVersion(String clauseContract) {
		this.clauseContract = clauseContract;
	}

	public String getClauzeContractuale() {
		return clauseContract;
	}
}
