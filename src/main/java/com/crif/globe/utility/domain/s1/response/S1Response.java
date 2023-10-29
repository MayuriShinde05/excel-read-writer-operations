package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1Response {

	@JsonProperty("StrategyOneResponse")
	private StrategyOneResponse strategyOneResponse;

	/**
	 * @return the strategyOneResponse
	 */
	public StrategyOneResponse getStrategyOneResponse() {
		return strategyOneResponse;
	}

	/**
	 * @param strategyOneResponse the strategyOneResponse to set
	 */
	public void setStrategyOneResponse(StrategyOneResponse strategyOneResponse) {
		this.strategyOneResponse = strategyOneResponse;
	}

	@Override
	public String toString() {
		return "S1Response [strategyOneResponse=" + strategyOneResponse + "]";
	}
}
