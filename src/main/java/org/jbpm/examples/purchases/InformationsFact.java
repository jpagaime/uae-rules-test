package com.uae.rules.mvr.facts;

public class InformationsFact {
	
	private Integer value;
	private String scoreName;
	private Integer scoreValue;

	/**
	 * Gets the value
	 * 
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * Sets the value
	 * 
	 * @param value
	 *            the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

	/**
	 * Gets the score name
	 * 
	 * @return the scoreName
	 */
	public String getScoreName() {
		return scoreName;
	}

	/**
	 * Sets the score name
	 * 
	 * @param scoreName
	 *            the score name to set
	 */
	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}

	/**
	 * Gets the score value
	 * 
	 * @return the scoreValue
	 */
	public Integer getScoreValue() {
		return scoreValue;
	}

	/**
	 * Sets the score value
	 * 
	 * @param scoreValue
	 *            the score value to set
	 */
	public void setScoreValue(Integer scoreValue) {
		this.scoreValue = scoreValue;
	}

}
