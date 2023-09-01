package run;

import java.io.Serializable;
import java.util.Objects;

public class ItemMasterDTO implements Serializable{
	int item_id, item_name, unit, price, image;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getItem_name() {
		return item_name;
	}

	public void setItem_name(int item_name) {
		this.item_name = item_name;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemMasterDTO other = (ItemMasterDTO) obj;
		return item_id == other.item_id;
	}

	@Override
	public String toString() {
		return "ItemMasterDTO [item_id=" + item_id + ", item_name=" + item_name + ", unit=" + unit + ", price=" + price
				+ ", image=" + image + "]";
	}
	/* Connection con=ConnectionUtility.getConnection();
	
	PreparedStatement p=con.prepareStatement("select * from employee");
	
	ResultSet rs=p.executeQuery();
	ArrayList<Emp> list=new ArrayList<Emp>();
	while(rs.next()) {
		Emp emp=new Emp();
		emp.setEid(rs.getInt("eid"));
		emp.setEname(rs.getString("ename"));
		emp.setEpass(rs.getString(3));
		emp.setEsal(rs.getInt(4));
		emp.setEcity(rs.getString(5));
		emp.setFlag(rs.getInt("flag"));
		list.add(emp); */
}
