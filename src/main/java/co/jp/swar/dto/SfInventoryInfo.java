package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfInventoryInfo {

	/** */
	@JsonProperty("item_master_type")
	private Integer itemMasterType;

	/** */
	@JsonProperty("item_quantity")
	private Integer itemQuantity;

	/** */
	@JsonProperty("item_master_id")
	private Integer itemMasterId;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	public Integer getItemMasterType() {
		return itemMasterType;
	}

	public void setItemMasterType(Integer itemMasterType) {
		this.itemMasterType = itemMasterType;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Integer getItemMasterId() {
		return itemMasterId;
	}

	public void setItemMasterId(Integer itemMasterId) {
		this.itemMasterId = itemMasterId;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}
}
