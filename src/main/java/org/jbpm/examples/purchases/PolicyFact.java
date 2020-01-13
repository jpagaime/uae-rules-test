package com.uae.rules.mvr.facts;

/**
 * The Policy Fact class.
 */
public class PolicyFact {

	private String province;
	private String policyId;
	private Integer score = 0;
	private Integer clientYearsSinceAuto;
	private Integer clientYearsSinceAutoScore;

	/**
	 * Gets the province.
	 * 
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets the province.
	 * 
	 * @param province
	 *            the province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getClientYearsSinceAuto() {
		return clientYearsSinceAuto;
	}

	public void setClientYearsSinceAuto(Integer clientYearsSinceAuto) {
		this.clientYearsSinceAuto = clientYearsSinceAuto;
	}

	public Integer getClientYearsSinceAutoScore() {
		return clientYearsSinceAutoScore;
	}

	public void setClientYearsSinceAutoScore(Integer clientYearsSinceAutoScore) {
		this.clientYearsSinceAutoScore = clientYearsSinceAutoScore;
	}
	
}
