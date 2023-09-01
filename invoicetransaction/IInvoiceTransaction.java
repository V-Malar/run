package invoicetransaction;

import java.sql.SQLException;
import java.util.List;

public interface IInvoiceTransaction {
	
	public int updateInvoiceTransaction(InvoiceTransactionDTO it);
	
	public int deleteInvoiceTransactionByInvoiceID(int invoice_id);
	
	public int deleteInvoiceTransactionByItemID(int item_id);

	public List<InvoiceTransactionDTO> listAllInvoiceTransaction() throws SQLException;
	
	public InvoiceTransactionDTO findByID(int invoice_id) throws SQLException;
	
	public InvoiceTransactionDTO findByItemID(int item_no) throws SQLException;
}
