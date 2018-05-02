package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;


public class Student {
	
	String firstName;
	String lastName;
	int age;
	String country;
	String favoriteLanguage;
	String[] operatingSystemsArray;
	
	Map<String,String> countryOptions = new LinkedHashMap<>();
	Map<String,String> languageRadioButtons = new LinkedHashMap<>();
	Map<String,String> operatingSystemsMap = new LinkedHashMap<>();
	
	
	public Student() {
		countryOptions.put("USA", "United States");
		countryOptions.put("BR", "Brasil");
		countryOptions.put("Moldova", "Moldova");
		countryOptions.put("Ho", "Honduras");
		
		languageRadioButtons.put("Java", "Java");
		languageRadioButtons.put("C#", "C#");
		languageRadioButtons.put("Python", "Python");
		languageRadioButtons.put("Ruby", "Ruby");
		
		operatingSystemsMap.put("Windows", "Windows");
		operatingSystemsMap.put("Linux", "Linux");
		operatingSystemsMap.put("Mac OS", "Mac OS");
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public Map<String, String> getLanguageRadioButtons() {
		return languageRadioButtons;
	}

	public void setLanguageRadioButtons(Map<String, String> languageRadioButtons) {
		this.languageRadioButtons = languageRadioButtons;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystemsArray() {
		return operatingSystemsArray;
	}

	public void setOperatingSystemsArray(String[] operatingSystemsArray) {
		this.operatingSystemsArray = operatingSystemsArray;
	}

	public Map<String, String> getOperatingSystemsMap() {
		return operatingSystemsMap;
	}

	public void setOperatingSystemsMap(Map<String, String> operatingSystemsMap) {
		this.operatingSystemsMap = operatingSystemsMap;
	}
	
	

}
