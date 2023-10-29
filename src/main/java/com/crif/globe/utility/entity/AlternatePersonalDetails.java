package com.crif.globe.utility.entity;

/**
 * The Class AlternatePersonalDetails.
 */
public class AlternatePersonalDetails {
	
	/** The contact number. */
	private String contactNumber;
	
	/** The alternate contact number. */
	private String alternateContactNumber = "783559875";

	/**
	 * Gets the contact number.
	 *
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Gets the alternate contact number.
	 *
	 * @return the alternateContactNumber
	 */
	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}

	/**
	 * Sets the alternate contact number.
	 *
	 * @param alternateContactNumber the alternateContactNumber to set
	 */
	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

}
