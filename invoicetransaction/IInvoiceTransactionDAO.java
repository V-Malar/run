package invoicetransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connectionutility.ConnectionUtility;

import java.util.ArrayList;

public class IInvoiceTransactionDAO implements IInvoiceTransaction {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public IInvoiceTransactionDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int updateInvoiceTransaction(InvoiceTransactionDTO it) {
		try {
			ps = con.prepareStatement("insert into invoice_transaction values (?,?,?)");
			ps.setInt(1, it.getInvoice_id());
			ps.setInt(2, it.getItem_id());
			ps.setInt(3, it.getQuantity());

			int i = ps.executeUpdate();
			// ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ee) {
			}
			// ConnectionUtility.closeConnection(e, null);
			return 0;
		}
	}

	@Override
	public int deleteInvoiceTransactionByInvoiceID(int invoice_id) {
		try {
			ps = con.prepareStatement("delete from employee where eid=?");
			ps.setInt(1, invoice_id);

			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ee) {
			}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
	}

	@Override
	public int deleteInvoiceTransactionByItemID(int item_id) {
		try {
			ps = con.prepareStatement("delete from employee where eid=?");
			ps.setInt(1, item_id);

			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ee) {
			}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
	}

	@Override
	public List<InvoiceTransactionDTO> listAllInvoiceTransaction() throws SQLException {
		ps = con.prepareStatement("select * from employee");
		rs = ps.executeQuery();
		ArrayList<InvoiceTransactionDTO> list = new ArrayList<InvoiceTransactionDTO>();
		while (rs.next()) {
			InvoiceTransactionDTO it = new InvoiceTransactionDTO();
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setItem_id(rs.getInt("item_id"));
			it.setQuantity(rs.getInt("Quantity"));
			list.add(it);
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return list;
	}

	@Override
	public InvoiceTransactionDTO findByID(int invoice_id) throws SQLException {
		ps = con.prepareStatement("select * from invoice_transaction where invoice_id=?");
		ps.setInt(1, invoice_id);
		rs = ps.executeQuery();
		InvoiceTransactionDTO it = new InvoiceTransactionDTO();
		if (rs.next()) {
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setItem_id(rs.getInt("item_id"));
			it.setQuantity(rs.getInt("Quantity"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;
	}

	@Override
	public InvoiceTransactionDTO findByItemID(int item_no) throws SQLException {
		ps = con.prepareStatement("select * from invoice_transaction where item_id=?");
		ps.setInt(1, item_no);
		rs = ps.executeQuery();
		InvoiceTransactionDTO it = new InvoiceTransactionDTO();
		if (rs.next()) {
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setItem_id(rs.getInt("item_id"));
			it.setQuantity(rs.getInt("Quantity"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;
	}

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionUtility.getConnection();

		PreparedStatement p = con.prepareStatement("select * from invoice_transaction");

		ResultSet rs = p.executeQuery();
		ArrayList<InvoiceTransactionDTO> list = new ArrayList<InvoiceTransactionDTO>();
		while (rs.next()) {
			InvoiceTransactionDTO im = new InvoiceTransactionDTO();
			im.setInvoice_id(rs.getInt("invoice_id"));
			im.setItem_id(rs.getInt("item_id"));
			im.setQuantity(rs.getInt("Quantity"));
			list.add(im);
		}

	}
}