package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categories {
	@JsonProperty("Customer")
	private Customer customer;

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Categories [customer=" + customer + "]";
	}

}
