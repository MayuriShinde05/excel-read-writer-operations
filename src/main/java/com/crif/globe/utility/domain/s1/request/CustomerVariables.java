package com.crif.globe.utility.domain.s1.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerVariables {

	@JsonProperty("MASKEDCUSTOMERID")
	private String maskedCustomerID;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonProperty("CLIENTBIRTHDATE")
	private String clientBirthDate;
	@JsonProperty("GCASHSCORE")
	private Double gCashScore;
	@JsonProperty("POID")
	private String poid;

	/**
	 * @return the maskedCustomerID
	 */
	public String getMaskedCustomerID() {
		return maskedCustomerID;
	}

	/**
	 * @param maskedCustomerID the maskedCustomerID to set
	 */
	public void setMaskedCustomerID(String maskedCustomerID) {
		this.maskedCustomerID = maskedCustomerID;
	}

	/**
	 * @return the clientBirthDate
	 */
	public String getClientBirthDate() {
		return clientBirthDate;
	}

	/**
	 * @param clientBirthDate the clientBirthDate to set
	 */
	public void setClientBirthDate(String clientBirthDate) {
		this.clientBirthDate = clientBirthDate;
	}

	/**
	 * @return the gCashScore
	 */
	public Double getgCashScore() {
		return gCashScore;
	}

	/**
	 * @param gCashScore the gCashScore to set
	 */
	public void setgCashScore(Double gCashScore) {
		this.gCashScore = gCashScore;
	}

	/**
	 * @return the poid
	 */
	public String getPoid() {
		return poid;
	}

	/**
	 * @param poid the poid to set
	 */
	public void setPoid(String poid) {
		this.poid = poid;
	}

	@Override
	public String toString() {
		return "CustomerVariables [maskedCustomerID=" + maskedCustomerID + ", clientBirthDate=" + clientBirthDate
				+ ", gCashScore=" + gCashScore + ", poid=" + poid + "]";
	}

}
