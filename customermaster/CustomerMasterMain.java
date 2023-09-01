package customermaster;

import java.util.Scanner;
import java.util.UUID;

import connectionutility.ConnectionUtility;

public class CustomerMasterMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		ICustomerMasterDAO customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());

		CustomerMasterDTO customer_dto = customer_dao.findByID(1);

		customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());
		CustomerMasterDTO c_dto = new CustomerMasterDTO();
		c_dto.setC_id(Math.abs(UUID.randomUUID().hashCode()%10));
		c_dto.setC_name(sc.next());
		c_dto.setC_addr(sc.next());
		c_dto.setC_tele(sc.nextLong());
		customer_dao.updateCustomerMaster(c_dto);
		System.out.println(c_dto);
		
//		customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());
//		customer_dao.deleteCustomer(1);
//		System.out.println(customer_dao);
		
		customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());
		customer_dao.listAllCustomers();
		
		customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());
		customer_dao.deleteCustomer(3);
	}

}
