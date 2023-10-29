package com.crif.globe.utility.domain.s1.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Application {
	@JsonProperty("Variables")
	public ApplicationVariables variables;
	@JsonProperty("Categories")
	public List<Categories> categories;

	/**
	 * @return the variables
	 */
	public ApplicationVariables getVariables() {
		return variables;
	}

	/**
	 * @param variables the variables to set
	 */
	public void setVariables(ApplicationVariables variables) {
		this.variables = variables;
	}

	/**
	 * @return the categories
	 */
	public List<Categories> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Application [variables=" + variables + ", categories=" + categories + "]";
	}

}
