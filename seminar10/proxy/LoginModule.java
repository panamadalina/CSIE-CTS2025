package proxy;

public class LoginModule implements ILoginModule{
	
	String user;
	String pass;
	
	public LoginModule(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	@Override
	public boolean login(String user, String pass) {
		if(user.equals(this.user) && pass.equals(this.pass))
			return true;
		else
			return false;
	}

}