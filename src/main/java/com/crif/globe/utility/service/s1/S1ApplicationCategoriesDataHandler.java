package com.crif.globe.utility.service.s1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.crif.globe.utility.domain.s1.request.Categories;
import com.crif.globe.utility.domain.s1.request.Customer;
import com.crif.globe.utility.domain.s1.request.CustomerVariables;
import com.crif.globe.utility.entity.GlobeEntityRequest;
import com.crif.globe.utility.entity.GlobeVariableRequest;

@Component
public class S1ApplicationCategoriesDataHandler {

	public List<Categories> prepareApplicationCategories(GlobeEntityRequest request, boolean flag) {
		ArrayList<Categories> categories = new ArrayList<Categories>();
		Categories category = new Categories();
		Customer customer = new Customer();
		CustomerVariables customerVariables = prepareCustomerVariables(request, flag);
		customer.setVariables(customerVariables);
		category.setCustomer(customer);
		categories.add(category);
		return categories;
	}

	private CustomerVariables prepareCustomerVariables(GlobeEntityRequest request, boolean flag) {
		CustomerVariables customerVariables = new CustomerVariables();
		GlobeVariableRequest individualUserData = request.getIndividualUserData();

		customerVariables.setClientBirthDate(
				getDate(StringUtils.isEmpty(individualUserData.getPersonaldetail().getBirthday()) ? ""
						: individualUserData.getPersonaldetail().getBirthday()));
		customerVariables.setgCashScore(
				Double.parseDouble(StringUtils.isEmpty(individualUserData.getEligibilitychk().getgScore()) ? "0"
						: individualUserData.getEligibilitychk().getgScore()));
		customerVariables
				.setMaskedCustomerID(StringUtils.isEmpty(individualUserData.getCustaccinfo().getCustomerID()) ? ""
						: individualUserData.getCustaccinfo().getCustomerID());
		customerVariables.setoBHBAmount(individualUserData.getEligibilitychk().getTotalOverDue());
		customerVariables
				.setCustomerType(StringUtils.isEmpty(individualUserData.getCustaccinfo().getCustomerType()) ? ""
						: individualUserData.getCustaccinfo().getCustomerType());
		customerVariables
				.setFlag_BlackList(StringUtils.isEmpty(individualUserData.getEligibilitychk().getCndbResults()) ? ""
						: individualUserData.getEligibilitychk().getCndbResults());
		customerVariables.setOccupation(
				StringUtils.isEmpty(individualUserData.getOccupation()) ? "" : individualUserData.getOccupation());

		customerVariables.setCivilStatus(
				StringUtils.isEmpty(individualUserData.getCivilStatus()) ? "" : individualUserData.getCivilStatus());
		customerVariables
				.setPoid(StringUtils.isEmpty(individualUserData.getPoidchk().getProofOfIdentificationType()) ? ""
						: individualUserData.getPoidchk().getProofOfIdentificationType());
		// *** Fields need to be created by globe team *** //
		customerVariables.setDeclaredMonthlyIncome(1000.0);
		customerVariables.setcBScore(600);

		if (flag) {
			customerVariables.setCustomerType("new");
		} else {
			customerVariables.setCustomerType("existing");
		}

		return customerVariables;
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
