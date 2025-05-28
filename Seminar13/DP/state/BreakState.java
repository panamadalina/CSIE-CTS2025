package dp.behavioral.state;

public class BreakState implements IState{

	@Override
	public void act(String message) {
		// TODO Auto-generated method stub

		System.out.println("This employee is taking a break, he will work to resolve the issue: "+message);
	}

}
