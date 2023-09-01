package run;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class InvoiceMasterDTO implements Serializable{
	int invoice_id, discount;
	LocalDateTime invoice_date;
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
	public LocalDateTime getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(LocalDateTime invoice_date) {
		this.invoice_date = invoice_date;
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
				+ invoice_date + "]";
	}
}
