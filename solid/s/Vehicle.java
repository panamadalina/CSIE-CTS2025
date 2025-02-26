//package ...*

public class Vehicle {

	int weight;
	String color;
	String model;
	//etc

	public void printDetailsAboutVehicle() {
		System.out.println("Vehicle "+model+"has weight: "+weight+" color:"+color);
	}
	
	public void addNewVehicleToDatabase() {

		Connection connection=null;
		try {
			String url = "jdbc:sqlite:path-to-db/etc/example.db";
			connection = DriverManager.getConnection(url);
		      
		    String sql = "insert into vehicles values (?, ?, ?);";

		    PreparedStatement  preparedStatement  =
		            connection.prepareStatement(sql);

		    preparedStatement.setString(1, model);
		    preparedStatement.setString(2, color);

		    int rowsAffected = preparedStatement.executeUpdate(); 
		    connection.close();
		      
		}catch(Error err) {
			System.out.println("err");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int calculateVehiclePrice() {
		int price=0;
		if(weight>2) {
			price+=2000;
		}else {
			price+=5000;
		}
		if(color.equals("black")) {
			price+=500;
		}else {
			price+=2000;
		}
		if(model.equals("Renault")||model.equals("Dacia")) {
			price+=1000;
		}else {
			price+=4000;
		}
		return price;
	}
	
} 
