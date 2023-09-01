package invoicemaster;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class InvoiceMasterDTO implements Serializable{
	int invoice_id, discount, c_id;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	java.util.Date invoice_date;
	public int getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public java.util.Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(java.util.Date parsedDate) {
		this.invoice_date = parsedDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(invoice_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceMasterDTO other = (InvoiceMasterDTO) obj;
		return invoice_id == other.invoice_id;
	}
	@Override
	public String toString() {
		return "InvoiceMasterDTO [invoice_id=" + invoice_id + ", discount=" + discount + ", invoice_date="
				+ invoice_date + ", customer_id=" + c_id + "]";
	}
}
