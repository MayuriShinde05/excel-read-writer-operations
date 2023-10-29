package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class S1ResponseApplicationVariables {

	@JsonProperty("ASCORE")
	private String aScore;
	@JsonProperty("STRATEGYDECISION")
	private String strategyDecision;
	@JsonProperty("RULERESULT")
	private String rulerResult;
	@JsonProperty("GCASHSCORE_LEVEL")
	private String gcashScoreLevel;
	@JsonProperty("CBSCORE_LEVEL")
	private String cbScoreLevel;
	@JsonProperty("REASONCODE")
	private String reasonCode;
	@JsonProperty("ASCORE_LEVEL")
	private String ascoreLevel;
	@JsonProperty("PRODUCT_TYPE")
	private String productType;
	@JsonProperty("STRATEGY")
	private String strategy;
	@JsonProperty("APPPLICATIONDATE")
	private String appplicationDate;
	@JsonProperty("APPLIEDAMOUNT")
	private String appliedAmount;

	@JsonProperty("SCORECARD_OBJCODE")
	private String scorecardObjcode;
	@JsonProperty("SCORECARD_RAW")
	private String scorecardRaw;
	@JsonProperty("SCORECARD_ALIGNED")
	private String scorecardAligned;
	@JsonProperty("SCORECARD_VAR_0")
	private String scorecardVar0;
	@JsonProperty("SCORECARD_VAR_1")
	private String scorecardVar1;
	@JsonProperty("SCORECARD_VAR_2")
	private String scorecardVar2;
	@JsonProperty("SCORECARD_VAR_3")
	private String scorecardVar3;
	@JsonProperty("SCORECARD_VAR_4")
	private String scorecardVar4;
	@JsonProperty("SCORECARD_VAR_5")
	private String scorecardVar5;
	@JsonProperty("SCORECARD_VAR_6")
	private String scorecardVar6;
	@JsonProperty("SCORECARD_VAR_VALUE_0")
	private String scorecardVarValue0;
	@JsonProperty("SCORECARD_VAR_VALUE_1")
	private String scorecardVarValue1;
	@JsonProperty("SCORECARD_VAR_VALUE_2")
	private String scorecardVarValue2;
	@JsonProperty("SCORECARD_VAR_VALUE_3")
	private String scorecardVarValue3;
	@JsonProperty("SCORECARD_VAR_VALUE_4")
	private String scorecardVarValue4;
	@JsonProperty("SCORECARD_VAR_VALUE_5")
	private String scorecardVarValue5;
	@JsonProperty("SCORECARD_VAR_VALUE_6")
	private String scorecardVarValue6;
	@JsonProperty("SCORECARD_VAR_RC_0")
	private String scorecardVarRc0;
	@JsonProperty("SCORECARD_VAR_RC_1")
	private String scorecardVarRc1;
	@JsonProperty("SCORECARD_VAR_RC_2")
	private String scorecardVarRc2;
	@JsonProperty("SCORECARD_VAR_RC_3")
	private String scorecardVarRc3;
	@JsonProperty("SCORECARD_VAR_RC_4")
	private String scorecardVarRc4;
	@JsonProperty("SCORECARD_VAR_RC_5")
	private String scorecardVarRc5;
	@JsonProperty("SCORECARD_VAR_RC_6")
	private String scorecardVarRc6;
	@JsonProperty("SCORECARD_VAR_RM_0")
	private String scorecardVarRm0;
	@JsonProperty("SCORECARD_VAR_RM_1")
	private String scorecardVarRm1;
	@JsonProperty("SCORECARD_VAR_RM_2")
	private String scorecardVarRm2;
	@JsonProperty("SCORECARD_VAR_RM_3")
	private String scorecardVarRm3;
	@JsonProperty("SCORECARD_VAR_RM_4")
	private String scorecardVarRm4;
	@JsonProperty("SCORECARD_VAR_RM_5")
	private String scorecardVarRm5;
	@JsonProperty("SCORECARD_VAR_RM_6")
	private String scorecardVarRm6;

	/**
	 * @return the aScore
	 */
	public String getaScore() {
		return aScore;
	}

	/**
	 * @param aScore the aScore to set
	 */
	public void setaScore(String aScore) {
		this.aScore = aScore;
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
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @return the strategy
	 */
	public String getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the appplicationDate
	 */
	public String getAppplicationDate() {
		return appplicationDate;
	}

	/**
	 * @param appplicationDate the appplicationDate to set
	 */
	public void setAppplicationDate(String appplicationDate) {
		this.appplicationDate = appplicationDate;
	}

	/**
	 * @return the appliedAmount
	 */
	public String getAppliedAmount() {
		return appliedAmount;
	}

	/**
	 * @param appliedAmount the appliedAmount to set
	 */
	public void setAppliedAmount(String appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

	/**
	 * @return the scorecardObjcode
	 */
	public String getScorecardObjcode() {
		return scorecardObjcode;
	}

	/**
	 * @param scorecardObjcode the scorecardObjcode to set
	 */
	public void setScorecardObjcode(String scorecardObjcode) {
		this.scorecardObjcode = scorecardObjcode;
	}

	/**
	 * @return the scorecardRaw
	 */
	public String getScorecardRaw() {
		return scorecardRaw;
	}

	/**
	 * @param scorecardRaw the scorecardRaw to set
	 */
	public void setScorecardRaw(String scorecardRaw) {
		this.scorecardRaw = scorecardRaw;
	}

	/**
	 * @return the scorecardAligned
	 */
	public String getScorecardAligned() {
		return scorecardAligned;
	}

	/**
	 * @param scorecardAligned the scorecardAligned to set
	 */
	public void setScorecardAligned(String scorecardAligned) {
		this.scorecardAligned = scorecardAligned;
	}

	/**
	 * @return the scorecardVar0
	 */
	public String getScorecardVar0() {
		return scorecardVar0;
	}

	/**
	 * @param scorecardVar0 the scorecardVar0 to set
	 */
	public void setScorecardVar0(String scorecardVar0) {
		this.scorecardVar0 = scorecardVar0;
	}

	/**
	 * @return the scorecardVar1
	 */
	public String getScorecardVar1() {
		return scorecardVar1;
	}

	/**
	 * @param scorecardVar1 the scorecardVar1 to set
	 */
	public void setScorecardVar1(String scorecardVar1) {
		this.scorecardVar1 = scorecardVar1;
	}

	/**
	 * @return the scorecardVar2
	 */
	public String getScorecardVar2() {
		return scorecardVar2;
	}

	/**
	 * @param scorecardVar2 the scorecardVar2 to set
	 */
	public void setScorecardVar2(String scorecardVar2) {
		this.scorecardVar2 = scorecardVar2;
	}

	/**
	 * @return the scorecardVar3
	 */
	public String getScorecardVar3() {
		return scorecardVar3;
	}

	/**
	 * @param scorecardVar3 the scorecardVar3 to set
	 */
	public void setScorecardVar3(String scorecardVar3) {
		this.scorecardVar3 = scorecardVar3;
	}

	/**
	 * @return the scorecardVar4
	 */
	public String getScorecardVar4() {
		return scorecardVar4;
	}

	/**
	 * @param scorecardVar4 the scorecardVar4 to set
	 */
	public void setScorecardVar4(String scorecardVar4) {
		this.scorecardVar4 = scorecardVar4;
	}

	/**
	 * @return the scorecardVar5
	 */
	public String getScorecardVar5() {
		return scorecardVar5;
	}

	/**
	 * @param scorecardVar5 the scorecardVar5 to set
	 */
	public void setScorecardVar5(String scorecardVar5) {
		this.scorecardVar5 = scorecardVar5;
	}

	/**
	 * @return the scorecardVar6
	 */
	public String getScorecardVar6() {
		return scorecardVar6;
	}

	/**
	 * @param scorecardVar6 the scorecardVar6 to set
	 */
	public void setScorecardVar6(String scorecardVar6) {
		this.scorecardVar6 = scorecardVar6;
	}

	/**
	 * @return the scorecardVarValue0
	 */
	public String getScorecardVarValue0() {
		return scorecardVarValue0;
	}

	/**
	 * @param scorecardVarValue0 the scorecardVarValue0 to set
	 */
	public void setScorecardVarValue0(String scorecardVarValue0) {
		this.scorecardVarValue0 = scorecardVarValue0;
	}

	/**
	 * @return the scorecardVarValue1
	 */
	public String getScorecardVarValue1() {
		return scorecardVarValue1;
	}

	/**
	 * @param scorecardVarValue1 the scorecardVarValue1 to set
	 */
	public void setScorecardVarValue1(String scorecardVarValue1) {
		this.scorecardVarValue1 = scorecardVarValue1;
	}

	/**
	 * @return the scorecardVarValue2
	 */
	public String getScorecardVarValue2() {
		return scorecardVarValue2;
	}

	/**
	 * @param scorecardVarValue2 the scorecardVarValue2 to set
	 */
	public void setScorecardVarValue2(String scorecardVarValue2) {
		this.scorecardVarValue2 = scorecardVarValue2;
	}

	/**
	 * @return the scorecardVarValue3
	 */
	public String getScorecardVarValue3() {
		return scorecardVarValue3;
	}

	/**
	 * @param scorecardVarValue3 the scorecardVarValue3 to set
	 */
	public void setScorecardVarValue3(String scorecardVarValue3) {
		this.scorecardVarValue3 = scorecardVarValue3;
	}

	/**
	 * @return the scorecardVarValue4
	 */
	public String getScorecardVarValue4() {
		return scorecardVarValue4;
	}

	/**
	 * @param scorecardVarValue4 the scorecardVarValue4 to set
	 */
	public void setScorecardVarValue4(String scorecardVarValue4) {
		this.scorecardVarValue4 = scorecardVarValue4;
	}

	/**
	 * @return the scorecardVarValue5
	 */
	public String getScorecardVarValue5() {
		return scorecardVarValue5;
	}

	/**
	 * @param scorecardVarValue5 the scorecardVarValue5 to set
	 */
	public void setScorecardVarValue5(String scorecardVarValue5) {
		this.scorecardVarValue5 = scorecardVarValue5;
	}

	/**
	 * @return the scorecardVarValue6
	 */
	public String getScorecardVarValue6() {
		return scorecardVarValue6;
	}

	/**
	 * @param scorecardVarValue6 the scorecardVarValue6 to set
	 */
	public void setScorecardVarValue6(String scorecardVarValue6) {
		this.scorecardVarValue6 = scorecardVarValue6;
	}

	/**
	 * @return the scorecardVarRc0
	 */
	public String getScorecardVarRc0() {
		return scorecardVarRc0;
	}

	/**
	 * @param scorecardVarRc0 the scorecardVarRc0 to set
	 */
	public void setScorecardVarRc0(String scorecardVarRc0) {
		this.scorecardVarRc0 = scorecardVarRc0;
	}

	/**
	 * @return the scorecardVarRc1
	 */
	public String getScorecardVarRc1() {
		return scorecardVarRc1;
	}

	/**
	 * @param scorecardVarRc1 the scorecardVarRc1 to set
	 */
	public void setScorecardVarRc1(String scorecardVarRc1) {
		this.scorecardVarRc1 = scorecardVarRc1;
	}

	/**
	 * @return the scorecardVarRc2
	 */
	public String getScorecardVarRc2() {
		return scorecardVarRc2;
	}

	/**
	 * @param scorecardVarRc2 the scorecardVarRc2 to set
	 */
	public void setScorecardVarRc2(String scorecardVarRc2) {
		this.scorecardVarRc2 = scorecardVarRc2;
	}

	/**
	 * @return the scorecardVarRc3
	 */
	public String getScorecardVarRc3() {
		return scorecardVarRc3;
	}

	/**
	 * @param scorecardVarRc3 the scorecardVarRc3 to set
	 */
	public void setScorecardVarRc3(String scorecardVarRc3) {
		this.scorecardVarRc3 = scorecardVarRc3;
	}

	/**
	 * @return the scorecardVarRc4
	 */
	public String getScorecardVarRc4() {
		return scorecardVarRc4;
	}

	/**
	 * @param scorecardVarRc4 the scorecardVarRc4 to set
	 */
	public void setScorecardVarRc4(String scorecardVarRc4) {
		this.scorecardVarRc4 = scorecardVarRc4;
	}

	/**
	 * @return the scorecardVarRc5
	 */
	public String getScorecardVarRc5() {
		return scorecardVarRc5;
	}

	/**
	 * @param scorecardVarRc5 the scorecardVarRc5 to set
	 */
	public void setScorecardVarRc5(String scorecardVarRc5) {
		this.scorecardVarRc5 = scorecardVarRc5;
	}

	/**
	 * @return the scorecardVarRc6
	 */
	public String getScorecardVarRc6() {
		return scorecardVarRc6;
	}

	/**
	 * @param scorecardVarRc6 the scorecardVarRc6 to set
	 */
	public void setScorecardVarRc6(String scorecardVarRc6) {
		this.scorecardVarRc6 = scorecardVarRc6;
	}

	/**
	 * @return the scorecardVarRm0
	 */
	public String getScorecardVarRm0() {
		return scorecardVarRm0;
	}

	/**
	 * @param scorecardVarRm0 the scorecardVarRm0 to set
	 */
	public void setScorecardVarRm0(String scorecardVarRm0) {
		this.scorecardVarRm0 = scorecardVarRm0;
	}

	/**
	 * @return the scorecardVarRm1
	 */
	public String getScorecardVarRm1() {
		return scorecardVarRm1;
	}

	/**
	 * @param scorecardVarRm1 the scorecardVarRm1 to set
	 */
	public void setScorecardVarRm1(String scorecardVarRm1) {
		this.scorecardVarRm1 = scorecardVarRm1;
	}

	/**
	 * @return the scorecardVarRm2
	 */
	public String getScorecardVarRm2() {
		return scorecardVarRm2;
	}

	/**
	 * @param scorecardVarRm2 the scorecardVarRm2 to set
	 */
	public void setScorecardVarRm2(String scorecardVarRm2) {
		this.scorecardVarRm2 = scorecardVarRm2;
	}

	/**
	 * @return the scorecardVarRm3
	 */
	public String getScorecardVarRm3() {
		return scorecardVarRm3;
	}

	/**
	 * @param scorecardVarRm3 the scorecardVarRm3 to set
	 */
	public void setScorecardVarRm3(String scorecardVarRm3) {
		this.scorecardVarRm3 = scorecardVarRm3;
	}

	/**
	 * @return the scorecardVarRm4
	 */
	public String getScorecardVarRm4() {
		return scorecardVarRm4;
	}

	/**
	 * @param scorecardVarRm4 the scorecardVarRm4 to set
	 */
	public void setScorecardVarRm4(String scorecardVarRm4) {
		this.scorecardVarRm4 = scorecardVarRm4;
	}

	/**
	 * @return the scorecardVarRm5
	 */
	public String getScorecardVarRm5() {
		return scorecardVarRm5;
	}

	/**
	 * @param scorecardVarRm5 the scorecardVarRm5 to set
	 */
	public void setScorecardVarRm5(String scorecardVarRm5) {
		this.scorecardVarRm5 = scorecardVarRm5;
	}

	/**
	 * @return the scorecardVarRm6
	 */
	public String getScorecardVarRm6() {
		return scorecardVarRm6;
	}

	/**
	 * @param scorecardVarRm6 the scorecardVarRm6 to set
	 */
	public void setScorecardVarRm6(String scorecardVarRm6) {
		this.scorecardVarRm6 = scorecardVarRm6;
	}

	@Override
	public String toString() {
		return "S1ResponseApplicationVariables [aScore=" + aScore + ", strategyDecision=" + strategyDecision
				+ ", rulerResult=" + rulerResult + ", gcashScoreLevel=" + gcashScoreLevel + ", cbScoreLevel="
				+ cbScoreLevel + ", reasonCode=" + reasonCode + ", ascoreLevel=" + ascoreLevel + ", productType="
				+ productType + ", strategy=" + strategy + ", appplicationDate=" + appplicationDate + ", appliedAmount="
				+ appliedAmount + ", scorecardObjcode=" + scorecardObjcode + ", scorecardRaw=" + scorecardRaw
				+ ", scorecardAligned=" + scorecardAligned + ", scorecardVar0=" + scorecardVar0 + ", scorecardVar1="
				+ scorecardVar1 + ", scorecardVar2=" + scorecardVar2 + ", scorecardVar3=" + scorecardVar3
				+ ", scorecardVar4=" + scorecardVar4 + ", scorecardVar5=" + scorecardVar5 + ", scorecardVar6="
				+ scorecardVar6 + ", scorecardVarValue0=" + scorecardVarValue0 + ", scorecardVarValue1="
				+ scorecardVarValue1 + ", scorecardVarValue2=" + scorecardVarValue2 + ", scorecardVarValue3="
				+ scorecardVarValue3 + ", scorecardVarValue4=" + scorecardVarValue4 + ", scorecardVarValue5="
				+ scorecardVarValue5 + ", scorecardVarValue6=" + scorecardVarValue6 + ", scorecardVarRc0="
				+ scorecardVarRc0 + ", scorecardVarRc1=" + scorecardVarRc1 + ", scorecardVarRc2=" + scorecardVarRc2
				+ ", scorecardVarRc3=" + scorecardVarRc3 + ", scorecardVarRc4=" + scorecardVarRc4 + ", scorecardVarRc5="
				+ scorecardVarRc5 + ", scorecardVarRc6=" + scorecardVarRc6 + ", scorecardVarRm0=" + scorecardVarRm0
				+ ", scorecardVarRm1=" + scorecardVarRm1 + ", scorecardVarRm2=" + scorecardVarRm2 + ", scorecardVarRm3="
				+ scorecardVarRm3 + ", scorecardVarRm4=" + scorecardVarRm4 + ", scorecardVarRm5=" + scorecardVarRm5
				+ ", scorecardVarRm6=" + scorecardVarRm6 + "]";
	}

}
