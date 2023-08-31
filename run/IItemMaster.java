package run;

import java.util.List;

public interface IItemMaster {

	public int createItemMaster(ItemMaster cm);
	
	public int updateItemMaster(ItemMaster im);

	public int deleteItemMaster(int item_id);

	public int deleteItemMaster(String item_name);

	public List<ItemMaster> listAllItemMaster();

	public ItemMaster findByID(int item_id);

	public ItemMaster findByName(String item_name);

	public ItemMaster findByUnit(int unit);

	public ItemMaster findByPrice(String price);
}
