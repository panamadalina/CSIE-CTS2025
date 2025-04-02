package facade;

public class Facade {

	public static void reservation(String initialLocation, String destination){
		//flight
		//room
	

		Airline company=new Airline("CTS flughts");
		Flight toGo=company.flightBooking(initialLocation, destination);
		Flight back=company.flightBooking(destination, initialLocation);
		
		Hotel hotel=new Hotel("CTS Hotel");
		hotel.roomBooking(destination);
	}

	
}
