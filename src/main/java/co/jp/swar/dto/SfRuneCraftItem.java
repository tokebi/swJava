package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfRuneCraftItem {

	/** */
	@JsonProperty("sell_value")
	private Integer sellValue;

	/** */
	@JsonProperty("craft_type_id")
	private Integer craftTypeId;

	/** */
	@JsonProperty("craft_item_id")
	private Integer craftItemId;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("craft_type")
	private Integer craftType;

	public Integer getSellValue() {
		return sellValue;
	}

	public void setSellValue(Integer sellValue) {
		this.sellValue = sellValue;
	}

	public Integer getCraftTypeId() {
		return craftTypeId;
	}

	public void setCraftTypeId(Integer craftTypeId) {
		this.craftTypeId = craftTypeId;
	}

	public Integer getCraftItemId() {
		return craftItemId;
	}

	public void setCraftItemId(Integer craftItemId) {
		this.craftItemId = craftItemId;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}

	public Integer getCraftType() {
		return craftType;
	}

	public void setCraftType(Integer craftType) {
		this.craftType = craftType;
	}
}
