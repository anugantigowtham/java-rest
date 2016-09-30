package com.hm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public Connection getConnection() throws Exception {
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/hmsystem";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			return connection;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}
}
