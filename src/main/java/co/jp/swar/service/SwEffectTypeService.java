package co.jp.swar.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class SwEffectTypeService {
	private static SwEffectTypeService singleton = new SwEffectTypeService();
	private static HashMap<Integer, String> effectType = new HashMap<Integer, String>();

	private SwEffectTypeService() {
		try {
			Connection con = DbFactory.getConnection();
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM EffectType";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String value = rs.getString("name");
				effectType.put(id, value);
			}
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SwEffectTypeService getInstance() {
		return singleton;
	}

	/**
	 * 効果名の日本語名を返す
	 * 
	 * @param idx
	 * @return 効果名の日本語名
	 */
	public String getJname(int idx) {
		return effectType.get(idx);
	}

	// private static HashMap<Integer, String> effectType = new HashMap<Integer,
	// String>() {
	// private static final long serialVersionUID = -3662534994596617101L;
//		//@formatter:off
//		{put(0, "");}
//		{put(1, "体");}
//		{put(2, "体%");}
//		{put(3, "攻");}
//		{put(4, "攻%");}
//		{put(5, "防");}
//		{put(6, "防%");}
//		{put(8, "速");}
//		{put(9, "クリ");}
//		{put(10, "ダメ");}
//		{put(11, "抵抗");}
//		{put(12, "的中");}
//		//@formatter:on
	// };
}
