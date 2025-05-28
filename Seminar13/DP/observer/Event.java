package observer;
//nu observable din java.util
public class Event extends Observable{
	private String info;
	private boolean declansareEv = false;
	
	private void activateEvent() {
		if(!declansareEv) {
			declansareEv = true;
			this.notifyAllObservers();
		}
	}
	
	public void publicateEvent() {
		System.out.println("Eveniment declansat");
		activateEvent();
	}
	
}
