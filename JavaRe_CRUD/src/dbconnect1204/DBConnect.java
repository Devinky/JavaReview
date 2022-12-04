package dbconnect1204;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		Connection conn = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		try {
			Class.forName(driver); //DB연결
			System.out.println("Oracle Driver Connect Complete");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connect Complete");
		} catch (ClassNotFoundException e) {
			System.out.println("Orecle Driver Not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB Connect Fail");
			e.printStackTrace();
		}
		
		return conn;
	}

}
