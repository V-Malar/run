package invoicemaster;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InvoiceMaster {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String username = "root";
		String password = "Gs#ry!@99";
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Statement statement = con.createStatement();
			// Create invoice_master Table
			String invoice_master_table = "CREATE TABLE invoice_master (c_id INT, invoice_id INT, invoice_date DATE, discount INT, FOREIGN KEY (c_id) REFERENCES customer_master(c_id), PRIMARY KEY(c_id, invoice_id))";
			statement.executeUpdate(invoice_master_table);
			System.out.println("invoice_master table created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
