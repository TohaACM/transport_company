package by.teachmeskills.dao;

import by.teachmeskills.connections.MySqlConnection;
import by.teachmeskills.entity.Cities;
import by.teachmeskills.entity.transport.Transport;
import by.teachmeskills.entity.transport.TransportType;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransportDao {
    public void add(Transport transport){
        try (Connection connection = MySqlConnection.getConnection()) {
            String sql = "INSERT INTO transport (name, speed, capacity, cargo, transportId, price) " +
                    "values (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, transport.getName());
            statement.setInt(2, transport.getSpeed());
            statement.setInt(3, transport.getCapacity());
            statement.setDouble(4, transport.getCargo());
            statement.setInt(5, transport.getTransportType().getId());
            statement.setInt(6, transport.getPrice());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void remove(Transport transport){

    }
    public List<Transport> get(){
        List<Transport> transports = new ArrayList<>();
        try {
            Connection connection = MySqlConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT t.id, t.name, t.speed, t.capacity, t.cargo, t.price, tt.typename " +
                    "FROM transport t LEFT JOIN transporttype tt ON t.transportId = tt.id;");
            while (result.next()){
                Transport transport = new Transport();
                transport.setId(result.getInt("id"));
                transport.setSpeed(result.getInt("speed"));
                transport.setName(result.getString("name"));
                transport.setCapacity(result.getInt("capacity"));
                transport.setCargo(result.getDouble("cargo"));
                transport.setPrice(result.getInt("price"));
                TransportType transportType = new TransportType(result.getString("typename"));
                transport.setTransportType(transportType);
                transports.add(transport);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transports;
    }

}
