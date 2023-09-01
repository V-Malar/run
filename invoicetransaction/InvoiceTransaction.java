package invoicetransaction;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class InvoiceTransaction {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/vastpro";
		String username = "root";
		String password = "Gs#ry!@99";
		try (Connection con = DriverManager.getConnection(url, username, password)) {
			Statement statement = con.createStatement();
			// Create invoice_transaction Table
			String invoice_transaction_table = "CREATE TABLE invoice_transaction (invoice_id INT AUTO_INCREMENT, item_id INT, Quantity INT, PRIMARY KEY(invoice_id, item_id))";
			statement.executeUpdate(invoice_transaction_table);
			System.out.println("invoice_transaction table created successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
