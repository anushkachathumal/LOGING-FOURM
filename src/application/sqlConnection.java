package application;

import java.sql.*;
public class sqlConnection {

	public static Connection Connector () {
		
		try { 
			Class.forName("brg.sqlite.JDBC");
			Connection conn=DriverManager.getConnection("JDBC:sqlite:posdb:sqlite");
			return conn;
				
			} catch(Exception e) {
				e.printStackTrace();
				return null;
			}

			

	}
		
	}
	

