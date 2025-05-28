package dp.behavioral.state;

public class WorkingState implements IState {

	@Override
	public void act(String message) {
		// TODO Auto-generated method stub

		System.out.println("This employee is available and he works to resolve this issue: "+message);
	}

}
