package com.crif.globe.utility.entity;

/**
 * The Class PlanInfo.
 */
public class PlanInfo {

	/** The selected plan. */
	private String selectedPlan;

	/** The selected plan amount. */
	private Double selectedPlanAmount;

	private Integer selectedPlanId;

	/** The new product type. */
	private String newProductType = "GHP";

	/** The application date. */
	private String applicationDate;

	/** The with handset. */
	private String withHandset;

	/** The acqui type. */
	private String acquiType = "Locked in a promo contract without handset";

	/**
	 * Gets the selected plan.
	 *
	 * @return the selectedPlan
	 */
	public String getSelectedPlan() {
		return selectedPlan;
	}

	/**
	 * Sets the selected plan.
	 *
	 * @param selectedPlan the selectedPlan to set
	 */
	public void setSelectedPlan(String selectedPlan) {
		this.selectedPlan = selectedPlan;
	}

	/**
	 * @return the selectedPlanAmount
	 */
	public Double getSelectedPlanAmount() {
		return selectedPlanAmount;
	}

	/**
	 * @param selectedPlanAmount the selectedPlanAmount to set
	 */
	public void setSelectedPlanAmount(Double selectedPlanAmount) {
		this.selectedPlanAmount = selectedPlanAmount;
	}

	/**
	 * @return the selectedPlanId
	 */
	public Integer getSelectedPlanId() {
		return selectedPlanId;
	}

	/**
	 * @param selectedPlanId the selectedPlanId to set
	 */
	public void setSelectedPlanId(Integer selectedPlanId) {
		this.selectedPlanId = selectedPlanId;
	}

	/**
	 * Gets the new product type.
	 *
	 * @return the newProductType
	 */
	public String getNewProductType() {
		return newProductType;
	}

	/**
	 * Sets the new product type.
	 *
	 * @param newProductType the newProductType to set
	 */
	public void setNewProductType(String newProductType) {
		this.newProductType = newProductType;
	}

	/**
	 * Gets the application date.
	 *
	 * @return the applicationDate
	 */
	public String getApplicationDate() {
		return applicationDate;
	}

	/**
	 * Sets the application date.
	 *
	 * @param applicationDate the applicationDate to set
	 */
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	/**
	 * Gets the with handset.
	 *
	 * @return the withHandset
	 */
	public String getWithHandset() {
		return withHandset;
	}

	/**
	 * Sets the with handset.
	 *
	 * @param withHandset the withHandset to set
	 */
	public void setWithHandset(String withHandset) {
		this.withHandset = withHandset;
	}

	/**
	 * Gets the acqui type.
	 *
	 * @return the acquiType
	 */
	public String getAcquiType() {
		return acquiType;
	}

	/**
	 * Sets the acqui type.
	 *
	 * @param acquiType the acquiType to set
	 */
	public void setAcquiType(String acquiType) {
		this.acquiType = acquiType;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PlanInfo [selectedPlan=" + selectedPlan + ", selectedPlanAmount=" + selectedPlanAmount
				+ ", newProductType=" + newProductType + ", applicationDate=" + applicationDate + ", withHandset="
				+ withHandset + ", acquiType=" + acquiType + "]";
	}

}
