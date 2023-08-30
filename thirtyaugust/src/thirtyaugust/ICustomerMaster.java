package thirtyaugust;

import java.util.List;

public interface ICustomerMaster {

	public int getInvoice_id();

	public void setInvoice_id(int invoice_id);

	public int getItem_id();

	public void setItem_id(int item_id);

	public int getQuantity();

	public void setQuantity(int quantity);

	public List<CustomerMaster> findAll();
}
