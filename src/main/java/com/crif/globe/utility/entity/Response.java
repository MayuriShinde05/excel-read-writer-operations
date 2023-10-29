package com.crif.globe.utility.entity;

public class Response {
	private String status;
	private String error;
	private String strategyDecision;
	private String rulerResult;
	private String gcashScoreLevel;
	private String cbScoreLevel;
	private String reasonCode;
	private String ascoreLevel;
	private Double ascore;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @return the strategyDecision
	 */
	public String getStrategyDecision() {
		return strategyDecision;
	}

	/**
	 * @param strategyDecision the strategyDecision to set
	 */
	public void setStrategyDecision(String strategyDecision) {
		this.strategyDecision = strategyDecision;
	}

	/**
	 * @return the rulerResult
	 */
	public String getRulerResult() {
		return rulerResult;
	}

	/**
	 * @param rulerResult the rulerResult to set
	 */
	public void setRulerResult(String rulerResult) {
		this.rulerResult = rulerResult;
	}

	/**
	 * @return the gcashScoreLevel
	 */
	public String getGcashScoreLevel() {
		return gcashScoreLevel;
	}

	/**
	 * @param gcashScoreLevel the gcashScoreLevel to set
	 */
	public void setGcashScoreLevel(String gcashScoreLevel) {
		this.gcashScoreLevel = gcashScoreLevel;
	}

	/**
	 * @return the cbScoreLevel
	 */
	public String getCbScoreLevel() {
		return cbScoreLevel;
	}

	/**
	 * @param cbScoreLevel the cbScoreLevel to set
	 */
	public void setCbScoreLevel(String cbScoreLevel) {
		this.cbScoreLevel = cbScoreLevel;
	}

	/**
	 * @return the reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}

	/**
	 * @param reasonCode the reasonCode to set
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	/**
	 * @return the ascoreLevel
	 */
	public String getAscoreLevel() {
		return ascoreLevel;
	}

	/**
	 * @param ascoreLevel the ascoreLevel to set
	 */
	public void setAscoreLevel(String ascoreLevel) {
		this.ascoreLevel = ascoreLevel;
	}

	/**
	 * @return the ascore
	 */
	public Double getAscore() {
		return ascore;
	}

	/**
	 * @param ascore the ascore to set
	 */
	public void setAscore(Double ascore) {
		this.ascore = ascore;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", error=" + error + ", strategyDecision=" + strategyDecision
				+ ", rulerResult=" + rulerResult + ", gcashScoreLevel=" + gcashScoreLevel + ", cbScoreLevel="
				+ cbScoreLevel + ", reasonCode=" + reasonCode + ", ascoreLevel=" + ascoreLevel + ", ascore=" + ascore
				+ "]";
	}

}
