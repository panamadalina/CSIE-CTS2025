package seminar2.solid.s;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleSqlQueries {
    private static final String DB_URL = "jdbc:sqlite:path-to-db/etc/example.db";

    public void addVehicle(Vehicle vehicle) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            String sql = "INSERT INTO vehicles (model, color, weight) VALUES (?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, vehicle.getModel());
            preparedStatement.setString(2, vehicle.getColor());
            preparedStatement.setInt(3, vehicle.getWeight());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
