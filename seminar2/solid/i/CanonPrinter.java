package seminar2.solid.i;

public class CanonPrinter implements IPrintTasks{

	@Override
	public boolean printContent(String content) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean scanContent(String content) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean faxContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean photoCopyContent(String content) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean badgeAuth(String content) {
		// TODO Auto-generated method stub
		return false;
	}
}

