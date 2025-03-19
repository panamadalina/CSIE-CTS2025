package singleton;

import java.util.List;

public class DatabaseLazyInitThreadSafeWRONG {
	private int id;
	private List<String>users;
	

	private DatabaseLazyInitThreadSafeWRONG(int id, List<String> users) {
		super();
		this.id = id;
		this.users = users;
	}
	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	private static DatabaseLazyInitThreadSafeWRONG INSTANCE=null;
	
	private DatabaseLazyInitThreadSafeWRONG() {
		super();
		this.id = 0;
		this.users = null;
	}
	public static synchronized  DatabaseLazyInitThreadSafeWRONG getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new DatabaseLazyInitThreadSafeWRONG();
		}
		return INSTANCE;
	}
}
