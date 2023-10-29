package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1Error {

	@JsonProperty("InquiryDate")
	private String inquiryDate;

	@JsonProperty("Code")
	private String code;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("EngineVersion")
	private String engineVersion;

	/**
	 * @return the inquiryDate
	 */
	public String getInquiryDate() {
		return inquiryDate;
	}

	/**
	 * @param inquiryDate the inquiryDate to set
	 */
	public void setInquiryDate(String inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the engineVersion
	 */
	public String getEngineVersion() {
		return engineVersion;
	}

	/**
	 * @param engineVersion the engineVersion to set
	 */
	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	@Override
	public String toString() {
		return "S1Error [inquiryDate=" + inquiryDate + ", code=" + code + ", description=" + description
				+ ", engineVersion=" + engineVersion + "]";
	}

}
