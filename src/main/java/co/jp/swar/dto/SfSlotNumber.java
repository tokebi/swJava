package co.jp.swar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SfSlotNumber {
	
	/** */
	@JsonProperty("number")
	private Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
