package singleton;
/*Eager Initialization*/

import java.util.List;

/*instance is created when the app loads
 * 
 * Thread safe
 * always available even when is not needed
 */
public class DatabaseEarlyLoading {
	private int id;
	private List<String>users;
	

	private DatabaseEarlyLoading(int id, List<String> users) {
		super();
		this.id = id;
		this.users = users;
	}
	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	private static final DatabaseEarlyLoading INSTANCE=new DatabaseEarlyLoading();
	
	private DatabaseEarlyLoading() {
		super();
		this.id = 0;
		this.users = null;
	}
	public static DatabaseEarlyLoading getInstance() {
		return INSTANCE;
	}
	
}
