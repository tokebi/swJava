package co.jp.swar.service;

import java.util.HashMap;

public class SwEffectType {
	private static HashMap<Integer,String> effectType = new HashMap<Integer, String>() {
		private static final long serialVersionUID = -3662534994596617101L;
		{put(0 , "");}
		{put(1 , "��");}
		{put(2 , "��%");}
		{put(3 , "�U");}
		{put(4 , "�U%");}
		{put(5 , "�h");}
		{put(6 , "�h%");}
		{put(8 , "��");}
		{put(9 , "�N��");}
		{put(10, "�_��");}
		{put(11, "��R");}
		{put(12, "�I��");}
    };
    /**
     * ���ʖ��̓��{�ꖼ��Ԃ�
     * 
     * @param idx
     * @return ���ʖ��̓��{�ꖼ
     */
	public String getJname(int idx) {
		return effectType.get(idx);
	}
}
