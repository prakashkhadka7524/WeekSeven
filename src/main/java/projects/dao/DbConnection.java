package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
final private static String HOST="localhost";
final private static String PASSWORD="projects";
final private static int PORT=3306;
final private static String SCHEMA= "projects";
final private static String USER="projects";

public static Connection getConnection() {
	String uri=String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s",
			HOST, PORT, SCHEMA, USER, PASSWORD);
	try {
		Connection conn=DriverManager.getConnection(uri); // it will connect with the driver
		System.out.println("Connection is successful!!");
		return conn;
	} catch (SQLException e) {
	System.out.println("Unable to connect at "+uri);
	throw new DbException(uri);
	}
}
}
