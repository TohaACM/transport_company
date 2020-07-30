package by.teachmeskills.dao;

import by.teachmeskills.connections.MySqlConnection;
import by.teachmeskills.entity.Cities;
import by.teachmeskills.entity.transport.Transport;
import by.teachmeskills.entity.transport.TransportType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransportTypeDao {
    public List<TransportType> get() {
        List<TransportType> transportTypeList = new ArrayList<>();
        try {
            Connection connection = MySqlConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM transporttype");
            while (result.next()) {
                TransportType transport = new TransportType();
                transport.setId(result.getInt("id"));
                transport.setTypename(result.getString("typename"));
                transportTypeList.add(transport);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transportTypeList;
    }
}