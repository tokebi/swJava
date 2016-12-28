package co.jp.swar.service;

import java.util.HashMap;

public class SwAttribute {
	/**
	 * 属性の日本語名を返す
	 * 
	 * @param idx
	 * @return 属性の日本語名
	 */
	public String getJname(int idx) {
		return attrivute.get(idx);
	}

	private static HashMap<Integer, String> attrivute = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -955576291157305786L;
		//@formatter:off
		{put(1, "水");}
		{put(2, "火");}
		{put(3, "風");}
		{put(4, "光");}
		{put(5, "闇");}
		//@formatter:on
	};
}
