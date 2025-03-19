package singleton;

import java.util.List;

public class Database {

	private int id;
	private List<String>users;
	
	public Database(int id, List<String> users) {
		super();
		this.id = id;
		this.users = users;
	}
	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	
	
	
}
