package run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ICustomerMasterDAO implements ICustomerMaster{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	 public ICustomerMasterDAO(Connection con) {
		this.con=con;
	}
	@Override
	public int createCustomerMaster(CustomerMasterDTO cm) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomerMaster(CustomerMasterDTO cm) {
		try {
			ps = con.prepareStatement("insert into customer_master values (?,?,?,?)");
			ps.setInt(1, cm.getC_id());
			ps.setString(3, cm.getC_name());
			ps.setFloat(2, cm.getC_bill());
			ps.setLong(4, cm.getC_tell());

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
	public int deleteCustomer(int customer_id) {
		try {
			ps = con.prepareStatement("delete from customer_master where c_id=?");
			ps.setInt(1, customer_id);

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
	public int deleteCustomer(String customer_name) {
		try {
			ps = con.prepareStatement("delete from employee where c_name=?");
			ps.setString(2, customer_name);

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
	public List<CustomerMasterDTO> listAllCustomers() {
		ps = con.prepareStatement("select * from customer_master");
		rs = ps.executeQuery();
		ArrayList<CustomerMasterDTO> list = new ArrayList<CustomerMasterDTO>();
		while (rs.next()) {
			CustomerMasterDTO it = new CustomerMasterDTO();
			it.setC_id(rs.getInt(1));
			it.setC_bill(rs.getFloat(3));
			it.setC_name(rs.getString(2));
			it.setC_tell(rs.getLong(4));
			list.add(it);
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return list;
	}

	@Override
	public CustomerMasterDTO findByID(int customer_id) {
		ps = con.prepareStatement("select * from customer_master where c_id=?");
		ps.setInt(1, customer_id);
		rs = ps.executeQuery();
		CustomerMasterDTO it = new CustomerMasterDTO();
		if (rs.next()) {
			it.setC_id(rs.getInt(1));
			it.setC_bill(rs.getFloat(3));
			it.setC_name(rs.getString(2));
			it.setC_tell(rs.getLong(4));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;
	}

	@Override
	public CustomerMasterDTO findByName(String customer_name) {
		ps = con.prepareStatement("select * from customer_master where c_name=?");
		ps.setString(2, customer_name);
		rs = ps.executeQuery();
		CustomerMasterDTO it = new CustomerMasterDTO();
		if (rs.next()) {
			it.setC_id(rs.getInt(1));
			it.setC_bill(rs.getFloat(3));
			it.setC_name(rs.getString(2));
			it.setC_tell(rs.getLong(4));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return it;
	}

}
