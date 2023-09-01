package run;

import java.util.List;

public interface IInvoiceMaster {
public int createInvoiceMaster(InvoiceMaster im);
	
	public int updateInvoiceMaster(InvoiceMaster im);
	
	public int deleteInvoiceMaster(int invoice_id);
	
	public int deleteInvoiceMaster(String invoice_name);

	public List<InvoiceMaster> listAllInvoiceMaster();
	
	public InvoiceMaster findByID(int invoice_id);
	
	public InvoiceMaster findByName(String invoice_name);
}
