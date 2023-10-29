package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1ResponseApplication {

	@JsonProperty("Variables")
	private S1ResponseApplicationVariables variables;

	/**
	 * @return the variables
	 */
	public S1ResponseApplicationVariables getVariables() {
		return variables;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(S1ResponseApplicationVariables variables) {
		this.variables = variables;
	}

	@Override
	public String toString() {
		return "S1ResponseApplication [variables=" + variables + "]";
	}

}
