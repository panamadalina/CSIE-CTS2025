package facade;

public class Hotel {

	private String name;
	
	
	public Hotel(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}


	public void roomBooking(String location) {
		System.out.println("Hotel: "+this.name+" from "+location+" 1 room");
	}
}
