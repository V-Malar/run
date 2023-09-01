package itemmaster;

import java.sql.SQLException;
import java.util.List;

public interface IItemMaster {
	
	public int updateItemMaster(ItemMasterDTO im);

	public int deleteItemMaster(int item_id);

	public int deleteItemMaster(String item_name);

	public List<ItemMasterDTO> listAllItemMaster() throws SQLException;

	public ItemMasterDTO findByID(int item_id) throws SQLException;

	public ItemMasterDTO findByName(String item_name) throws SQLException;

	public ItemMasterDTO findByUnit(int unit) throws SQLException;

	public ItemMasterDTO findByPrice(int price) throws SQLException;
}
