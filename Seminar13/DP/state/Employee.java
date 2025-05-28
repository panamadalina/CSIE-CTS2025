package dp.behavioral.state;

public class Employee {
	// stare curenta angajat
		IState currentState;

		public Employee() {
			this.currentState = new WorkingState();
		}

		public void setStare(EState state) {
			// logica de trecere dintr-o stare in alta
			if (state == EState.VACATION)
				this.currentState = new VacationState();
			else if (state == EState.BREAK)
				this.currentState = new BreakState();
			else
				this.currentState = new WorkingState();
		}
		
		public void procesareMesaj(String mesaj) {
			this.currentState.act(mesaj);
		}
}
