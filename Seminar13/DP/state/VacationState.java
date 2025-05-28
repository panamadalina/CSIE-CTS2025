package dp.behavioral.state;

public class VacationState implements IState {

	@Override
	public void act(String message) {
		// TODO Auto-generated method stub
		System.out.println("This employee is in vacation. He cannot resolve the issue: "+message);
	}

}
