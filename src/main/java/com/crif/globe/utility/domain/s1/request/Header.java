package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {
	@JsonProperty("InquiryCode")
	private String inquiryCode;
	@JsonProperty("ProcessCode")
	private String processCode;

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

	@Override
	public String toString() {
		return "Header [inquiryCode=" + inquiryCode + ", processCode=" + processCode + "]";
	}

}