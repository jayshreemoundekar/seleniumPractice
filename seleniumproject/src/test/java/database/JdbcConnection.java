package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/udemy","root", "root");
		
		Statement s=con.createStatement();
		ResultSet rs= s.executeQuery("select * from idpasswordinfo;");
		while(rs.next())
		{
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		
		
		}
		
		

	}

}