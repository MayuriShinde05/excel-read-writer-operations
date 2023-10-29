package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1Request {
	@JsonProperty("StrategyOneRequest")
	private StrategyOneRequest strategyOneRequest;

	/**
	 * @return the strategyOneRequest
	 */
	public StrategyOneRequest getStrategyOneRequest() {
		return strategyOneRequest;
	}

	/**
	 * @param strategyOneRequest the strategyOneRequest to set
	 */
	public void setStrategyOneRequest(StrategyOneRequest strategyOneRequest) {
		this.strategyOneRequest = strategyOneRequest;
	}

	@Override
	public String toString() {
		return "S1Request [strategyOneRequest=" + strategyOneRequest + "]";
	}

}
