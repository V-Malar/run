package run;

import java.util.List;

public interface IInvoiceTransaction {
	
	public int updateInvoiceTransaction(InvoiceTransactionDTO it);
	
	public int deleteInvoiceTransactionByInvoiceID(int invoice_id);
	
	public int deleteInvoiceTransactionByItemID(int item_id);

	public List<InvoiceTransactionDTO> listAllInvoiceTransaction();
	
	public InvoiceTransactionDTO findByID(int invoice_id);
	
	public InvoiceTransactionDTO findByItemID(int item_no);
}
