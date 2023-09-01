package invoicemaster;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connectionutility.ConnectionUtility;

public class IInvoiceMasterDAO implements IInvoiceMaster {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public IInvoiceMasterDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int updateInvoiceMaster(InvoiceMasterDTO im) {
		try {
			ps = con.prepareStatement("insert into invoice_master values (?,?,?,?)");
			ps.setInt(1, im.getC_id());
			ps.setInt(2, im.getInvoice_id());
			ps.setDate(3, (Date) im.getInvoice_date());
			ps.setInt(4, im.getDiscount());

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
	public int deleteInvoiceMaster(int invoice_id) {
		try {
			ps = con.prepareStatement("delete from invoice_master where eid=?");
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
	public int deleteInvoiceMaster(String invoice_name) {
		try {
			ps = con.prepareStatement("delete from invoice_master where eid=?");
			ps.setString(2, invoice_name);

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
	public List<InvoiceMasterDTO> listAllInvoiceMaster() throws SQLException {
		ps = con.prepareStatement("select * from invoice_master");
		rs = ps.executeQuery();
		ArrayList<InvoiceMasterDTO> list = new ArrayList<InvoiceMasterDTO>();
		while (rs.next()) {
			InvoiceMasterDTO it = new InvoiceMasterDTO();
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setInvoice_date(rs.getDate("invoice_date"));
			it.setDiscount(rs.getInt("discount"));
			list.add(it);
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return list;
	}

	@Override
	public InvoiceMasterDTO findByID(int invoice_id) throws SQLException {
		ps = con.prepareStatement("select * from invoice_master where invoice_id=?");
		ps.setInt(1, invoice_id);
		rs = ps.executeQuery();
		InvoiceMasterDTO it = new InvoiceMasterDTO();
		if (rs.next()) {
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setInvoice_date(rs.getDate("invoice_date"));
			it.setDiscount(rs.getInt("discount"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;

	}

	@Override
	public InvoiceMasterDTO findByName(String invoice_name) throws SQLException {
		ps = con.prepareStatement("select * from invoice_master where invoice_id=?");
		ps.setString(2, invoice_name);
		rs = ps.executeQuery();
		InvoiceMasterDTO it = new InvoiceMasterDTO();
		if (rs.next()) {
			it.setInvoice_id(rs.getInt("invoice_id"));
			it.setInvoice_date(rs.getDate("invoice_date"));
			it.setDiscount(rs.getInt("discount"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;
	}

}
