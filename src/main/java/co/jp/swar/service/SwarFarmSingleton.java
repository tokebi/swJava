package co.jp.swar.service;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import co.jp.swar.dto.SwarFarm;

public class SwarFarmSingleton {
	private static SwarFarmSingleton singleton = new SwarFarmSingleton();
	private SwarFarm swarFarm = null;
	
    private SwarFarmSingleton(){
    	// JSON�t�@�C���̎w��
        String file_name = "C:\\Users\\hhara\\OneDrive\\SWProxy-windows\\819205-swarfarm.json";
        File file = new File(file_name);
        
        //�@Jackson�̃}�b�p�[�\��
        ObjectMapper mapper = new ObjectMapper();
        
        try {
        	// JSON�ǂݍ���
        	swarFarm = mapper.readValue(file, SwarFarm.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("�C���X�^���X���쐬���܂����B");
    }

    public static SwarFarmSingleton getInstance(){
        return singleton;
    }

	public SwarFarm getData() {
		return swarFarm;
	}
}
