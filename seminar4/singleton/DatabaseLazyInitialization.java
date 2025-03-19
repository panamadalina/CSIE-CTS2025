package singleton;

import java.util.List;
/*
 * NOT THREAD SAFE!
 */
public class DatabaseLazyInitialization {
	private int id;
	private List<String>users;
	

	private DatabaseLazyInitialization(int id, List<String> users) {
		super();
		this.id = id;
		this.users = users;
	}
	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	private static DatabaseLazyInitialization INSTANCE=null;
	
	private DatabaseLazyInitialization() {
		super();
		this.id = 0;
		this.users = null;
	}
	public static DatabaseLazyInitialization getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new DatabaseLazyInitialization();
		}
		return INSTANCE;
	}
}
