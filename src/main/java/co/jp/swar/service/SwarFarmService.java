package co.jp.swar.service;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.jp.swar.dto.SfUnit;
import co.jp.swar.dto.SwarFarm;

public class SwarFarmService {
	private static SwarFarmService singleton = new SwarFarmService();
	private SwarFarm swarFarm = null;

	private SwarFarmService() {
		// JSONファイルの指定
		String file_name = "C:\\Users\\hhara\\OneDrive\\SWProxy-windows\\819205-swarfarm.json";
		File file = new File(file_name);

		// Jacksonのマッパー構成
		ObjectMapper mapper = new ObjectMapper();

		try {
			// JSON読み込み
			swarFarm = mapper.readValue(file, SwarFarm.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("インスタンスを作成しました。");
	}

	public static SwarFarmService getInstance() {
		return singleton;
	}

	public SwarFarm getData() {
		return swarFarm;
	}

	public SfUnit[] getLstUnit() {
		return swarFarm.getLstUnit();
	}
}
