package com.uae.rules.mvr.facts;

/**
 * The Transaction Type Fact class.
 */
public class TransactionTypeFact {

	private String externalTransactionType;
	private String internalTransactionType;

	/**
	 * Gets the external transaction type code.
	 * 
	 * @return the external transaction type code
	 */
	public String getExternalTransactionType() {
		return externalTransactionType;
	}

	/**
	 * Sets the external transaction type code.
	 * 
	 * @param externalTransactionType
	 *            the external transaction type code to set
	 */
	public void setExternalTransactionType(String externalTransactionType) {
		this.externalTransactionType = externalTransactionType;
	}

	/**
	 * Gets the internal transaction type code.
	 * 
	 * @return the internal transaction type code
	 */
	public String getInternalTransactionType() {
		return internalTransactionType;
	}

	/**
	 * Sets internal transaction type code.
	 * 
	 * @param internalTransactionType
	 *            the internal transaction type code to set
	 */
	public void setInternalTransactionType(String internalTransactionType) {
		this.internalTransactionType = internalTransactionType;
	}

}
