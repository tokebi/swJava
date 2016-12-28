package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfBuildingList {
	/** */
	@JsonProperty("pos_x")
	private Integer posX;

	/** */
	@JsonProperty("pos_y")
	private Integer posY;

	/** */
	@JsonProperty("next_harvest")
	private Integer nextHarvest;

	/** */
	@JsonProperty("harvest_max")
	private Integer harvestMax;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("gain_per_hour")
	private Integer gainPerHour;

	/** */
	@JsonProperty("island_id")
	private Integer islandId;

	/** */
	@JsonProperty("building_master_id")
	private Integer buildingMasterId;

	/** */
	@JsonProperty("harvest_available")
	private Integer harvestAvailable;

	/** */
	@JsonProperty("building_id")
	private Integer buildingId;

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
	 * @return nextHarvest
	 */
	public Integer getNextHarvest() {
		return nextHarvest;
	}

	/**
	 * @return harvestMax
	 */
	public Integer getHarvestMax() {
		return harvestMax;
	}

	/**
	 * @return wizardId
	 */
	public Integer getWizardId() {
		return wizardId;
	}

	/**
	 * @return gainPerHour
	 */
	public Integer getGainPerHour() {
		return gainPerHour;
	}

	/**
	 * @return islandId
	 */
	public Integer getIslandId() {
		return islandId;
	}

	/**
	 * @return buildingMasterId
	 */
	public Integer getBuildingMasterId() {
		return buildingMasterId;
	}

	/**
	 * @return harvestAvailable
	 */
	public Integer getHarvestAvailable() {
		return harvestAvailable;
	}

	/**
	 * @return buildingId
	 */
	public Integer getBuildingId() {
		return buildingId;
	}
}
