package customermaster;

import java.util.List;

public interface ICustomerMaster {
	
	public int createCustomerMaster(CustomerMasterDTO cm);
	
	public int updateCustomerMaster(CustomerMasterDTO cm);
	
	public int deleteCustomer(int customer_id);
	
	public int deleteCustomer(String customer_name);

	public List<CustomerMasterDTO> listAllCustomers() throws Exception;
	
	public CustomerMasterDTO findByID(int customer_id) throws Exception;
	
	public CustomerMasterDTO findByName(String customer_name) throws Exception;
}