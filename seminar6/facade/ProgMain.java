package facade;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Airline company=new Airline("CTS flughts");
		Flight toGo=company.flightBooking("Buchares", "Cluj");
		Flight comeBack=company.flightBooking("cluj", "Bucharest");
		
		Hotel hotel=new Hotel("CTS Hotel");
		hotel.roomBooking("cluj");
		
		
	}

}
