package com.crif.globe.utility.entity;

public class PaymentDetails {

	private String paymenttype;

	/**
	 * @return the paymenttype
	 */
	public String getPaymenttype() {
		return paymenttype;
	}

	/**
	 * @param paymenttype the paymenttype to set
	 */
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	@Override
	public String toString() {
		return "PaymentDetails [paymenttype=" + paymenttype + "]";
	}

}
