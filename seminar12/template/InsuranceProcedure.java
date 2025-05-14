package template;

public class InsuranceProcedure extends AInsuranceProcedure{

	@Override
	protected void identifyDamage() {
		// TODO Auto-generated method stub
		System.out.println("Identify any damage");
	}

	@Override
	protected void evaluateDamage() {
		// TODO Auto-generated method stub
		System.out.println("Evaluate the damage founded");
	}

	@Override
	protected void sendEvaluation() {
		// TODO Auto-generated method stub
		System.out.println("Send the resulted report");
	}

}
