package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1ResponseHeader {

	@JsonProperty("InquiryCode")
	private String inquiryCode;
	@JsonProperty("ProcessCode")
	private String processCode;
	@JsonProperty("OrganizationCode")
	private String organizationCode;
	@JsonProperty("ProcessVersion")
	private String processVersion;
	@JsonProperty("LayoutVersion")
	private String layoutVersion;

	/**
	 * @return the inquiryCode
	 */
	public String getInquiryCode() {
		return inquiryCode;
	}

	/**
	 * @param inquiryCode the inquiryCode to set
	 */
	public void setInquiryCode(String inquiryCode) {
		this.inquiryCode = inquiryCode;
	}

	/**
	 * @return the processCode
	 */
	public String getProcessCode() {
		return processCode;
	}

	/**
	 * @param processCode the processCode to set
	 */
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	/**
	 * @return the organizationCode
	 */
	public String getOrganizationCode() {
		return organizationCode;
	}

	/**
	 * @param organizationCode the organizationCode to set
	 */
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	/**
	 * @return the processVersion
	 */
	public String getProcessVersion() {
		return processVersion;
	}

	/**
	 * @param processVersion the processVersion to set
	 */
	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}

	/**
	 * @return the layoutVersion
	 */
	public String getLayoutVersion() {
		return layoutVersion;
	}

	/**
	 * @param layoutVersion the layoutVersion to set
	 */
	public void setLayoutVersion(String layoutVersion) {
		this.layoutVersion = layoutVersion;
	}

	@Override
	public String toString() {
		return "S1ResponseHeader [inquiryCode=" + inquiryCode + ", processCode=" + processCode + ", organizationCode="
				+ organizationCode + ", processVersion=" + processVersion + ", layoutVersion=" + layoutVersion + "]";
	}

}
