package by.teachmeskills.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
    private static final String URL = "jdbc:mysql://localhost/cities?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection () throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
