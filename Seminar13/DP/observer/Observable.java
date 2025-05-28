package observer;

import java.util.ArrayList;

public abstract class Observable {
	//lista observatori
	ArrayList<Handler> observerList = new ArrayList<>();
	
	public void addHandler(Handler h) {
		observerList.add(h);
	}
	
	public void removeHandler(Handler h) {
		observerList.remove(h);
	}
	
	public void notifyAllObservers() {
		if(observerList!=null)
			for(Handler h:observerList)
				h.act();
	}
}
