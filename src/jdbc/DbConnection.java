package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver"; // jar -> mysql-connector.jar
		String url = "jdbc:mysql://localhost:3306/yashvi";
		String userName = "root";
		String password = "root";

		try {
			// load driver into memory
			Class.forName(driver);
			//connection open 
			Connection con = DriverManager.getConnection(url,userName,password);

			if(con != null) {
				System.out.println("DB connected....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
