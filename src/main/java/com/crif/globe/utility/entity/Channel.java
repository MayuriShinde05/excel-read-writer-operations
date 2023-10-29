package com.crif.globe.utility.entity;

public class Channel {
	private String dafSource;

	/**
	 * @return the dafSource
	 */
	public String getDafSource() {
		return dafSource;	
	}

	/**
	 * @param dafSource the dafSource to set
	 */
	public void setDafSource(String dafSource) {
		this.dafSource = dafSource;
	}

	@Override
	public String toString() {
		return "Channel [dafSource=" + dafSource + "]";
	}

}
