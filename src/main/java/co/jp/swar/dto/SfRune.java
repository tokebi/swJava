package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfRune {

	/** */
	@JsonProperty("occupied_type")
	private Integer occupiedType;

	/** */
	@JsonProperty("sell_value")
	private Integer sellValue;

	/** */
	@JsonProperty("pri_eff")
	private Integer[] priEff;

	/** */
	@JsonProperty("prefix_eff")
	private Integer[] prefixEff;

	/** */
	@JsonProperty("slot_no")
	private Integer slotNo;

	/** */
	@JsonProperty("rank")
	private Integer rank;

	/** */
	@JsonProperty("occupied_id")
	private Integer occupiedId;

	/** */
	@JsonProperty("sec_eff")
	private Integer[][] secEff;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("upgrade_curr")
	private Integer upgradeCurr;

	/** */
	@JsonProperty("rune_id")
	private Long runeId;

	/** */
	@JsonProperty("base_value")
	private Integer baseValue;

	@JsonProperty("class")
	private Integer classNum;

	/** */
	@JsonProperty("set_id")
	private Integer setId;

	/** */
	@JsonProperty("upgrade_limit")
	private Integer upgradeLimit;

	public Integer getOccupiedType() {
		return occupiedType;
	}

	public void setOccupiedType(Integer occupiedType) {
		this.occupiedType = occupiedType;
	}

	public Integer getSellValue() {
		return sellValue;
	}

	public void setSellValue(Integer sellValue) {
		this.sellValue = sellValue;
	}

	public Integer[] getPriEff() {
		return priEff;
	}

	public void setPriEff(Integer[] priEff) {
		this.priEff = priEff;
	}

	public Integer[] getPrefixEff() {
		return prefixEff;
	}

	public void setPrefixEff(Integer[] prefixEff) {
		this.prefixEff = prefixEff;
	}

	public Integer getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(Integer slotNo) {
		this.slotNo = slotNo;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getOccupiedId() {
		return occupiedId;
	}

	public void setOccupiedId(Integer occupiedId) {
		this.occupiedId = occupiedId;
	}

	public Integer[][] getSecEff() {
		return secEff;
	}

	public void setSecEff(Integer[][] secEff) {
		this.secEff = secEff;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}

	public Integer getUpgradeCurr() {
		return upgradeCurr;
	}

	public void setUpgradeCurr(Integer upgradeCurr) {
		this.upgradeCurr = upgradeCurr;
	}

	public Long getRuneId() {
		return runeId;
	}

	public void setRuneId(Long runeId) {
		this.runeId = runeId;
	}

	public Integer getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(Integer baseValue) {
		this.baseValue = baseValue;
	}

	public Integer getClassNum() {
		return classNum;
	}

	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}

	public Integer getSetId() {
		return setId;
	}

	public void setSetId(Integer setId) {
		this.setId = setId;
	}

	public Integer getUpgradeLimit() {
		return upgradeLimit;
	}

	public void setUpgradeLimit(Integer upgradeLimit) {
		this.upgradeLimit = upgradeLimit;
	}
}
