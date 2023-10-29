package com.crif.globe.utility.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.crif.globe")
public class PropertyHandler {
	private String s1url;
	private String s1inquiryCode;
	private String s1processCode;
	private String s1path;
	private Integer s1noOfSheet;
	private String s1responseFile;
	private String s1sheetname;
	private String brandName;

	/**
	 * @return the s1url
	 */
	public String getS1url() {
		return s1url;
	}

	/**
	 * @param s1url the s1url to set
	 */
	public void setS1url(String s1url) {
		this.s1url = s1url;
	}

	/**
	 * @return the s1inquiryCode
	 */
	public String getS1inquiryCode() {
		return s1inquiryCode;
	}

	/**
	 * @param s1inquiryCode the s1inquiryCode to set
	 */
	public void setS1inquiryCode(String s1inquiryCode) {
		this.s1inquiryCode = s1inquiryCode;
	}

	/**
	 * @return the s1processCode
	 */
	public String getS1processCode() {
		return s1processCode;
	}

	/**
	 * @param s1processCode the s1processCode to set
	 */
	public void setS1processCode(String s1processCode) {
		this.s1processCode = s1processCode;
	}

	/**
	 * @return the s1path
	 */
	public String getS1path() {
		return s1path;
	}

	/**
	 * @param s1path the s1path to set
	 */
	public void setS1path(String s1path) {
		this.s1path = s1path;
	}

	/**
	 * @return the s1noOfSheet
	 */
	public Integer getS1noOfSheet() {
		return s1noOfSheet;
	}

	/**
	 * @param s1noOfSheet the s1noOfSheet to set
	 */
	public void setS1noOfSheet(Integer s1noOfSheet) {
		this.s1noOfSheet = s1noOfSheet;
	}

	/**
	 * @return the s1responseFile
	 */
	public String getS1responseFile() {
		return s1responseFile;
	}

	/**
	 * @param s1responseFile the s1responseFile to set
	 */
	public void setS1responseFile(String s1responseFile) {
		this.s1responseFile = s1responseFile;
	}

	/**
	 * @return the s1sheetname
	 */
	public String getS1sheetname() {
		return s1sheetname;
	}

	/**
	 * @param s1sheetname the s1sheetname to set
	 */
	public void setS1sheetname(String s1sheetname) {
		this.s1sheetname = s1sheetname;
	}

	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}

	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
