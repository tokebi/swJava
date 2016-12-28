package co.jp.swar.service;

import java.util.HashMap;

public class SwEffectType {
	private static HashMap<Integer,String> effectType = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -3662534994596617101L;
		{put(0 , "");}
		{put(1 , "‘Ì");}
		{put(2 , "‘Ì%");}
		{put(3 , "U");}
		{put(4 , "U%");}
		{put(5 , "–h");}
		{put(6 , "–h%");}
		{put(8 , "‘¬");}
		{put(9 , "ƒNƒŠ");}
		{put(10, "ƒ_ƒ");}
		{put(11, "’ïR");}
		{put(12, "“I’†");}
    };
    /**
     * Œø‰Ê–¼‚Ì“ú–{Œê–¼‚ğ•Ô‚·
     * 
     * @param idx
     * @return Œø‰Ê–¼‚Ì“ú–{Œê–¼
     */
	public String getJname(int idx) {
		return effectType.get(idx);
	}
}
