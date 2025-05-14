package template;

public abstract class AInsuranceProcedure {

	protected abstract void identifyDamage();
	protected abstract void evaluateDamage();
	protected abstract void sendEvaluation();
	
	public final void giveInsurance() {
		
		identifyDamage();
		evaluateDamage();
		sendEvaluation();
	}



}
