package singleton;

import java.util.ArrayList;
import java.util.List;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		list.add("mada");
		list.add("mihai");
		Database db=new Database(1,list);
		/*Eager Initialization*/
		DatabaseEarlyLoading db1=DatabaseEarlyLoading.getInstance();

		/*STATIC INIT (like Eager Init) for exeptions handling*/
		DatabaseStaticBlockInit db2=DatabaseStaticBlockInit.getInstance();
		
		/*LazyInit - NOT THREAD SAFE!*/
		DatabaseLazyInitialization db3=DatabaseLazyInitialization.getInstance();
		
		/*Lazy Init - Thread safe but sync waiting too long*/
		DatabaseLazyInitThreadSafeWRONG db4=DatabaseLazyInitThreadSafeWRONG.getInstance();
		
		/*Lazy Init - Thread safe with a little sync*/
		
		DatabaseLazyInitThreadSafeRIGHT db5=DatabaseLazyInitThreadSafeRIGHT.getInstance();
		
	}

}
