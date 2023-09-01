package invoicetransaction;
import java.io.Serializable;
import java.util.Objects;

public class InvoiceTransactionDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4554187124527945293L;
	int invoice_id, item_id , quantity;

	public int getInvoice_id() {
		return invoice_id;
	}

	public void setInvoice_id(int invoice_id) {
		this.invoice_id = invoice_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(invoice_id, item_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceTransactionDTO other = (InvoiceTransactionDTO) obj;
		return invoice_id == other.invoice_id && item_id == other.item_id;
	}

	@Override
	public String toString() {
		return "InvoiceTransactionDTO [invoice_id=" + invoice_id + ", item_id=" + item_id + ", quantity=" + quantity
				+ "]";
	}
	
}
