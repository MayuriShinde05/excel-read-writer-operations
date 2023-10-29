package com.crif.globe.utility.entity;

public class GlobeVariableRequest {

	private Channel channel;
	private PersonalDetail personaldetail;
	private AlternatePersonalDetails alternatePersonalDetails;
	private AddBillInfo addbillinfo;
	private ServiceAbilityCheck serviceAbilityCheck;
	private CustomerAccountInfo custaccinfo;
	private PlanInfo planinfo;
	private PrequalResult prequalResult;
	private EligibilityCheck eligibilitychk;
	private ProofOfIdentificationCheck poidchk;
	private DeliveryOption deliveryOption;
	private PaymentDetails paymentDetails;
	private String jobOrderNumber;
	private String civilStatus = "Single";
	private Double declaredMonthlyINcome = 1000.0;
	private Integer certificateIdFk;
	private String certificateName;
	private String occupation = "OWNER";
	private String paymentType = "Outright payment";
	private String tpaName;
	private String territory;
	private String scenario;

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
	 * @return the addbillinfo
	 */
	public AddBillInfo getAddbillinfo() {
		return addbillinfo;
	}

	/**
	 * @param addbillinfo the addbillinfo to set
	 */
	public void setAddbillinfo(AddBillInfo addbillinfo) {
		this.addbillinfo = addbillinfo;
	}

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
	 * @return the personaldetail
	 */
	public PersonalDetail getPersonaldetail() {
		return personaldetail;
	}

	/**
	 * @param personaldetail the personaldetail to set
	 */
	public void setPersonaldetail(PersonalDetail personaldetail) {
		this.personaldetail = personaldetail;
	}

	/**
	 * @return the serviceAbilityCheck
	 */
	public ServiceAbilityCheck getServiceAbilityCheck() {
		return serviceAbilityCheck;
	}

	/**
	 * @param serviceAbilityCheck the serviceAbilityCheck to set
	 */
	public void setServiceAbilityCheck(ServiceAbilityCheck serviceAbilityCheck) {
		this.serviceAbilityCheck = serviceAbilityCheck;
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
	 * @return the prequalResult
	 */
	public PrequalResult getPrequalResult() {
		return prequalResult;
	}

	/**
	 * @param prequalResult the prequalResult to set
	 */
	public void setPrequalResult(PrequalResult prequalResult) {
		this.prequalResult = prequalResult;
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
	 * @return the deliveryOption
	 */
	public DeliveryOption getDeliveryOption() {
		return deliveryOption;
	}

	/**
	 * @param deliveryOption the deliveryOption to set
	 */
	public void setDeliveryOption(DeliveryOption deliveryOption) {
		this.deliveryOption = deliveryOption;
	}

	/**
	 * @return the paymentDetails
	 */
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * @param paymentDetails the paymentDetails to set
	 */
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	/**
	 * @return the jobOrderNumber
	 */
	public String getJobOrderNumber() {
		return jobOrderNumber;
	}

	/**
	 * @param jobOrderNumber the jobOrderNumber to set
	 */
	public void setJobOrderNumber(String jobOrderNumber) {
		this.jobOrderNumber = jobOrderNumber;
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
	 * @return the certificateIdFk
	 */
	public Integer getCertificateIdFk() {
		return certificateIdFk;
	}

	/**
	 * @param certificateIdFk the certificateIdFk to set
	 */
	public void setCertificateIdFk(Integer certificateIdFk) {
		this.certificateIdFk = certificateIdFk;
	}

	/**
	 * @return the certificateName
	 */
	public String getCertificateName() {
		return certificateName;
	}

	/**
	 * @param certificateName the certificateName to set
	 */
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
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

	@Override
	public String toString() {
		return "GlobeVariableRequest [channel=" + channel + ", personaldetail=" + personaldetail
				+ ", alternatePersonalDetails=" + alternatePersonalDetails + ", addbillinfo=" + addbillinfo
				+ ", serviceAbilityCheck=" + serviceAbilityCheck + ", custaccinfo=" + custaccinfo + ", planinfo="
				+ planinfo + ", prequalResult=" + prequalResult + ", eligibilitychk=" + eligibilitychk + ", poidchk="
				+ poidchk + ", deliveryOption=" + deliveryOption + ", paymentDetails=" + paymentDetails
				+ ", jobOrderNumber=" + jobOrderNumber + ", civilStatus=" + civilStatus + ", declaredMonthlyINcome="
				+ declaredMonthlyINcome + ", certificateIdFk=" + certificateIdFk + ", certificateName="
				+ certificateName + ", occupation=" + occupation + ", paymentType=" + paymentType + ", tpaName="
				+ tpaName + ", territory=" + territory + ", scenario=" + scenario + "]";
	}

}
