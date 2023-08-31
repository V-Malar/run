package run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class IInvoiceMasterDAO implements IInvoiceMaster{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	 public IInvoiceMasterDAO(Connection con) {
		this.con=con;
	}
	@Override
	public int createInvoiceMaster(InvoiceMaster im) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateInvoiceMaster(InvoiceMaster im) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMaster(int invoice_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteInvoiceMaster(String invoice_name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<InvoiceMaster> listAllInvoiceMaster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceMaster findByID(int invoice_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvoiceMaster findByName(String invoice_name) {
		// TODO Auto-generated method stub
		return null;
	}

}
