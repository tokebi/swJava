package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfHelperList {

	/** */
	@JsonProperty("rep_unit_level")
	private Integer repUnitLevel;

	/** */
	@JsonProperty("last_login_time")
	private Integer lastLoginTime;

	/** */
	@JsonProperty("wizard_level")
	private Integer wizardLevel;

	/** */
	@JsonProperty("rating_id")
	private Integer ratingId;

	/** */
	@JsonProperty("rep_unit_master_id")
	private Integer repUnitMasterId;

	/** */
	@JsonProperty("arena_score")
	private Integer arenaScore;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("next_assist_time")
	private Integer nextAssistTime;

	/** */
	@JsonProperty("wizard_name")
	private String wizardName;

	/** */
	@JsonProperty("rep_unit_class")
	private Integer repUnitClass;

	/** */
	@JsonProperty("channel_uid")
	private Long channelUid;

	/** */
	@JsonProperty("next_gift_time")
	private Integer nextGiftTime;

	/** */
	@JsonProperty("rep_unit_id")
	private Integer repUnitId;

	public Integer getRepUnitLevel() {
		return repUnitLevel;
	}

	public void setRepUnitLevel(Integer repUnitLevel) {
		this.repUnitLevel = repUnitLevel;
	}

	public Integer getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Integer lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getWizardLevel() {
		return wizardLevel;
	}

	public void setWizardLevel(Integer wizardLevel) {
		this.wizardLevel = wizardLevel;
	}

	public Integer getRatingId() {
		return ratingId;
	}

	public void setRatingId(Integer ratingId) {
		this.ratingId = ratingId;
	}

	public Integer getRepUnitMasterId() {
		return repUnitMasterId;
	}

	public void setRepUnitMasterId(Integer repUnitMasterId) {
		this.repUnitMasterId = repUnitMasterId;
	}

	public Integer getArenaScore() {
		return arenaScore;
	}

	public void setArenaScore(Integer arenaScore) {
		this.arenaScore = arenaScore;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}

	public Integer getNextAssistTime() {
		return nextAssistTime;
	}

	public void setNextAssistTime(Integer nextAssistTime) {
		this.nextAssistTime = nextAssistTime;
	}

	public String getWizardName() {
		return wizardName;
	}

	public void setWizardName(String wizardName) {
		this.wizardName = wizardName;
	}

	public Integer getRepUnitClass() {
		return repUnitClass;
	}

	public void setRepUnitClass(Integer repUnitClass) {
		this.repUnitClass = repUnitClass;
	}

	public Long getChannelUid() {
		return channelUid;
	}

	public void setChannelUid(Long channelUid) {
		this.channelUid = channelUid;
	}

	public Integer getNextGiftTime() {
		return nextGiftTime;
	}

	public void setNextGiftTime(Integer nextGiftTime) {
		this.nextGiftTime = nextGiftTime;
	}

	public Integer getRepUnitId() {
		return repUnitId;
	}

	public void setRepUnitId(Integer repUnitId) {
		this.repUnitId = repUnitId;
	}
}
