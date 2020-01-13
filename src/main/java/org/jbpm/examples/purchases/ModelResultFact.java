package com.uae.rules.mvr.facts;

import java.math.BigDecimal;

/**
 * The Model Result Fact class.
 */
public class ModelResultFact {

	private String province;
	private Integer mvrDriverScore;
	private Boolean doNotOrderMVR;
	private Boolean mvrResult;
	private Integer threshold;

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
	 *            the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * Gets the MVR Driver Score.
	 * 
	 * @return the mvrDriverScore
	 */
	public Integer getMvrDriverScore() {
		return mvrDriverScore;
	}

	/**
	 * Sets the MVR Driver Score.
	 * 
	 * @param mvrDriverScore
	 *            the MVR Driver Score to set
	 */
	public void setMvrDriverScore(Integer mvrDriverScore) {
		this.mvrDriverScore = mvrDriverScore;
	}
	/**
	 * Gets the Do Not Order MVR flag.
	 * 
	 * @return the doNotOrderMVR
	 */
	public Boolean getDoNotOrderMVR() {
		return doNotOrderMVR;
	}

	/**
	 * Sets the Do Not Order MVR flag.
	 * 
	 * @param doNotOrderMVR
	 *            the Do Not Order MVR flag to set
	 */
	public void setDoNotOrderMVR(Boolean doNotOrderMVR) {
		this.doNotOrderMVR = doNotOrderMVR;
	}

	/**
	 * Gets the MVR Result.
	 * 
	 * @return the mvrResult
	 */
	public Boolean getMvrResult() {
		return mvrResult;
	}

	/**
	 * Sets the MVR Result.
	 * 
	 * @param mvrResult
	 *            the MVR Result to set
	 */
	public void setMvrResult(Boolean mvrResult) {
		this.mvrResult = mvrResult;
	}

	/**
	 * Gets the threshold.
	 * 
	 * @return the threshold
	 */
	public Integer getThreshold() {
		return threshold;
	}

	/**
	 * Sets the threshold.
	 * 
	 * @param threshold
	 *            the threshold to set
	 */
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

}
