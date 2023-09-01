package connectionutility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.util.Properties;

public class ConnectionUtility {
	private ConnectionUtility() {

	}

	private static ThreadLocal<Connection> tlocal = new ThreadLocal<Connection>();
	static String url, username, password;
	static {
		try {
//			Properties prop = new Properties();
//			prop.load(new FileInputStream("dbconfig.properties"));
//			url = prop.getProperty("url");
//			username = prop.getProperty("username");
//			password = prop.getProperty("password");
//			Class.forName(prop.getProperty("driver"));
			Class.forName("com.mysql.cj.jdbc.Driver");
			url = "jdbc:mysql://localhost:3306/vastpro";
			username = "root";
			password = "Gs#ry!@99";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized public static Connection getConnection() throws Exception {
		Connection con = tlocal.get();
		if (con == null) {
			con = DriverManager.getConnection(url, username, password);
			con.setAutoCommit(false);
			tlocal.set(con);
			return con;
		} else {
			return con;
		}
	}

	synchronized public static void closeConnection(Exception ex, Savepoint sp) {
		Connection con = tlocal.get();
		if (con == null) {
			System.out.println("no connection available for closing...");
		} else {
			try {
				if (ex == null) {
					con.commit();
				} else {
					if (sp != null) {
						con.rollback(sp);
						con.commit();
					} else {
						con.rollback();
					}
				}
				con.close();
				tlocal.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}