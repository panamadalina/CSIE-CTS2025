package singleton;

import java.util.List;

public class DatabaseLazyInitThreadSafeRIGHT {
	private int id;
	private List<String>users;
	


	@Override
	public String toString() {
		return "The database [id=" + id + ", users=" + users ;
	}
	
	private static volatile DatabaseLazyInitThreadSafeRIGHT INSTANCE=null;
	//volatile makes thread safe
	private DatabaseLazyInitThreadSafeRIGHT() {
		super();
		this.id = 0;
		this.users = null;
	}
	public static  DatabaseLazyInitThreadSafeRIGHT getInstance() {
		//DoubleCHeck Locking
		if(INSTANCE==null) {
			synchronized (DatabaseLazyInitThreadSafeRIGHT.class) {
				if(INSTANCE==null) {
					INSTANCE=new DatabaseLazyInitThreadSafeRIGHT();
				}
			}
			
		}
		return INSTANCE;
	}
}
