package com.learn.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String favouriteLanguage;
	
	private String operatingSystems;
	
	private LinkedHashMap<String, String> operatingSystemsOptions;
	
	public LinkedHashMap<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}
	
	/*public Student(){
		operatingSystemsOptions = new LinkedHashMap();
		
		operatingSystemsOptions.put("Linux", "Linux");
		operatingSystemsOptions.put("MAC OS", "MAC OS");
		operatingSystemsOptions.put("Windows OS", "Windows OS");
	}*/
	
	/*private LinkedHashMap<String, String> favouriteLanguageOptions;
	
	public Student(){
		favouriteLanguageOptions = new LinkedHashMap<String, String>();
		
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		favouriteLanguageOptions.put("Python", "Python");
		
	}
	
	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}*/
	
	
	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	//	private LinkedHashMap<String, String> countryOptions;
//	
//	public Student(){
//		
//		countryOptions = new LinkedHashMap<>();
//		
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("US", "United States of America");
//		
//	}
//	
	public String getCountry() {
		return country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public void setCountry(String country) {
		this.country = country;
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
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

}
