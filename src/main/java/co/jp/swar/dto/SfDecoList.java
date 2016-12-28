package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfDecoList {
	/** */
	@JsonProperty("pos_x")
	private Integer posX;

	/** */
	@JsonProperty("pos_y")
	private Integer posY;

	/** */
	@JsonProperty("deco_id")
	private Integer decoId;

	/** */
	@JsonProperty("level")
	private Integer level;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("island_id")
	private Integer islandId;

	/** */
	@JsonProperty("master_id")
	private Integer masterId;

	public Integer getPosX() {
		return posX;
	}

	public void setPosX(Integer posX) {
		this.posX = posX;
	}

	public Integer getPosY() {
		return posY;
	}

	public void setPosY(Integer posY) {
		this.posY = posY;
	}

	public Integer getDecoId() {
		return decoId;
	}

	public void setDecoId(Integer decoId) {
		this.decoId = decoId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}

	public Integer getIslandId() {
		return islandId;
	}

	public void setIslandId(Integer islandId) {
		this.islandId = islandId;
	}

	public Integer getMasterId() {
		return masterId;
	}

	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
}
