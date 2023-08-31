package run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class IItemMasterDAO implements IItemMaster{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	 public IItemMasterDAO(Connection con) {
		this.con=con;
	}
	@Override
	public int updateItemMaster(ItemMaster im) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemMaster(int item_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemMaster(String item_name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ItemMaster> listAllItemMaster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster findByID(int item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster findByName(String item_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster findByUnit(int unit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMaster findByPrice(String price) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int createItemMaster(ItemMaster cm) {
		// TODO Auto-generated method stub
		return 0;
	}

}
