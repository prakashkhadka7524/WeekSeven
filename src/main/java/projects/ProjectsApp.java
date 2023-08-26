package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		DbConnection dbConnection= new DbConnection();
		dbConnection.getConnection(); // calling the method from DbConnection class
	}

}
