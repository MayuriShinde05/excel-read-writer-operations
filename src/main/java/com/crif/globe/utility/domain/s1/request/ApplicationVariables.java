package com.crif.globe.utility.domain.s1.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ApplicationVariables {
	// should be in yyyy-mm-dd format
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("APPPLICATIONDATE")
	private String applicationDate;
	@JsonProperty("APPLIEDAMOUNT")
	private Double appliedAmount;
	@JsonProperty("BRAND")
	private String brand;
	@JsonProperty("WITH_HANDSET_IND")
	private Double withHandSetInd;

	@JsonProperty("MAINOFFERNAME")
	private String mainOfferName;

	@JsonProperty("SALESCHANNEL")
	private String salesChannel;

	@JsonProperty("SCENARIO")
	private String scenario;

	@JsonProperty("TERRITORY")
	private String territory;
	@JsonProperty("TPANAME")
	private String tpaName;

	@JsonProperty("POSTALCODE")
	private Double postalCode;

	/**
	 * @return the applicationDate
	 */
	public String getApplicationDate() {
		return applicationDate;
	}

	/**
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	/**
	 * @return the appliedAmount
	 */
	public Double getAppliedAmount() {
		return appliedAmount;
	}

	/**
	 * @param appliedAmount the appliedAmount to set
	 */
	public void setAppliedAmount(Double appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the withHandSetInd
	 */
	public Double getWithHandSetInd() {
		return withHandSetInd;
	}

	/**
	 * @param withHandSetInd the withHandSetInd to set
	 */
	public void setWithHandSetInd(Double withHandSetInd) {
		this.withHandSetInd = withHandSetInd;
	}

	/**
	 * @return the mainOfferName
	 */
	public String getMainOfferName() {
		return mainOfferName;
	}

	/**
	 * @param mainOfferName the mainOfferName to set
	 */
	public void setMainOfferName(String mainOfferName) {
		this.mainOfferName = mainOfferName;
	}

	/**
	 * @return the salesChannel
	 */
	public String getSalesChannel() {
		return salesChannel;
	}

	/**
	 * @param salesChannel the salesChannel to set
	 */
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	/**
	 * @return the scenario
	 */
	public String getScenario() {
		return scenario;
	}

	/**
	 * @param scenario the scenario to set
	 */
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	/**
	 * @return the territory
	 */
	public String getTerritory() {
		return territory;
	}

	/**
	 * @param territory the territory to set
	 */
	public void setTerritory(String territory) {
		this.territory = territory;
	}

	/**
	 * @return the tpaName
	 */
	public String getTpaName() {
		return tpaName;
	}

	/**
	 * @param tpaName the tpaName to set
	 */
	public void setTpaName(String tpaName) {
		this.tpaName = tpaName;
	}

	/**
	 * @return the postalCode
	 */
	public Double getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(Double postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "ApplicationVariables [applicationDate=" + applicationDate + ", appliedAmount=" + appliedAmount
				+ ", brand=" + brand + ", withHandSetInd=" + withHandSetInd + ", mainOfferName=" + mainOfferName
				+ ", salesChannel=" + salesChannel + ", scenario=" + scenario + ", territory=" + territory
				+ ", tpaName=" + tpaName + ", postalCode=" + postalCode + "]";
	}

}
