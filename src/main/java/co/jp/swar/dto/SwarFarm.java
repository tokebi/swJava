package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SwarFarm {
	
	/** */
	@JsonProperty("unit_list")
	private SfUnit[] lstUnit;
	
	/** */
	@JsonProperty("building_list")
	private SfBuildingList[] lstBuilding;
	
	/** */
	@JsonProperty("runes")
	private SfRune[] lstRune;
	
	/** */
	@JsonProperty("deco_list")
	private SfDecoList[] lstDeco;
	
	/** */
	@JsonProperty("helper_list")
	private SfHelperList[] lstHelper;
	
	/** */
	@JsonProperty("unit_lock_list")
	private Integer[] lstUnitLock;
	
	/** */
	@JsonProperty("wizard_info")
	private SfWizardInfo wizardInfo;
	
	/** */
	@JsonProperty("inventory_info")
	private SfInventoryInfo[] lstInventoryInfo;
	
	/** */
	@JsonProperty("rune_craft_item_list")
	private SfRuneCraftItem[] lstRuneCraftItem;

	public SfUnit[] getLstUnit() {
		return lstUnit;
	}

	public void setLstUnit(SfUnit[] lstUnit) {
		this.lstUnit = lstUnit;
	}

	public SfBuildingList[] getLstBuilding() {
		return lstBuilding;
	}

	public void setLstBuilding(SfBuildingList[] lstBuilding) {
		this.lstBuilding = lstBuilding;
	}

	public SfRune[] getLstRune() {
		return lstRune;
	}

	public void setLstRune(SfRune[] lstRune) {
		this.lstRune = lstRune;
	}

	public SfDecoList[] getLstDeco() {
		return lstDeco;
	}

	public void setLstDeco(SfDecoList[] lstDeco) {
		this.lstDeco = lstDeco;
	}

	public SfHelperList[] getLstHelper() {
		return lstHelper;
	}

	public void setLstHelper(SfHelperList[] lstHelper) {
		this.lstHelper = lstHelper;
	}

	public Integer[] getLstUnitLock() {
		return lstUnitLock;
	}

	public void setLstUnitLock(Integer[] lstUnitLock) {
		this.lstUnitLock = lstUnitLock;
	}

	public SfWizardInfo getWizardInfo() {
		return wizardInfo;
	}

	public void setWizardInfo(SfWizardInfo wizardInfo) {
		this.wizardInfo = wizardInfo;
	}

	public SfInventoryInfo[] getLstInventoryInfo() {
		return lstInventoryInfo;
	}

	public void setLstInventoryInfo(SfInventoryInfo[] lstInventoryInfo) {
		this.lstInventoryInfo = lstInventoryInfo;
	}

	public SfRuneCraftItem[] getLstRuneCraftItem() {
		return lstRuneCraftItem;
	}

	public void setLstRuneCraftItem(SfRuneCraftItem[] lstRuneCraftItem) {
		this.lstRuneCraftItem = lstRuneCraftItem;
	}
}
