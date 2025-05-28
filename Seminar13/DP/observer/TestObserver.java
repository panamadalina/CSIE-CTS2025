package observer;

public class TestObserver {
	
	/*
	 * Notificarea unor componente la producerea unui eveniment
Componentele se aboneaza la acel eveniment
La producerea unui eveniment pot fi notificate mai multe componente

	 */

	public static void main(String[] args) {
		Event ev = new Event();
		
		Handler h1 = new HandlerA();
		Handler h2 = new HandlerB();
		//abonare observatori la eveniment
		ev.addHandler(h1);
		ev.addHandler(h2);

		//declansare eveniment
		ev.publicateEvent();
	}

}
