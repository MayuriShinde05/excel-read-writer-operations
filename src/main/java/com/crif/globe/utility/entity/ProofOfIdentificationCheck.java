package com.crif.globe.utility.entity;

/**
 * The Class ProofOfIdentificationCheck.
 */
public class ProofOfIdentificationCheck {
	
	/** The proof of identification type. */
	private String proofOfIdentificationType;
	
	/** The proof of identification number. */
	private String proofOfIdentificationNumber = "66798";
	
	/** The proof of identification. */
	private String proofOfIdentification = "ggg";
	
	/** The valid id front. */
	private String validIdFront = "bkjffhf";
	
	/** The valid id front content type. */
	private String validIdFrontContentType = "hyyr";
	
	/** The valid id back. */
	private String validIdBack = "yiuyiu";
	
	/** The valid id back content type. */
	private String validIdBackContentType = "ghghgh";

	/**
	 * Gets the proof of identification type.
	 *
	 * @return the proofOfIdentificationType
	 */
	public String getProofOfIdentificationType() {
		return proofOfIdentificationType;
	}

	/**
	 * Sets the proof of identification type.
	 *
	 * @param proofOfIdentificationType the proofOfIdentificationType to set
	 */
	public void setProofOfIdentificationType(String proofOfIdentificationType) {
		this.proofOfIdentificationType = proofOfIdentificationType;
	}

	/**
	 * Gets the proof of identification number.
	 *
	 * @return the proofOfIdentificationNumber
	 */
	public String getProofOfIdentificationNumber() {
		return proofOfIdentificationNumber;
	}

	/**
	 * Sets the proof of identification number.
	 *
	 * @param proofOfIdentificationNumber the proofOfIdentificationNumber to set
	 */
	public void setProofOfIdentificationNumber(String proofOfIdentificationNumber) {
		this.proofOfIdentificationNumber = proofOfIdentificationNumber;
	}

	/**
	 * Gets the proof of identification.
	 *
	 * @return the proofOfIdentification
	 */
	public String getProofOfIdentification() {
		return proofOfIdentification;
	}

	/**
	 * Sets the proof of identification.
	 *
	 * @param proofOfIdentification the proofOfIdentification to set
	 */
	public void setProofOfIdentification(String proofOfIdentification) {
		this.proofOfIdentification = proofOfIdentification;
	}

	/**
	 * Gets the valid id front.
	 *
	 * @return the validIdFront
	 */
	public String getValidIdFront() {
		return validIdFront;
	}

	/**
	 * Sets the valid id front.
	 *
	 * @param validIdFront the validIdFront to set
	 */
	public void setValidIdFront(String validIdFront) {
		this.validIdFront = validIdFront;
	}

	/**
	 * Gets the valid id front content type.
	 *
	 * @return the validIdFrontContentType
	 */
	public String getValidIdFrontContentType() {
		return validIdFrontContentType;
	}

	/**
	 * Sets the valid id front content type.
	 *
	 * @param validIdFrontContentType the validIdFrontContentType to set
	 */
	public void setValidIdFrontContentType(String validIdFrontContentType) {
		this.validIdFrontContentType = validIdFrontContentType;
	}

	/**
	 * Gets the valid id back.
	 *
	 * @return the validIdBack
	 */
	public String getValidIdBack() {
		return validIdBack;
	}

	/**
	 * Sets the valid id back.
	 *
	 * @param validIdBack the validIdBack to set
	 */
	public void setValidIdBack(String validIdBack) {
		this.validIdBack = validIdBack;
	}

	/**
	 * Gets the valid id back content type.
	 *
	 * @return the validIdBackContentType
	 */
	public String getValidIdBackContentType() {
		return validIdBackContentType;
	}

	/**
	 * Sets the valid id back content type.
	 *
	 * @param validIdBackContentType the validIdBackContentType to set
	 */
	public void setValidIdBackContentType(String validIdBackContentType) {
		this.validIdBackContentType = validIdBackContentType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProofOfIdentificationCheck [proofOfIdentificationType=" + proofOfIdentificationType
				+ ", proofOfIdentificationNumber=" + proofOfIdentificationNumber + ", proofOfIdentification="
				+ proofOfIdentification + ", validIdFront=" + validIdFront + ", validIdFrontContentType="
				+ validIdFrontContentType + ", validIdBack=" + validIdBack + ", validIdBackContentType="
				+ validIdBackContentType + "]";
	}

}
