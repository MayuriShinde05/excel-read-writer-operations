package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StrategyOneRequest {
	@JsonProperty("Header")
	private Header header;
	@JsonProperty("Body")
	private Body body;

	/**
	 * @return the header
	 */
	public Header getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(Header header) {
		this.header = header;
	}

	/**
	 * @return the body
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "StrategyOneRequest [header=" + header + ", body=" + body + "]";
	}

}
