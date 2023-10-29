package com.crif.globe.utility.entity;

public class IndividualUserDataEntity {
	private Channel channel;
	private PersonalDetail personalDetail;
	private AlternatePersonalDetails alternatePersonalDetails;
	private AddBillInfo addBillInfo;
	private CustomerAccountInfo custaccinfo;
	private PlanInfo planinfo;
	private EligibilityCheck eligibilitychk;
	private ProofOfIdentificationCheck poidchk;
	private String civilStatus = "Single";
	private Double declaredMonthlyINcome = 1000.0;
	private String scenario;
	private String occupation = "OWNER";
	private String paymentType = "Outright payment";
	private String territory;
	private String tpaName;

	/**
	 * @return the channel
	 */
	public Channel getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	/**
	 * @return the personalDetail
	 */
	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}

	/**
	 * @param personalDetail the personalDetail to set
	 */
	public void setPersonalDetail(PersonalDetail personalDetail) {
		this.personalDetail = personalDetail;
	}

	/**
	 * @return the alternatePersonalDetails
	 */
	public AlternatePersonalDetails getAlternatePersonalDetails() {
		return alternatePersonalDetails;
	}

	/**
	 * @param alternatePersonalDetails the alternatePersonalDetails to set
	 */
	public void setAlternatePersonalDetails(AlternatePersonalDetails alternatePersonalDetails) {
		this.alternatePersonalDetails = alternatePersonalDetails;
	}

	/**
	 * @return the addBillInfo
	 */
	public AddBillInfo getAddBillInfo() {
		return addBillInfo;
	}

	/**
	 * @param addBillInfo the addBillInfo to set
	 */
	public void setAddBillInfo(AddBillInfo addBillInfo) {
		this.addBillInfo = addBillInfo;
	}

	/**
	 * @return the custaccinfo
	 */
	public CustomerAccountInfo getCustaccinfo() {
		return custaccinfo;
	}

	/**
	 * @param custaccinfo the custaccinfo to set
	 */
	public void setCustaccinfo(CustomerAccountInfo custaccinfo) {
		this.custaccinfo = custaccinfo;
	}

	/**
	 * @return the planinfo
	 */
	public PlanInfo getPlaninfo() {
		return planinfo;
	}

	/**
	 * @param planinfo the planinfo to set
	 */
	public void setPlaninfo(PlanInfo planinfo) {
		this.planinfo = planinfo;
	}

	/**
	 * @return the eligibilitychk
	 */
	public EligibilityCheck getEligibilitychk() {
		return eligibilitychk;
	}

	/**
	 * @param eligibilitychk the eligibilitychk to set
	 */
	public void setEligibilitychk(EligibilityCheck eligibilitychk) {
		this.eligibilitychk = eligibilitychk;
	}

	/**
	 * @return the poidchk
	 */
	public ProofOfIdentificationCheck getPoidchk() {
		return poidchk;
	}

	/**
	 * @param poidchk the poidchk to set
	 */
	public void setPoidchk(ProofOfIdentificationCheck poidchk) {
		this.poidchk = poidchk;
	}

	/**
	 * @return the civilStatus
	 */
	public String getCivilStatus() {
		return civilStatus;
	}

	/**
	 * @param civilStatus the civilStatus to set
	 */
	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}

	/**
	 * @return the declaredMonthlyINcome
	 */
	public Double getDeclaredMonthlyINcome() {
		return declaredMonthlyINcome;
	}

	/**
	 * @param declaredMonthlyINcome the declaredMonthlyINcome to set
	 */
	public void setDeclaredMonthlyINcome(Double declaredMonthlyINcome) {
		this.declaredMonthlyINcome = declaredMonthlyINcome;
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
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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

	@Override
	public String toString() {
		return "IndividualUserDataEntity [channel=" + channel + ", personalDetail=" + personalDetail
				+ ", alternatePersonalDetails=" + alternatePersonalDetails + ", addBillInfo=" + addBillInfo
				+ ", custaccinfo=" + custaccinfo + ", planinfo=" + planinfo + ", eligibilitychk=" + eligibilitychk
				+ ", poidchk=" + poidchk + ", civilStatus=" + civilStatus + ", declaredMonthlyINcome="
				+ declaredMonthlyINcome + ", scenario=" + scenario + ", occupation=" + occupation + ", paymentType="
				+ paymentType + ", territory=" + territory + ", tpaName=" + tpaName + "]";
	}

}
