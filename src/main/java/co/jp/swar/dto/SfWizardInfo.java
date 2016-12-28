package co.jp.swar.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SfWizardInfo {

	/** */
	@JsonProperty("arena_energy_next_gain")
	private Integer arenaEnergyNextGain;

	/** */
	@JsonProperty("wizard_level")
	private Integer wizardLevel;

	/** */
	@JsonProperty("darkportal_energy")
	private Integer darkportalEnergy;

	/** */
	@JsonProperty("unit_depository_slots")
	private SfSlotNumber unitDepositorySlots;

	/** */
	@JsonProperty("energy_per_min")
	private BigDecimal energyPerMin;

	/** */
	@JsonProperty("costume_point")
	private Integer costumePoint;

	/** */
	@JsonProperty("social_point_max")
	private Integer socialPointMax;

	/** */
	@JsonProperty("next_energy_gain")
	private Integer nextEnergyGain;

	/** */
	@JsonProperty("unit_slots")
	private SfSlotNumber unitSlots;

	/** */
	@JsonProperty("wizard_energy")
	private Integer wizardEnergy;

	/** */
	@JsonProperty("wizard_last_login")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
	private Date wizardLastLogin;

	/** */
	@JsonProperty("mail_box_event")
	private Integer mailBoxEvent;

	/** */
	@JsonProperty("arena_energy")
	private Integer arenaEnergy;

	/** */
	@JsonProperty("social_point_current")
	private Integer socialPointCurrent;

	/** */
	@JsonProperty("arena_energy_max")
	private Integer arenaEnergyMax;

	/** */
	@JsonProperty("wizard_id")
	private Integer wizardId;

	/** */
	@JsonProperty("honor_point")
	private Integer honorPoint;

	/** */
	@JsonProperty("wizard_name")
	private String wizardName;

	/** */
	@JsonProperty("darkportal_energy_max")
	private Integer darkportalEnergyMax;

	/** */
	@JsonProperty("rep_assigned")
	private Integer repAssigned;

	/** */
	@JsonProperty("rep_unit_id")
	private Integer repUnitId;

	/** */
	@JsonProperty("wizard_mana")
	private Integer wizardMana;

	/** */
	@JsonProperty("pvp_event")
	private Integer pvpEvent;

	/** */
	@JsonProperty("energy_max")
	private Integer energyMax;

	/** */
	@JsonProperty("experience")
	private Integer experience;

	/** */
	@JsonProperty("wizard_crystal")
	private Integer wizardCrystal;

	/** */
	@JsonProperty("guild_point")
	private Integer guildPoint;

	/** */
	@JsonProperty("costume_point_max")
	private Integer costumePointMax;

	public Integer getArenaEnergyNextGain() {
		return arenaEnergyNextGain;
	}

	public void setArenaEnergyNextGain(Integer arenaEnergyNextGain) {
		this.arenaEnergyNextGain = arenaEnergyNextGain;
	}

	public Integer getWizardLevel() {
		return wizardLevel;
	}

	public void setWizardLevel(Integer wizardLevel) {
		this.wizardLevel = wizardLevel;
	}

	public Integer getDarkportalEnergy() {
		return darkportalEnergy;
	}

	public void setDarkportalEnergy(Integer darkportalEnergy) {
		this.darkportalEnergy = darkportalEnergy;
	}

	public SfSlotNumber getUnitDepositorySlots() {
		return unitDepositorySlots;
	}

	public void setUnitDepositorySlots(SfSlotNumber unitDepositorySlots) {
		this.unitDepositorySlots = unitDepositorySlots;
	}

	public BigDecimal getEnergyPerMin() {
		return energyPerMin;
	}

	public void setEnergyPerMin(BigDecimal energyPerMin) {
		this.energyPerMin = energyPerMin;
	}

	public Integer getCostumePoint() {
		return costumePoint;
	}

	public void setCostumePoint(Integer costumePoint) {
		this.costumePoint = costumePoint;
	}

	public Integer getSocialPointMax() {
		return socialPointMax;
	}

	public void setSocialPointMax(Integer socialPointMax) {
		this.socialPointMax = socialPointMax;
	}

	public Integer getNextEnergyGain() {
		return nextEnergyGain;
	}

	public void setNextEnergyGain(Integer nextEnergyGain) {
		this.nextEnergyGain = nextEnergyGain;
	}

	public SfSlotNumber getUnitSlots() {
		return unitSlots;
	}

	public void setUnitSlots(SfSlotNumber unitSlots) {
		this.unitSlots = unitSlots;
	}

	public Integer getWizardEnergy() {
		return wizardEnergy;
	}

	public void setWizardEnergy(Integer wizardEnergy) {
		this.wizardEnergy = wizardEnergy;
	}

	public Date getWizardLastLogin() {
		return wizardLastLogin;
	}

	public void setWizardLastLogin(Date wizardLastLogin) {
		this.wizardLastLogin = wizardLastLogin;
	}

	public Integer getMailBoxEvent() {
		return mailBoxEvent;
	}

	public void setMailBoxEvent(Integer mailBoxEvent) {
		this.mailBoxEvent = mailBoxEvent;
	}

	public Integer getArenaEnergy() {
		return arenaEnergy;
	}

	public void setArenaEnergy(Integer arenaEnergy) {
		this.arenaEnergy = arenaEnergy;
	}

	public Integer getSocialPointCurrent() {
		return socialPointCurrent;
	}

	public void setSocialPointCurrent(Integer socialPointCurrent) {
		this.socialPointCurrent = socialPointCurrent;
	}

	public Integer getArenaEnergyMax() {
		return arenaEnergyMax;
	}

	public void setArenaEnergyMax(Integer arenaEnergyMax) {
		this.arenaEnergyMax = arenaEnergyMax;
	}

	public Integer getWizardId() {
		return wizardId;
	}

	public void setWizardId(Integer wizardId) {
		this.wizardId = wizardId;
	}

	public Integer getHonorPoint() {
		return honorPoint;
	}

	public void setHonorPoint(Integer honorPoint) {
		this.honorPoint = honorPoint;
	}

	public String getWizardName() {
		return wizardName;
	}

	public void setWizardName(String wizardName) {
		this.wizardName = wizardName;
	}

	public Integer getDarkportalEnergyMax() {
		return darkportalEnergyMax;
	}

	public void setDarkportalEnergyMax(Integer darkportalEnergyMax) {
		this.darkportalEnergyMax = darkportalEnergyMax;
	}

	public Integer getRepAssigned() {
		return repAssigned;
	}

	public void setRepAssigned(Integer repAssigned) {
		this.repAssigned = repAssigned;
	}

	public Integer getRepUnitId() {
		return repUnitId;
	}

	public void setRepUnitId(Integer repUnitId) {
		this.repUnitId = repUnitId;
	}

	public Integer getWizardMana() {
		return wizardMana;
	}

	public void setWizardMana(Integer wizardMana) {
		this.wizardMana = wizardMana;
	}

	public Integer getPvpEvent() {
		return pvpEvent;
	}

	public void setPvpEvent(Integer pvpEvent) {
		this.pvpEvent = pvpEvent;
	}

	public Integer getEnergyMax() {
		return energyMax;
	}

	public void setEnergyMax(Integer energyMax) {
		this.energyMax = energyMax;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getWizardCrystal() {
		return wizardCrystal;
	}

	public void setWizardCrystal(Integer wizardCrystal) {
		this.wizardCrystal = wizardCrystal;
	}

	public Integer getGuildPoint() {
		return guildPoint;
	}

	public void setGuildPoint(Integer guildPoint) {
		this.guildPoint = guildPoint;
	}

	public Integer getCostumePointMax() {
		return costumePointMax;
	}

	public void setCostumePointMax(Integer costumePointMax) {
		this.costumePointMax = costumePointMax;
	}
}
