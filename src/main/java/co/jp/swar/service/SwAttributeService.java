package co.jp.swar.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class SwAttributeService {
	private static SwAttributeService singleton = new SwAttributeService();
	private static HashMap<Integer, String> attrivute = new HashMap<Integer, String>();

	private SwAttributeService() {
		try {
			Connection con = DbFactory.getConnection();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM Attribute";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String value = rs.getString("name");
				attrivute.put(id, value);
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SwAttributeService getInstance() {
		return singleton;
	}

	/**
	 * 属性の日本語名を返す
	 * 
	 * @param idx
	 * @return 属性の日本語名
	 */
	public String getJname(int idx) {
		return attrivute.get(idx);
	}

	// private static HashMap<Integer, String> attrivute = new HashMap<Integer,
	// String>() {
	// private static final long serialVersionUID = -955576291157305786L;
//		//@formatter:off
//		{put(1, "水");}
//		{put(2, "火");}
//		{put(3, "風");}
//		{put(4, "光");}
//		{put(5, "闇");}
//		//@formatter:on
	// };
}
