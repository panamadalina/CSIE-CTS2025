package proxy;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginModule modulLogin = new LoginModule("admin", "1234");
		
		String[] dictionarParole = new String[] {"123456", "1222", "admin", "root", "1234"};
		//bruteforce
		for(String parola : dictionarParole) {
			System.out.println("Trying to find the password " + parola);
			if(modulLogin.login("admin", parola))
				System.out.println("Found the password: "+parola);
		}
		
		//cu proxy
		System.out.println("----");
		ProxyLoginModule proxy  = new ProxyLoginModule(modulLogin);
		for(String parola : dictionarParole) {
			System.out.println("Incerc " + parola);
			if(proxy.login("admin", parola))
				System.out.println("Am gasit parola");
		}
	}

}
