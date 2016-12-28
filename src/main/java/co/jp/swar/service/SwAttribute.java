package co.jp.swar.service;

import java.util.HashMap;

public class SwAttribute {
	private static HashMap<Integer,String> attrivute = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -955576291157305786L;
		{put(1, "…");}
        {put(2, "‰Î");}
        {put(3, "•—");}
        {put(4, "Œõ");}
        {put(5, "ˆÅ");}
    };
    /**
     * ‘®«‚Ì“ú–{Œê–¼‚ğ•Ô‚·
     * 
     * @param idx
     * @return ‘®«‚Ì“ú–{Œê–¼
     */
	public String getJname(int idx) {
		return attrivute.get(idx);
	}
}
