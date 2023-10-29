package com.crif.globe.utility.entity;

public class PrequalResult {

	private Boolean needPOFC;
	private Boolean isPrequal;
	private String creditLimit;
	private String gmi;

	/**
	 * @return the needPOFC
	 */
	public Boolean getNeedPOFC() {
		return needPOFC;
	}

	/**
	 * @param needPOFC the needPOFC to set
	 */
	public void setNeedPOFC(Boolean needPOFC) {
		this.needPOFC = needPOFC;
	}

	/**
	 * @return the isPrequal
	 */
	public Boolean getIsPrequal() {
		return isPrequal;
	}

	/**
	 * @param isPrequal the isPrequal to set
	 */
	public void setIsPrequal(Boolean isPrequal) {
		this.isPrequal = isPrequal;
	}

	/**
	 * @return the creditLimit
	 */
	public String getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the gmi
	 */
	public String getGmi() {
		return gmi;
	}

	/**
	 * @param gmi the gmi to set
	 */
	public void setGmi(String gmi) {
		this.gmi = gmi;
	}

	@Override
	public String toString() {
		return "PrequalResult [needPOFC=" + needPOFC + ", isPrequal=" + isPrequal + ", creditLimit=" + creditLimit
				+ ", gmi=" + gmi + "]";
	}
}
