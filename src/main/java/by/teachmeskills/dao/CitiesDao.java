package by.teachmeskills.dao;

import by.teachmeskills.connections.MySqlConnection;
import by.teachmeskills.entity.Cities;
import by.teachmeskills.exceptions.DuplicateCityException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesDao {

    public void add(Cities cities)  throws DuplicateCityException {
        try (Connection connection = MySqlConnection.getConnection()) {
            String sql = "INSERT INTO cities (name, longitude, latitude, airport, seaport) values (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cities.getName());
            statement.setDouble(2, cities.getLongitude());
            statement.setDouble(3, cities.getLatitude());
            statement.setBoolean(4, cities.isAirport());
            statement.setBoolean(5, cities.isSeaport());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(Cities cities) {
        try (Connection connection = MySqlConnection.getConnection()){
            String sql ="DELETE FROM cities WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, cities.getId());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public List<Cities> get() {
        List <Cities> citiesList =new ArrayList<>();
        try {
            Connection connection = MySqlConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM cities");
            while (result.next()){
                Cities cities = new Cities();
                cities.setId(result.getInt("id"));
                cities.setName(result.getString("name"));
                cities.setLongitude(result.getDouble("longitude"));
                cities.setLatitude(result.getDouble("latitude"));
                cities.setAirport(result.getBoolean("airport"));
                cities.setSeaport(result.getBoolean("seaport"));
                citiesList.add(cities);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citiesList;
    }

    public void searchCityOut(String cityOut) {
        Cities selectedCityOut = new Cities();
        try (Connection connection = MySqlConnection.getConnection()) {
            String sql = "SELECT * FROM cities WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cityOut);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                selectedCityOut.setId(result.getInt("id"));
                selectedCityOut.setName(result.getString("name"));
                selectedCityOut.setLatitude(result.getDouble("latitude"));
                selectedCityOut.setLongitude(result.getDouble("longitude"));
                selectedCityOut.setAirport(result.getBoolean("airport"));
                selectedCityOut.setSeaport(result.getBoolean("seaport"));

            }
            System.out.println(selectedCityOut);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void searchCityIn(String cityIn) {
            Cities selectedCityIn = new Cities();
            try (Connection connection = MySqlConnection.getConnection()){
                String sql ="SELECT * FROM cities WHERE name = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, cityIn);
                ResultSet result = statement.executeQuery();
                while (result.next()){
                    selectedCityIn.setId(result.getInt("id"));
                    selectedCityIn.setName(result.getString("name"));
                    selectedCityIn.setLatitude(result.getDouble("latitude"));
                    selectedCityIn.setLongitude(result.getDouble("longitude"));
                    selectedCityIn.setAirport(result.getBoolean("airport"));
                    selectedCityIn.setSeaport(result.getBoolean("seaport"));

                }
                System.out.println(selectedCityIn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}



