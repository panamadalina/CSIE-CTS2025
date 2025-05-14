package memento;

/*
 * Salvarea starii unui obiect
Obiectul iti poate restaure starea pe baza unei imagini anterioare

 */

public class TestMemento {

	public static void main(String[] args) {
		ManagerVersions managerContracte = new ManagerVersions();
		Contract contract = new Contract("Client1");//originator
		
		//salvare versiuni contracte
		contract.addClauza("Clauza1");
		System.out.println(contract);
		contract.addClauza("Clauza2");
		System.out.println(contract);
		managerContracte.addVersion(contract.saveVersiune());
		
		contract.addClauza("Clauza3");
		System.out.println(contract);
		managerContracte.addVersion(contract.saveVersiune());
		System.out.println("----");
		//recuperare versiuni anterioare
		contract.restoreFromVersion
		(managerContracte.recoveryVersion(0));
		System.out.println(contract);
	}

}
