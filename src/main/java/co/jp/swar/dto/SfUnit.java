package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SfUnit {
	/** モンスターの一意ID */
	@JsonProperty("unit_id")
	private Integer unitId;
	
	/** マスターID */
	@JsonProperty("unit_master_id")
	private Integer unitMasterId;
	
	/** 属性 */
	@JsonProperty("attribute")
	private Integer attribute;
	
	/** モンスター召喚日 */
	@JsonProperty("create_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
	private String createTime;
	
	/** レベル */
	@JsonProperty("unit_level")
	private Integer unitLevel;
	
	/** 星数 */
	@JsonProperty("class")
	private Integer classNum;
	
	/** 基礎体力 */
	@JsonProperty("con")
	private Integer con;

	/** 攻撃力 */
	@JsonProperty("atk")
	private Integer atk;
	
	/** 防御力 */
	@JsonProperty("def")
	private Integer def;
	
	/** 攻撃速度 */
	@JsonProperty("spd")
	private Integer spd;
	
	/** クリ率 */
	@JsonProperty("critical_rate")
	private Integer criticalRate;
	
	/** クリダメ*/
	@JsonProperty("critical_damage")
	private Integer criticalDamage;
	
	/** 効果抵抗 */
	@JsonProperty("resist")
	private Integer resist;
	
	/** 効果的中 */
	@JsonProperty("accuracy")
	private Integer accuracy;
	
	/** 装着ルーン */
	@JsonProperty("runes")
	private SfRune[] lstRune;
	
	/** スキル */
	@JsonProperty("skills")
	private Integer[][] lstskill;
	
	/** ホムンクルス */
	@JsonProperty("homunculus")
	private Integer homunculus;
	
	/** ホムンクルス名 */
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
	 * モンスターの一意IDを返す
	 * 
	 * @return unitId
	 */
	public Integer getUnitId() {
		return unitId;
	}

	/**
	 * マスターIDを返す
	 * 
	 * @return unitMasterId
	 */
	public Integer getUnitMasterId() {
		return unitMasterId;
	}

	/**
	 * 属性を返す
	 * 
	 * @return attribute
	 */
	public Integer getAttribute() {
		return attribute;
	}

	/**
	 * 召喚日を返す
	 * 
	 * @return createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * レベルを返す
	 * 
	 * @return unitLevel
	 */
	public Integer getUnitLevel() {
		return unitLevel;
	}

	/**
	 * 星数を返す
	 * 
	 * @return classNum
	 */
	public Integer getClassNum() {
		return classNum;
	}

	/**
	 * 体力を返す
	 * 
	 * @return con
	 */
	public Integer getCon() {
		return con;
	}

	/**
	 * 攻撃力を返す
	 * 
	 * @return atk
	 */
	public Integer getAtk() {
		return atk;
	}

	/**
	 * 防御力を返す
	 * 
	 * @return def
	 */
	public Integer getDef() {
		return def;
	}

	/**
	 * 攻撃力を返す
	 * 
	 * @return spd
	 */
	public Integer getSpd() {
		return spd;
	}

	/**
	 * クリ率を返す
	 * 
	 * @return criticalRate
	 */
	public Integer getCriticalRate() {
		return criticalRate;
	}

	/**
	 * クリダメを返す
	 * 
	 * @return criticalDamage
	 */
	public Integer getCriticalDamage() {
		return criticalDamage;
	}

	/**
	 * 効果抵抗を返す
	 * 
	 * @return resist
	 */
	public Integer getResist() {
		return resist;
	}

	/**
	 * 効果的中を返す
	 * 
	 * @return accuracy
	 */
	public Integer getAccuracy() {
		return accuracy;
	}

	/**
	 * ルーンを返す
	 * 
	 * @return lstRune
	 */
	public SfRune[] getLstRune() {
		return lstRune;
	}

	/**
	 * スキルを返す
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
	 * ホムンクルス名を返す
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
