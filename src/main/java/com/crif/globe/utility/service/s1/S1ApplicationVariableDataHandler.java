package com.crif.globe.utility.service.s1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.crif.globe.utility.domain.s1.request.ApplicationVariables;
import com.crif.globe.utility.entity.GlobeEntityRequest;
import com.crif.globe.utility.entity.GlobeVariableRequest;

@Component
public class S1ApplicationVariableDataHandler {

	public ApplicationVariables prepareApplicationVariables(GlobeEntityRequest request) {
		ApplicationVariables applicationVariables = new ApplicationVariables();
		GlobeVariableRequest individualUserData = request.getIndividualUserData();

		applicationVariables.setApplicationDate(
				getDate(StringUtils.isEmpty(individualUserData.getPlaninfo().getApplicationDate()) ? ""
						: individualUserData.getPlaninfo().getApplicationDate()));
		applicationVariables.setAppliedAmount((individualUserData.getPlaninfo().getSelectedPlanAmount()) <= 0 ? 0.0
				: individualUserData.getPlaninfo().getSelectedPlanAmount());
		applicationVariables
				.setMainOfferName(StringUtils.isEmpty(individualUserData.getPlaninfo().getSelectedPlan()) ? ""
						: individualUserData.getPlaninfo().getSelectedPlan());
		applicationVariables.setBrand(StringUtils.isEmpty(individualUserData.getPlaninfo().getNewProductType()) ? ""
				: individualUserData.getPlaninfo().getNewProductType());
		applicationVariables.setWithHandSetInd(
				Double.parseDouble(StringUtils.isEmpty(individualUserData.getPlaninfo().getWithHandset()) ? "0"
						: individualUserData.getPlaninfo().getWithHandset()));
		applicationVariables.setContractType(StringUtils.isEmpty(individualUserData.getPlaninfo().getAcquiType()) ? ""
				: individualUserData.getPlaninfo().getAcquiType());

		applicationVariables.setTenure(individualUserData.getCustaccinfo().getTenure());
		applicationVariables
				.setBillingArea(StringUtils.isEmpty(individualUserData.getAddbillinfo().getBillingProvince()) ? ""
						: individualUserData.getAddbillinfo().getBillingProvince());
		applicationVariables.setPostalCode(individualUserData.getAddbillinfo().getBillingZipCode());

		applicationVariables.setSalesChannel(StringUtils.isEmpty(individualUserData.getChannel().getDafSource()) ? ""
				: individualUserData.getChannel().getDafSource());

		applicationVariables.setPaymentType(
				StringUtils.isEmpty(individualUserData.getPaymentType()) ? "" : individualUserData.getPaymentType());
		applicationVariables.setTpaName(
				StringUtils.isEmpty(individualUserData.getTpaName()) ? "" : individualUserData.getTpaName());
		applicationVariables.setTerritory(
				StringUtils.isEmpty(individualUserData.getTerritory()) ? "" : individualUserData.getTerritory());

		applicationVariables.setScenario(individualUserData.getScenario());

		return applicationVariables;
	}

	public Date getDate(String SDate) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(SDate);
		} catch (ParseException e) {
			System.out.println(date);
		}
		return date;
	}
}
