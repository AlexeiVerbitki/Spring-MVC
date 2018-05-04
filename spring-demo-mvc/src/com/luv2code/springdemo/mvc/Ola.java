package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ola {

	private String haveAnAccount;
	private Map<String, String> haveAnAccountMap;
	private String prefix;
	private Map<String, String> prefixMap;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private Map<String, String> suffixMap;
	private String email;
	private String emailReEnter;
	private int number;
	private int ext;
	private boolean nonUSnumber;
	private String citizenship;
	private Map<String, String> citizenshipMap;
	private String accountType;
	private Map<String, String> accountTypeMap;
	private String tradingType;
	private Map<String, String> tradingTypeMap;
	private String newToInvesting;
	private Map<String, String> newToInvestingMap;
	private String offerCode;
	private boolean privacyStatement;
	private String[] testArray;
	

	public String[] getTestArray() {
		return testArray;
	}

	public void setTestArray(String[] testArray) {
		this.testArray = testArray;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Map<String, String> getPrefixMap() {
		return prefixMap;
	}

	public void setPrefixMap(Map<String, String> prefixMap) {
		this.prefixMap = prefixMap;
	}

	public Map<String, String> getSuffixMap() {
		return suffixMap;
	}

	public void setSuffixMap(Map<String, String> suffixMap) {
		this.suffixMap = suffixMap;
	}

	public String getHaveAnAccount() {
		return haveAnAccount;
	}

	public void setHaveAnAccount(String haveAnAccount) {
		this.haveAnAccount = haveAnAccount;
	}

	public Map<String, String> getHaveAnAccountMap() {
		return haveAnAccountMap;
	}

	public void setHaveAnAccountMap(Map<String, String> haveAnAccountMap) {
		this.haveAnAccountMap = haveAnAccountMap;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailReEnter() {
		return emailReEnter;
	}

	public void setEmailReEnter(String emailReEnter) {
		this.emailReEnter = emailReEnter;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getExt() {
		return ext;
	}

	public void setExt(int ext) {
		this.ext = ext;
	}

	public boolean isNonUSnumber() {
		return nonUSnumber;
	}

	public void setNonUSnumber(boolean nonUSnumber) {
		this.nonUSnumber = nonUSnumber;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public Map<String, String> getCitizenshipMap() {
		return citizenshipMap;
	}

	public void setCitizenshipMap(Map<String, String> citizenshipMap) {
		this.citizenshipMap = citizenshipMap;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Map<String, String> getAccountTypeMap() {
		return accountTypeMap;
	}

	public void setAccountTypeMap(Map<String, String> accountTypeMap) {
		this.accountTypeMap = accountTypeMap;
	}

	public String getTradingType() {
		return tradingType;
	}

	public void setTradingType(String tradingType) {
		this.tradingType = tradingType;
	}

	public Map<String, String> getTradingTypeMap() {
		return tradingTypeMap;
	}

	public void setTradingTypeMap(Map<String, String> tradingTypeMap) {
		this.tradingTypeMap = tradingTypeMap;
	}

	public String getNewToInvesting() {
		return newToInvesting;
	}

	public void setNewToInvesting(String newToInvesting) {
		this.newToInvesting = newToInvesting;
	}

	public Map<String, String> getNewToInvestingMap() {
		return newToInvestingMap;
	}

	public void setNewToInvestingMap(Map<String, String> newToInvestingMap) {
		this.newToInvestingMap = newToInvestingMap;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public boolean isPrivacyStatement() {
		return privacyStatement;
	}

	public void setPrivacyStatement(boolean privacyStatement) {
		this.privacyStatement = privacyStatement;
	}

	public Ola() {

		// populate have an account
		haveAnAccountMap = new LinkedHashMap<String, String>();
		haveAnAccountMap.put("Yes, please prefill parts of my application. ",
				"Yes, please prefill parts of my application.");
		haveAnAccountMap.put("No, I'm a new client.  ", "No, I'm a new client.  ");

		// populate prefix
		prefixMap = new LinkedHashMap<String, String>();
		prefixMap.put("Select", "");
		prefixMap.put("Mr", "Mr");
		prefixMap.put("Mrs", "Mrs");
		prefixMap.put("Ms", "Ms");
		prefixMap.put("Miss", "Miss");
		prefixMap.put("Dr", "Dr");
		prefixMap.put("Rev", "Rev");

		// populate suffix
		suffixMap = new LinkedHashMap<String, String>();
		suffixMap.put("Select", "");
		suffixMap.put("Jr", "Jr");
		suffixMap.put("Sr", "Sr");
		suffixMap.put("II", "II");
		suffixMap.put("III", "III");
		suffixMap.put("IV", "IV");

		// populate Citizenship
		citizenshipMap = new LinkedHashMap<String, String>();
		citizenshipMap.put("I am a U.S. citizen. ", "I am a U.S. citizen. ");
		citizenshipMap.put("I am a permanent resident of the U.S. or a resident alien. ",
				"I am a permanent resident of the U.S. or a resident alien. ");
		citizenshipMap.put("I have dual citizenship of the U.S. and another country.",
				"I have dual citizenship of the U.S. and another country.");
		citizenshipMap.put("I am neither a U.S. citizen nor a permanent resident of the U.S.",
				"I am neither a U.S. citizen nor a permanent resident of the U.S.");

		// populate Account Type
		accountTypeMap = new LinkedHashMap<String, String>();
		accountTypeMap.put("Individual", "Individual");
		accountTypeMap.put("Joint Tenants WROS (With Rights of Survivorship)",
				"Joint Tenants WROS (With Rights of Survivorship)");
		accountTypeMap.put("Traditional IRA", "Traditional IRA");
		accountTypeMap.put("Rollover IRA", "Rollover IRA");
		accountTypeMap.put("Trust", "Trust");
		accountTypeMap.put("UTMA/UGMA", "UTMA/UGMA");

		// populate new to investing
		tradingTypeMap = new LinkedHashMap<String, String>();
		tradingTypeMap.put("Buy, hold, and occasionally trade stocks, mutual funds, ETFs, or bonds", "Buy, hold, and occasionally trade stocks, mutual funds, ETFs, or bonds");
		tradingTypeMap.put("Actively trade stocks, ETFs, options, futures, or forex", "Actively trade stocks, ETFs, options, futures, or forex");
		tradingTypeMap.put("I'm not sure", "I'm not sure");
		
		// populate new to trading type
		newToInvestingMap = new LinkedHashMap<String, String>();
		newToInvestingMap.put("Yes", "Yes");
		newToInvestingMap.put("No", "No");
		

	} // end constructor

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
