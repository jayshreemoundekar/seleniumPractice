package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

    public static void main(String[] args) {
        String host = "localhost";
        String port = "3306";
        String database = "udemy";
        String username = "root";
        String password = "root";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + database;

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM idpasswordinfo;")) {

            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: " + rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}