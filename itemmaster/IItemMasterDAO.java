package itemmaster;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import connectionutility.ConnectionUtility;

public class IItemMasterDAO implements IItemMaster {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public IItemMasterDAO(Connection con) {
		this.con = con;
	}

	@Override
	public int updateItemMaster(ItemMasterDTO im) {
		try {
			ps = con.prepareStatement("INSERT INTO item_master values(?,?,?,?,?)");
			ps.setInt(1, im.getItem_id());
			ps.setString(2, im.getItem_name());
			ps.setInt(3, im.getUnit());
			ps.setInt(4, im.getPrice());
			ps.setBlob(5, im.getImage());
			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ex) {

			}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
	}

	@Override
	public int deleteItemMaster(int item_id) {
		try {
			ps = con.prepareStatement("DELETE FROM item_master where item_id = ?");
			ps.setInt(1, item_id);

			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ee) {

			}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}

	}

	@Override
	public int deleteItemMaster(String item_name) {
		try {
			ps = con.prepareStatement("DELETE FROM item_master where item_id = ?");
			ps.setString(2, item_name);

			int i = ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
			return i;
		} catch (Exception e) {
			try {
				ps.close();
				rs.close();
			} catch (Exception ee) {

			}
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}

	}

	@Override
	public List<ItemMasterDTO> listAllItemMaster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemMasterDTO findByID(int item_id) throws SQLException {
		ps = con.prepareStatement("SELECT * FROM item_master where item_id = ?");
		ps.setInt(1, item_id);
		rs = ps.executeQuery();
		ItemMasterDTO im = new ItemMasterDTO();
		if (rs.next()) {
			im.setItem_id(rs.getInt("item_id"));
			im.setItem_name(rs.getNString("item_name"));
			im.setUnit(rs.getInt("unit"));
			im.setPrice(rs.getInt("price"));
			im.setImage(rs.getBlob("image"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return im;
	}

	@Override
	public ItemMasterDTO findByName(String item_name) throws SQLException {
		ps = con.prepareStatement("SELECT * FROM item_master WHERE item_name = ?");
		ps.setString(2, item_name);
		rs = ps.executeQuery();
		ItemMasterDTO im = new ItemMasterDTO();
		if (rs.next()) {
			im.setItem_id(rs.getInt("item_id"));
			im.setItem_name(rs.getString("item_name"));
			im.setUnit(rs.getInt("unit"));
			im.setPrice(rs.getInt("price"));
			im.setImage(rs.getBlob("image"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return im;
	}

	@Override
	public ItemMasterDTO findByUnit(int unit) throws SQLException {
		ps = con.prepareStatement("SELECT * FROM item_master WHERE unit=?");
		ps.setInt(3, unit);
		rs = ps.executeQuery();
		ItemMasterDTO im = new ItemMasterDTO();
		if (rs.next()) {
			im.setItem_id(rs.getInt("item_id"));
			im.setItem_name(rs.getNString("item_name"));
			im.setUnit(rs.getInt("unit"));
			im.setPrice(rs.getInt("price"));
			im.setImage(rs.getBlob("image"));
		} else {
			System.out.println("No Record found.....");
		}
		ps.close();
		rs.close();
		ConnectionUtility.closeConnection(null, null);
		return im;
	}

	@Override
	public ItemMasterDTO findByPrice(int price) throws SQLException {
		ps = con.prepareStatement("SELECT * FROM item_master WHERE price=?");
		ps.setInt(4, price);
		rs = ps.executeQuery();
		ItemMasterDTO im = new ItemMasterDTO();
		if (rs.next()) {
			im.setItem_id(rs.getInt("item_id"));
			im.setItem_name(rs.getNString("item_name"));
			im.setUnit(rs.getInt("unit"));
			im.setPrice(rs.getInt("price"));
			im.setImage(rs.getBlob("image"));
		} else {
			System.out.println("No Record found.....");
		}
		rs.close();
		ps.close();
		ConnectionUtility.closeConnection(null, null);
		return im;
	}

	
}
