package com.crif.globe.utility.entity;

import java.util.List;

/**
 * The Class GlobeEntityRequest.
 */
public class GlobeEntityRequest {
	
	/** The individual user data. */
	private GlobeVariableRequest individualUserData;
	
	/** The candidate user list. */
	private List<GlobeVariableRequest> candidateUserList;


	/**
	 * @return the individualUserData
	 */
	public GlobeVariableRequest getIndividualUserData() {
		return individualUserData;
	}

	/**
	 * @param individualUserData the individualUserData to set
	 */
	public void setIndividualUserData(GlobeVariableRequest individualUserData) {
		this.individualUserData = individualUserData;
	}

	/**
	 * Gets the candidate user list.
	 *
	 * @return the candidateUserList
	 */
	public List<GlobeVariableRequest> getCandidateUserList() {
		return candidateUserList;
	}

	/**
	 * Sets the candidate user list.
	 *
	 * @param candidateUserList the candidateUserList to set
	 */
	public void setCandidateUserList(List<GlobeVariableRequest> candidateUserList) {
		this.candidateUserList = candidateUserList;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "GlobeEntityRequest [individualUserData=" + individualUserData + ", candidateUserList="
				+ candidateUserList + "]";
	}

}