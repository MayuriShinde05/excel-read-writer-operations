package com.crif.globe.utility.entity;

/**
 * The Class EligibilityCheck.
 */
public class EligibilityCheck {
	
	/** The total over due. */
	private Double totalOverDue = 200.0;
	
	/** The g score. */
	private String gScore;
	
	/** The cndb results. */
	private String cndbResults = "N";
	
	/** The pofc type. */
	private String pofcType = "hoyf";
	
	/** The proof of financial capacity. */
	private String proofOfFinancialCapacity = "7558555";
	
	/** The proof of financial capacity content type. */
	private String proofOfFinancialCapacityContentType = "fihfoh";

	/**
	 * Gets the total over due.
	 *
	 * @return the totalOverDue
	 */
	public Double getTotalOverDue() {
		return totalOverDue;
	}

	/**
	 * Sets the total over due.
	 *
	 * @param totalOverDue the totalOverDue to set
	 */
	public void setTotalOverDue(Double totalOverDue) {
		this.totalOverDue = totalOverDue;
	}

	/**
	 * Gets the g score.
	 *
	 * @return the gScore
	 */
	public String getgScore() {
		return gScore;
	}

	/**
	 * Sets the g score.
	 *
	 * @param gScore the gScore to set
	 */
	public void setgScore(String gScore) {
		this.gScore = gScore;
	}

	/**
	 * Gets the cndb results.
	 *
	 * @return the cndbResults
	 */
	public String getCndbResults() {
		return cndbResults;
	}

	/**
	 * Sets the cndb results.
	 *
	 * @param cndbResults the cndbResults to set
	 */
	public void setCndbResults(String cndbResults) {
		this.cndbResults = cndbResults;
	}

	/**
	 * Gets the pofc type.
	 *
	 * @return the pofcType
	 */
	public String getPofcType() {
		return pofcType;
	}

	/**
	 * Sets the pofc type.
	 *
	 * @param pofcType the pofcType to set
	 */
	public void setPofcType(String pofcType) {
		this.pofcType = pofcType;
	}

	/**
	 * Gets the proof of financial capacity.
	 *
	 * @return the proofOfFinancialCapacity
	 */
	public String getProofOfFinancialCapacity() {
		return proofOfFinancialCapacity;
	}

	/**
	 * Sets the proof of financial capacity.
	 *
	 * @param proofOfFinancialCapacity the proofOfFinancialCapacity to set
	 */
	public void setProofOfFinancialCapacity(String proofOfFinancialCapacity) {
		this.proofOfFinancialCapacity = proofOfFinancialCapacity;
	}

	/**
	 * Gets the proof of financial capacity content type.
	 *
	 * @return the proofOfFinancialCapacityContentType
	 */
	public String getProofOfFinancialCapacityContentType() {
		return proofOfFinancialCapacityContentType;
	}

	/**
	 * Sets the proof of financial capacity content type.
	 *
	 * @param proofOfFinancialCapacityContentType the
	 *                                            proofOfFinancialCapacityContentType
	 *                                            to set
	 */
	public void setProofOfFinancialCapacityContentType(String proofOfFinancialCapacityContentType) {
		this.proofOfFinancialCapacityContentType = proofOfFinancialCapacityContentType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "EligibilityCheck [totalOverDue=" + totalOverDue + ", gScore=" + gScore + ", cndbResults=" + cndbResults
				+ ", pofcType=" + pofcType + ", proofOfFinancialCapacity=" + proofOfFinancialCapacity
				+ ", proofOfFinancialCapacityContentType=" + proofOfFinancialCapacityContentType + "]";
	}

}
