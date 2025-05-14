package memento;

import java.util.ArrayList;

public class ManagerVersions {//Caretaker
	private ArrayList<ContractVersion> versionList = new ArrayList<ContractVersion>();

	public void addVersion(ContractVersion versiuneContract) {
		this.versionList.add(versiuneContract);
	}

	public ContractVersion recoveryVersion(int i) {
		return versionList.get(i);

	}
}
