package com.crif.globe.utility.domain.s1.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S1ResponseBody {

	@JsonProperty("Application")
	private S1ResponseApplication application;

	/**
	 * @return the application
	 */
	public S1ResponseApplication getApplication() {
		return application;
	}

	/**
	 * @param application the application to set
	 */
	public void setApplication(S1ResponseApplication application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "S1ResponseBody [application=" + application + "]";
	}

}
