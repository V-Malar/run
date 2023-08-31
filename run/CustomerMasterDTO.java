package run;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable{
	int c_id; 
	String c_name;
	float c_bill;
	long c_tell;
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
	public float getC_bill() {
		return c_bill;
	}
	public void setC_bill(float f) {
		this.c_bill = f;
	}
	public long getC_tell() {
		return c_tell;
	}
	public void setC_tell(long c_tell) {
		this.c_tell = c_tell;
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
		return "CustomerMasterDTO [c_id=" + c_id + ", c_name=" + c_name + ", c_bill=" + c_bill + ", c_tell=" + c_tell
				+ "]";
	}
	
}
