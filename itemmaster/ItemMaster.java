package itemmaster;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ItemMaster {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String username = "root";
		String password = "Gs#ry!@99";
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Statement statement = con.createStatement();
			// Create invoice_transaction table
			String item_master_table = "CREATE TABLE item_master (item_id INT PRIMARY KEY, item_name VARCHAR(34), unit varchar(34), price FLOAT, image BLOB)";
			statement.executeUpdate(item_master_table);
			System.out.println("item_master table created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
