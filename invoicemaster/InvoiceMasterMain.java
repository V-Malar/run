package invoicemaster;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.UUID;

import connectionutility.ConnectionUtility;

public class InvoiceMasterMain {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		IInvoiceMasterDAO customer_dao = new IInvoiceMasterDAO(ConnectionUtility.getConnection());

		InvoiceMasterDTO customer_dto = customer_dao.findByID(1);

		customer_dao = new IInvoiceMasterDAO(ConnectionUtility.getConnection());
		InvoiceMasterDTO c_dto = new InvoiceMasterDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		c_dto.setInvoice_id(Math.abs(UUID.randomUUID().hashCode() % 10));
		String dateStr = sc.next();
		java.util.Date parsedDate = sdf.parse(dateStr);
		c_dto.setInvoice_date(parsedDate);
		c_dto.setDiscount(sc.nextInt());
		c_dto.setC_id(Math.abs(UUID.randomUUID().hashCode() % 10));
		customer_dao.updateInvoiceMaster(c_dto);
		System.out.println(c_dto);

//		customer_dao = new ICustomerMasterDAO(ConnectionUtility.getConnection());
//		customer_dao.deleteCustomer(1);
//		System.out.println(customer_dao);

		customer_dao = new IInvoiceMasterDAO(ConnectionUtility.getConnection());
		customer_dao.listAllInvoiceMaster();

		customer_dao = new IInvoiceMasterDAO(ConnectionUtility.getConnection());
		// customer_dao.deleteCustomer(3);
	}

}
