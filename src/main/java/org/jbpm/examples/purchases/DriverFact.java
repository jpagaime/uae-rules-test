package com.uae.rules.mvr.facts;

import java.util.HashMap;
import java.util.Map;

/**
 * The Driver Fact class.
 */
public class DriverFact {

	private String province;
	private String publicId;
	private String transactionType;
	private Integer age;
	private Integer ageScore;
	private String gender;
	private Integer genderScore;
	private Integer maxVehiclePrice;
	private Integer maxVehiclePriceScore;
	private Integer mvrHit;
	private Integer mvrHitScore;
	private Integer timeSinceLastMVR;
	private Integer timeSinceLastMVRScore;
	private Integer maxAccBenefitRateGroup;
	private Integer maxAccBenefitRateGroupScore;
	private Integer maxHorsepower;
	private Integer maxHorsepowerScore;
	private Map<String, InformationsFact> claims = new HashMap<>();
	private Map<String, InformationsFact> convictions = new HashMap<>();

	private Integer score = 0;
	private Integer totalScore = 0;

	/**
	 * Gets province.
	 *
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * Sets province.
	 *
	 * @param province
	 *            the province
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * Gets the public Id.
	 * 
	 * @return the public id
	 */
	public String getPublicId() {
		return publicId;
	}

	/**
	 * Sets the public id.
	 * 
	 * @param publicId
	 *            the public id
	 */
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	/**
	 * Gets the transaction type.
	 * 
	 * @return the transaction type
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the transaction type.
	 * 
	 * @param transactionType
	 *            the transaction type
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Gets driver age.
	 *
	 * @return the driver age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * Sets driver age.
	 *
	 * @param age
	 *            the driver age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * Get driver age score.
	 *
	 * @return ageScore
	 */
	public Integer getAgeScore() {
		return ageScore;
	}

	/**
	 * Set driver age score.
	 *
	 * @param ageScore
	 *            the driver age score
	 */
	public void setAgeScore(Integer ageScore) {
		this.ageScore = ageScore;
	}

	/**
	 * Gets gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets gender.
	 *
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets gender score.
	 *
	 * @return the gender score
	 */
	public Integer getGenderScore() {
		return genderScore;
	}

	/**
	 * Set gender score.
	 *
	 * @param genderScore
	 *            the gender score
	 */
	public void setGenderScore(Integer genderScore) {
		this.genderScore = genderScore;
	}

	/**
	 * Gets maximum vehicle price.
	 *
	 * @return the maximum vehicle price
	 */
	public Integer getMaxVehiclePrice() {
		return maxVehiclePrice;
	}

	/**
	 * Sets maximum vehicle price.
	 *
	 * @param maxVehiclePrice
	 *            the maximum vehicle price
	 */
	public void setMaxVehiclePrice(Integer maxVehiclePrice) {
		this.maxVehiclePrice = maxVehiclePrice;
	}

	/**
	 * Gets maximum vehicle price score.
	 *
	 * @return the maximum vehicle price score
	 */
	public Integer getMaxVehiclePriceScore() {
		return maxVehiclePriceScore;
	}

	/**
	 * Sets maximum vehicle price score.
	 *
	 * @param maxVehiclePriceScore
	 *            the maximum vehicle price score
	 */
	public void setMaxVehiclePriceScore(Integer maxVehiclePriceScore) {
		this.maxVehiclePriceScore = maxVehiclePriceScore;
	}

	/**
	 * Gets the MVR Hit indicator
	 * 
	 * @return the mvrHit
	 */
	public Integer getMvrHit() {
		return mvrHit;
	}

	/**
	 * Sets the MVR Hit indicator
	 * 
	 * @param mvrHit
	 *            the MVR Hit indicator to set
	 */
	public void setMvrHit(Integer mvrHit) {
		this.mvrHit = mvrHit;
	}

	/**
	 * Gets the MVR Hit indicator score
	 * 
	 * @return the mvrHitScore
	 */
	public Integer getMvrHitScore() {
		return mvrHitScore;
	}

	/**
	 * Sets the MVR Hit indicator score
	 * 
	 * @param mvrHitScore
	 *            the MVR Hit indicator score to set
	 */
	public void setMvrHitScore(Integer mvrHitScore) {
		this.mvrHitScore = mvrHitScore;
	}

	/**
	 * Gets the time since last MVR
	 * 
	 * @return the timeSinceLastMVR
	 */
	public Integer getTimeSinceLastMVR() {
		return timeSinceLastMVR;
	}

	/**
	 * Sets the time since last MVR
	 * 
	 * @param timeSinceLastMVR
	 *            the time since last MVR to set
	 */
	public void setTimeSinceLastMVR(Integer timeSinceLastMVR) {
		this.timeSinceLastMVR = timeSinceLastMVR;
	}

	/**
	 * Gets the time since last MVR score
	 * 
	 * @return the timeSinceLastMVRScore
	 */
	public Integer getTimeSinceLastMVRScore() {
		return timeSinceLastMVRScore;
	}

	/**
	 * Sets the time since last MVR score
	 * 
	 * @param timeSinceLastMVRScore
	 *            the time since last MVR score to set
	 */
	public void setTimeSinceLastMVRScore(Integer timeSinceLastMVRScore) {
		this.timeSinceLastMVRScore = timeSinceLastMVRScore;
	}

	/**
	 * Gets the vehicle max accident benefit rate group
	 * 
	 * @return the maxAccBenefitRateGroup
	 */
	public Integer getMaxAccBenefitRateGroup() {
		return maxAccBenefitRateGroup;
	}

	/**
	 * Sets the vehicle max accident benefit rate group
	 * 
	 * @param maxAccBenefitRateGroup
	 *            the vehicle max accident benefit rate group to set
	 */
	public void setMaxAccBenefitRateGroup(Integer maxAccBenefitRateGroup) {
		this.maxAccBenefitRateGroup = maxAccBenefitRateGroup;
	}

	/**
	 * Gets the vehicle max accident benefit rate group score
	 * 
	 * @return the maxAccBenefitRateGroupScore
	 */
	public Integer getMaxAccBenefitRateGroupScore() {
		return maxAccBenefitRateGroupScore;
	}

	/**
	 * Sets the vehicle max accident benefit rate group score
	 * 
	 * @param maxAccBenefitRateGroupScore
	 *            the vehicle max accident benefit rate group score to set
	 */
	public void setMaxAccBenefitRateGroupScore(Integer maxAccBenefitRateGroupScore) {
		this.maxAccBenefitRateGroupScore = maxAccBenefitRateGroupScore;
	}

	/**
	 * Gets vehicle maximum horsepower.
	 *
	 * @return the vehicle maximum horsepower
	 */
	public Integer getMaxHorsepower() {
		return maxHorsepower;
	}

	/**
	 * Sets vehicle maximum horsepower.
	 *
	 * @param maxHorsepower
	 *            the vehicle maximum horsepower
	 */
	public void setMaxHorsepower(Integer maxHorsepower) {
		this.maxHorsepower = maxHorsepower;
	}

	/**
	 * Gets vehicle maximum horsepower score.
	 *
	 * @return the vehicle maximum horsepower score
	 */
	public Integer getMaxHorsepowerScore() {
		return maxHorsepowerScore;
	}

	/**
	 * Sets vehicle maximum horsepower score.
	 *
	 * @param maxHorsepowerScore
	 *            the vehicle maximum horsepower score
	 */
	public void setMaxHorsepowerScore(Integer maxHorsepowerScore) {
		this.maxHorsepowerScore = maxHorsepowerScore;
	}

	/**
	 * Gets driver score.
	 *
	 * @return the driver score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * Sets driver score
	 *
	 * @param score
	 *            the driver score
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * Gets the information on the claims.
	 * 
	 * @return the claims
	 */
	public Map<String, InformationsFact> getClaims() {
		return claims;
	}

	/**
	 * Sets the information on the claims.
	 * 
	 * @param claims
	 *            the information on the claims to set
	 */
	public void setClaims(Map<String, InformationsFact> claims) {
		this.claims = claims;
	}

	/**
	 * Gets the information on the convictions.
	 * 
	 * @return the convictions
	 */
	public Map<String, InformationsFact> getConvictions() {
		return convictions;
	}

	/**
	 * Sets the information on the convictions.
	 * 
	 * @param convictions
	 *            the information on the convictions to set
	 */
	public void setConvictions(Map<String, InformationsFact> convictions) {
		this.convictions = convictions;
	}

	/**
	 * Checks if a claimType exists in the claims context
	 * 
	 * * @param claimType the claim type
	 * 
	 * @return the flag
	 */
	public Boolean hasClaim(String claimType) {
		return this.claims != null && this.claims.get(claimType) != null;
	}

	/**
	 * Gets the value of a specific claim based on the claim type.
	 * 
	 * * @param claimType the claim type
	 * 
	 * @return the value
	 */
	public Integer getClaimValue(String claimType) {
		return this.claims.get(claimType).getValue();
	}

	/**
	 * Gets the value of a score of the specific claim based on the claim type.
	 * 
	 * * @param claimType the claim type
	 * 
	 * @return the score value
	 */
	public Integer getClaimScore(String claimType) {
		return this.claims.get(claimType).getScoreValue();
	}

	/**
	 * Sets the score name and score value of the claim based on the claim type.
	 * 
	 * @param claimType
	 *            the claim type
	 * @param scoreName
	 *            the score name to set
	 * @param scoreValue
	 *            the score value to set
	 * 
	 */
	public void setClaimScore(String claimType, String scoreName, Integer scoreValue) {
		if (!this.hasClaim(claimType)) {
			this.claims.put(claimType, new InformationsFact());
		}
		this.claims.get(claimType).setScoreName(scoreName);
		this.claims.get(claimType).setScoreValue(scoreValue);
	}

	/**
	 * Checks if a convictionsType exists in the claims context
	 * 
	 * * @param convictionType the claim type
	 * 
	 * @return the flag
	 */
	public Boolean hasConviction(String convictionType) {
		return this.convictions != null && this.convictions.get(convictionType) != null;
	}

	/**
	 * Gets the value of a specific claim based on the conviction type.
	 * 
	 * * @param convictionType the conviction type
	 * 
	 * @return the value
	 */
	public Integer getConvictionValue(String convictionType) {
		return this.convictions.get(convictionType).getValue();
	}

	/**
	 * Gets the value of a score of the specific conviction based on the conviction type.
	 * 
	 * * @param convictionType the conviction type
	 * 
	 * @return the score value
	 */
	public Integer getConvictionScore(String convictionType) {
		return this.convictions.get(convictionType).getScoreValue();
	}

	/**
	 * Sets the score name and score value of the conviction based on the claim type.
	 * 
	 * @param convictionType
	 *            the conviction type
	 * @param scoreName
	 *            the score name to set
	 * @param scoreValue
	 *            the score value to set
	 * 
	 */
	public void setConvictionScore(String convictionType, String scoreName, Integer scoreValue) {
		if (!this.hasConviction(convictionType)) {
			this.convictions.put(convictionType, new InformationsFact());
		}
		this.convictions.get(convictionType).setScoreName(scoreName);
		this.convictions.get(convictionType).setScoreValue(scoreValue);

	}

	/**
	 * Gets driver total score.
	 *
	 * @return the driver total score
	 */
	public Integer getTotalScore() {
		return totalScore;
	}

	/**
	 * Sets driver total score
	 *
	 * @param totalScore
	 *            the driver total score
	 */
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

}
