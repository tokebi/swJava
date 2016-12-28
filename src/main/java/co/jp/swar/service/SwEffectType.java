package co.jp.swar.service;

import java.util.HashMap;

public class SwEffectType {
	/**
	 * 効果名の日本語名を返す
	 * 
	 * @param idx
	 * @return 効果名の日本語名
	 */
	public String getJname(int idx) {
		return effectType.get(idx);
	}

	private static HashMap<Integer, String> effectType = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -3662534994596617101L;
		//@formatter:off
		{put(0, "");}
		{put(1, "体");}
		{put(2, "体%");}
		{put(3, "攻");}
		{put(4, "攻%");}
		{put(5, "防");}
		{put(6, "防%");}
		{put(8, "速");}
		{put(9, "クリ");}
		{put(10, "ダメ");}
		{put(11, "抵抗");}
		{put(12, "的中");}
		//@formatter:on
	};
}
