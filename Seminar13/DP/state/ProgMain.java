package dp.behavioral.state;

public class ProgMain {
/*
 * Aplicatie ce trateaza un anumit eveniment diferit in functie de starea in care se afla
Numarul de stari poate sa creasca in timp
Modul de tratare a actiunii este asociat cu starea in care se afla obiectul

 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		
		emp.procesareMesaj("UX bug");
		
		//schimbare stare
		emp.setStare(EState.VACATION);
		emp.procesareMesaj("database connection lost");
		
		emp.setStare(EState.BREAK);
		emp.procesareMesaj("server down");
	
	}

}
