package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrategyOneResponse {

	@JsonProperty("Header")
	private S1ResponseHeader header;
	@JsonProperty("Body")
	private S1ResponseBody body;
	@JsonProperty("Error")
	private S1Error error;

	/**
	 * @return the header
	 */
	public S1ResponseHeader getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(S1ResponseHeader header) {
		this.header = header;
	}

	/**
	 * @return the body
	 */
	public S1ResponseBody getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(S1ResponseBody body) {
		this.body = body;
	}

	/**
	 * @return the error
	 */
	public S1Error getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(S1Error error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "StrategyOneResponse [header=" + header + ", body=" + body + ", error=" + error + "]";
	}

}
