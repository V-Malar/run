package customermaster;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable{
	int c_id; 
	String c_name, c_addr;
	long c_tele;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_addr() {
		return c_addr;
	}
	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}
	public long getC_tele() {
		return c_tele;
	}
	public void setC_tele(long c_tele) {
		this.c_tele = c_tele;
	}
	@Override
	public int hashCode() {
		return Objects.hash(c_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMasterDTO other = (CustomerMasterDTO) obj;
		return c_id == other.c_id;
	}
	@Override
	public String toString() {
		return "CustomerMasterDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_addr=" + c_addr + ", c_tele=" + c_tele
				+ "]";
	}
	
}
