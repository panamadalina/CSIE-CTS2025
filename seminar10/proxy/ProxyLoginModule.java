package proxy;

public class ProxyLoginModule implements ILoginModule {

	ILoginModule modulLogin;
	
	int contorIncercari = 0;
	

	public ProxyLoginModule(ILoginModule modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String user, String pass) {
		
		if(contorIncercari >= 3) {
			System.out.println("Notific utilizatorul");
			return false;
		}
		
		boolean esteAutentificat = this.modulLogin.login(user, pass);
		if(!esteAutentificat)
			contorIncercari += 1;
		else
			contorIncercari = 0;
		
		return esteAutentificat;
	};
	
	
}
