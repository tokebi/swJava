package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SfUnit {
	/** �����X�^�[�̈��ID */
	@JsonProperty("unit_id")
	private Integer unitId;
	
	/** �}�X�^�[ID */
	@JsonProperty("unit_master_id")
	private Integer unitMasterId;
	
	/** ���� */
	@JsonProperty("attribute")
	private Integer attribute;
	
	/** �����X�^�[������ */
	@JsonProperty("create_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
	private String createTime;
	
	/** ���x�� */
	@JsonProperty("unit_level")
	private Integer unitLevel;
	
	/** ���� */
	@JsonProperty("class")
	private Integer classNum;
	
	/** ��b�̗� */
	@JsonProperty("con")
	private Integer con;

	/** �U���� */
	@JsonProperty("atk")
	private Integer atk;
	
	/** �h��� */
	@JsonProperty("def")
	private Integer def;
	
	/** �U�����x */
	@JsonProperty("spd")
	private Integer spd;
	
	/** �N���� */
	@JsonProperty("critical_rate")
	private Integer criticalRate;
	
	/** �N���_��*/
	@JsonProperty("critical_damage")
	private Integer criticalDamage;
	
	/** ���ʒ�R */
	@JsonProperty("resist")
	private Integer resist;
	
	/** ���ʓI�� */
	@JsonProperty("accuracy")
	private Integer accuracy;
	
	/** �������[�� */
	@JsonProperty("runes")
	private SfRune[] lstRune;
	
	/** �X�L�� */
	@JsonProperty("skills")
	private Integer[][] lstskill;
	
	/** �z�����N���X */
	@JsonProperty("homunculus")
	private Integer homunculus;
	
	/** �z�����N���X�� */
	@JsonProperty("homunculus_name")
	private String homunculusName;	/** */
	@JsonProperty("source")
	private Integer source;
	
	/** */
	@JsonProperty("building_id")
	private Integer buildingId;
	
	/** */
	@JsonProperty("exp_gain_rate")
	private Integer expGainRate;
	
	/** */
	@JsonProperty("exp_gained")
	private Integer expGained;
	
	/** */
	@JsonProperty("trans_items")
	private Integer[] lstTtransItem;
	
	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;
	
	/** */
	@JsonProperty("pos_x")
	private Integer posX;
	
	/** */
	@JsonProperty("pos_y")
	private Integer posY;
	
	/** */
	@JsonProperty("costume_master_id")
	private Integer costumeMasterId;
	
	/** */
	@JsonProperty("experience")
	private Integer experience;
	
	/** */
	@JsonProperty("island_id")
	private Integer islandId;

	/**
	 * �����X�^�[�̈��ID��Ԃ�
	 * 
	 * @return unitId
	 */
	public Integer getUnitId() {
		return unitId;
	}

	/**
	 * �}�X�^�[ID��Ԃ�
	 * 
	 * @return unitMasterId
	 */
	public Integer getUnitMasterId() {
		return unitMasterId;
	}

	/**
	 * ������Ԃ�
	 * 
	 * @return attribute
	 */
	public Integer getAttribute() {
		return attribute;
	}

	/**
	 * ��������Ԃ�
	 * 
	 * @return createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * ���x����Ԃ�
	 * 
	 * @return unitLevel
	 */
	public Integer getUnitLevel() {
		return unitLevel;
	}

	/**
	 * ������Ԃ�
	 * 
	 * @return classNum
	 */
	public Integer getClassNum() {
		return classNum;
	}

	/**
	 * �̗͂�Ԃ�
	 * 
	 * @return con
	 */
	public Integer getCon() {
		return con;
	}

	/**
	 * �U���͂�Ԃ�
	 * 
	 * @return atk
	 */
	public Integer getAtk() {
		return atk;
	}

	/**
	 * �h��͂�Ԃ�
	 * 
	 * @return def
	 */
	public Integer getDef() {
		return def;
	}

	/**
	 * �U���͂�Ԃ�
	 * 
	 * @return spd
	 */
	public Integer getSpd() {
		return spd;
	}

	/**
	 * �N������Ԃ�
	 * 
	 * @return criticalRate
	 */
	public Integer getCriticalRate() {
		return criticalRate;
	}

	/**
	 * �N���_����Ԃ�
	 * 
	 * @return criticalDamage
	 */
	public Integer getCriticalDamage() {
		return criticalDamage;
	}

	/**
	 * ���ʒ�R��Ԃ�
	 * 
	 * @return resist
	 */
	public Integer getResist() {
		return resist;
	}

	/**
	 * ���ʓI����Ԃ�
	 * 
	 * @return accuracy
	 */
	public Integer getAccuracy() {
		return accuracy;
	}

	/**
	 * ���[����Ԃ�
	 * 
	 * @return lstRune
	 */
	public SfRune[] getLstRune() {
		return lstRune;
	}

	/**
	 * �X�L����Ԃ�
	 * 
	 * @return lstskill
	 */
	public Integer[][] getLstskill() {
		return lstskill;
	}

	/**
	 * 
	 * @return homunculus
	 */
	public Integer getHomunculus() {
		return homunculus;
	}

	/**
	 * �z�����N���X����Ԃ�
	 * 
	 * @return homunculusName
	 */
	public String getHomunculusName() {
		return homunculusName;
	}

	/**
	 * @return source
	 */
	public Integer getSource() {
		return source;
	}

	/**
	 * @return buildingId
	 */
	public Integer getBuildingId() {
		return buildingId;
	}

	/**
	 * @return expGainRate
	 */
	public Integer getExpGainRate() {
		return expGainRate;
	}

	/**
	 * @return expGained
	 */
	public Integer getExpGained() {
		return expGained;
	}

	/**
	 * @return lstTtransItem
	 */
	public Integer[] getLstTtransItem() {
		return lstTtransItem;
	}

	/**
	 * @return wizardId
	 */
	public Integer getWizardId() {
		return wizardId;
	}

	/**
	 * @return posX
	 */
	public Integer getPosX() {
		return posX;
	}

	/**
	 * @return posY
	 */
	public Integer getPosY() {
		return posY;
	}

	/**
	 * @return costumeMasterId
	 */
	public Integer getCostumeMasterId() {
		return costumeMasterId;
	}

	/**
	 * @return experience
	 */
	public Integer getExperience() {
		return experience;
	}

	/**
	 * @return islandId
	 */
	public Integer getIslandId() {
		return islandId;
	}

}
