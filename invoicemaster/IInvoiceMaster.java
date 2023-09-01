package invoicemaster;

import java.sql.SQLException;
import java.util.List;

public interface IInvoiceMaster {
	
	public int updateInvoiceMaster(InvoiceMasterDTO im);
	
	public int deleteInvoiceMaster(int invoice_id);
	
	public int deleteInvoiceMaster(String invoice_name);

	public List<InvoiceMasterDTO> listAllInvoiceMaster() throws SQLException;
	
	public InvoiceMasterDTO findByID(int invoice_id) throws SQLException;
	
	public InvoiceMasterDTO findByName(String invoice_name) throws SQLException;
}
