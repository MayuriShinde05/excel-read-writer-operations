package com.crif.globe.utility.entity;

/**
 * The Class CustomerAccountInfo.
 */
public class CustomerAccountInfo {
	
	/** The customer type. */
	private String customerType = "New";
	
	/** The tenure. */
	private Double tenure = 9.0;
	
	/** The customer ID. */
	private String customerID;

	/**
	 * Gets the customer type.
	 *
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * Sets the customer type.
	 *
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * Gets the tenure.
	 *
	 * @return the tenure
	 */
	public Double getTenure() {
		return tenure;
	}

	/**
	 * Sets the tenure.
	 *
	 * @param tenure the tenure to set
	 */
	public void setTenure(Double tenure) {
		this.tenure = tenure;
	}

	/**
	 * Gets the customer ID.
	 *
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * Sets the customer ID.
	 *
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "CustomerAccountInfo [customerType=" + customerType + ", tenure=" + tenure + ", customerID=" + customerID
				+ "]";
	}

}
