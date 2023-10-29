package com.crif.globe.utility.domain.s1.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Body {
	@JsonProperty("Application")
	private Application application;

	/**
	 * @return the application
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * @param application the application to set
	 */
	public void setApplication(Application application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "Body [application=" + application + "]";
	}

}
