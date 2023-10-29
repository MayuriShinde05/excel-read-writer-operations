package com.crif.globe.utility.entity;

public class ServiceAbilityCheck {

	private String geoLat;
	private String geoLng;
	private String serviceabilityId;

	/**
	 * @return the geoLat
	 */
	public String getGeoLat() {
		return geoLat;
	}

	/**
	 * @param geoLat the geoLat to set
	 */
	public void setGeoLat(String geoLat) {
		this.geoLat = geoLat;
	}

	/**
	 * @return the geoLng
	 */
	public String getGeoLng() {
		return geoLng;
	}

	/**
	 * @param geoLng the geoLng to set
	 */
	public void setGeoLng(String geoLng) {
		this.geoLng = geoLng;
	}

	/**
	 * @return the serviceabilityId
	 */
	public String getServiceabilityId() {
		return serviceabilityId;
	}

	/**
	 * @param serviceabilityId the serviceabilityId to set
	 */
	public void setServiceabilityId(String serviceabilityId) {
		this.serviceabilityId = serviceabilityId;
	}

	@Override
	public String toString() {
		return "ServiceAbilityCheck [geoLat=" + geoLat + ", geoLng=" + geoLng + ", serviceabilityId=" + serviceabilityId
				+ "]";
	}
}
