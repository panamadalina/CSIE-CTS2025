package singleton;

import java.util.List;

import javax.management.RuntimeErrorException;

public class DatabaseStaticBlockInit {

/*instance is created when the app loads
 * 
 * Thread safe
 * always available even when is not needed
 *    //static block initialization for exception handling!!!!!
 */
	private int id;
	private List<String>users;
	

	private DatabaseStaticBlockInit(int id, List<String> users) {
		super();
		this.id = id;
		this.users = users;
	}
	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	private static final DatabaseStaticBlockInit INSTANCE;
	
	static {
	
		try {
			INSTANCE=new DatabaseStaticBlockInit();
			//static block initialization for exception handling!!!!!
		}catch(Exception e) {
			throw new RuntimeException("Error while creating singleton instance");
		}
	}
	
	
	private DatabaseStaticBlockInit() {
		super();
		this.id = 0;
		this.users = null;
	}
	public static DatabaseStaticBlockInit getInstance() {
		return INSTANCE;
	}
	
}
