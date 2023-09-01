package customermaster;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CustomerMaster {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String username = "root";
		String password = "Gs#ry!@99";
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Statement statement = con.createStatement();
			// Create customer_master table
			String customer_master = "CREATE TABLE customer_master (c_id INT PRIMARY KEY AUTO_INCREMENT, c_name VARCHAR(25), c_addr VARCHAR(25), c_tele LONG)";
			statement.executeUpdate(customer_master);
			System.out.println("customer_master table created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
