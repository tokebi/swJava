package co.jp.swar.service;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.jp.swar.dto.SwarFarm;

public class SwarFarmSingleton {
	private static SwarFarmSingleton singleton = new SwarFarmSingleton();
	private SwarFarm swarFarm = null;
	
    private SwarFarmSingleton(){
    	// JSONファイルの指定
        String file_name = "C:\\Users\\hhara\\OneDrive\\SWProxy-windows\\819205-swarfarm.json";
        File file = new File(file_name);
        
        //　Jacksonのマッパー構成
        ObjectMapper mapper = new ObjectMapper();
        
        try {
        	// JSON読み込み
        	swarFarm = mapper.readValue(file, SwarFarm.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("インスタンスを作成しました。");
    }

    public static SwarFarmSingleton getInstance(){
        return singleton;
    }

	public SwarFarm getData() {
		return swarFarm;
	}
}
