package com.uae.rules.mvr.facts;

/**
 * The Vehicle Fact class.
 */
public class VehicleFact {

	private String province;
	private String publicId;
	private Integer postalCodeArea;
	private Integer postalCodeAreaScore;
	private Integer annualMileage;
	private Integer annualMileageScore;

	private Integer score = 0;

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
	 * Gets the public id.
	 * 
	 * @return the publicId
	 */
	public String getPublicId() {
		return publicId;
	}

	/**
	 * Sets the public id.
	 * 
	 * @param publicId
	 *            the publicId to set
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	/**
	 * Gets the postal code area.
	 * 
	 * @return the postalCodeArea
	 */
	public Integer getPostalCodeArea() {
		return postalCodeArea;
	}

	/**
	 * Sets the postal code area.
	 * 
	 * @param postalCodeArea
	 *            the postalCodeArea to set
	 */
	public void setPostalCodeArea(Integer postalCodeArea) {
		this.postalCodeArea = postalCodeArea;
	}

	/**
	 * Gets the postal code area score.
	 * 
	 * @return the postalCodeAreaScore
	 */
	public Integer getPostalCodeAreaScore() {
		return postalCodeAreaScore;
	}

	/**
	 * Sets the postal code area score.
	 * 
	 * @param postalCodeAreaScore
	 *            the postalCodeAreaScore to set
	 */
	public void setPostalCodeAreaScore(Integer postalCodeAreaScore) {
		this.postalCodeAreaScore = postalCodeAreaScore;
	}

	/**
	 * Gets the annual mileage.
	 * 
	 * @return the annualMileage
	 */
	public Integer getAnnualMileage() {
		return annualMileage;
	}

	/**
	 * Sets the annual mileage.
	 * 
	 * @param annualMileage
	 *            the annualMileage to set
	 */
	public void setAnnualMileage(Integer annualMileage) {
		this.annualMileage = annualMileage;
	}

	/**
	 * Gets the annual mileage score.
	 * 
	 * @return the annualMileageScore
	 */
	public Integer getAnnualMileageScore() {
		return annualMileageScore;
	}

	/**
	 * Sets the annual mileage score.
	 * 
	 * @param annualMileageScore
	 *            the annualMileageScore to set
	 */
	public void setAnnualMileageScore(Integer annualMileageScore) {
		this.annualMileageScore = annualMileageScore;
	}

	/**
	 * Gets the score.
	 * 
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * Sets the score.
	 * 
	 * @param score
	 *            the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

}
