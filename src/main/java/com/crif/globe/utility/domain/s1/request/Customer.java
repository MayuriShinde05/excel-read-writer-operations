package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("Variables")
	public CustomerVariables variables;

	/**
	 * @return the variables
	 */
	public CustomerVariables getVariables() {
		return variables;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(CustomerVariables variables) {
		this.variables = variables;
	}

	@Override
	public String toString() {
		return "Customer [variables=" + variables + "]";
	}

}
