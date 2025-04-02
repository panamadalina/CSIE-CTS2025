package facade;

public class Flight {

	private String initialLocation;
	private String destination;
	private Airline airline;
	
	
	
	public Flight(String initialLocation, String destination,Airline airline) {
		this.initialLocation=initialLocation;
		this.destination=destination;
		this.airline=airline;
		
	}



	public String getInitialLocation() {
		return initialLocation;
	}



	public void setInitialLocation(String initialLocation) {
		this.initialLocation = initialLocation;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public Airline getAirline() {
		return airline;
	}



	public void setAirline(Airline airline) {
		this.airline = airline;
	}



	@Override
	public String toString() {
		return "Flight [initialLocation=" + initialLocation + ", destination=" + destination + ", airline=" + airline
				+ "]";
	}
	
	
	
	
}
